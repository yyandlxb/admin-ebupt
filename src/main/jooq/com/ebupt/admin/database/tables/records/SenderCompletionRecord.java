/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.SenderCompletion;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 发货人自动补全
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SenderCompletionRecord extends UpdatableRecordImpl<SenderCompletionRecord> implements Record5<Integer, String, String, String, Timestamp> {

    private static final long serialVersionUID = -1356789747;

    /**
     * Setter for <code>st.sender_completion.id</code>.
     */
    public SenderCompletionRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.sender_completion.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.sender_completion.id_card_number</code>.
     */
    public SenderCompletionRecord setIdCardNumber(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.sender_completion.id_card_number</code>.
     */
    public String getIdCardNumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.sender_completion.phone_number</code>.
     */
    public SenderCompletionRecord setPhoneNumber(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.sender_completion.phone_number</code>.
     */
    public String getPhoneNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.sender_completion.name</code>.
     */
    public SenderCompletionRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.sender_completion.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.sender_completion.created_at</code>.
     */
    public SenderCompletionRecord setCreatedAt(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.sender_completion.created_at</code>.
     */
    public Timestamp getCreatedAt() {
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
    public Row5<Integer, String, String, String, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SenderCompletion.SENDER_COMPLETION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SenderCompletion.SENDER_COMPLETION.ID_CARD_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SenderCompletion.SENDER_COMPLETION.PHONE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SenderCompletion.SENDER_COMPLETION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return SenderCompletion.SENDER_COMPLETION.CREATED_AT;
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
        return getIdCardNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPhoneNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getIdCardNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPhoneNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
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
    public SenderCompletionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SenderCompletionRecord value2(String value) {
        setIdCardNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SenderCompletionRecord value3(String value) {
        setPhoneNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SenderCompletionRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SenderCompletionRecord value5(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SenderCompletionRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5) {
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
     * Create a detached SenderCompletionRecord
     */
    public SenderCompletionRecord() {
        super(SenderCompletion.SENDER_COMPLETION);
    }

    /**
     * Create a detached, initialised SenderCompletionRecord
     */
    public SenderCompletionRecord(Integer id, String idCardNumber, String phoneNumber, String name, Timestamp createdAt) {
        super(SenderCompletion.SENDER_COMPLETION);

        set(0, id);
        set(1, idCardNumber);
        set(2, phoneNumber);
        set(3, name);
        set(4, createdAt);
    }
}
