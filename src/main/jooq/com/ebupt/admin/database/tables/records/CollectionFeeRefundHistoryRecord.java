/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.CollectionFeeRefundHistory;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class CollectionFeeRefundHistoryRecord extends UpdatableRecordImpl<CollectionFeeRefundHistoryRecord> implements Record15<Integer, Integer, String, Integer, String, String, String, String, String, String, Timestamp, Byte, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1969260011;

    /**
     * Setter for <code>st.collection_fee_refund_history.id</code>.
     */
    public CollectionFeeRefundHistoryRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.refund_id</code>.
     */
    public CollectionFeeRefundHistoryRecord setRefundId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.refund_id</code>.
     */
    public Integer getRefundId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.no</code>. 转账流水号
     */
    public CollectionFeeRefundHistoryRecord setNo(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.no</code>. 转账流水号
     */
    public String getNo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.amount</code>. 转账金额
     */
    public CollectionFeeRefundHistoryRecord setAmount(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.amount</code>. 转账金额
     */
    public Integer getAmount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.account</code>. 收款方账户
     */
    public CollectionFeeRefundHistoryRecord setAccount(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.account</code>. 收款方账户
     */
    public String getAccount() {
        return (String) get(4);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.payee</code>. 收款人姓名
     */
    public CollectionFeeRefundHistoryRecord setPayee(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.payee</code>. 收款人姓名
     */
    public String getPayee() {
        return (String) get(5);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.province</code>. 收款账户开户行所在省份代码
     */
    public CollectionFeeRefundHistoryRecord setProvince(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.province</code>. 收款账户开户行所在省份代码
     */
    public String getProvince() {
        return (String) get(6);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.bank_code</code>. 收款账户银行代码
     */
    public CollectionFeeRefundHistoryRecord setBankCode(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.bank_code</code>. 收款账户银行代码
     */
    public String getBankCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.subbranch_code</code>. 收款账户支行行号
     */
    public CollectionFeeRefundHistoryRecord setSubbranchCode(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.subbranch_code</code>. 收款账户支行行号
     */
    public String getSubbranchCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.subbranch_name</code>. 收款账户支行名称
     */
    public CollectionFeeRefundHistoryRecord setSubbranchName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.subbranch_name</code>. 收款账户支行名称
     */
    public String getSubbranchName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.expire_time</code>. 执行超时时间
     */
    public CollectionFeeRefundHistoryRecord setExpireTime(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.expire_time</code>. 执行超时时间
     */
    public Timestamp getExpireTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.status</code>.
     */
    public CollectionFeeRefundHistoryRecord setStatus(Byte value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.message</code>.
     */
    public CollectionFeeRefundHistoryRecord setMessage(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.message</code>.
     */
    public String getMessage() {
        return (String) get(12);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.created_at</code>.
     */
    public CollectionFeeRefundHistoryRecord setCreatedAt(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>st.collection_fee_refund_history.updated_at</code>.
     */
    public CollectionFeeRefundHistoryRecord setUpdatedAt(Timestamp value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_refund_history.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, String, Integer, String, String, String, String, String, String, Timestamp, Byte, String, Timestamp, Timestamp> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, String, Integer, String, String, String, String, String, String, Timestamp, Byte, String, Timestamp, Timestamp> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.REFUND_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.PAYEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.PROVINCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.BANK_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.SUBBRANCH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.SUBBRANCH_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.EXPIRE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY.UPDATED_AT;
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
        return getRefundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPayee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getProvince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getSubbranchCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getSubbranchName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component12() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component15() {
        return getUpdatedAt();
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
        return getRefundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPayee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getProvince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSubbranchCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getSubbranchName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value2(Integer value) {
        setRefundId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value3(String value) {
        setNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value4(Integer value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value5(String value) {
        setAccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value6(String value) {
        setPayee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value7(String value) {
        setProvince(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value8(String value) {
        setBankCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value9(String value) {
        setSubbranchCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value10(String value) {
        setSubbranchName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value11(Timestamp value) {
        setExpireTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value12(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value13(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value14(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord value15(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRefundHistoryRecord values(Integer value1, Integer value2, String value3, Integer value4, String value5, String value6, String value7, String value8, String value9, String value10, Timestamp value11, Byte value12, String value13, Timestamp value14, Timestamp value15) {
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
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollectionFeeRefundHistoryRecord
     */
    public CollectionFeeRefundHistoryRecord() {
        super(CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY);
    }

    /**
     * Create a detached, initialised CollectionFeeRefundHistoryRecord
     */
    public CollectionFeeRefundHistoryRecord(Integer id, Integer refundId, String no, Integer amount, String account, String payee, String province, String bankCode, String subbranchCode, String subbranchName, Timestamp expireTime, Byte status, String message, Timestamp createdAt, Timestamp updatedAt) {
        super(CollectionFeeRefundHistory.COLLECTION_FEE_REFUND_HISTORY);

        set(0, id);
        set(1, refundId);
        set(2, no);
        set(3, amount);
        set(4, account);
        set(5, payee);
        set(6, province);
        set(7, bankCode);
        set(8, subbranchCode);
        set(9, subbranchName);
        set(10, expireTime);
        set(11, status);
        set(12, message);
        set(13, createdAt);
        set(14, updatedAt);
    }
}
