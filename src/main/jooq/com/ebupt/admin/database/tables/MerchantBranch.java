/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.MerchantBranchRecord;

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
public class MerchantBranch extends TableImpl<MerchantBranchRecord> {

    private static final long serialVersionUID = -345568718;

    /**
     * The reference instance of <code>st.merchant_branch</code>
     */
    public static final MerchantBranch MERCHANT_BRANCH = new MerchantBranch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MerchantBranchRecord> getRecordType() {
        return MerchantBranchRecord.class;
    }

    /**
     * The column <code>st.merchant_branch.id</code>.
     */
    public final TableField<MerchantBranchRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.merchant_branch.name</code>. 名称
     */
    public final TableField<MerchantBranchRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(30), this, "名称");

    /**
     * The column <code>st.merchant_branch.address</code>. 地址
     */
    public final TableField<MerchantBranchRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(50), this, "地址");

    /**
     * The column <code>st.merchant_branch.phone</code>. 电话
     */
    public final TableField<MerchantBranchRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(50), this, "电话");

    /**
     * The column <code>st.merchant_branch.merchant_id</code>. 托运部Id
     */
    public final TableField<MerchantBranchRecord, Integer> MERCHANT_ID = createField("merchant_id", org.jooq.impl.SQLDataType.INTEGER, this, "托运部Id");

    /**
     * The column <code>st.merchant_branch.created_at</code>.
     */
    public final TableField<MerchantBranchRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.merchant_branch.updated_at</code>.
     */
    public final TableField<MerchantBranchRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.merchant_branch.enabled</code>.
     */
    public final TableField<MerchantBranchRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'1'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>st.merchant_branch.status</code>. 启用，禁用
     */
    public final TableField<MerchantBranchRecord, Boolean> STATUS = createField("status", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'1'", org.jooq.impl.SQLDataType.BIT)), this, "启用，禁用");

    /**
     * Create a <code>st.merchant_branch</code> table reference
     */
    public MerchantBranch() {
        this(DSL.name("merchant_branch"), null);
    }

    /**
     * Create an aliased <code>st.merchant_branch</code> table reference
     */
    public MerchantBranch(String alias) {
        this(DSL.name(alias), MERCHANT_BRANCH);
    }

    /**
     * Create an aliased <code>st.merchant_branch</code> table reference
     */
    public MerchantBranch(Name alias) {
        this(alias, MERCHANT_BRANCH);
    }

    private MerchantBranch(Name alias, Table<MerchantBranchRecord> aliased) {
        this(alias, aliased, null);
    }

    private MerchantBranch(Name alias, Table<MerchantBranchRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.MERCHANT_BRANCH_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MerchantBranchRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MERCHANT_BRANCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MerchantBranchRecord> getPrimaryKey() {
        return Keys.KEY_MERCHANT_BRANCH_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MerchantBranchRecord>> getKeys() {
        return Arrays.<UniqueKey<MerchantBranchRecord>>asList(Keys.KEY_MERCHANT_BRANCH_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MerchantBranch as(String alias) {
        return new MerchantBranch(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MerchantBranch as(Name alias) {
        return new MerchantBranch(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MerchantBranch rename(String name) {
        return new MerchantBranch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MerchantBranch rename(Name name) {
        return new MerchantBranch(name, null);
    }
}