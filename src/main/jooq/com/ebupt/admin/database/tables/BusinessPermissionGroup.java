/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.BusinessPermissionGroupRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class BusinessPermissionGroup extends TableImpl<BusinessPermissionGroupRecord> {

    private static final long serialVersionUID = 2145957648;

    /**
     * The reference instance of <code>st.business_permission_group</code>
     */
    public static final BusinessPermissionGroup BUSINESS_PERMISSION_GROUP = new BusinessPermissionGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BusinessPermissionGroupRecord> getRecordType() {
        return BusinessPermissionGroupRecord.class;
    }

    /**
     * The column <code>st.business_permission_group.id</code>.
     */
    public final TableField<BusinessPermissionGroupRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.business_permission_group.code</code>. 权限组代码
     */
    public final TableField<BusinessPermissionGroupRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "权限组代码");

    /**
     * The column <code>st.business_permission_group.name</code>. 权限组名称
     */
    public final TableField<BusinessPermissionGroupRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "权限组名称");

    /**
     * The column <code>st.business_permission_group.description</code>. 权限组描述
     */
    public final TableField<BusinessPermissionGroupRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(50), this, "权限组描述");

    /**
     * Create a <code>st.business_permission_group</code> table reference
     */
    public BusinessPermissionGroup() {
        this(DSL.name("business_permission_group"), null);
    }

    /**
     * Create an aliased <code>st.business_permission_group</code> table reference
     */
    public BusinessPermissionGroup(String alias) {
        this(DSL.name(alias), BUSINESS_PERMISSION_GROUP);
    }

    /**
     * Create an aliased <code>st.business_permission_group</code> table reference
     */
    public BusinessPermissionGroup(Name alias) {
        this(alias, BUSINESS_PERMISSION_GROUP);
    }

    private BusinessPermissionGroup(Name alias, Table<BusinessPermissionGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private BusinessPermissionGroup(Name alias, Table<BusinessPermissionGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return St.ST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BUSINESS_PERMISSION_GROUP_PRIMARY, Indexes.BUSINESS_PERMISSION_GROUP_UK_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BusinessPermissionGroupRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BUSINESS_PERMISSION_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BusinessPermissionGroupRecord> getPrimaryKey() {
        return Keys.KEY_BUSINESS_PERMISSION_GROUP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BusinessPermissionGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<BusinessPermissionGroupRecord>>asList(Keys.KEY_BUSINESS_PERMISSION_GROUP_PRIMARY, Keys.KEY_BUSINESS_PERMISSION_GROUP_UK_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessPermissionGroup as(String alias) {
        return new BusinessPermissionGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessPermissionGroup as(Name alias) {
        return new BusinessPermissionGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BusinessPermissionGroup rename(String name) {
        return new BusinessPermissionGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BusinessPermissionGroup rename(Name name) {
        return new BusinessPermissionGroup(name, null);
    }
}
