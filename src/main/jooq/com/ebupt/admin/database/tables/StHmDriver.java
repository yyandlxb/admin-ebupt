/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.StHmDriverRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class StHmDriver extends TableImpl<StHmDriverRecord> {

    private static final long serialVersionUID = -2126182733;

    /**
     * The reference instance of <code>st.st_hm_driver</code>
     */
    public static final StHmDriver ST_HM_DRIVER = new StHmDriver();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StHmDriverRecord> getRecordType() {
        return StHmDriverRecord.class;
    }

    /**
     * The column <code>st.st_hm_driver.id</code>.
     */
    public final TableField<StHmDriverRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.st_hm_driver.user_name</code>. 姓名
     */
    public final TableField<StHmDriverRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "姓名");

    /**
     * The column <code>st.st_hm_driver.user_phone</code>. 电话
     */
    public final TableField<StHmDriverRecord, String> USER_PHONE = createField("user_phone", org.jooq.impl.SQLDataType.VARCHAR(11), this, "电话");

    /**
     * The column <code>st.st_hm_driver.plate_number</code>. 车牌号
     */
    public final TableField<StHmDriverRecord, String> PLATE_NUMBER = createField("plate_number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "车牌号");

    /**
     * The column <code>st.st_hm_driver.vehicle_length</code>. 车长
     */
    public final TableField<StHmDriverRecord, String> VEHICLE_LENGTH = createField("vehicle_length", org.jooq.impl.SQLDataType.VARCHAR(255), this, "车长");

    /**
     * The column <code>st.st_hm_driver.vehicle_type</code>. 车型
     */
    public final TableField<StHmDriverRecord, String> VEHICLE_TYPE = createField("vehicle_type", org.jooq.impl.SQLDataType.VARCHAR(255), this, "车型");

    /**
     * The column <code>st.st_hm_driver.create_time</code>. 同步时间
     */
    public final TableField<StHmDriverRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "同步时间");

    /**
     * The column <code>st.st_hm_driver.update_time</code>. 更新时间
     */
    public final TableField<StHmDriverRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>st.st_hm_driver.status</code>. 0 有效 1 无效
     */
    public final TableField<StHmDriverRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "0 有效 1 无效");

    /**
     * The column <code>st.st_hm_driver.audit_status</code>. 审核状态 '司机状态：\r\n1. 待提交\r\n2. 待审核\r\n3. 已通过\r\n4. 未通过 \r\n5. 无效'
     */
    public final TableField<StHmDriverRecord, String> AUDIT_STATUS = createField("audit_status", org.jooq.impl.SQLDataType.VARCHAR(2), this, "审核状态 '司机状态：\\r\\n1. 待提交\\r\\n2. 待审核\\r\\n3. 已通过\\r\\n4. 未通过 \\r\\n5. 无效'");

    /**
     * The column <code>st.st_hm_driver.work_status</code>. 工作状态 1空闲中／2接单中／3离线（不接单状态）'
     */
    public final TableField<StHmDriverRecord, String> WORK_STATUS = createField("work_status", org.jooq.impl.SQLDataType.VARCHAR(2), this, "工作状态 1空闲中／2接单中／3离线（不接单状态）'");

    /**
     * The column <code>st.st_hm_driver.vehicle_status</code>. 车辆审核状态
     */
    public final TableField<StHmDriverRecord, String> VEHICLE_STATUS = createField("vehicle_status", org.jooq.impl.SQLDataType.VARCHAR(2), this, "车辆审核状态");

    /**
     * The column <code>st.st_hm_driver.vehicle_work_status</code>. 车辆工作状态
     */
    public final TableField<StHmDriverRecord, String> VEHICLE_WORK_STATUS = createField("vehicle_work_status", org.jooq.impl.SQLDataType.VARCHAR(2), this, "车辆工作状态");

    /**
     * The column <code>st.st_hm_driver.driver_id_card</code>. 干线司机身份证
     */
    public final TableField<StHmDriverRecord, String> DRIVER_ID_CARD = createField("driver_id_card", org.jooq.impl.SQLDataType.VARCHAR(255), this, "干线司机身份证");

    /**
     * The column <code>st.st_hm_driver.busy</code>. 忙碌标志位，决定主次包
     */
    public final TableField<StHmDriverRecord, Boolean> BUSY = createField("busy", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "忙碌标志位，决定主次包");

    /**
     * The column <code>st.st_hm_driver.bank_account_name</code>.
     */
    public final TableField<StHmDriverRecord, String> BANK_ACCOUNT_NAME = createField("bank_account_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>st.st_hm_driver.bank_account_number</code>.
     */
    public final TableField<StHmDriverRecord, String> BANK_ACCOUNT_NUMBER = createField("bank_account_number", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>st.st_hm_driver.opening_bank</code>. 开户行
     */
    public final TableField<StHmDriverRecord, String> OPENING_BANK = createField("opening_bank", org.jooq.impl.SQLDataType.VARCHAR(50), this, "开户行");

    /**
     * Create a <code>st.st_hm_driver</code> table reference
     */
    public StHmDriver() {
        this(DSL.name("st_hm_driver"), null);
    }

    /**
     * Create an aliased <code>st.st_hm_driver</code> table reference
     */
    public StHmDriver(String alias) {
        this(DSL.name(alias), ST_HM_DRIVER);
    }

    /**
     * Create an aliased <code>st.st_hm_driver</code> table reference
     */
    public StHmDriver(Name alias) {
        this(alias, ST_HM_DRIVER);
    }

    private StHmDriver(Name alias, Table<StHmDriverRecord> aliased) {
        this(alias, aliased, null);
    }

    private StHmDriver(Name alias, Table<StHmDriverRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return St.ST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ST_HM_DRIVER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StHmDriverRecord> getPrimaryKey() {
        return Keys.KEY_ST_HM_DRIVER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StHmDriverRecord>> getKeys() {
        return Arrays.<UniqueKey<StHmDriverRecord>>asList(Keys.KEY_ST_HM_DRIVER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StHmDriver as(String alias) {
        return new StHmDriver(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StHmDriver as(Name alias) {
        return new StHmDriver(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StHmDriver rename(String name) {
        return new StHmDriver(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StHmDriver rename(Name name) {
        return new StHmDriver(name, null);
    }
}