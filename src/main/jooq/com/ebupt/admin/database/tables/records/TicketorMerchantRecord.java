/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.TicketorMerchant;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class TicketorMerchantRecord extends UpdatableRecordImpl<TicketorMerchantRecord> implements Record5<Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 434475467;

    /**
     * Setter for <code>st.ticketor_merchant.id</code>.
     */
    public TicketorMerchantRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_merchant.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.ticketor_merchant.ticktor_id</code>.
     */
    public TicketorMerchantRecord setTicktorId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_merchant.ticktor_id</code>.
     */
    public Integer getTicktorId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>st.ticketor_merchant.merchant_id</code>.
     */
    public TicketorMerchantRecord setMerchantId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_merchant.merchant_id</code>.
     */
    public Integer getMerchantId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>st.ticketor_merchant.created_at</code>.
     */
    public TicketorMerchantRecord setCreatedAt(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_merchant.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>st.ticketor_merchant.updated_at</code>.
     */
    public TicketorMerchantRecord setUpdatedAt(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.ticketor_merchant.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TicketorMerchant.TICKETOR_MERCHANT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TicketorMerchant.TICKETOR_MERCHANT.TICKTOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TicketorMerchant.TICKETOR_MERCHANT.MERCHANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TicketorMerchant.TICKETOR_MERCHANT.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TicketorMerchant.TICKETOR_MERCHANT.UPDATED_AT;
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
        return getTicktorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getMerchantId();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getTicktorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getMerchantId();
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
    public TicketorMerchantRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorMerchantRecord value2(Integer value) {
        setTicktorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorMerchantRecord value3(Integer value) {
        setMerchantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorMerchantRecord value4(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorMerchantRecord value5(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorMerchantRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TicketorMerchantRecord
     */
    public TicketorMerchantRecord() {
        super(TicketorMerchant.TICKETOR_MERCHANT);
    }

    /**
     * Create a detached, initialised TicketorMerchantRecord
     */
    public TicketorMerchantRecord(Integer id, Integer ticktorId, Integer merchantId, Timestamp createdAt, Timestamp updatedAt) {
        super(TicketorMerchant.TICKETOR_MERCHANT);

        set(0, id);
        set(1, ticktorId);
        set(2, merchantId);
        set(3, createdAt);
        set(4, updatedAt);
    }
}
