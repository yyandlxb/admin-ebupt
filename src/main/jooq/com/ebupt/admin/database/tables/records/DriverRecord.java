/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.Driver;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DriverRecord extends UpdatableRecordImpl<DriverRecord> implements Record11<Integer, String, String, String, Integer, Integer, Timestamp, Integer, Integer, BigDecimal, Integer> {

    private static final long serialVersionUID = -963194684;

    /**
     * Setter for <code>st.driver.id</code>.
     */
    public DriverRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.driver.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.driver.driver_name</code>.
     */
    public DriverRecord setDriverName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.driver.driver_name</code>.
     */
    public String getDriverName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.driver.driver_phone</code>.
     */
    public DriverRecord setDriverPhone(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.driver.driver_phone</code>.
     */
    public String getDriverPhone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.driver.plate_number</code>. 车牌号
     */
    public DriverRecord setPlateNumber(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.driver.plate_number</code>. 车牌号
     */
    public String getPlateNumber() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.driver.work_status</code>. 1：未出车 2：出车
     */
    public DriverRecord setWorkStatus(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.driver.work_status</code>. 1：未出车 2：出车
     */
    public Integer getWorkStatus() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>st.driver.driver_status</code>. 0：正常 1：删除
     */
    public DriverRecord setDriverStatus(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.driver.driver_status</code>. 0：正常 1：删除
     */
    public Integer getDriverStatus() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>st.driver.create_time</code>.
     */
    public DriverRecord setCreateTime(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.driver.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>st.driver.order_num</code>. 订单数
     */
    public DriverRecord setOrderNum(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.driver.order_num</code>. 订单数
     */
    public Integer getOrderNum() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>st.driver.goods_num</code>. 商品数
     */
    public DriverRecord setGoodsNum(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.driver.goods_num</code>. 商品数
     */
    public Integer getGoodsNum() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>st.driver.total_price</code>. 运费
     */
    public DriverRecord setTotalPrice(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.driver.total_price</code>. 运费
     */
    public BigDecimal getTotalPrice() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>st.driver.business_id</code>. 托运部id
     */
    public DriverRecord setBusinessId(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.driver.business_id</code>. 托运部id
     */
    public Integer getBusinessId() {
        return (Integer) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, Integer, Integer, Timestamp, Integer, Integer, BigDecimal, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, Integer, Integer, Timestamp, Integer, Integer, BigDecimal, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Driver.DRIVER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Driver.DRIVER.DRIVER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Driver.DRIVER.DRIVER_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Driver.DRIVER.PLATE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Driver.DRIVER.WORK_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Driver.DRIVER.DRIVER_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Driver.DRIVER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Driver.DRIVER.ORDER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Driver.DRIVER.GOODS_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return Driver.DRIVER.TOTAL_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Driver.DRIVER.BUSINESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDriverName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDriverPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPlateNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getWorkStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getDriverStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getOrderNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getGoodsNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getTotalPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getBusinessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDriverName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDriverPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPlateNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getWorkStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getDriverStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getOrderNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getGoodsNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getTotalPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getBusinessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value2(String value) {
        setDriverName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value3(String value) {
        setDriverPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value4(String value) {
        setPlateNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value5(Integer value) {
        setWorkStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value6(Integer value) {
        setDriverStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value7(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value8(Integer value) {
        setOrderNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value9(Integer value) {
        setGoodsNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value10(BigDecimal value) {
        setTotalPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord value11(Integer value) {
        setBusinessId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Integer value6, Timestamp value7, Integer value8, Integer value9, BigDecimal value10, Integer value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DriverRecord
     */
    public DriverRecord() {
        super(Driver.DRIVER);
    }

    /**
     * Create a detached, initialised DriverRecord
     */
    public DriverRecord(Integer id, String driverName, String driverPhone, String plateNumber, Integer workStatus, Integer driverStatus, Timestamp createTime, Integer orderNum, Integer goodsNum, BigDecimal totalPrice, Integer businessId) {
        super(Driver.DRIVER);

        set(0, id);
        set(1, driverName);
        set(2, driverPhone);
        set(3, plateNumber);
        set(4, workStatus);
        set(5, driverStatus);
        set(6, createTime);
        set(7, orderNum);
        set(8, goodsNum);
        set(9, totalPrice);
        set(10, businessId);
    }
}
