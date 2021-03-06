/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.CwSendReportRecord;

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
public class CwSendReport extends TableImpl<CwSendReportRecord> {

    private static final long serialVersionUID = -1214181410;

    /**
     * The reference instance of <code>st.cw_send_report</code>
     */
    public static final CwSendReport CW_SEND_REPORT = new CwSendReport();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CwSendReportRecord> getRecordType() {
        return CwSendReportRecord.class;
    }

    /**
     * The column <code>st.cw_send_report.id</code>.
     */
    public final TableField<CwSendReportRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.cw_send_report.business_id</code>.
     */
    public final TableField<CwSendReportRecord, Integer> BUSINESS_ID = createField("business_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>st.cw_send_report.line_code</code>.
     */
    public final TableField<CwSendReportRecord, String> LINE_CODE = createField("line_code", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>st.cw_send_report.security_fee</code>.
     */
    public final TableField<CwSendReportRecord, String> SECURITY_FEE = createField("security_fee", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>st.cw_send_report.business_fee</code>.
     */
    public final TableField<CwSendReportRecord, String> BUSINESS_FEE = createField("business_fee", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>st.cw_send_report.landing_fee</code>.
     */
    public final TableField<CwSendReportRecord, String> LANDING_FEE = createField("landing_fee", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>st.cw_send_report.hlvan_fee</code>.
     */
    public final TableField<CwSendReportRecord, String> HLVAN_FEE = createField("hlvan_fee", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>st.cw_send_report.send</code>. 对账人
     */
    public final TableField<CwSendReportRecord, String> SEND = createField("send", org.jooq.impl.SQLDataType.VARCHAR(50), this, "对账人");

    /**
     * The column <code>st.cw_send_report.send_time</code>. 对账日期
     */
    public final TableField<CwSendReportRecord, Timestamp> SEND_TIME = createField("send_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "对账日期");

    /**
     * The column <code>st.cw_send_report.status</code>. 0: 认默 1:发送报表  2：删除
     */
    public final TableField<CwSendReportRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "0: 认默 1:发送报表  2：删除");

    /**
     * The column <code>st.cw_send_report.begin_time</code>. 开始日期
     */
    public final TableField<CwSendReportRecord, String> BEGIN_TIME = createField("begin_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "开始日期");

    /**
     * The column <code>st.cw_send_report.end_time</code>. 结束日期
     */
    public final TableField<CwSendReportRecord, String> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "结束日期");

    /**
     * Create a <code>st.cw_send_report</code> table reference
     */
    public CwSendReport() {
        this(DSL.name("cw_send_report"), null);
    }

    /**
     * Create an aliased <code>st.cw_send_report</code> table reference
     */
    public CwSendReport(String alias) {
        this(DSL.name(alias), CW_SEND_REPORT);
    }

    /**
     * Create an aliased <code>st.cw_send_report</code> table reference
     */
    public CwSendReport(Name alias) {
        this(alias, CW_SEND_REPORT);
    }

    private CwSendReport(Name alias, Table<CwSendReportRecord> aliased) {
        this(alias, aliased, null);
    }

    private CwSendReport(Name alias, Table<CwSendReportRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CW_SEND_REPORT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CwSendReportRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CW_SEND_REPORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CwSendReportRecord> getPrimaryKey() {
        return Keys.KEY_CW_SEND_REPORT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CwSendReportRecord>> getKeys() {
        return Arrays.<UniqueKey<CwSendReportRecord>>asList(Keys.KEY_CW_SEND_REPORT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CwSendReport as(String alias) {
        return new CwSendReport(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CwSendReport as(Name alias) {
        return new CwSendReport(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CwSendReport rename(String name) {
        return new CwSendReport(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CwSendReport rename(Name name) {
        return new CwSendReport(name, null);
    }
}
