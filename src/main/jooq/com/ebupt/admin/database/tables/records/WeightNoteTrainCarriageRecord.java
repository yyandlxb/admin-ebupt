/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.WeightNoteTrainCarriage;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 磅单与车厢关联表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WeightNoteTrainCarriageRecord extends UpdatableRecordImpl<WeightNoteTrainCarriageRecord> implements Record6<Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp> {

    private static final long serialVersionUID = -568928423;

    /**
     * Setter for <code>st.weight_note_train_carriage.id</code>.
     */
    public WeightNoteTrainCarriageRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note_train_carriage.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.weight_note_train_carriage.weight_note_id</code>. 磅单id
     */
    public WeightNoteTrainCarriageRecord setWeightNoteId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note_train_carriage.weight_note_id</code>. 磅单id
     */
    public Integer getWeightNoteId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>st.weight_note_train_carriage.train_carriage_id</code>. 车厢id
     */
    public WeightNoteTrainCarriageRecord setTrainCarriageId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note_train_carriage.train_carriage_id</code>. 车厢id
     */
    public Integer getTrainCarriageId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>st.weight_note_train_carriage.load_weight</code>. 装车重量
     */
    public WeightNoteTrainCarriageRecord setLoadWeight(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note_train_carriage.load_weight</code>. 装车重量
     */
    public BigDecimal getLoadWeight() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>st.weight_note_train_carriage.created_at</code>.
     */
    public WeightNoteTrainCarriageRecord setCreatedAt(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note_train_carriage.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>st.weight_note_train_carriage.updated_at</code>.
     */
    public WeightNoteTrainCarriageRecord setUpdatedAt(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.weight_note_train_carriage.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
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
    public Row6<Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return WeightNoteTrainCarriage.WEIGHT_NOTE_TRAIN_CARRIAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return WeightNoteTrainCarriage.WEIGHT_NOTE_TRAIN_CARRIAGE.WEIGHT_NOTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return WeightNoteTrainCarriage.WEIGHT_NOTE_TRAIN_CARRIAGE.TRAIN_CARRIAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return WeightNoteTrainCarriage.WEIGHT_NOTE_TRAIN_CARRIAGE.LOAD_WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return WeightNoteTrainCarriage.WEIGHT_NOTE_TRAIN_CARRIAGE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return WeightNoteTrainCarriage.WEIGHT_NOTE_TRAIN_CARRIAGE.UPDATED_AT;
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
        return getWeightNoteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getTrainCarriageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getLoadWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
        return getWeightNoteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getTrainCarriageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getLoadWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteTrainCarriageRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteTrainCarriageRecord value2(Integer value) {
        setWeightNoteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteTrainCarriageRecord value3(Integer value) {
        setTrainCarriageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteTrainCarriageRecord value4(BigDecimal value) {
        setLoadWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteTrainCarriageRecord value5(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteTrainCarriageRecord value6(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WeightNoteTrainCarriageRecord values(Integer value1, Integer value2, Integer value3, BigDecimal value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached WeightNoteTrainCarriageRecord
     */
    public WeightNoteTrainCarriageRecord() {
        super(WeightNoteTrainCarriage.WEIGHT_NOTE_TRAIN_CARRIAGE);
    }

    /**
     * Create a detached, initialised WeightNoteTrainCarriageRecord
     */
    public WeightNoteTrainCarriageRecord(Integer id, Integer weightNoteId, Integer trainCarriageId, BigDecimal loadWeight, Timestamp createdAt, Timestamp updatedAt) {
        super(WeightNoteTrainCarriage.WEIGHT_NOTE_TRAIN_CARRIAGE);

        set(0, id);
        set(1, weightNoteId);
        set(2, trainCarriageId);
        set(3, loadWeight);
        set(4, createdAt);
        set(5, updatedAt);
    }
}
