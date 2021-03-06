/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.SenderCompletionRecord;

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
 * 发货人自动补全
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SenderCompletion extends TableImpl<SenderCompletionRecord> {

    private static final long serialVersionUID = -262232938;

    /**
     * The reference instance of <code>st.sender_completion</code>
     */
    public static final SenderCompletion SENDER_COMPLETION = new SenderCompletion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SenderCompletionRecord> getRecordType() {
        return SenderCompletionRecord.class;
    }

    /**
     * The column <code>st.sender_completion.id</code>.
     */
    public final TableField<SenderCompletionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.sender_completion.id_card_number</code>.
     */
    public final TableField<SenderCompletionRecord, String> ID_CARD_NUMBER = createField("id_card_number", org.jooq.impl.SQLDataType.VARCHAR(18).nullable(false), this, "");

    /**
     * The column <code>st.sender_completion.phone_number</code>.
     */
    public final TableField<SenderCompletionRecord, String> PHONE_NUMBER = createField("phone_number", org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * The column <code>st.sender_completion.name</code>.
     */
    public final TableField<SenderCompletionRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>st.sender_completion.created_at</code>.
     */
    public final TableField<SenderCompletionRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>st.sender_completion</code> table reference
     */
    public SenderCompletion() {
        this(DSL.name("sender_completion"), null);
    }

    /**
     * Create an aliased <code>st.sender_completion</code> table reference
     */
    public SenderCompletion(String alias) {
        this(DSL.name(alias), SENDER_COMPLETION);
    }

    /**
     * Create an aliased <code>st.sender_completion</code> table reference
     */
    public SenderCompletion(Name alias) {
        this(alias, SENDER_COMPLETION);
    }

    private SenderCompletion(Name alias, Table<SenderCompletionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SenderCompletion(Name alias, Table<SenderCompletionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "发货人自动补全");
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
        return Arrays.<Index>asList(Indexes.SENDER_COMPLETION_PRIMARY, Indexes.SENDER_COMPLETION_UK_SENDER_COMPLETION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SenderCompletionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SENDER_COMPLETION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SenderCompletionRecord> getPrimaryKey() {
        return Keys.KEY_SENDER_COMPLETION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SenderCompletionRecord>> getKeys() {
        return Arrays.<UniqueKey<SenderCompletionRecord>>asList(Keys.KEY_SENDER_COMPLETION_PRIMARY, Keys.KEY_SENDER_COMPLETION_UK_SENDER_COMPLETION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SenderCompletion as(String alias) {
        return new SenderCompletion(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SenderCompletion as(Name alias) {
        return new SenderCompletion(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SenderCompletion rename(String name) {
        return new SenderCompletion(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SenderCompletion rename(Name name) {
        return new SenderCompletion(name, null);
    }
}
