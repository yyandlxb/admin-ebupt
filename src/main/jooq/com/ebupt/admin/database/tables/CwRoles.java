/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.CwRolesRecord;

import java.sql.Timestamp;
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
public class CwRoles extends TableImpl<CwRolesRecord> {

    private static final long serialVersionUID = 1256391947;

    /**
     * The reference instance of <code>st.cw_roles</code>
     */
    public static final CwRoles CW_ROLES = new CwRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CwRolesRecord> getRecordType() {
        return CwRolesRecord.class;
    }

    /**
     * The column <code>st.cw_roles.id</code>.
     */
    public final TableField<CwRolesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.cw_roles.role_name</code>.
     */
    public final TableField<CwRolesRecord, String> ROLE_NAME = createField("role_name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>st.cw_roles.create_time</code>.
     */
    public final TableField<CwRolesRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>st.cw_roles.is_delete</code>. 0：有效 1：失效
     */
    public final TableField<CwRolesRecord, Integer> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0：有效 1：失效");

    /**
     * Create a <code>st.cw_roles</code> table reference
     */
    public CwRoles() {
        this(DSL.name("cw_roles"), null);
    }

    /**
     * Create an aliased <code>st.cw_roles</code> table reference
     */
    public CwRoles(String alias) {
        this(DSL.name(alias), CW_ROLES);
    }

    /**
     * Create an aliased <code>st.cw_roles</code> table reference
     */
    public CwRoles(Name alias) {
        this(alias, CW_ROLES);
    }

    private CwRoles(Name alias, Table<CwRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private CwRoles(Name alias, Table<CwRolesRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CW_ROLES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CwRolesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CW_ROLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CwRolesRecord> getPrimaryKey() {
        return Keys.KEY_CW_ROLES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CwRolesRecord>> getKeys() {
        return Arrays.<UniqueKey<CwRolesRecord>>asList(Keys.KEY_CW_ROLES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CwRoles as(String alias) {
        return new CwRoles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CwRoles as(Name alias) {
        return new CwRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CwRoles rename(String name) {
        return new CwRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CwRoles rename(Name name) {
        return new CwRoles(name, null);
    }
}
