/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.TicketorMerchantRecord;

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
public class TicketorMerchant extends TableImpl<TicketorMerchantRecord> {

    private static final long serialVersionUID = 644156600;

    /**
     * The reference instance of <code>st.ticketor_merchant</code>
     */
    public static final TicketorMerchant TICKETOR_MERCHANT = new TicketorMerchant();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TicketorMerchantRecord> getRecordType() {
        return TicketorMerchantRecord.class;
    }

    /**
     * The column <code>st.ticketor_merchant.id</code>.
     */
    public final TableField<TicketorMerchantRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.ticketor_merchant.ticktor_id</code>.
     */
    public final TableField<TicketorMerchantRecord, Integer> TICKTOR_ID = createField("ticktor_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.ticketor_merchant.merchant_id</code>.
     */
    public final TableField<TicketorMerchantRecord, Integer> MERCHANT_ID = createField("merchant_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.ticketor_merchant.created_at</code>.
     */
    public final TableField<TicketorMerchantRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.ticketor_merchant.updated_at</code>.
     */
    public final TableField<TicketorMerchantRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>st.ticketor_merchant</code> table reference
     */
    public TicketorMerchant() {
        this(DSL.name("ticketor_merchant"), null);
    }

    /**
     * Create an aliased <code>st.ticketor_merchant</code> table reference
     */
    public TicketorMerchant(String alias) {
        this(DSL.name(alias), TICKETOR_MERCHANT);
    }

    /**
     * Create an aliased <code>st.ticketor_merchant</code> table reference
     */
    public TicketorMerchant(Name alias) {
        this(alias, TICKETOR_MERCHANT);
    }

    private TicketorMerchant(Name alias, Table<TicketorMerchantRecord> aliased) {
        this(alias, aliased, null);
    }

    private TicketorMerchant(Name alias, Table<TicketorMerchantRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.TICKETOR_MERCHANT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TicketorMerchantRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TICKETOR_MERCHANT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TicketorMerchantRecord> getPrimaryKey() {
        return Keys.KEY_TICKETOR_MERCHANT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TicketorMerchantRecord>> getKeys() {
        return Arrays.<UniqueKey<TicketorMerchantRecord>>asList(Keys.KEY_TICKETOR_MERCHANT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorMerchant as(String alias) {
        return new TicketorMerchant(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketorMerchant as(Name alias) {
        return new TicketorMerchant(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TicketorMerchant rename(String name) {
        return new TicketorMerchant(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TicketorMerchant rename(Name name) {
        return new TicketorMerchant(name, null);
    }
}
