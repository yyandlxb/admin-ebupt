/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.SearchRecord;

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
public class SearchRecordRecord extends UpdatableRecordImpl<SearchRecordRecord> implements Record5<Integer, String, Timestamp, String, Integer> {

    private static final long serialVersionUID = -617317461;

    /**
     * Setter for <code>st.search_record.id</code>. 主键
     */
    public SearchRecordRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.search_record.id</code>. 主键
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.search_record.content</code>. 搜索内容
     */
    public SearchRecordRecord setContent(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.search_record.content</code>. 搜索内容
     */
    public String getContent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.search_record.create_time</code>. 创建时间
     */
    public SearchRecordRecord setCreateTime(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.search_record.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>st.search_record.user_id</code>. 用户id
     */
    public SearchRecordRecord setUserId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.search_record.user_id</code>. 用户id
     */
    public String getUserId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.search_record.source</code>. 1、零担商户后台
     */
    public SearchRecordRecord setSource(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.search_record.source</code>. 1、零担商户后台
     */
    public Integer getSource() {
        return (Integer) get(4);
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
    public Row5<Integer, String, Timestamp, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Timestamp, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SearchRecord.SEARCH_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SearchRecord.SEARCH_RECORD.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return SearchRecord.SEARCH_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SearchRecord.SEARCH_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return SearchRecord.SEARCH_RECORD.SOURCE;
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
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSource();
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
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchRecordRecord value2(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchRecordRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchRecordRecord value4(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchRecordRecord value5(Integer value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchRecordRecord values(Integer value1, String value2, Timestamp value3, String value4, Integer value5) {
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
     * Create a detached SearchRecordRecord
     */
    public SearchRecordRecord() {
        super(SearchRecord.SEARCH_RECORD);
    }

    /**
     * Create a detached, initialised SearchRecordRecord
     */
    public SearchRecordRecord(Integer id, String content, Timestamp createTime, String userId, Integer source) {
        super(SearchRecord.SEARCH_RECORD);

        set(0, id);
        set(1, content);
        set(2, createTime);
        set(3, userId);
        set(4, source);
    }
}