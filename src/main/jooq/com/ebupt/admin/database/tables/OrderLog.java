/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.OrderLogRecord;

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
public class OrderLog extends TableImpl<OrderLogRecord> {

    private static final long serialVersionUID = 504790921;

    /**
     * The reference instance of <code>st.order_log</code>
     */
    public static final OrderLog ORDER_LOG = new OrderLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderLogRecord> getRecordType() {
        return OrderLogRecord.class;
    }

    /**
     * The column <code>st.order_log.id</code>.
     */
    public final TableField<OrderLogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.order_log.order_code</code>. 订单号
     */
    public final TableField<OrderLogRecord, String> ORDER_CODE = createField("order_code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "订单号");

    /**
     * The column <code>st.order_log.type</code>. 1:回滚待付款,2:回滚待办票,3:关闭,4:修改内容,5:删除
     */
    public final TableField<OrderLogRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(2), this, "1:回滚待付款,2:回滚待办票,3:关闭,4:修改内容,5:删除");

    /**
     * The column <code>st.order_log.create_time</code>. 创建时间
     */
    public final TableField<OrderLogRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>st.order_log.log_info</code>. 详情
     */
    public final TableField<OrderLogRecord, String> LOG_INFO = createField("log_info", org.jooq.impl.SQLDataType.VARCHAR(255), this, "详情");

    /**
     * The column <code>st.order_log.user_name</code>. 用户名
     */
    public final TableField<OrderLogRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "用户名");

    /**
     * The column <code>st.order_log.source</code>. 1:财务系统,2:办票系统,3:直接操作数据库4:APP
     */
    public final TableField<OrderLogRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR(2), this, "1:财务系统,2:办票系统,3:直接操作数据库4:APP");

    /**
     * The column <code>st.order_log.hm_fee_change</code>. 运费变化
     */
    public final TableField<OrderLogRecord, BigDecimal> HM_FEE_CHANGE = createField("hm_fee_change", org.jooq.impl.SQLDataType.DECIMAL(20, 2), this, "运费变化");

    /**
     * The column <code>st.order_log.advance_fee_change</code>. 垫付费变化
     */
    public final TableField<OrderLogRecord, BigDecimal> ADVANCE_FEE_CHANGE = createField("advance_fee_change", org.jooq.impl.SQLDataType.DECIMAL(20, 2), this, "垫付费变化");

    /**
     * The column <code>st.order_log.collection_fee_change</code>. 代收费变化
     */
    public final TableField<OrderLogRecord, BigDecimal> COLLECTION_FEE_CHANGE = createField("collection_fee_change", org.jooq.impl.SQLDataType.DECIMAL(20, 2), this, "代收费变化");

    /**
     * The column <code>st.order_log.security_fee_change</code>. 附加运费变化
     */
    public final TableField<OrderLogRecord, BigDecimal> SECURITY_FEE_CHANGE = createField("security_fee_change", org.jooq.impl.SQLDataType.DECIMAL(20, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "附加运费变化");

    /**
     * The column <code>st.order_log.paygo_fee_change</code>. 现付费变化
     */
    public final TableField<OrderLogRecord, BigDecimal> PAYGO_FEE_CHANGE = createField("paygo_fee_change", org.jooq.impl.SQLDataType.DECIMAL(20, 2), this, "现付费变化");

    /**
     * The column <code>st.order_log.dest_fee_change</code>. 到付费变化
     */
    public final TableField<OrderLogRecord, BigDecimal> DEST_FEE_CHANGE = createField("dest_fee_change", org.jooq.impl.SQLDataType.DECIMAL(20, 2), this, "到付费变化");

    /**
     * The column <code>st.order_log.old_line_code</code>. 修改前原线路
     */
    public final TableField<OrderLogRecord, String> OLD_LINE_CODE = createField("old_line_code", org.jooq.impl.SQLDataType.VARCHAR(10), this, "修改前原线路");

    /**
     * The column <code>st.order_log.new_line_code</code>. 修改后现线路
     */
    public final TableField<OrderLogRecord, String> NEW_LINE_CODE = createField("new_line_code", org.jooq.impl.SQLDataType.VARCHAR(10), this, "修改后现线路");

    /**
     * Create a <code>st.order_log</code> table reference
     */
    public OrderLog() {
        this(DSL.name("order_log"), null);
    }

    /**
     * Create an aliased <code>st.order_log</code> table reference
     */
    public OrderLog(String alias) {
        this(DSL.name(alias), ORDER_LOG);
    }

    /**
     * Create an aliased <code>st.order_log</code> table reference
     */
    public OrderLog(Name alias) {
        this(alias, ORDER_LOG);
    }

    private OrderLog(Name alias, Table<OrderLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderLog(Name alias, Table<OrderLogRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ORDER_LOG_IDX_ORDER_CODE, Indexes.ORDER_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderLogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORDER_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderLogRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderLogRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderLogRecord>>asList(Keys.KEY_ORDER_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderLog as(String alias) {
        return new OrderLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderLog as(Name alias) {
        return new OrderLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderLog rename(String name) {
        return new OrderLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderLog rename(Name name) {
        return new OrderLog(name, null);
    }
}
