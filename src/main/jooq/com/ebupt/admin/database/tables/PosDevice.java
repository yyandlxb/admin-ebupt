/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.PosDeviceRecord;

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
public class PosDevice extends TableImpl<PosDeviceRecord> {

    private static final long serialVersionUID = 927420719;

    /**
     * The reference instance of <code>st.pos_device</code>
     */
    public static final PosDevice POS_DEVICE = new PosDevice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PosDeviceRecord> getRecordType() {
        return PosDeviceRecord.class;
    }

    /**
     * The column <code>st.pos_device.id</code>.
     */
    public final TableField<PosDeviceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.pos_device.name</code>. 设备名称
     */
    public final TableField<PosDeviceRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "设备名称");

    /**
     * The column <code>st.pos_device.serial_number</code>. 设备号
     */
    public final TableField<PosDeviceRecord, String> SERIAL_NUMBER = createField("serial_number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "设备号");

    /**
     * The column <code>st.pos_device.model_number</code>. 型号
     */
    public final TableField<PosDeviceRecord, String> MODEL_NUMBER = createField("model_number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "型号");

    /**
     * The column <code>st.pos_device.business_id</code>. 分配的商家ID
     */
    public final TableField<PosDeviceRecord, Integer> BUSINESS_ID = createField("business_id", org.jooq.impl.SQLDataType.INTEGER, this, "分配的商家ID");

    /**
     * The column <code>st.pos_device.status</code>. 0：已分配  1：闲置  2：损坏
     */
    public final TableField<PosDeviceRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "0：已分配  1：闲置  2：损坏");

    /**
     * The column <code>st.pos_device.create_time</code>. 创建日期
     */
    public final TableField<PosDeviceRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建日期");

    /**
     * The column <code>st.pos_device.update_time</code>. 修改日期
     */
    public final TableField<PosDeviceRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "修改日期");

    /**
     * The column <code>st.pos_device.fix_time</code>. 安装日期
     */
    public final TableField<PosDeviceRecord, Timestamp> FIX_TIME = createField("fix_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "安装日期");

    /**
     * The column <code>st.pos_device.pos_code</code>. 设备编号
     */
    public final TableField<PosDeviceRecord, Integer> POS_CODE = createField("pos_code", org.jooq.impl.SQLDataType.INTEGER, this, "设备编号");

    /**
     * The column <code>st.pos_device.sn_code_img</code>. SN编码照片
     */
    public final TableField<PosDeviceRecord, String> SN_CODE_IMG = createField("sn_code_img", org.jooq.impl.SQLDataType.VARCHAR(255), this, "SN编码照片");

    /**
     * The column <code>st.pos_device.remark</code>. 设备注释
     */
    public final TableField<PosDeviceRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "设备注释");

    /**
     * Create a <code>st.pos_device</code> table reference
     */
    public PosDevice() {
        this(DSL.name("pos_device"), null);
    }

    /**
     * Create an aliased <code>st.pos_device</code> table reference
     */
    public PosDevice(String alias) {
        this(DSL.name(alias), POS_DEVICE);
    }

    /**
     * Create an aliased <code>st.pos_device</code> table reference
     */
    public PosDevice(Name alias) {
        this(alias, POS_DEVICE);
    }

    private PosDevice(Name alias, Table<PosDeviceRecord> aliased) {
        this(alias, aliased, null);
    }

    private PosDevice(Name alias, Table<PosDeviceRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.POS_DEVICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PosDeviceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_POS_DEVICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PosDeviceRecord> getPrimaryKey() {
        return Keys.KEY_POS_DEVICE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PosDeviceRecord>> getKeys() {
        return Arrays.<UniqueKey<PosDeviceRecord>>asList(Keys.KEY_POS_DEVICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosDevice as(String alias) {
        return new PosDevice(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosDevice as(Name alias) {
        return new PosDevice(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PosDevice rename(String name) {
        return new PosDevice(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PosDevice rename(Name name) {
        return new PosDevice(name, null);
    }
}
