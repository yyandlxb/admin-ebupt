/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.WeightNote;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 磅单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WeightNoteRecord extends UpdatableRecordImpl<WeightNoteRecord> implements Record15<Integer, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Timestamp, Timestamp, Integer, Integer, Boolean, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 2023038078;

    /**
     * Setter for <code>st.weight_note.id</code>.
     */
    public WeightNoteRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.weight_note.code</code>. 磅单号
     */
    public WeightNoteRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.code</code>. 磅单号
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.weight_note.plate_number</code>. 车牌号
     */
    public WeightNoteRecord setPlateNumber(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.plate_number</code>. 车牌号
     */
    public String getPlateNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.weight_note.gross_weight</code>. 毛重
     */
    public WeightNoteRecord setGrossWeight(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.gross_weight</code>. 毛重
     */
    public BigDecimal getGrossWeight() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>st.weight_note.tare_weight</code>. 皮重
     */
    public WeightNoteRecord setTareWeight(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.tare_weight</code>. 皮重
     */
    public BigDecimal getTareWeight() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>st.weight_note.estimate_tare_weight</code>. 预估皮重
     */
    public WeightNoteRecord setEstimateTareWeight(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.estimate_tare_weight</code>. 预估皮重
     */
    public BigDecimal getEstimateTareWeight() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>st.weight_note.load_weight</code>. 已装车总量
     */
    public WeightNoteRecord setLoadWeight(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.load_weight</code>. 已装车总量
     */
    public BigDecimal getLoadWeight() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>st.weight_note.first_weigh_time</code>. 第一次过磅时间
     */
    public WeightNoteRecord setFirstWeighTime(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.first_weigh_time</code>. 第一次过磅时间
     */
    public Timestamp getFirstWeighTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>st.weight_note.second_weigh_time</code>. 第二次过磅时间
     */
    public WeightNoteRecord setSecondWeighTime(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.second_weigh_time</code>. 第二次过磅时间
     */
    public Timestamp getSecondWeighTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>st.weight_note.merchant_id</code>. 商户id
     */
    public WeightNoteRecord setMerchantId(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.merchant_id</code>. 商户id
     */
    public Integer getMerchantId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>st.weight_note.line_id</code>. 线路id
     */
    public WeightNoteRecord setLineId(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.line_id</code>. 线路id
     */
    public Integer getLineId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>st.weight_note.enabled</code>. 是否可用
     */
    public WeightNoteRecord setEnabled(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.enabled</code>. 是否可用
     */
    public Boolean getEnabled() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>st.weight_note.status</code>. 0-未全部发车，1-全部发车
     */
    public WeightNoteRecord setStatus(Byte value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.status</code>. 0-未全部发车，1-全部发车
     */
    public Byte getStatus() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>st.weight_note.created_at</code>.
     */
    public WeightNoteRecord setCreatedAt(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>st.weight_note.updated_at</code>.
     */
    public WeightNoteRecord setUpdatedAt(Timestamp value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note.updated_at</code>.
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
    public Row15<Integer, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Timestamp, Timestamp, Integer, Integer, Boolean, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Timestamp, Timestamp, Integer, Integer, Boolean, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return WeightNote.WEIGHT_NOTE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return WeightNote.WEIGHT_NOTE.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WeightNote.WEIGHT_NOTE.PLATE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return WeightNote.WEIGHT_NOTE.GROSS_WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return WeightNote.WEIGHT_NOTE.TARE_WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return WeightNote.WEIGHT_NOTE.ESTIMATE_TARE_WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return WeightNote.WEIGHT_NOTE.LOAD_WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return WeightNote.WEIGHT_NOTE.FIRST_WEIGH_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return WeightNote.WEIGHT_NOTE.SECOND_WEIGH_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return WeightNote.WEIGHT_NOTE.MERCHANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return WeightNote.WEIGHT_NOTE.LINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return WeightNote.WEIGHT_NOTE.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return WeightNote.WEIGHT_NOTE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return WeightNote.WEIGHT_NOTE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return WeightNote.WEIGHT_NOTE.UPDATED_AT;
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
    public String component3() {
        return getPlateNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getGrossWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getTareWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getEstimateTareWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getLoadWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getFirstWeighTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getSecondWeighTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getMerchantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getLineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getEnabled();
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
    public String value2() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPlateNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getGrossWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getTareWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getEstimateTareWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getLoadWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getFirstWeighTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getSecondWeighTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getMerchantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getLineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getEnabled();
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
    public WeightNoteRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value2(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value3(String value) {
        setPlateNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value4(BigDecimal value) {
        setGrossWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value5(BigDecimal value) {
        setTareWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value6(BigDecimal value) {
        setEstimateTareWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value7(BigDecimal value) {
        setLoadWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value8(Timestamp value) {
        setFirstWeighTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value9(Timestamp value) {
        setSecondWeighTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value10(Integer value) {
        setMerchantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value11(Integer value) {
        setLineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value12(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value13(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value14(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord value15(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteRecord values(Integer value1, String value2, String value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, Timestamp value8, Timestamp value9, Integer value10, Integer value11, Boolean value12, Byte value13, Timestamp value14, Timestamp value15) {
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
     * Create a detached WeightNoteRecord
     */
    public WeightNoteRecord() {
        super(WeightNote.WEIGHT_NOTE);
    }

    /**
     * Create a detached, initialised WeightNoteRecord
     */
    public WeightNoteRecord(Integer id, String code, String plateNumber, BigDecimal grossWeight, BigDecimal tareWeight, BigDecimal estimateTareWeight, BigDecimal loadWeight, Timestamp firstWeighTime, Timestamp secondWeighTime, Integer merchantId, Integer lineId, Boolean enabled, Byte status, Timestamp createdAt, Timestamp updatedAt) {
        super(WeightNote.WEIGHT_NOTE);

        set(0, id);
        set(1, code);
        set(2, plateNumber);
        set(3, grossWeight);
        set(4, tareWeight);
        set(5, estimateTareWeight);
        set(6, loadWeight);
        set(7, firstWeighTime);
        set(8, secondWeighTime);
        set(9, merchantId);
        set(10, lineId);
        set(11, enabled);
        set(12, status);
        set(13, createdAt);
        set(14, updatedAt);
    }
}
