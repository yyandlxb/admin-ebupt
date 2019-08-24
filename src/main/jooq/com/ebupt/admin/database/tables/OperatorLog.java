/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.OperatorLogRecord;

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
 * 操作日志
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OperatorLog extends TableImpl<OperatorLogRecord> {

    private static final long serialVersionUID = 90700020;

    /**
     * The reference instance of <code>st.operator_log</code>
     */
    public static final OperatorLog OPERATOR_LOG = new OperatorLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OperatorLogRecord> getRecordType() {
        return OperatorLogRecord.class;
    }

    /**
     * The column <code>st.operator_log.id</code>.
     */
    public final TableField<OperatorLogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.operator_log.account</code>. 操作账号
     */
    public final TableField<OperatorLogRecord, String> ACCOUNT = createField("account", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "操作账号");

    /**
     * The column <code>st.operator_log.classify</code>. 操作项目
     */
    public final TableField<OperatorLogRecord, String> CLASSIFY = createField("classify", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "操作项目");

    /**
     * The column <code>st.operator_log.content</code>. 操作内容
     */
    public final TableField<OperatorLogRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "操作内容");

    /**
     * The column <code>st.operator_log.created_at</code>.
     */
    public final TableField<OperatorLogRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.operator_log.updated_at</code>.
     */
    public final TableField<OperatorLogRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>st.operator_log</code> table reference
     */
    public OperatorLog() {
        this(DSL.name("operator_log"), null);
    }

    /**
     * Create an aliased <code>st.operator_log</code> table reference
     */
    public OperatorLog(String alias) {
        this(DSL.name(alias), OPERATOR_LOG);
    }

    /**
     * Create an aliased <code>st.operator_log</code> table reference
     */
    public OperatorLog(Name alias) {
        this(alias, OPERATOR_LOG);
    }

    private OperatorLog(Name alias, Table<OperatorLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private OperatorLog(Name alias, Table<OperatorLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "操作日志");
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
        return Arrays.<Index>asList(Indexes.OPERATOR_LOG_IDX_ACCOUNT, Indexes.OPERATOR_LOG_IDX_CLASSIFY, Indexes.OPERATOR_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OperatorLogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OPERATOR_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OperatorLogRecord> getPrimaryKey() {
        return Keys.KEY_OPERATOR_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OperatorLogRecord>> getKeys() {
        return Arrays.<UniqueKey<OperatorLogRecord>>asList(Keys.KEY_OPERATOR_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorLog as(String alias) {
        return new OperatorLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorLog as(Name alias) {
        return new OperatorLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OperatorLog rename(String name) {
        return new OperatorLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OperatorLog rename(Name name) {
        return new OperatorLog(name, null);
    }
}
