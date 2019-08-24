/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.OrderSeqNumRecord;

import java.sql.Date;
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
public class OrderSeqNum extends TableImpl<OrderSeqNumRecord> {

    private static final long serialVersionUID = 1462702057;

    /**
     * The reference instance of <code>st.order_seq_num</code>
     */
    public static final OrderSeqNum ORDER_SEQ_NUM = new OrderSeqNum();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderSeqNumRecord> getRecordType() {
        return OrderSeqNumRecord.class;
    }

    /**
     * The column <code>st.order_seq_num.id</code>.
     */
    public final TableField<OrderSeqNumRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.order_seq_num.order_seq_num</code>. 序列号
     */
    public final TableField<OrderSeqNumRecord, Integer> ORDER_SEQ_NUM_ = createField("order_seq_num", org.jooq.impl.SQLDataType.INTEGER, this, "序列号");

    /**
     * The column <code>st.order_seq_num.business_id</code>. 商户ID
     */
    public final TableField<OrderSeqNumRecord, Integer> BUSINESS_ID = createField("business_id", org.jooq.impl.SQLDataType.INTEGER, this, "商户ID");

    /**
     * The column <code>st.order_seq_num.create_time</code>. 创建
     */
    public final TableField<OrderSeqNumRecord, Date> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.DATE, this, "创建");

    /**
     * The column <code>st.order_seq_num.line_code</code>. 线路Code
     */
    public final TableField<OrderSeqNumRecord, String> LINE_CODE = createField("line_code", org.jooq.impl.SQLDataType.VARCHAR(10), this, "线路Code");

    /**
     * The column <code>st.order_seq_num.pos_code</code>. 设备号Code
     */
    public final TableField<OrderSeqNumRecord, String> POS_CODE = createField("pos_code", org.jooq.impl.SQLDataType.VARCHAR(10), this, "设备号Code");

    /**
     * Create a <code>st.order_seq_num</code> table reference
     */
    public OrderSeqNum() {
        this(DSL.name("order_seq_num"), null);
    }

    /**
     * Create an aliased <code>st.order_seq_num</code> table reference
     */
    public OrderSeqNum(String alias) {
        this(DSL.name(alias), ORDER_SEQ_NUM);
    }

    /**
     * Create an aliased <code>st.order_seq_num</code> table reference
     */
    public OrderSeqNum(Name alias) {
        this(alias, ORDER_SEQ_NUM);
    }

    private OrderSeqNum(Name alias, Table<OrderSeqNumRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderSeqNum(Name alias, Table<OrderSeqNumRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ORDER_SEQ_NUM_ORDER_SEQ_NUM, Indexes.ORDER_SEQ_NUM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderSeqNumRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORDER_SEQ_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderSeqNumRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_SEQ_NUM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderSeqNumRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderSeqNumRecord>>asList(Keys.KEY_ORDER_SEQ_NUM_PRIMARY, Keys.KEY_ORDER_SEQ_NUM_ORDER_SEQ_NUM);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderSeqNum as(String alias) {
        return new OrderSeqNum(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderSeqNum as(Name alias) {
        return new OrderSeqNum(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderSeqNum rename(String name) {
        return new OrderSeqNum(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderSeqNum rename(Name name) {
        return new OrderSeqNum(name, null);
    }
}