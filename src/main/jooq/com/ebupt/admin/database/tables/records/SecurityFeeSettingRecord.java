/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.SecurityFeeSetting;

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
public class SecurityFeeSettingRecord extends UpdatableRecordImpl<SecurityFeeSettingRecord> implements Record11<Integer, Timestamp, Timestamp, Integer, BigDecimal, BigDecimal, String, String, BigDecimal, BigDecimal, String> {

    private static final long serialVersionUID = -1959167916;

    /**
     * Setter for <code>st.security_fee_setting.id</code>.
     */
    public SecurityFeeSettingRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.security_fee_setting.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.security_fee_setting.create_time</code>.
     */
    public SecurityFeeSettingRecord setCreateTime(Timestamp value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.security_fee_setting.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>st.security_fee_setting.update_time</code>.
     */
    public SecurityFeeSettingRecord setUpdateTime(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.security_fee_setting.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>st.security_fee_setting.status</code>. 0 正常  1 删除
     */
    public SecurityFeeSettingRecord setStatus(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.security_fee_setting.status</code>. 0 正常  1 删除
     */
    public Integer getStatus() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>st.security_fee_setting.start_point</code>. 开始节点
     */
    public SecurityFeeSettingRecord setStartPoint(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.security_fee_setting.start_point</code>. 开始节点
     */
    public BigDecimal getStartPoint() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>st.security_fee_setting.end_point</code>. 结束节点
     */
    public SecurityFeeSettingRecord setEndPoint(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.security_fee_setting.end_point</code>. 结束节点
     */
    public BigDecimal getEndPoint() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>st.security_fee_setting.line_code</code>. 线路code
     */
    public SecurityFeeSettingRecord setLineCode(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.security_fee_setting.line_code</code>. 线路code
     */
    public String getLineCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>st.security_fee_setting.oper_user</code>. 创建人
     */
    public SecurityFeeSettingRecord setOperUser(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.security_fee_setting.oper_user</code>. 创建人
     */
    public String getOperUser() {
        return (String) get(7);
    }

    /**
     * Setter for <code>st.security_fee_setting.fee_percent</code>. 百分比
     */
    public SecurityFeeSettingRecord setFeePercent(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.security_fee_setting.fee_percent</code>. 百分比
     */
    public BigDecimal getFeePercent() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>st.security_fee_setting.fee_amount</code>. 默认值
     */
    public SecurityFeeSettingRecord setFeeAmount(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.security_fee_setting.fee_amount</code>. 默认值
     */
    public BigDecimal getFeeAmount() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>st.security_fee_setting.type</code>. 0:百分比，1：根据件数
     */
    public SecurityFeeSettingRecord setType(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.security_fee_setting.type</code>. 0:百分比，1：根据件数
     */
    public String getType() {
        return (String) get(10);
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
    public Row11<Integer, Timestamp, Timestamp, Integer, BigDecimal, BigDecimal, String, String, BigDecimal, BigDecimal, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Timestamp, Timestamp, Integer, BigDecimal, BigDecimal, String, String, BigDecimal, BigDecimal, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SecurityFeeSetting.SECURITY_FEE_SETTING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return SecurityFeeSetting.SECURITY_FEE_SETTING.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return SecurityFeeSetting.SECURITY_FEE_SETTING.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return SecurityFeeSetting.SECURITY_FEE_SETTING.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return SecurityFeeSetting.SECURITY_FEE_SETTING.START_POINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return SecurityFeeSetting.SECURITY_FEE_SETTING.END_POINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SecurityFeeSetting.SECURITY_FEE_SETTING.LINE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SecurityFeeSetting.SECURITY_FEE_SETTING.OPER_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return SecurityFeeSetting.SECURITY_FEE_SETTING.FEE_PERCENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return SecurityFeeSetting.SECURITY_FEE_SETTING.FEE_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SecurityFeeSetting.SECURITY_FEE_SETTING.TYPE;
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
    public Timestamp component2() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getStartPoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getEndPoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLineCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getOperUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getFeePercent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getFeeAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getType();
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
    public Timestamp value2() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getStartPoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getEndPoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLineCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getOperUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getFeePercent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getFeeAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSettingRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSettingRecord value2(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSettingRecord value3(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSettingRecord value4(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSettingRecord value5(BigDecimal value) {
        setStartPoint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSettingRecord value6(BigDecimal value) {
        setEndPoint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSettingRecord value7(String value) {
        setLineCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSettingRecord value8(String value) {
        setOperUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSettingRecord value9(BigDecimal value) {
        setFeePercent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSettingRecord value10(BigDecimal value) {
        setFeeAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSettingRecord value11(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityFeeSettingRecord values(Integer value1, Timestamp value2, Timestamp value3, Integer value4, BigDecimal value5, BigDecimal value6, String value7, String value8, BigDecimal value9, BigDecimal value10, String value11) {
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
     * Create a detached SecurityFeeSettingRecord
     */
    public SecurityFeeSettingRecord() {
        super(SecurityFeeSetting.SECURITY_FEE_SETTING);
    }

    /**
     * Create a detached, initialised SecurityFeeSettingRecord
     */
    public SecurityFeeSettingRecord(Integer id, Timestamp createTime, Timestamp updateTime, Integer status, BigDecimal startPoint, BigDecimal endPoint, String lineCode, String operUser, BigDecimal feePercent, BigDecimal feeAmount, String type) {
        super(SecurityFeeSetting.SECURITY_FEE_SETTING);

        set(0, id);
        set(1, createTime);
        set(2, updateTime);
        set(3, status);
        set(4, startPoint);
        set(5, endPoint);
        set(6, lineCode);
        set(7, operUser);
        set(8, feePercent);
        set(9, feeAmount);
        set(10, type);
    }
}
