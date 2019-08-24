/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.CompanyPermission;

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
public class CompanyPermissionRecord extends UpdatableRecordImpl<CompanyPermissionRecord> implements Record5<Integer, String, String, String, Integer> {

    private static final long serialVersionUID = -153406792;

    /**
     * Setter for <code>st.company_permission.id</code>.
     */
    public CompanyPermissionRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.company_permission.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.company_permission.code</code>. 权限代码
     */
    public CompanyPermissionRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.company_permission.code</code>. 权限代码
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.company_permission.name</code>. 权限名称
     */
    public CompanyPermissionRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.company_permission.name</code>. 权限名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.company_permission.description</code>. 权限描述
     */
    public CompanyPermissionRecord setDescription(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.company_permission.description</code>. 权限描述
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.company_permission.group_id</code>. 权限组id
     */
    public CompanyPermissionRecord setGroupId(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.company_permission.group_id</code>. 权限组id
     */
    public Integer getGroupId() {
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
    public Row5<Integer, String, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CompanyPermission.COMPANY_PERMISSION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CompanyPermission.COMPANY_PERMISSION.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CompanyPermission.COMPANY_PERMISSION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CompanyPermission.COMPANY_PERMISSION.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CompanyPermission.COMPANY_PERMISSION.GROUP_ID;
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
    public Integer component5() {
        return getGroupId();
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
    public Integer value5() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyPermissionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyPermissionRecord value2(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyPermissionRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyPermissionRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyPermissionRecord value5(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyPermissionRecord values(Integer value1, String value2, String value3, String value4, Integer value5) {
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
     * Create a detached CompanyPermissionRecord
     */
    public CompanyPermissionRecord() {
        super(CompanyPermission.COMPANY_PERMISSION);
    }

    /**
     * Create a detached, initialised CompanyPermissionRecord
     */
    public CompanyPermissionRecord(Integer id, String code, String name, String description, Integer groupId) {
        super(CompanyPermission.COMPANY_PERMISSION);

        set(0, id);
        set(1, code);
        set(2, name);
        set(3, description);
        set(4, groupId);
    }
}
