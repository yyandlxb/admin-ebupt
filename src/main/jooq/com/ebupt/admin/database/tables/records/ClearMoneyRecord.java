/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.ClearMoney;

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
public class ClearMoneyRecord extends UpdatableRecordImpl<ClearMoneyRecord> implements Record11<Integer, Integer, String, Timestamp, Integer, String, Integer, BigDecimal, String, Integer, String> {

    private static final long serialVersionUID = 351686289;

    /**
     * Setter for <code>st.clear_money.id</code>.
     */
    public ClearMoneyRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.clear_money.bcr_id</code>. 财务统计表ID
     */
    public ClearMoneyRecord setBcrId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money.bcr_id</code>. 财务统计表ID
     */
    public Integer getBcrId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>st.clear_money.type</code>. 1:运费,2:垫付款3:代收款
     */
    public ClearMoneyRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money.type</code>. 1:运费,2:垫付款3:代收款
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.clear_money.clear_time</code>. 清分的时间
     */
    public ClearMoneyRecord setClearTime(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money.clear_time</code>. 清分的时间
     */
    public Timestamp getClearTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>st.clear_money.user_id</code>. 清分的人Id
     */
    public ClearMoneyRecord setUserId(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money.user_id</code>. 清分的人Id
     */
    public Integer getUserId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>st.clear_money.clear_code</code>. 清分单号
     */
    public ClearMoneyRecord setClearCode(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money.clear_code</code>. 清分单号
     */
    public String getClearCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>st.clear_money.bankCard_id</code>. 银行卡ID
     */
    public ClearMoneyRecord setBankcardId(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money.bankCard_id</code>. 银行卡ID
     */
    public Integer getBankcardId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>st.clear_money.clear_money</code>. 清分的钱数
     */
    public ClearMoneyRecord setClearMoney(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money.clear_money</code>. 清分的钱数
     */
    public BigDecimal getClearMoney() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>st.clear_money.line_code</code>. 线路Code
     */
    public ClearMoneyRecord setLineCode(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money.line_code</code>. 线路Code
     */
    public String getLineCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>st.clear_money.business_id</code>. 商户ID
     */
    public ClearMoneyRecord setBusinessId(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money.business_id</code>. 商户ID
     */
    public Integer getBusinessId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>st.clear_money.send_time</code>. 报表时间
     */
    public ClearMoneyRecord setSendTime(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.clear_money.send_time</code>. 报表时间
     */
    public String getSendTime() {
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
    public Row11<Integer, Integer, String, Timestamp, Integer, String, Integer, BigDecimal, String, Integer, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, String, Timestamp, Integer, String, Integer, BigDecimal, String, Integer, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ClearMoney.CLEAR_MONEY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ClearMoney.CLEAR_MONEY.BCR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ClearMoney.CLEAR_MONEY.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ClearMoney.CLEAR_MONEY.CLEAR_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ClearMoney.CLEAR_MONEY.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ClearMoney.CLEAR_MONEY.CLEAR_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ClearMoney.CLEAR_MONEY.BANKCARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return ClearMoney.CLEAR_MONEY.CLEAR_MONEY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ClearMoney.CLEAR_MONEY.LINE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ClearMoney.CLEAR_MONEY.BUSINESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ClearMoney.CLEAR_MONEY.SEND_TIME;
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
        return getBcrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getClearTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getClearCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getBankcardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getClearMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getLineCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getBusinessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSendTime();
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
        return getBcrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getClearTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getClearCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getBankcardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getClearMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLineCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getBusinessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSendTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyRecord value2(Integer value) {
        setBcrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyRecord value4(Timestamp value) {
        setClearTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyRecord value5(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyRecord value6(String value) {
        setClearCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyRecord value7(Integer value) {
        setBankcardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyRecord value8(BigDecimal value) {
        setClearMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyRecord value9(String value) {
        setLineCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyRecord value10(Integer value) {
        setBusinessId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyRecord value11(String value) {
        setSendTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClearMoneyRecord values(Integer value1, Integer value2, String value3, Timestamp value4, Integer value5, String value6, Integer value7, BigDecimal value8, String value9, Integer value10, String value11) {
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
     * Create a detached ClearMoneyRecord
     */
    public ClearMoneyRecord() {
        super(ClearMoney.CLEAR_MONEY);
    }

    /**
     * Create a detached, initialised ClearMoneyRecord
     */
    public ClearMoneyRecord(Integer id, Integer bcrId, String type, Timestamp clearTime, Integer userId, String clearCode, Integer bankcardId, BigDecimal clearMoney, String lineCode, Integer businessId, String sendTime) {
        super(ClearMoney.CLEAR_MONEY);

        set(0, id);
        set(1, bcrId);
        set(2, type);
        set(3, clearTime);
        set(4, userId);
        set(5, clearCode);
        set(6, bankcardId);
        set(7, clearMoney);
        set(8, lineCode);
        set(9, businessId);
        set(10, sendTime);
    }
}
