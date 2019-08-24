/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.TrainCarriageGoods;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 申请请车品种
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrainCarriageGoodsRecord extends UpdatableRecordImpl<TrainCarriageGoodsRecord> implements Record8<Integer, Integer, Integer, BigDecimal, Integer, BigDecimal, Timestamp, Timestamp> {

    private static final long serialVersionUID = -940731981;

    /**
     * Setter for <code>st.train_carriage_goods.id</code>.
     */
    public TrainCarriageGoodsRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.train_carriage_goods.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.train_carriage_goods.train_carriage_id</code>. 车厢id
     */
    public TrainCarriageGoodsRecord setTrainCarriageId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.train_carriage_goods.train_carriage_id</code>. 车厢id
     */
    public Integer getTrainCarriageId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>st.train_carriage_goods.goods_id</code>. 品名id
     */
    public TrainCarriageGoodsRecord setGoodsId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.train_carriage_goods.goods_id</code>. 品名id
     */
    public Integer getGoodsId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>st.train_carriage_goods.weight</code>. 重量
     */
    public TrainCarriageGoodsRecord setWeight(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.train_carriage_goods.weight</code>. 重量
     */
    public BigDecimal getWeight() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>st.train_carriage_goods.total</code>. 件数
     */
    public TrainCarriageGoodsRecord setTotal(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.train_carriage_goods.total</code>. 件数
     */
    public Integer getTotal() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>st.train_carriage_goods.volume</code>. 体积
     */
    public TrainCarriageGoodsRecord setVolume(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.train_carriage_goods.volume</code>. 体积
     */
    public BigDecimal getVolume() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>st.train_carriage_goods.created_at</code>.
     */
    public TrainCarriageGoodsRecord setCreatedAt(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.train_carriage_goods.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>st.train_carriage_goods.updated_at</code>.
     */
    public TrainCarriageGoodsRecord setUpdatedAt(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.train_carriage_goods.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, BigDecimal, Integer, BigDecimal, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, BigDecimal, Integer, BigDecimal, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TrainCarriageGoods.TRAIN_CARRIAGE_GOODS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TrainCarriageGoods.TRAIN_CARRIAGE_GOODS.TRAIN_CARRIAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TrainCarriageGoods.TRAIN_CARRIAGE_GOODS.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TrainCarriageGoods.TRAIN_CARRIAGE_GOODS.WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TrainCarriageGoods.TRAIN_CARRIAGE_GOODS.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TrainCarriageGoods.TRAIN_CARRIAGE_GOODS.VOLUME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TrainCarriageGoods.TRAIN_CARRIAGE_GOODS.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TrainCarriageGoods.TRAIN_CARRIAGE_GOODS.UPDATED_AT;
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
        return getTrainCarriageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getVolume();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
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
        return getTrainCarriageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getVolume();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrainCarriageGoodsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrainCarriageGoodsRecord value2(Integer value) {
        setTrainCarriageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrainCarriageGoodsRecord value3(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrainCarriageGoodsRecord value4(BigDecimal value) {
        setWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrainCarriageGoodsRecord value5(Integer value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrainCarriageGoodsRecord value6(BigDecimal value) {
        setVolume(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrainCarriageGoodsRecord value7(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrainCarriageGoodsRecord value8(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrainCarriageGoodsRecord values(Integer value1, Integer value2, Integer value3, BigDecimal value4, Integer value5, BigDecimal value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TrainCarriageGoodsRecord
     */
    public TrainCarriageGoodsRecord() {
        super(TrainCarriageGoods.TRAIN_CARRIAGE_GOODS);
    }

    /**
     * Create a detached, initialised TrainCarriageGoodsRecord
     */
    public TrainCarriageGoodsRecord(Integer id, Integer trainCarriageId, Integer goodsId, BigDecimal weight, Integer total, BigDecimal volume, Timestamp createdAt, Timestamp updatedAt) {
        super(TrainCarriageGoods.TRAIN_CARRIAGE_GOODS);

        set(0, id);
        set(1, trainCarriageId);
        set(2, goodsId);
        set(3, weight);
        set(4, total);
        set(5, volume);
        set(6, createdAt);
        set(7, updatedAt);
    }
}