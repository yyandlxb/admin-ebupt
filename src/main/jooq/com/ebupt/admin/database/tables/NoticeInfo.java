/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.NoticeInfoRecord;

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
public class NoticeInfo extends TableImpl<NoticeInfoRecord> {

    private static final long serialVersionUID = -1232907497;

    /**
     * The reference instance of <code>st.notice_info</code>
     */
    public static final NoticeInfo NOTICE_INFO = new NoticeInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NoticeInfoRecord> getRecordType() {
        return NoticeInfoRecord.class;
    }

    /**
     * The column <code>st.notice_info.id</code>.
     */
    public final TableField<NoticeInfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.notice_info.title</code>. 标题
     */
    public final TableField<NoticeInfoRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(255), this, "标题");

    /**
     * The column <code>st.notice_info.simple_info</code>. 简介
     */
    public final TableField<NoticeInfoRecord, String> SIMPLE_INFO = createField("simple_info", org.jooq.impl.SQLDataType.VARCHAR(255), this, "简介");

    /**
     * The column <code>st.notice_info.info</code>. 内容
     */
    public final TableField<NoticeInfoRecord, String> INFO = createField("info", org.jooq.impl.SQLDataType.CLOB, this, "内容");

    /**
     * The column <code>st.notice_info.is_online</code>. 1，上线，0下线
     */
    public final TableField<NoticeInfoRecord, Integer> IS_ONLINE = createField("is_online", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "1，上线，0下线");

    /**
     * The column <code>st.notice_info.create_time</code>.
     */
    public final TableField<NoticeInfoRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>st.notice_info.is_delete</code>. 是否删除
     */
    public final TableField<NoticeInfoRecord, Integer> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否删除");

    /**
     * Create a <code>st.notice_info</code> table reference
     */
    public NoticeInfo() {
        this(DSL.name("notice_info"), null);
    }

    /**
     * Create an aliased <code>st.notice_info</code> table reference
     */
    public NoticeInfo(String alias) {
        this(DSL.name(alias), NOTICE_INFO);
    }

    /**
     * Create an aliased <code>st.notice_info</code> table reference
     */
    public NoticeInfo(Name alias) {
        this(alias, NOTICE_INFO);
    }

    private NoticeInfo(Name alias, Table<NoticeInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private NoticeInfo(Name alias, Table<NoticeInfoRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.NOTICE_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<NoticeInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_NOTICE_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<NoticeInfoRecord> getPrimaryKey() {
        return Keys.KEY_NOTICE_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NoticeInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<NoticeInfoRecord>>asList(Keys.KEY_NOTICE_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NoticeInfo as(String alias) {
        return new NoticeInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NoticeInfo as(Name alias) {
        return new NoticeInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NoticeInfo rename(String name) {
        return new NoticeInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NoticeInfo rename(Name name) {
        return new NoticeInfo(name, null);
    }
}
