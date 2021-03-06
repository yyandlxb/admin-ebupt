/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.StRouteRecord;

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
public class StRoute extends TableImpl<StRouteRecord> {

    private static final long serialVersionUID = -1023830139;

    /**
     * The reference instance of <code>st.st_route</code>
     */
    public static final StRoute ST_ROUTE = new StRoute();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StRouteRecord> getRecordType() {
        return StRouteRecord.class;
    }

    /**
     * The column <code>st.st_route.id</code>.
     */
    public final TableField<StRouteRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>st.st_route.start_point</code>. 起点
     */
    public final TableField<StRouteRecord, String> START_POINT = createField("start_point", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "起点");

    /**
     * The column <code>st.st_route.end_point</code>. 重点
     */
    public final TableField<StRouteRecord, String> END_POINT = createField("end_point", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "重点");

    /**
     * The column <code>st.st_route.create_time</code>.
     */
    public final TableField<StRouteRecord, String> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.VARCHAR(510), this, "");

    /**
     * The column <code>st.st_route.route_status</code>.
     */
    public final TableField<StRouteRecord, String> ROUTE_STATUS = createField("route_status", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>st.st_route.operation_username</code>.
     */
    public final TableField<StRouteRecord, byte[]> OPERATION_USERNAME = createField("operation_username", org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>st.st_route.route_code</code>.
     */
    public final TableField<StRouteRecord, String> ROUTE_CODE = createField("route_code", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>st.st_route.lobby</code>. 办票大厅地址
     */
    public final TableField<StRouteRecord, String> LOBBY = createField("lobby", org.jooq.impl.SQLDataType.VARCHAR(100), this, "办票大厅地址");

    /**
     * The column <code>st.st_route.user_phone</code>.
     */
    public final TableField<StRouteRecord, byte[]> USER_PHONE = createField("user_phone", org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>st.st_route.give_phone</code>. 办票大厅电话
     */
    public final TableField<StRouteRecord, String> GIVE_PHONE = createField("give_phone", org.jooq.impl.SQLDataType.VARCHAR(30), this, "办票大厅电话");

    /**
     * The column <code>st.st_route.is_storage</code>.
     */
    public final TableField<StRouteRecord, String> IS_STORAGE = createField("is_storage", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>st.st_route.is_securitysetting</code>.
     */
    public final TableField<StRouteRecord, String> IS_SECURITYSETTING = createField("is_securitysetting", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>st.st_route.is_lobby_exist</code>.
     */
    public final TableField<StRouteRecord, String> IS_LOBBY_EXIST = createField("is_lobby_exist", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>st.st_route.hm_id</code>. 对应干线线路
     */
    public final TableField<StRouteRecord, Integer> HM_ID = createField("hm_id", org.jooq.impl.SQLDataType.INTEGER, this, "对应干线线路");

    /**
     * The column <code>st.st_route.hm_route_name</code>. 对应干线线路名称
     */
    public final TableField<StRouteRecord, String> HM_ROUTE_NAME = createField("hm_route_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "对应干线线路名称");

    /**
     * The column <code>st.st_route.is_long_line</code>. 线路模式
     */
    public final TableField<StRouteRecord, Byte> IS_LONG_LINE = createField("is_long_line", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "线路模式");

    /**
     * Create a <code>st.st_route</code> table reference
     */
    public StRoute() {
        this(DSL.name("st_route"), null);
    }

    /**
     * Create an aliased <code>st.st_route</code> table reference
     */
    public StRoute(String alias) {
        this(DSL.name(alias), ST_ROUTE);
    }

    /**
     * Create an aliased <code>st.st_route</code> table reference
     */
    public StRoute(Name alias) {
        this(alias, ST_ROUTE);
    }

    private StRoute(Name alias, Table<StRouteRecord> aliased) {
        this(alias, aliased, null);
    }

    private StRoute(Name alias, Table<StRouteRecord> aliased, Field<?>[] parameters) {
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
    public StRoute as(String alias) {
        return new StRoute(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRoute as(Name alias) {
        return new StRoute(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StRoute rename(String name) {
        return new StRoute(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StRoute rename(Name name) {
        return new StRoute(name, null);
    }
}
