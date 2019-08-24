/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.SecurityFeeSettingRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
public class SecurityFeeSetting extends TableImpl<SecurityFeeSettingRecord> {

    private static final long serialVersionUID = -1173218886;

    /**
     * The reference instance of <code>st.security_fee_setting</code>
     */
    public static final SecurityFeeSetting SECURITY_FEE_SETTING = new SecurityFeeSetting();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SecurityFeeSettingRecord> getRecordType() {
        return SecurityFeeSettingRecord.class;
    }

    /**
     * The column <code>st.security_fee_setting.id</code>.
     */
    public final TableField<SecurityFeeSettingRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.security_fee_setting.create_time</code>.
     */
    public final TableField<SecurityFeeSettingRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>st.security_fee_setting.update_time</code>.
     */
    public final TableField<SecurityFeeSettingRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>st.security_fee_setting.status</code>. 0 正常  1 删除
     */
    public final TableField<SecurityFeeSettingRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0 正常  1 删除");

    /**
     * The column <code>st.security_fee_setting.start_point</code>. 开始节点
     */
    public final TableField<SecurityFeeSettingRecord, BigDecimal> START_POINT = createField("start_point", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false), this, "开始节点");

    /**
     * The column <code>st.security_fee_setting.end_point</code>. 结束节点
     */
    public final TableField<SecurityFeeSettingRecord, BigDecimal> END_POINT = createField("end_point", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false), this, "结束节点");

    /**
     * The column <code>st.security_fee_setting.line_code</code>. 线路code
     */
    public final TableField<SecurityFeeSettingRecord, String> LINE_CODE = createField("line_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "线路code");

    /**
     * The column <code>st.security_fee_setting.oper_user</code>. 创建人
     */
    public final TableField<SecurityFeeSettingRecord, String> OPER_USER = createField("oper_user", org.jooq.impl.SQLDataType.VARCHAR(255), this, "创建人");

    /**
     * The column <code>st.security_fee_setting.fee_percent</code>. 百分比
     */
    public final TableField<SecurityFeeSettingRecord, BigDecimal> FEE_PERCENT = createField("fee_percent", org.jooq.impl.SQLDataType.DECIMAL(20, 2), this, "百分比");

    /**
     * The column <code>st.security_fee_setting.fee_amount</code>. 默认值
     */
    public final TableField<SecurityFeeSettingRecord, BigDecimal> FEE_AMOUNT = createField("fee_amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2), this, "默认值");

    /**
     * The column <code>st.security_fee_setting.type</code>. 0:百分比，1：根据件数
     */
    public final TableField<SecurityFeeSettingRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(2), this, "0:百分比，1：根据件数");

    /**
     * Create a <code>st.security_fee_setting</code> table reference
     */
    public SecurityFeeSetting() {
        this(DSL.name("security_fee_setting"), null);
    }

    /**
     * Create an aliased <code>st.security_fee_setting</code> table reference
     */
    public SecurityFeeSetting(String alias) {
        this(DSL.name(alias), SECURITY_FEE_SETTING);
    }

    /**
     * Create an aliased <code>st.security_fee_setting</code> table reference
     */
    public SecurityFeeSetting(Name alias) {
        this(alias, SECURITY_FEE_SETTING);
    }

    private SecurityFeeSetting(Name alias, Table<SecurityFeeSettingRecord> aliased) {
        this(alias, aliased, null);
    }

    private SecurityFeeSetting(Name alias, Table<SecurityFeeSettingRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.SECURITY_FEE_SETTING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SecurityFeeSettingRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SECURITY_FEE_SETTING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SecurityFeeSettingRecord> getPrimaryKey() {
        return Keys.KEY_SECURITY_FEE_SETTING_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SecurityFeeSettingRecord>> getKeys() {
        return Arrays.<UniqueKey<SecurityFeeSettingRecord>>asList(Keys.KEY_SECURITY_FEE_SETTING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSetting as(String alias) {
        return new SecurityFeeSetting(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSetting as(Name alias) {
        return new SecurityFeeSetting(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SecurityFeeSetting rename(String name) {
        return new SecurityFeeSetting(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SecurityFeeSetting rename(Name name) {
        return new SecurityFeeSetting(name, null);
    }
}
