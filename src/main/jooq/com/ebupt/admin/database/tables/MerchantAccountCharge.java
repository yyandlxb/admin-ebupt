/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.MerchantAccountChargeRecord;

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
 * 商户账户充值
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MerchantAccountCharge extends TableImpl<MerchantAccountChargeRecord> {

    private static final long serialVersionUID = 1002476837;

    /**
     * The reference instance of <code>st.merchant_account_charge</code>
     */
    public static final MerchantAccountCharge MERCHANT_ACCOUNT_CHARGE = new MerchantAccountCharge();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MerchantAccountChargeRecord> getRecordType() {
        return MerchantAccountChargeRecord.class;
    }

    /**
     * The column <code>st.merchant_account_charge.id</code>.
     */
    public final TableField<MerchantAccountChargeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.merchant_account_charge.no</code>.
     */
    public final TableField<MerchantAccountChargeRecord, String> NO = createField("no", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>st.merchant_account_charge.method</code>.
     */
    public final TableField<MerchantAccountChargeRecord, Byte> METHOD = createField("method", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>st.merchant_account_charge.account_id</code>.
     */
    public final TableField<MerchantAccountChargeRecord, Integer> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.merchant_account_charge.price</code>.
     */
    public final TableField<MerchantAccountChargeRecord, Integer> PRICE = createField("price", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.merchant_account_charge.commission_fee</code>.
     */
    public final TableField<MerchantAccountChargeRecord, Integer> COMMISSION_FEE = createField("commission_fee", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.merchant_account_charge.commission_fee_rate</code>.
     */
    public final TableField<MerchantAccountChargeRecord, BigDecimal> COMMISSION_FEE_RATE = createField("commission_fee_rate", org.jooq.impl.SQLDataType.DECIMAL(5, 5).nullable(false), this, "");

    /**
     * The column <code>st.merchant_account_charge.expire_time</code>.
     */
    public final TableField<MerchantAccountChargeRecord, Timestamp> EXPIRE_TIME = createField("expire_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.merchant_account_charge.status</code>.
     */
    public final TableField<MerchantAccountChargeRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>st.merchant_account_charge.uri</code>.
     */
    public final TableField<MerchantAccountChargeRecord, String> URI = createField("uri", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>st.merchant_account_charge.trade_no</code>.
     */
    public final TableField<MerchantAccountChargeRecord, String> TRADE_NO = createField("trade_no", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>st.merchant_account_charge.paid_at</code>.
     */
    public final TableField<MerchantAccountChargeRecord, Timestamp> PAID_AT = createField("paid_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>st.merchant_account_charge.created_at</code>.
     */
    public final TableField<MerchantAccountChargeRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.merchant_account_charge.updated_at</code>.
     */
    public final TableField<MerchantAccountChargeRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>st.merchant_account_charge</code> table reference
     */
    public MerchantAccountCharge() {
        this(DSL.name("merchant_account_charge"), null);
    }

    /**
     * Create an aliased <code>st.merchant_account_charge</code> table reference
     */
    public MerchantAccountCharge(String alias) {
        this(DSL.name(alias), MERCHANT_ACCOUNT_CHARGE);
    }

    /**
     * Create an aliased <code>st.merchant_account_charge</code> table reference
     */
    public MerchantAccountCharge(Name alias) {
        this(alias, MERCHANT_ACCOUNT_CHARGE);
    }

    private MerchantAccountCharge(Name alias, Table<MerchantAccountChargeRecord> aliased) {
        this(alias, aliased, null);
    }

    private MerchantAccountCharge(Name alias, Table<MerchantAccountChargeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "商户账户充值");
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
        return Arrays.<Index>asList(Indexes.MERCHANT_ACCOUNT_CHARGE_IDX_MERCHANT_ACCOUNT_CHARGE_AID, Indexes.MERCHANT_ACCOUNT_CHARGE_IDX_MERCHANT_ACCOUNT_CHARGE_EXPIRE, Indexes.MERCHANT_ACCOUNT_CHARGE_PRIMARY, Indexes.MERCHANT_ACCOUNT_CHARGE_UK_MERCHANT_ACCOUNT_CHARGE_ON);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MerchantAccountChargeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MERCHANT_ACCOUNT_CHARGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MerchantAccountChargeRecord> getPrimaryKey() {
        return Keys.KEY_MERCHANT_ACCOUNT_CHARGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MerchantAccountChargeRecord>> getKeys() {
        return Arrays.<UniqueKey<MerchantAccountChargeRecord>>asList(Keys.KEY_MERCHANT_ACCOUNT_CHARGE_PRIMARY, Keys.KEY_MERCHANT_ACCOUNT_CHARGE_UK_MERCHANT_ACCOUNT_CHARGE_ON);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MerchantAccountCharge as(String alias) {
        return new MerchantAccountCharge(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MerchantAccountCharge as(Name alias) {
        return new MerchantAccountCharge(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MerchantAccountCharge rename(String name) {
        return new MerchantAccountCharge(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MerchantAccountCharge rename(Name name) {
        return new MerchantAccountCharge(name, null);
    }
}
