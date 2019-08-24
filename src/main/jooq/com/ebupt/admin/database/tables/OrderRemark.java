/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.OrderRemarkRecord;

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
public class OrderRemark extends TableImpl<OrderRemarkRecord> {

    private static final long serialVersionUID = 2076397200;

    /**
     * The reference instance of <code>st.order_remark</code>
     */
    public static final OrderRemark ORDER_REMARK = new OrderRemark();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderRemarkRecord> getRecordType() {
        return OrderRemarkRecord.class;
    }

    /**
     * The column <code>st.order_remark.id</code>.
     */
    public final TableField<OrderRemarkRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.order_remark.order_id</code>. 订单id
     */
    public final TableField<OrderRemarkRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER, this, "订单id");

    /**
     * The column <code>st.order_remark.remark</code>. 备注
     */
    public final TableField<OrderRemarkRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>st.order_remark.create_time</code>. 创建时间
     */
    public final TableField<OrderRemarkRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>st.order_remark.status</code>. 0有效 1无效
     */
    public final TableField<OrderRemarkRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0有效 1无效");

    /**
     * The column <code>st.order_remark.user_account</code>. 操作人
     */
    public final TableField<OrderRemarkRecord, String> USER_ACCOUNT = createField("user_account", org.jooq.impl.SQLDataType.VARCHAR(255), this, "操作人");

    /**
     * Create a <code>st.order_remark</code> table reference
     */
    public OrderRemark() {
        this(DSL.name("order_remark"), null);
    }

    /**
     * Create an aliased <code>st.order_remark</code> table reference
     */
    public OrderRemark(String alias) {
        this(DSL.name(alias), ORDER_REMARK);
    }

    /**
     * Create an aliased <code>st.order_remark</code> table reference
     */
    public OrderRemark(Name alias) {
        this(alias, ORDER_REMARK);
    }

    private OrderRemark(Name alias, Table<OrderRemarkRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderRemark(Name alias, Table<OrderRemarkRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ORDER_REMARK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderRemarkRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORDER_REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderRemarkRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_REMARK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderRemarkRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderRemarkRecord>>asList(Keys.KEY_ORDER_REMARK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRemark as(String alias) {
        return new OrderRemark(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRemark as(Name alias) {
        return new OrderRemark(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderRemark rename(String name) {
        return new OrderRemark(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderRemark rename(Name name) {
        return new OrderRemark(name, null);
    }
}