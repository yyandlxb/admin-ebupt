/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.OrderPayRecord;

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
public class OrderPay extends TableImpl<OrderPayRecord> {

    private static final long serialVersionUID = 1092456485;

    /**
     * The reference instance of <code>st.order_pay</code>
     */
    public static final OrderPay ORDER_PAY = new OrderPay();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderPayRecord> getRecordType() {
        return OrderPayRecord.class;
    }

    /**
     * The column <code>st.order_pay.id</code>.
     */
    public final TableField<OrderPayRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.order_pay.order_code</code>. 订单号
     */
    public final TableField<OrderPayRecord, String> ORDER_CODE = createField("order_code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "订单号");

    /**
     * The column <code>st.order_pay.pay_code</code>. 支付code
     */
    public final TableField<OrderPayRecord, String> PAY_CODE = createField("pay_code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "支付code");

    /**
     * The column <code>st.order_pay.pay_status</code>. 1 失败 2 成功
     */
    public final TableField<OrderPayRecord, String> PAY_STATUS = createField("pay_status", org.jooq.impl.SQLDataType.VARCHAR(2).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.VARCHAR)), this, "1 失败 2 成功");

    /**
     * The column <code>st.order_pay.pay_price</code>. 支付金额
     */
    public final TableField<OrderPayRecord, BigDecimal> PAY_PRICE = createField("pay_price", org.jooq.impl.SQLDataType.DECIMAL(20, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "支付金额");

    /**
     * The column <code>st.order_pay.oper_type</code>. 1 订单支付  2 订单退款
     */
    public final TableField<OrderPayRecord, String> OPER_TYPE = createField("oper_type", org.jooq.impl.SQLDataType.VARCHAR(2).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.VARCHAR)), this, "1 订单支付  2 订单退款");

    /**
     * The column <code>st.order_pay.pay_type</code>. 1 微信扫用户 2支付宝扫用户 3微信扫商户 4支付宝扫商户 5 pos 6 现金 7 托运部现金（回单付）
     */
    public final TableField<OrderPayRecord, String> PAY_TYPE = createField("pay_type", org.jooq.impl.SQLDataType.VARCHAR(2).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.VARCHAR)), this, "1 微信扫用户 2支付宝扫用户 3微信扫商户 4支付宝扫商户 5 pos 6 现金 7 托运部现金（回单付）");

    /**
     * The column <code>st.order_pay.send_msg</code>. 请求报文
     */
    public final TableField<OrderPayRecord, String> SEND_MSG = createField("send_msg", org.jooq.impl.SQLDataType.VARCHAR(2000), this, "请求报文");

    /**
     * The column <code>st.order_pay.rec_msg</code>. 返回报文
     */
    public final TableField<OrderPayRecord, String> REC_MSG = createField("rec_msg", org.jooq.impl.SQLDataType.VARCHAR(2000), this, "返回报文");

    /**
     * The column <code>st.order_pay.payment_no</code>. 支付账号
     */
    public final TableField<OrderPayRecord, String> PAYMENT_NO = createField("payment_no", org.jooq.impl.SQLDataType.VARCHAR(120), this, "支付账号");

    /**
     * The column <code>st.order_pay.pay_trans_no</code>. 三方流水号
     */
    public final TableField<OrderPayRecord, String> PAY_TRANS_NO = createField("pay_trans_no", org.jooq.impl.SQLDataType.VARCHAR(120), this, "三方流水号");

    /**
     * The column <code>st.order_pay.create_time</code>. 发起时间
     */
    public final TableField<OrderPayRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "发起时间");

    /**
     * The column <code>st.order_pay.update_time</code>. 成功时间
     */
    public final TableField<OrderPayRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "成功时间");

    /**
     * The column <code>st.order_pay.remark</code>. 1 有效 2无效
     */
    public final TableField<OrderPayRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.VARCHAR)), this, "1 有效 2无效");

    /**
     * The column <code>st.order_pay.effective</code>. 1 有效 2无效
     */
    public final TableField<OrderPayRecord, String> EFFECTIVE = createField("effective", org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.VARCHAR)), this, "1 有效 2无效");

    /**
     * The column <code>st.order_pay.pay_flag</code>. 1、现付 2 到付
     */
    public final TableField<OrderPayRecord, Integer> PAY_FLAG = createField("pay_flag", org.jooq.impl.SQLDataType.INTEGER, this, "1、现付 2 到付");

    /**
     * Create a <code>st.order_pay</code> table reference
     */
    public OrderPay() {
        this(DSL.name("order_pay"), null);
    }

    /**
     * Create an aliased <code>st.order_pay</code> table reference
     */
    public OrderPay(String alias) {
        this(DSL.name(alias), ORDER_PAY);
    }

    /**
     * Create an aliased <code>st.order_pay</code> table reference
     */
    public OrderPay(Name alias) {
        this(alias, ORDER_PAY);
    }

    private OrderPay(Name alias, Table<OrderPayRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderPay(Name alias, Table<OrderPayRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ORDER_PAY_ORDER_PAY_ORDER_CODE, Indexes.ORDER_PAY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderPayRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORDER_PAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderPayRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_PAY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderPayRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderPayRecord>>asList(Keys.KEY_ORDER_PAY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderPay as(String alias) {
        return new OrderPay(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderPay as(Name alias) {
        return new OrderPay(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderPay rename(String name) {
        return new OrderPay(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderPay rename(Name name) {
        return new OrderPay(name, null);
    }
}