/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.CompanyInfo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class CompanyInfoRecord extends UpdatableRecordImpl<CompanyInfoRecord> implements Record4<String, Integer, Integer, String> {

    private static final long serialVersionUID = -481822393;

    /**
     * Setter for <code>st.company_info.c_name</code>.
     */
    public CompanyInfoRecord setCName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.company_info.c_name</code>.
     */
    public String getCName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>st.company_info.id</code>.
     */
    public CompanyInfoRecord setId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.company_info.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>st.company_info.status</code>. 0:正常 1：删除
     */
    public CompanyInfoRecord setStatus(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.company_info.status</code>. 0:正常 1：删除
     */
    public Integer getStatus() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>st.company_info.create_time</code>.
     */
    public CompanyInfoRecord setCreateTime(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.company_info.create_time</code>.
     */
    public String getCreateTime() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Integer, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Integer, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CompanyInfo.COMPANY_INFO.C_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CompanyInfo.COMPANY_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CompanyInfo.COMPANY_INFO.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CompanyInfo.COMPANY_INFO.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getId();
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
    public String component4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getId();
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
    public String value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyInfoRecord value1(String value) {
        setCName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyInfoRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyInfoRecord value3(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyInfoRecord value4(String value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyInfoRecord values(String value1, Integer value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompanyInfoRecord
     */
    public CompanyInfoRecord() {
        super(CompanyInfo.COMPANY_INFO);
    }

    /**
     * Create a detached, initialised CompanyInfoRecord
     */
    public CompanyInfoRecord(String cName, Integer id, Integer status, String createTime) {
        super(CompanyInfo.COMPANY_INFO);

        set(0, cName);
        set(1, id);
        set(2, status);
        set(3, createTime);
    }
}