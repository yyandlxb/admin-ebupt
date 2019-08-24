/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.RouteRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Route extends TableImpl<RouteRecord> {

    private static final long serialVersionUID = 721243706;

    /**
     * The reference instance of <code>st.route</code>
     */
    public static final Route ROUTE = new Route();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RouteRecord> getRecordType() {
        return RouteRecord.class;
    }

    /**
     * The column <code>st.route.route_id</code>.
     */
    public final TableField<RouteRecord, Integer> ROUTE_ID = createField("route_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>st.route.start_point</code>. 起点
     */
    public final TableField<RouteRecord, String> START_POINT = createField("start_point", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "起点");

    /**
     * The column <code>st.route.end_point</code>. 重点
     */
    public final TableField<RouteRecord, String> END_POINT = createField("end_point", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "重点");

    /**
     * The column <code>st.route.create_time</code>.
     */
    public final TableField<RouteRecord, String> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.VARCHAR(510), this, "");

    /**
     * The column <code>st.route.route_mileage</code>.
     */
    public final TableField<RouteRecord, byte[]> ROUTE_MILEAGE = createField("route_mileage", org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>st.route.route_status</code>.
     */
    public final TableField<RouteRecord, byte[]> ROUTE_STATUS = createField("route_status", org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>st.route.srclonlat</code>.
     */
    public final TableField<RouteRecord, byte[]> SRCLONLAT = createField("srclonlat", org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>st.route.destlonlat</code>.
     */
    public final TableField<RouteRecord, byte[]> DESTLONLAT = createField("destlonlat", org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>st.route.operation_username</code>.
     */
    public final TableField<RouteRecord, byte[]> OPERATION_USERNAME = createField("operation_username", org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>st.route.status</code>.
     */
    public final TableField<RouteRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>st.route.business_id</code>.
     */
    public final TableField<RouteRecord, Integer> BUSINESS_ID = createField("business_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.route.route_code</code>.
     */
    public final TableField<RouteRecord, String> ROUTE_CODE = createField("route_code", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>st.route.landing_point</code>. 地址
     */
    public final TableField<RouteRecord, String> LANDING_POINT = createField("landing_point", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "地址");

    /**
     * The column <code>st.route.landing_phone</code>. 电话
     */
    public final TableField<RouteRecord, String> LANDING_PHONE = createField("landing_phone", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "电话");

    /**
     * The column <code>st.route.id</code>.
     */
    public final TableField<RouteRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>st.route.user_phone</code>. 负责人电话
     */
    public final TableField<RouteRecord, String> USER_PHONE = createField("user_phone", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "负责人电话");

    /**
     * Create a <code>st.route</code> table reference
     */
    public Route() {
        this(DSL.name("route"), null);
    }

    /**
     * Create an aliased <code>st.route</code> table reference
     */
    public Route(String alias) {
        this(DSL.name(alias), ROUTE);
    }

    /**
     * Create an aliased <code>st.route</code> table reference
     */
    public Route(Name alias) {
        this(alias, ROUTE);
    }

    private Route(Name alias, Table<RouteRecord> aliased) {
        this(alias, aliased, null);
    }

    private Route(Name alias, Table<RouteRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
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
    public Route as(String alias) {
        return new Route(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Route as(Name alias) {
        return new Route(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Route rename(String name) {
        return new Route(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Route rename(Name name) {
        return new Route(name, null);
    }
}
