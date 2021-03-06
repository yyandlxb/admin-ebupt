/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.ClearMoneyLog;

import java.math.BigDecimal;
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
public class ClearMoneyLogRecord extends UpdatableRecordImpl<ClearMoneyLogRecord> implements Record15<Integer, String, Integer, Timestamp, Timestamp, String, String, BigDecimal, String, String, String, String, String, String, Integer> {

    private static final long serialVersionUID = -1599500675;

    /**
     * Setter for <code>st.clear_money_log.id</code>.
     */
    public ClearMoneyLogRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.clear_money_log.code</code>. 清分账号
     */
    public ClearMoneyLogRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.code</code>. 清分账号
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.clear_money_log.status</code>. 1,成功,2,失败
     */
    public ClearMoneyLogRecord setStatus(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.status</code>. 1,成功,2,失败
     */
    public Integer getStatus() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>st.clear_money_log.created_at</code>.
     */
    public ClearMoneyLogRecord setCreatedAt(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>st.clear_money_log.updated_at</code>.
     */
    public ClearMoneyLogRecord setUpdatedAt(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>st.clear_money_log.message</code>. 原因
     */
    public ClearMoneyLogRecord setMessage(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.message</code>. 原因
     */
    public String getMessage() {
        return (String) get(5);
    }

    /**
     * Setter for <code>st.clear_money_log.bank_card_number</code>. 银行卡号
     */
    public ClearMoneyLogRecord setBankCardNumber(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.bank_card_number</code>. 银行卡号
     */
    public String getBankCardNumber() {
        return (String) get(6);
    }

    /**
     * Setter for <code>st.clear_money_log.money</code>.
     */
    public ClearMoneyLogRecord setMoney(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.money</code>.
     */
    public BigDecimal getMoney() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>st.clear_money_log.name</code>. 姓名
     */
    public ClearMoneyLogRecord setName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.name</code>. 姓名
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>st.clear_money_log.bank_card_name</code>. 银行名称
     */
    public ClearMoneyLogRecord setBankCardName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.bank_card_name</code>. 银行名称
     */
    public String getBankCardName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>st.clear_money_log.bank_code</code>. 银行代码
     */
    public ClearMoneyLogRecord setBankCode(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.bank_code</code>. 银行代码
     */
    public String getBankCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>st.clear_money_log.opening_bank_name</code>. 开户行名称
     */
    public ClearMoneyLogRecord setOpeningBankName(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.opening_bank_name</code>. 开户行名称
     */
    public String getOpeningBankName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>st.clear_money_log.opening_bank_code</code>. 开户行行号
     */
    public ClearMoneyLogRecord setOpeningBankCode(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.opening_bank_code</code>. 开户行行号
     */
    public String getOpeningBankCode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>st.clear_money_log.user_phone</code>.
     */
    public ClearMoneyLogRecord setUserPhone(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.user_phone</code>.
     */
    public String getUserPhone() {
        return (String) get(13);
    }

    /**
     * Setter for <code>st.clear_money_log.clear_money_new_id</code>. 关联clear_money_new ID
     */
    public ClearMoneyLogRecord setClearMoneyNewId(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money_log.clear_money_new_id</code>. 关联clear_money_new ID
     */
    public Integer getClearMoneyNewId() {
        return (Integer) get(14);
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
    public Row15<Integer, String, Integer, Timestamp, Timestamp, String, String, BigDecimal, String, String, String, String, String, String, Integer> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, Integer, Timestamp, Timestamp, String, String, BigDecimal, String, String, String, String, String, String, Integer> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.BANK_CARD_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.BANK_CARD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.BANK_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.OPENING_BANK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.OPENING_BANK_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.USER_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return ClearMoneyLog.CLEAR_MONEY_LOG.CLEAR_MONEY_NEW_ID;
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
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getBankCardNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getBankCardName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getOpeningBankName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getOpeningBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getUserPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getClearMoneyNewId();
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
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBankCardNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getBankCardName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getOpeningBankName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getOpeningBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getUserPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getClearMoneyNewId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value2(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value3(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value4(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value5(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value6(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value7(String value) {
        setBankCardNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value8(BigDecimal value) {
        setMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value9(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value10(String value) {
        setBankCardName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value11(String value) {
        setBankCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value12(String value) {
        setOpeningBankName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value13(String value) {
        setOpeningBankCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value14(String value) {
        setUserPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord value15(Integer value) {
        setClearMoneyNewId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyLogRecord values(Integer value1, String value2, Integer value3, Timestamp value4, Timestamp value5, String value6, String value7, BigDecimal value8, String value9, String value10, String value11, String value12, String value13, String value14, Integer value15) {
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
     * Create a detached ClearMoneyLogRecord
     */
    public ClearMoneyLogRecord() {
        super(ClearMoneyLog.CLEAR_MONEY_LOG);
    }

    /**
     * Create a detached, initialised ClearMoneyLogRecord
     */
    public ClearMoneyLogRecord(Integer id, String code, Integer status, Timestamp createdAt, Timestamp updatedAt, String message, String bankCardNumber, BigDecimal money, String name, String bankCardName, String bankCode, String openingBankName, String openingBankCode, String userPhone, Integer clearMoneyNewId) {
        super(ClearMoneyLog.CLEAR_MONEY_LOG);

        set(0, id);
        set(1, code);
        set(2, status);
        set(3, createdAt);
        set(4, updatedAt);
        set(5, message);
        set(6, bankCardNumber);
        set(7, money);
        set(8, name);
        set(9, bankCardName);
        set(10, bankCode);
        set(11, openingBankName);
        set(12, openingBankCode);
        set(13, userPhone);
        set(14, clearMoneyNewId);
    }
}
