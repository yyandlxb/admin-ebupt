/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.BankCardClearRecord;

import java.math.BigDecimal;
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
public class BankCardClear extends TableImpl<BankCardClearRecord> {

    private static final long serialVersionUID = -776767137;

    /**
     * The reference instance of <code>st.bank_card_clear</code>
     */
    public static final BankCardClear BANK_CARD_CLEAR = new BankCardClear();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BankCardClearRecord> getRecordType() {
        return BankCardClearRecord.class;
    }

    /**
     * The column <code>st.bank_card_clear.id</code>.
     */
    public final TableField<BankCardClearRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.bank_card_clear.business_id</code>.
     */
    public final TableField<BankCardClearRecord, Integer> BUSINESS_ID = createField("business_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>st.bank_card_clear.line_id</code>. 线路id
     */
    public final TableField<BankCardClearRecord, Integer> LINE_ID = createField("line_id", org.jooq.impl.SQLDataType.INTEGER, this, "线路id");

    /**
     * The column <code>st.bank_card_clear.bank_card_num</code>. 银行卡号
     */
    public final TableField<BankCardClearRecord, String> BANK_CARD_NUM = createField("bank_card_num", org.jooq.impl.SQLDataType.VARCHAR(255), this, "银行卡号");

    /**
     * The column <code>st.bank_card_clear.bank_name</code>. 银行名称
     */
    public final TableField<BankCardClearRecord, String> BANK_NAME = createField("bank_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "银行名称");

    /**
     * The column <code>st.bank_card_clear.opening_bank_name</code>. 开户行名称
     */
    public final TableField<BankCardClearRecord, String> OPENING_BANK_NAME = createField("opening_bank_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "开户行名称");

    /**
     * The column <code>st.bank_card_clear.name</code>. 开户人姓名
     */
    public final TableField<BankCardClearRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "开户人姓名");

    /**
     * The column <code>st.bank_card_clear.bank_status</code>. 银行卡类型：1，运费，2，垫付费，3，代收款
     */
    public final TableField<BankCardClearRecord, String> BANK_STATUS = createField("bank_status", org.jooq.impl.SQLDataType.VARCHAR(2), this, "银行卡类型：1，运费，2，垫付费，3，代收款");

    /**
     * The column <code>st.bank_card_clear.bank_percent</code>. 银行卡比例
     */
    public final TableField<BankCardClearRecord, BigDecimal> BANK_PERCENT = createField("bank_percent", org.jooq.impl.SQLDataType.DECIMAL(20, 2).defaultValue(org.jooq.impl.DSL.inline("100.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "银行卡比例");

    /**
     * The column <code>st.bank_card_clear.enabled</code>.
     */
    public final TableField<BankCardClearRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'1'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>st.bank_card_clear.created_at</code>.
     */
    public final TableField<BankCardClearRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.bank_card_clear.updated_at</code>.
     */
    public final TableField<BankCardClearRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.bank_card_clear.province_number</code>. 省份号
     */
    public final TableField<BankCardClearRecord, String> PROVINCE_NUMBER = createField("province_number", org.jooq.impl.SQLDataType.VARCHAR(10), this, "省份号");

    /**
     * The column <code>st.bank_card_clear.province_name</code>. 省份名称
     */
    public final TableField<BankCardClearRecord, String> PROVINCE_NAME = createField("province_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "省份名称");

    /**
     * The column <code>st.bank_card_clear.bank_code</code>. 银行COde
     */
    public final TableField<BankCardClearRecord, String> BANK_CODE = createField("bank_code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "银行COde");

    /**
     * The column <code>st.bank_card_clear.opening_bank_code</code>. 开户行COde
     */
    public final TableField<BankCardClearRecord, String> OPENING_BANK_CODE = createField("opening_bank_code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "开户行COde");

    /**
     * Create a <code>st.bank_card_clear</code> table reference
     */
    public BankCardClear() {
        this(DSL.name("bank_card_clear"), null);
    }

    /**
     * Create an aliased <code>st.bank_card_clear</code> table reference
     */
    public BankCardClear(String alias) {
        this(DSL.name(alias), BANK_CARD_CLEAR);
    }

    /**
     * Create an aliased <code>st.bank_card_clear</code> table reference
     */
    public BankCardClear(Name alias) {
        this(alias, BANK_CARD_CLEAR);
    }

    private BankCardClear(Name alias, Table<BankCardClearRecord> aliased) {
        this(alias, aliased, null);
    }

    private BankCardClear(Name alias, Table<BankCardClearRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.BANK_CARD_CLEAR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BankCardClearRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BANK_CARD_CLEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BankCardClearRecord> getPrimaryKey() {
        return Keys.KEY_BANK_CARD_CLEAR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BankCardClearRecord>> getKeys() {
        return Arrays.<UniqueKey<BankCardClearRecord>>asList(Keys.KEY_BANK_CARD_CLEAR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankCardClear as(String alias) {
        return new BankCardClear(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankCardClear as(Name alias) {
        return new BankCardClear(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BankCardClear rename(String name) {
        return new BankCardClear(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BankCardClear rename(Name name) {
        return new BankCardClear(name, null);
    }
}
