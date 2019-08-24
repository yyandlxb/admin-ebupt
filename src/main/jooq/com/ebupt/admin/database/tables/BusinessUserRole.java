/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.BusinessUserRoleRecord;

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
public class BusinessUserRole extends TableImpl<BusinessUserRoleRecord> {

    private static final long serialVersionUID = -1786645687;

    /**
     * The reference instance of <code>st.business_user_role</code>
     */
    public static final BusinessUserRole BUSINESS_USER_ROLE = new BusinessUserRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BusinessUserRoleRecord> getRecordType() {
        return BusinessUserRoleRecord.class;
    }

    /**
     * The column <code>st.business_user_role.user_id</code>. 用户ID
     */
    public final TableField<BusinessUserRoleRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户ID");

    /**
     * The column <code>st.business_user_role.role_id</code>. 角色ID
     */
    public final TableField<BusinessUserRoleRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "角色ID");

    /**
     * Create a <code>st.business_user_role</code> table reference
     */
    public BusinessUserRole() {
        this(DSL.name("business_user_role"), null);
    }

    /**
     * Create an aliased <code>st.business_user_role</code> table reference
     */
    public BusinessUserRole(String alias) {
        this(DSL.name(alias), BUSINESS_USER_ROLE);
    }

    /**
     * Create an aliased <code>st.business_user_role</code> table reference
     */
    public BusinessUserRole(Name alias) {
        this(alias, BUSINESS_USER_ROLE);
    }

    private BusinessUserRole(Name alias, Table<BusinessUserRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private BusinessUserRole(Name alias, Table<BusinessUserRoleRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.BUSINESS_USER_ROLE_UK_USER_ID_ROLE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BusinessUserRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<BusinessUserRoleRecord>>asList(Keys.KEY_BUSINESS_USER_ROLE_UK_USER_ID_ROLE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRole as(String alias) {
        return new BusinessUserRole(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRole as(Name alias) {
        return new BusinessUserRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BusinessUserRole rename(String name) {
        return new BusinessUserRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BusinessUserRole rename(Name name) {
        return new BusinessUserRole(name, null);
    }
}