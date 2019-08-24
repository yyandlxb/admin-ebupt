/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.CompanyRole;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class CompanyRoleRecord extends UpdatableRecordImpl<CompanyRoleRecord> implements Record6<Integer, Integer, String, Boolean, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1024849200;

    /**
     * Setter for <code>st.company_role.id</code>.
     */
    public CompanyRoleRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.company_role.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.company_role.company_id</code>. 物流公司ID
     */
    public CompanyRoleRecord setCompanyId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.company_role.company_id</code>. 物流公司ID
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>st.company_role.name</code>. 角色名
     */
    public CompanyRoleRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.company_role.name</code>. 角色名
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.company_role.enabled</code>. 是否存在标志位
     */
    public CompanyRoleRecord setEnabled(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.company_role.enabled</code>. 是否存在标志位
     */
    public Boolean getEnabled() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>st.company_role.created_at</code>.
     */
    public CompanyRoleRecord setCreatedAt(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.company_role.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>st.company_role.updated_at</code>.
     */
    public CompanyRoleRecord setUpdatedAt(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.company_role.updated_at</code>.
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
    public Row6<Integer, Integer, String, Boolean, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Boolean, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CompanyRole.COMPANY_ROLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CompanyRole.COMPANY_ROLE.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CompanyRole.COMPANY_ROLE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return CompanyRole.COMPANY_ROLE.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return CompanyRole.COMPANY_ROLE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return CompanyRole.COMPANY_ROLE.UPDATED_AT;
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
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getEnabled();
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
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getEnabled();
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
    public CompanyRoleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRoleRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRoleRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRoleRecord value4(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRoleRecord value5(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRoleRecord value6(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRoleRecord values(Integer value1, Integer value2, String value3, Boolean value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached CompanyRoleRecord
     */
    public CompanyRoleRecord() {
        super(CompanyRole.COMPANY_ROLE);
    }

    /**
     * Create a detached, initialised CompanyRoleRecord
     */
    public CompanyRoleRecord(Integer id, Integer companyId, String name, Boolean enabled, Timestamp createdAt, Timestamp updatedAt) {
        super(CompanyRole.COMPANY_ROLE);

        set(0, id);
        set(1, companyId);
        set(2, name);
        set(3, enabled);
        set(4, createdAt);
        set(5, updatedAt);
    }
}