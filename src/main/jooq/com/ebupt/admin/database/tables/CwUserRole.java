/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.CwUserRoleRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class CwUserRole extends TableImpl<CwUserRoleRecord> {

    private static final long serialVersionUID = -799868366;

    /**
     * The reference instance of <code>st.cw_user_role</code>
     */
    public static final CwUserRole CW_USER_ROLE = new CwUserRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CwUserRoleRecord> getRecordType() {
        return CwUserRoleRecord.class;
    }

    /**
     * The column <code>st.cw_user_role.id</code>.
     */
    public final TableField<CwUserRoleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.cw_user_role.user_id</code>.
     */
    public final TableField<CwUserRoleRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>st.cw_user_role.role_id</code>.
     */
    public final TableField<CwUserRoleRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>st.cw_user_role.create_time</code>.
     */
    public final TableField<CwUserRoleRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>st.cw_user_role</code> table reference
     */
    public CwUserRole() {
        this(DSL.name("cw_user_role"), null);
    }

    /**
     * Create an aliased <code>st.cw_user_role</code> table reference
     */
    public CwUserRole(String alias) {
        this(DSL.name(alias), CW_USER_ROLE);
    }

    /**
     * Create an aliased <code>st.cw_user_role</code> table reference
     */
    public CwUserRole(Name alias) {
        this(alias, CW_USER_ROLE);
    }

    private CwUserRole(Name alias, Table<CwUserRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private CwUserRole(Name alias, Table<CwUserRoleRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CW_USER_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CwUserRoleRecord> getPrimaryKey() {
        return Keys.KEY_CW_USER_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CwUserRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<CwUserRoleRecord>>asList(Keys.KEY_CW_USER_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CwUserRole as(String alias) {
        return new CwUserRole(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CwUserRole as(Name alias) {
        return new CwUserRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CwUserRole rename(String name) {
        return new CwUserRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CwUserRole rename(Name name) {
        return new CwUserRole(name, null);
    }
}
