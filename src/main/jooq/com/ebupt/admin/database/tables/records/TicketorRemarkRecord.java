/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.TicketorRemark;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class TicketorRemarkRecord extends UpdatableRecordImpl<TicketorRemarkRecord> implements Record13<Integer, Timestamp, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Integer, String, String, Byte> {

    private static final long serialVersionUID = 392814992;

    /**
     * Setter for <code>st.ticketor_remark.id</code>.
     */
    public TicketorRemarkRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.ticketor_remark.create_time</code>. 创建时间
     */
    public TicketorRemarkRecord setCreateTime(Timestamp value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>st.ticketor_remark.hm_fee_change</code>. 提付运费修改
     */
    public TicketorRemarkRecord setHmFeeChange(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.hm_fee_change</code>. 提付运费修改
     */
    public BigDecimal getHmFeeChange() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>st.ticketor_remark.security_fee_change</code>. 合综服务费修改
     */
    public TicketorRemarkRecord setSecurityFeeChange(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.security_fee_change</code>. 合综服务费修改
     */
    public BigDecimal getSecurityFeeChange() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>st.ticketor_remark.wx_pay_price_change</code>. 信微修改
     */
    public TicketorRemarkRecord setWxPayPriceChange(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.wx_pay_price_change</code>. 信微修改
     */
    public BigDecimal getWxPayPriceChange() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>st.ticketor_remark.zfb_pay_price_change</code>. 付宝支修改
     */
    public TicketorRemarkRecord setZfbPayPriceChange(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.zfb_pay_price_change</code>. 付宝支修改
     */
    public BigDecimal getZfbPayPriceChange() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>st.ticketor_remark.pos_pay_price_change</code>. pos修改
     */
    public TicketorRemarkRecord setPosPayPriceChange(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.pos_pay_price_change</code>. pos修改
     */
    public BigDecimal getPosPayPriceChange() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>st.ticketor_remark.cash_pay_price_change</code>. 金现修改
     */
    public TicketorRemarkRecord setCashPayPriceChange(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.cash_pay_price_change</code>. 金现修改
     */
    public BigDecimal getCashPayPriceChange() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>st.ticketor_remark.ticketor</code>. 办票员
     */
    public TicketorRemarkRecord setTicketor(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.ticketor</code>. 办票员
     */
    public String getTicketor() {
        return (String) get(8);
    }

    /**
     * Setter for <code>st.ticketor_remark.business_id</code>.
     */
    public TicketorRemarkRecord setBusinessId(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.business_id</code>.
     */
    public Integer getBusinessId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>st.ticketor_remark.line_code</code>.
     */
    public TicketorRemarkRecord setLineCode(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.line_code</code>.
     */
    public String getLineCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>st.ticketor_remark.remark</code>. 注备
     */
    public TicketorRemarkRecord setRemark(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.remark</code>. 注备
     */
    public String getRemark() {
        return (String) get(11);
    }

    /**
     * Setter for <code>st.ticketor_remark.status</code>. 0：有效   1：失效
     */
    public TicketorRemarkRecord setStatus(Byte value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_remark.status</code>. 0：有效   1：失效
     */
    public Byte getStatus() {
        return (Byte) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Timestamp, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Integer, String, String, Byte> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Timestamp, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Integer, String, String, Byte> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TicketorRemark.TICKETOR_REMARK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return TicketorRemark.TICKETOR_REMARK.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TicketorRemark.TICKETOR_REMARK.HM_FEE_CHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TicketorRemark.TICKETOR_REMARK.SECURITY_FEE_CHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return TicketorRemark.TICKETOR_REMARK.WX_PAY_PRICE_CHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TicketorRemark.TICKETOR_REMARK.ZFB_PAY_PRICE_CHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TicketorRemark.TICKETOR_REMARK.POS_PAY_PRICE_CHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TicketorRemark.TICKETOR_REMARK.CASH_PAY_PRICE_CHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TicketorRemark.TICKETOR_REMARK.TICKETOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TicketorRemark.TICKETOR_REMARK.BUSINESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TicketorRemark.TICKETOR_REMARK.LINE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TicketorRemark.TICKETOR_REMARK.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return TicketorRemark.TICKETOR_REMARK.STATUS;
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
    public BigDecimal component3() {
        return getHmFeeChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getSecurityFeeChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getWxPayPriceChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getZfbPayPriceChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getPosPayPriceChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getCashPayPriceChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getTicketor();
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
        return getLineCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component13() {
        return getStatus();
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
    public BigDecimal value3() {
        return getHmFeeChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getSecurityFeeChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getWxPayPriceChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getZfbPayPriceChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getPosPayPriceChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getCashPayPriceChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTicketor();
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
        return getLineCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value2(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value3(BigDecimal value) {
        setHmFeeChange(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value4(BigDecimal value) {
        setSecurityFeeChange(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value5(BigDecimal value) {
        setWxPayPriceChange(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value6(BigDecimal value) {
        setZfbPayPriceChange(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value7(BigDecimal value) {
        setPosPayPriceChange(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value8(BigDecimal value) {
        setCashPayPriceChange(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value9(String value) {
        setTicketor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value10(Integer value) {
        setBusinessId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value11(String value) {
        setLineCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value12(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord value13(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorRemarkRecord values(Integer value1, Timestamp value2, BigDecimal value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, String value9, Integer value10, String value11, String value12, Byte value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TicketorRemarkRecord
     */
    public TicketorRemarkRecord() {
        super(TicketorRemark.TICKETOR_REMARK);
    }

    /**
     * Create a detached, initialised TicketorRemarkRecord
     */
    public TicketorRemarkRecord(Integer id, Timestamp createTime, BigDecimal hmFeeChange, BigDecimal securityFeeChange, BigDecimal wxPayPriceChange, BigDecimal zfbPayPriceChange, BigDecimal posPayPriceChange, BigDecimal cashPayPriceChange, String ticketor, Integer businessId, String lineCode, String remark, Byte status) {
        super(TicketorRemark.TICKETOR_REMARK);

        set(0, id);
        set(1, createTime);
        set(2, hmFeeChange);
        set(3, securityFeeChange);
        set(4, wxPayPriceChange);
        set(5, zfbPayPriceChange);
        set(6, posPayPriceChange);
        set(7, cashPayPriceChange);
        set(8, ticketor);
        set(9, businessId);
        set(10, lineCode);
        set(11, remark);
        set(12, status);
    }
}
