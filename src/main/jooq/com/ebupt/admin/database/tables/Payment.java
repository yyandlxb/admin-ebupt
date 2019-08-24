/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.PaymentRecord;

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
public class Payment extends TableImpl<PaymentRecord> {

    private static final long serialVersionUID = 1147599299;

    /**
     * The reference instance of <code>st.payment</code>
     */
    public static final Payment PAYMENT = new Payment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentRecord> getRecordType() {
        return PaymentRecord.class;
    }

    /**
     * The column <code>st.payment.id</code>.
     */
    public final TableField<PaymentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.payment.no</code>. 支付单号
     */
    public final TableField<PaymentRecord, String> NO = createField("no", org.jooq.impl.SQLDataType.VARCHAR(25).nullable(false), this, "支付单号");

    /**
     * The column <code>st.payment.order_id</code>.
     */
    public final TableField<PaymentRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.payment.method</code>. 支付方式。1：微信刷卡支付；2：支付宝条码支付
     */
    public final TableField<PaymentRecord, Byte> METHOD = createField("method", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "支付方式。1：微信刷卡支付；2：支付宝条码支付");

    /**
     * The column <code>st.payment.price</code>. 支付金额，单位为分
     */
    public final TableField<PaymentRecord, Integer> PRICE = createField("price", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "支付金额，单位为分");

    /**
     * The column <code>st.payment.expire_time</code>. 支付超时时间
     */
    public final TableField<PaymentRecord, Timestamp> EXPIRE_TIME = createField("expire_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "支付超时时间");

    /**
     * The column <code>st.payment.status</code>. 状态。0：未知状态；1：未支付；2：用户支付中，等待确认结果；3：支付成功；4：支付明确返回失败；5：交易过期，用户未在有效期内支付；6：系统主动交易撤销；7：交易发起了退款，等待确认结果；8：该笔支付已退款
     */
    public final TableField<PaymentRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "状态。0：未知状态；1：未支付；2：用户支付中，等待确认结果；3：支付成功；4：支付明确返回失败；5：交易过期，用户未在有效期内支付；6：系统主动交易撤销；7：交易发起了退款，等待确认结果；8：该笔支付已退款");

    /**
     * The column <code>st.payment.trade_no</code>. 支付平台交易号
     */
    public final TableField<PaymentRecord, String> TRADE_NO = createField("trade_no", org.jooq.impl.SQLDataType.VARCHAR(64), this, "支付平台交易号");

    /**
     * The column <code>st.payment.paid_at</code>. 实际支付时间
     */
    public final TableField<PaymentRecord, Timestamp> PAID_AT = createField("paid_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "实际支付时间");

    /**
     * The column <code>st.payment.created_at</code>.
     */
    public final TableField<PaymentRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.payment.updated_at</code>.
     */
    public final TableField<PaymentRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.payment.operator_id</code>. 操作人
     */
    public final TableField<PaymentRecord, Integer> OPERATOR_ID = createField("operator_id", org.jooq.impl.SQLDataType.INTEGER, this, "操作人");

    /**
     * Create a <code>st.payment</code> table reference
     */
    public Payment() {
        this(DSL.name("payment"), null);
    }

    /**
     * Create an aliased <code>st.payment</code> table reference
     */
    public Payment(String alias) {
        this(DSL.name(alias), PAYMENT);
    }

    /**
     * Create an aliased <code>st.payment</code> table reference
     */
    public Payment(Name alias) {
        this(alias, PAYMENT);
    }

    private Payment(Name alias, Table<PaymentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Payment(Name alias, Table<PaymentRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PAYMENT_IDX_PAYMENT_EXPIRE, Indexes.PAYMENT_IDX_PAYMENT_ORDER_ID, Indexes.PAYMENT_PRIMARY, Indexes.PAYMENT_UK_PAYMENT_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PaymentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PAYMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PaymentRecord> getPrimaryKey() {
        return Keys.KEY_PAYMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PaymentRecord>> getKeys() {
        return Arrays.<UniqueKey<PaymentRecord>>asList(Keys.KEY_PAYMENT_PRIMARY, Keys.KEY_PAYMENT_UK_PAYMENT_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Payment as(String alias) {
        return new Payment(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Payment as(Name alias) {
        return new Payment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Payment rename(String name) {
        return new Payment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Payment rename(Name name) {
        return new Payment(name, null);
    }
}