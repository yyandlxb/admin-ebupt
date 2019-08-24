/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.SmsInfo;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class SmsInfoRecord extends UpdatableRecordImpl<SmsInfoRecord> implements Record6<Integer, String, String, String, String, Timestamp> {

    private static final long serialVersionUID = -1208384269;

    /**
     * Setter for <code>st.sms_info.id</code>.
     */
    public SmsInfoRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.sms_info.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.sms_info.phone</code>.
     */
    public SmsInfoRecord setPhone(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.sms_info.phone</code>.
     */
    public String getPhone() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.sms_info.order_code</code>.
     */
    public SmsInfoRecord setOrderCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.sms_info.order_code</code>.
     */
    public String getOrderCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.sms_info.info</code>.
     */
    public SmsInfoRecord setInfo(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.sms_info.info</code>.
     */
    public String getInfo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.sms_info.type</code>. 到货短信
     */
    public SmsInfoRecord setType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.sms_info.type</code>. 到货短信
     */
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>st.sms_info.create_time</code>. 发送时间
     */
    public SmsInfoRecord setCreateTime(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.sms_info.create_time</code>. 发送时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, String, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, String, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SmsInfo.SMS_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SmsInfo.SMS_INFO.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SmsInfo.SMS_INFO.ORDER_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SmsInfo.SMS_INFO.INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SmsInfo.SMS_INFO.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return SmsInfo.SMS_INFO.CREATE_TIME;
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
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOrderCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreateTime();
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
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOrderCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsInfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsInfoRecord value2(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsInfoRecord value3(String value) {
        setOrderCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsInfoRecord value4(String value) {
        setInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsInfoRecord value5(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsInfoRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsInfoRecord values(Integer value1, String value2, String value3, String value4, String value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SmsInfoRecord
     */
    public SmsInfoRecord() {
        super(SmsInfo.SMS_INFO);
    }

    /**
     * Create a detached, initialised SmsInfoRecord
     */
    public SmsInfoRecord(Integer id, String phone, String orderCode, String info, String type, Timestamp createTime) {
        super(SmsInfo.SMS_INFO);

        set(0, id);
        set(1, phone);
        set(2, orderCode);
        set(3, info);
        set(4, type);
        set(5, createTime);
    }
}
