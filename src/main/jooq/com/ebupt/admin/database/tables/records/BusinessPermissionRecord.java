/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.BusinessPermission;

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
public class BusinessPermissionRecord extends UpdatableRecordImpl<BusinessPermissionRecord> implements Record5<Integer, String, String, String, Integer> {

    private static final long serialVersionUID = -1877201868;

    /**
     * Setter for <code>st.business_permission.id</code>.
     */
    public BusinessPermissionRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.business_permission.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.business_permission.code</code>. 权限代码
     */
    public BusinessPermissionRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.business_permission.code</code>. 权限代码
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.business_permission.name</code>. 权限名称
     */
    public BusinessPermissionRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.business_permission.name</code>. 权限名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.business_permission.description</code>. 权限描述
     */
    public BusinessPermissionRecord setDescription(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.business_permission.description</code>. 权限描述
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.business_permission.group_id</code>. 权限组id
     */
    public BusinessPermissionRecord setGroupId(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.business_permission.group_id</code>. 权限组id
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
        return BusinessPermission.BUSINESS_PERMISSION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BusinessPermission.BUSINESS_PERMISSION.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BusinessPermission.BUSINESS_PERMISSION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BusinessPermission.BUSINESS_PERMISSION.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return BusinessPermission.BUSINESS_PERMISSION.GROUP_ID;
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
    public BusinessPermissionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessPermissionRecord value2(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessPermissionRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessPermissionRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessPermissionRecord value5(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessPermissionRecord values(Integer value1, String value2, String value3, String value4, Integer value5) {
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
     * Create a detached BusinessPermissionRecord
     */
    public BusinessPermissionRecord() {
        super(BusinessPermission.BUSINESS_PERMISSION);
    }

    /**
     * Create a detached, initialised BusinessPermissionRecord
     */
    public BusinessPermissionRecord(Integer id, String code, String name, String description, Integer groupId) {
        super(BusinessPermission.BUSINESS_PERMISSION);

        set(0, id);
        set(1, code);
        set(2, name);
        set(3, description);
        set(4, groupId);
    }
}
