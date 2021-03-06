/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.TBackstageOperationRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 后台操作记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBackstageOperationRecordRecord extends UpdatableRecordImpl<TBackstageOperationRecordRecord> implements Record7<Integer, Integer, Timestamp, String, String, String, String> {

    private static final long serialVersionUID = -1401327947;

    /**
     * Setter for <code>st.t_backstage_operation_record.id</code>.
     */
    public TBackstageOperationRecordRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.t_backstage_operation_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.t_backstage_operation_record.user_id</code>. 关联t_backstage_user表USERID
     */
    public TBackstageOperationRecordRecord setUserId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.t_backstage_operation_record.user_id</code>. 关联t_backstage_user表USERID
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>st.t_backstage_operation_record.create_time</code>. 创建时间
     */
    public TBackstageOperationRecordRecord setCreateTime(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.t_backstage_operation_record.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>st.t_backstage_operation_record.operation_content</code>. 操作类容
     */
    public TBackstageOperationRecordRecord setOperationContent(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.t_backstage_operation_record.operation_content</code>. 操作类容
     */
    public String getOperationContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.t_backstage_operation_record.phone</code>. 手机号
     */
    public TBackstageOperationRecordRecord setPhone(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.t_backstage_operation_record.phone</code>. 手机号
     */
    public String getPhone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>st.t_backstage_operation_record.order_code</code>. 订单号
     */
    public TBackstageOperationRecordRecord setOrderCode(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.t_backstage_operation_record.order_code</code>. 订单号
     */
    public String getOrderCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>st.t_backstage_operation_record.flag</code>. 1：改变了目的地，2：改变了价格，3：改变了异常信息，4:进行办票，5，支付记录,6:打印次数7、拆包
     */
    public TBackstageOperationRecordRecord setFlag(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.t_backstage_operation_record.flag</code>. 1：改变了目的地，2：改变了价格，3：改变了异常信息，4:进行办票，5，支付记录,6:打印次数7、拆包
     */
    public String getFlag() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Timestamp, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Timestamp, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TBackstageOperationRecord.T_BACKSTAGE_OPERATION_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TBackstageOperationRecord.T_BACKSTAGE_OPERATION_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TBackstageOperationRecord.T_BACKSTAGE_OPERATION_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TBackstageOperationRecord.T_BACKSTAGE_OPERATION_RECORD.OPERATION_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TBackstageOperationRecord.T_BACKSTAGE_OPERATION_RECORD.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TBackstageOperationRecord.T_BACKSTAGE_OPERATION_RECORD.ORDER_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TBackstageOperationRecord.T_BACKSTAGE_OPERATION_RECORD.FLAG;
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
    public Integer component2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOperationContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getOrderCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getFlag();
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
    public Integer value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOperationContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOrderCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBackstageOperationRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBackstageOperationRecordRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBackstageOperationRecordRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBackstageOperationRecordRecord value4(String value) {
        setOperationContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBackstageOperationRecordRecord value5(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBackstageOperationRecordRecord value6(String value) {
        setOrderCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBackstageOperationRecordRecord value7(String value) {
        setFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBackstageOperationRecordRecord values(Integer value1, Integer value2, Timestamp value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TBackstageOperationRecordRecord
     */
    public TBackstageOperationRecordRecord() {
        super(TBackstageOperationRecord.T_BACKSTAGE_OPERATION_RECORD);
    }

    /**
     * Create a detached, initialised TBackstageOperationRecordRecord
     */
    public TBackstageOperationRecordRecord(Integer id, Integer userId, Timestamp createTime, String operationContent, String phone, String orderCode, String flag) {
        super(TBackstageOperationRecord.T_BACKSTAGE_OPERATION_RECORD);

        set(0, id);
        set(1, userId);
        set(2, createTime);
        set(3, operationContent);
        set(4, phone);
        set(5, orderCode);
        set(6, flag);
    }
}
