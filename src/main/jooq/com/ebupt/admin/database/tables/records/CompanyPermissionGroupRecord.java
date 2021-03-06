/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.CompanyPermissionGroup;

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
public class CompanyPermissionGroupRecord extends UpdatableRecordImpl<CompanyPermissionGroupRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = 1439902753;

    /**
     * Setter for <code>st.company_permission_group.id</code>.
     */
    public CompanyPermissionGroupRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.company_permission_group.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.company_permission_group.code</code>. 权限组代码
     */
    public CompanyPermissionGroupRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.company_permission_group.code</code>. 权限组代码
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.company_permission_group.name</code>. 权限组名称
     */
    public CompanyPermissionGroupRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.company_permission_group.name</code>. 权限组名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.company_permission_group.description</code>. 权限组描述
     */
    public CompanyPermissionGroupRecord setDescription(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.company_permission_group.description</code>. 权限组描述
     */
    public String getDescription() {
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
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CompanyPermissionGroup.COMPANY_PERMISSION_GROUP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CompanyPermissionGroup.COMPANY_PERMISSION_GROUP.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CompanyPermissionGroup.COMPANY_PERMISSION_GROUP.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CompanyPermissionGroup.COMPANY_PERMISSION_GROUP.DESCRIPTION;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDescription();
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyPermissionGroupRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyPermissionGroupRecord value2(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyPermissionGroupRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyPermissionGroupRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyPermissionGroupRecord values(Integer value1, String value2, String value3, String value4) {
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
     * Create a detached CompanyPermissionGroupRecord
     */
    public CompanyPermissionGroupRecord() {
        super(CompanyPermissionGroup.COMPANY_PERMISSION_GROUP);
    }

    /**
     * Create a detached, initialised CompanyPermissionGroupRecord
     */
    public CompanyPermissionGroupRecord(Integer id, String code, String name, String description) {
        super(CompanyPermissionGroup.COMPANY_PERMISSION_GROUP);

        set(0, id);
        set(1, code);
        set(2, name);
        set(3, description);
    }
}
