/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.CollectionFeeMonthRecordRecord;

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
public class CollectionFeeMonthRecord extends TableImpl<CollectionFeeMonthRecordRecord> {

    private static final long serialVersionUID = 1298199586;

    /**
     * The reference instance of <code>st.collection_fee_month_record</code>
     */
    public static final CollectionFeeMonthRecord COLLECTION_FEE_MONTH_RECORD = new CollectionFeeMonthRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CollectionFeeMonthRecordRecord> getRecordType() {
        return CollectionFeeMonthRecordRecord.class;
    }

    /**
     * The column <code>st.collection_fee_month_record.id</code>.
     */
    public final TableField<CollectionFeeMonthRecordRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.collection_fee_month_record.line_id</code>.
     */
    public final TableField<CollectionFeeMonthRecordRecord, Integer> LINE_ID = createField("line_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>st.collection_fee_month_record.business_id</code>.
     */
    public final TableField<CollectionFeeMonthRecordRecord, Integer> BUSINESS_ID = createField("business_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.collection_fee_month_record.start_at</code>. 日报开始时间
     */
    public final TableField<CollectionFeeMonthRecordRecord, Timestamp> START_AT = createField("start_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "日报开始时间");

    /**
     * The column <code>st.collection_fee_month_record.end_at</code>.
     */
    public final TableField<CollectionFeeMonthRecordRecord, Timestamp> END_AT = createField("end_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.collection_fee_month_record.money</code>.
     */
    public final TableField<CollectionFeeMonthRecordRecord, Integer> MONEY = createField("money", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.collection_fee_month_record.status</code>. 1:未发送 2:已发送 3：等待确认 4：已完成
     */
    public final TableField<CollectionFeeMonthRecordRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "1:未发送 2:已发送 3：等待确认 4：已完成");

    /**
     * The column <code>st.collection_fee_month_record.business_confirm_name</code>. 商户确认姓名
     */
    public final TableField<CollectionFeeMonthRecordRecord, String> BUSINESS_CONFIRM_NAME = createField("business_confirm_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "商户确认姓名");

    /**
     * The column <code>st.collection_fee_month_record.business_confirm_phone</code>. 商户对账手机号
     */
    public final TableField<CollectionFeeMonthRecordRecord, String> BUSINESS_CONFIRM_PHONE = createField("business_confirm_phone", org.jooq.impl.SQLDataType.VARCHAR(20), this, "商户对账手机号");

    /**
     * The column <code>st.collection_fee_month_record.finance_confirm_name</code>. 财务确认姓名
     */
    public final TableField<CollectionFeeMonthRecordRecord, String> FINANCE_CONFIRM_NAME = createField("finance_confirm_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "财务确认姓名");

    /**
     * The column <code>st.collection_fee_month_record.finance_confirm_phone</code>. 财务对账手机号
     */
    public final TableField<CollectionFeeMonthRecordRecord, String> FINANCE_CONFIRM_PHONE = createField("finance_confirm_phone", org.jooq.impl.SQLDataType.VARCHAR(20), this, "财务对账手机号");

    /**
     * The column <code>st.collection_fee_month_record.send_at</code>. 报表发送时间
     */
    public final TableField<CollectionFeeMonthRecordRecord, Timestamp> SEND_AT = createField("send_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "报表发送时间");

    /**
     * The column <code>st.collection_fee_month_record.business_at</code>. 商户确认时间
     */
    public final TableField<CollectionFeeMonthRecordRecord, Timestamp> BUSINESS_AT = createField("business_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "商户确认时间");

    /**
     * The column <code>st.collection_fee_month_record.created_at</code>.
     */
    public final TableField<CollectionFeeMonthRecordRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.collection_fee_month_record.updated_at</code>.
     */
    public final TableField<CollectionFeeMonthRecordRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>st.collection_fee_month_record</code> table reference
     */
    public CollectionFeeMonthRecord() {
        this(DSL.name("collection_fee_month_record"), null);
    }

    /**
     * Create an aliased <code>st.collection_fee_month_record</code> table reference
     */
    public CollectionFeeMonthRecord(String alias) {
        this(DSL.name(alias), COLLECTION_FEE_MONTH_RECORD);
    }

    /**
     * Create an aliased <code>st.collection_fee_month_record</code> table reference
     */
    public CollectionFeeMonthRecord(Name alias) {
        this(alias, COLLECTION_FEE_MONTH_RECORD);
    }

    private CollectionFeeMonthRecord(Name alias, Table<CollectionFeeMonthRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private CollectionFeeMonthRecord(Name alias, Table<CollectionFeeMonthRecordRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.COLLECTION_FEE_MONTH_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CollectionFeeMonthRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COLLECTION_FEE_MONTH_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CollectionFeeMonthRecordRecord> getPrimaryKey() {
        return Keys.KEY_COLLECTION_FEE_MONTH_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CollectionFeeMonthRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<CollectionFeeMonthRecordRecord>>asList(Keys.KEY_COLLECTION_FEE_MONTH_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeMonthRecord as(String alias) {
        return new CollectionFeeMonthRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeMonthRecord as(Name alias) {
        return new CollectionFeeMonthRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CollectionFeeMonthRecord rename(String name) {
        return new CollectionFeeMonthRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CollectionFeeMonthRecord rename(Name name) {
        return new CollectionFeeMonthRecord(name, null);
    }
}
