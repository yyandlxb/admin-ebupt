package com.ebupt.util;

import com.ebupt.exception.ApplicationException;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.ConverterNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.*;

@Service
public class ExcelUtils {

    @Autowired(required = false)
    private ConversionService conversionService;

    public <T> List<T> excelToList(InputStream is, Class<T> entityClass, Map<String, String> fieldMap) throws Exception {

        List<T> resultList = new ArrayList<T>();

        // 根据excel数据源创建WorkBook
        Workbook wb = WorkbookFactory.create(is);
        // 获取工作表
        Sheet sheet = wb.getSheetAt(0);

        // 获取工作表的有效行数
        int rouwS = sheet.getPhysicalNumberOfRows();
        int realRows = 0;

        for (int i = 0; i < rouwS; i++) {
            Row row = sheet.getRow(i);
            int nullCols = 0;
            for (int j = 0; j < fieldMap.size(); j++) {
                Cell cell = row.getCell(j);

                if (cell != null) {
                    CellType cellTypeEnum = cell.getCellTypeEnum();
                    if (cellTypeEnum == CellType.NUMERIC) {
                        if ("".equals(cell.getNumericCellValue())) {
                            nullCols++;
                        }
                    } else if (cellTypeEnum == CellType.STRING) {
                        if ("".equals(cell.getStringCellValue())) {
                            nullCols++;
                        }
                    } else if (cellTypeEnum == CellType.BLANK) {
                        nullCols++;
                    }
                } else {
                    nullCols++;
                }

            }

            if (nullCols == fieldMap.size()) {
                break;
            } else {
                realRows++;
            }
        }

        // 如果Excel中没有任何数据则提示错误信息
        if (realRows <= 1) {
            throw new ApplicationException("Excel文件中没有任何数据");
        }

        Row firstRow = sheet.getRow(0);

        String[] excelFieldNames = new String[firstRow.getPhysicalNumberOfCells()];

        // 获取Excel的列名
        for (int i = 0; i < firstRow.getPhysicalNumberOfCells(); i++) {
            excelFieldNames[i] = firstRow.getCell(i).getStringCellValue().trim();
        }

        // 判断需要的字段在Excel中是否都存在
        boolean isExist = true;
        List<String> excelFieldList = Arrays.asList(excelFieldNames);
        for (Map.Entry<String, String> entry : fieldMap.entrySet()) {
            if (!excelFieldList.contains(entry.getKey())) {
                isExist = false;
                break;
            }
        }

        // 如果有列名不存在或不匹配，则抛出异常并提示错误
        if (!isExist) {
            throw new ApplicationException("Excel中缺少必要的字段，或字段名称有误");
        }

        LinkedHashMap<String, Integer> colMap = new LinkedHashMap<>();
        for (int i = 0; i < excelFieldNames.length; i++) {
            colMap.put(excelFieldNames[i], i);
        }

        Field[] fields = new Field[colMap.size()];
        for (int i = 1; i < realRows; i++) {
            // 新建要转换的对象
            T entity = entityClass.newInstance();

            // 给对象中的字段赋值
            for (Map.Entry<String, String> entry : fieldMap.entrySet()) {
                // 获取中文字段名
                String enNormalName = entry.getKey();
                // 获取英文字段名
                String value = entry.getValue();
                // 根据中文字段名获取列号
                int index = colMap.get(enNormalName);

                // 获取当前单元格中的内容
                Cell cell = sheet.getRow(i).getCell(index);
                // 给对象赋值
                setFieldValueByName(value, cell, entity, fields, index, enNormalName);
            }

            resultList.add(entity);
        }

        return resultList;
    }

    /**
     * @param fieldName 字段名
     * @param o         对象
     * @Description 根据字段名给对象的字段赋值
     */
    private void setFieldValueByName(String fieldName, Cell cell, Object o, Field[] fields, int index, String enNormalName) throws Exception {

        Object fieldValue = null;
        if (cell == null) {
            return;
        }
        CellType cellTypeEnum = cell.getCellTypeEnum();
        if (cellTypeEnum == CellType.NUMERIC) {
            if (DateUtil.isCellDateFormatted(cell)) {
                fieldValue = cell.getDateCellValue();
            } else {
                fieldValue = cell.getNumericCellValue();
                int digit = (fieldValue + "").length() - (fieldValue + "").indexOf(".") - 1;
                if (digit > 2)
                    fieldValue = new DecimalFormat("#.##").format(fieldValue);
                //由于有些String类型会取值成数字类型，后面就加了“.0”，我们这里做下处理
                String s = fieldValue.toString();
                if (s.contains(".")) {
                    if (s.substring(s.lastIndexOf(".")).equals(".0")) {
                        fieldValue = s.substring(0, s.lastIndexOf("."));
                    }
                }
            }
        } else if (cellTypeEnum == CellType.STRING) {
            fieldValue = cell.getStringCellValue();
        }
        Field field;
        field = fields[index];
        if (field == null) {
            field = getFieldByName(fieldName, o.getClass());
            fields[index] = field;
        }

        if (field != null) {
            field.setAccessible(true);
            // 获取字段类型
            Class<?> fieldType = field.getType();
            if (fieldValue != null) {
                try {
                    fieldValue = conversionService.convert(fieldValue, fieldType);
                } catch (ConverterNotFoundException e) {
                    throw new ApplicationException(e.getMessage(), e, enNormalName + "类型不正确");
                }

            }
            field.set(o, fieldValue);
        } else {
            throw new ApplicationException(o.getClass().getSimpleName() + "类不存在字段名" + fieldName);
        }
    }

    /**
     * @param fieldName 字段名
     * @param clazz     包含该字段的类
     * @return 字段
     * @MethodName : getFieldByName
     * @Description : 根据字段名获取字段
     */
    private static Field getFieldByName(String fieldName, Class<?> clazz) throws Exception {
        // 如果本类中存放该字段，则返回
        Field field = ReflectionUtils.findField(clazz, fieldName);
        if (field != null) {
            return field;
        }

        // 否则，查看父类中是否存在此字段，如果有则返回
        Class<?> superClazz = clazz.getSuperclass();
        if (superClazz != null && superClazz != Object.class) {
            return getFieldByName(fieldName, superClazz);
        }

        return null;
    }

}
