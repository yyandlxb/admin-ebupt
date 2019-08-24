/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.AppMapRecord;

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
 * ÉÏ´«ÔËµ¥ÐÅÏ¢Ó³Éä
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppMap extends TableImpl<AppMapRecord> {

    private static final long serialVersionUID = -441152288;

    /**
     * The reference instance of <code>st.app_map</code>
     */
    public static final AppMap APP_MAP = new AppMap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppMapRecord> getRecordType() {
        return AppMapRecord.class;
    }

    /**
     * The column <code>st.app_map.id</code>.
     */
    public final TableField<AppMapRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.app_map.app_id</code>.
     */
    public final TableField<AppMapRecord, Integer> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.app_map.app_secret</code>.
     */
    public final TableField<AppMapRecord, String> APP_SECRET = createField("app_secret", org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * The column <code>st.app_map.pos_code</code>.
     */
    public final TableField<AppMapRecord, Integer> POS_CODE = createField("pos_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.app_map.created_at</code>.
     */
    public final TableField<AppMapRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.app_map.updated_at</code>.
     */
    public final TableField<AppMapRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>st.app_map</code> table reference
     */
    public AppMap() {
        this(DSL.name("app_map"), null);
    }

    /**
     * Create an aliased <code>st.app_map</code> table reference
     */
    public AppMap(String alias) {
        this(DSL.name(alias), APP_MAP);
    }

    /**
     * Create an aliased <code>st.app_map</code> table reference
     */
    public AppMap(Name alias) {
        this(alias, APP_MAP);
    }

    private AppMap(Name alias, Table<AppMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private AppMap(Name alias, Table<AppMapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "ÉÏ´«ÔËµ¥ÐÅÏ¢Ó³Éä");
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
        return Arrays.<Index>asList(Indexes.APP_MAP_PRIMARY, Indexes.APP_MAP_UK_APP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AppMapRecord, Integer> getIdentity() {
        return Keys.IDENTITY_APP_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AppMapRecord> getPrimaryKey() {
        return Keys.KEY_APP_MAP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AppMapRecord>> getKeys() {
        return Arrays.<UniqueKey<AppMapRecord>>asList(Keys.KEY_APP_MAP_PRIMARY, Keys.KEY_APP_MAP_UK_APP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppMap as(String alias) {
        return new AppMap(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppMap as(Name alias) {
        return new AppMap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AppMap rename(String name) {
        return new AppMap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AppMap rename(Name name) {
        return new AppMap(name, null);
    }
}