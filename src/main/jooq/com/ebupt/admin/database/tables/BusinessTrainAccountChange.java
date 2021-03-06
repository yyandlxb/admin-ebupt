/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.BusinessTrainAccountChangeRecord;

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
 * 商户班列账户变动表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessTrainAccountChange extends TableImpl<BusinessTrainAccountChangeRecord> {

    private static final long serialVersionUID = -693669711;

    /**
     * The reference instance of <code>st.business_train_account_change</code>
     */
    public static final BusinessTrainAccountChange BUSINESS_TRAIN_ACCOUNT_CHANGE = new BusinessTrainAccountChange();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BusinessTrainAccountChangeRecord> getRecordType() {
        return BusinessTrainAccountChangeRecord.class;
    }

    /**
     * The column <code>st.business_train_account_change.id</code>.
     */
    public final TableField<BusinessTrainAccountChangeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.business_train_account_change.no</code>.
     */
    public final TableField<BusinessTrainAccountChangeRecord, String> NO = createField("no", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>st.business_train_account_change.account_id</code>.
     */
    public final TableField<BusinessTrainAccountChangeRecord, Integer> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>st.business_train_account_change.type</code>. 1:充值 2.支付3:提现 4:异常增加 5:异常减少 6:微信充值 7:支付宝充值
     */
    public final TableField<BusinessTrainAccountChangeRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "1:充值 2.支付3:提现 4:异常增加 5:异常减少 6:微信充值 7:支付宝充值");

    /**
     * The column <code>st.business_train_account_change.delta</code>. 账户变化值
     */
    public final TableField<BusinessTrainAccountChangeRecord, BigDecimal> DELTA = createField("delta", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false), this, "账户变化值");

    /**
     * The column <code>st.business_train_account_change.after</code>. 此次变更后账户金额
     */
    public final TableField<BusinessTrainAccountChangeRecord, BigDecimal> AFTER = createField("after", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false), this, "此次变更后账户金额");

    /**
     * The column <code>st.business_train_account_change.remark</code>. 财务后台添加备注
     */
    public final TableField<BusinessTrainAccountChangeRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(50), this, "财务后台添加备注");

    /**
     * The column <code>st.business_train_account_change.created_at</code>.
     */
    public final TableField<BusinessTrainAccountChangeRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>st.business_train_account_change.updated_at</code>.
     */
    public final TableField<BusinessTrainAccountChangeRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>st.business_train_account_change</code> table reference
     */
    public BusinessTrainAccountChange() {
        this(DSL.name("business_train_account_change"), null);
    }

    /**
     * Create an aliased <code>st.business_train_account_change</code> table reference
     */
    public BusinessTrainAccountChange(String alias) {
        this(DSL.name(alias), BUSINESS_TRAIN_ACCOUNT_CHANGE);
    }

    /**
     * Create an aliased <code>st.business_train_account_change</code> table reference
     */
    public BusinessTrainAccountChange(Name alias) {
        this(alias, BUSINESS_TRAIN_ACCOUNT_CHANGE);
    }

    private BusinessTrainAccountChange(Name alias, Table<BusinessTrainAccountChangeRecord> aliased) {
        this(alias, aliased, null);
    }

    private BusinessTrainAccountChange(Name alias, Table<BusinessTrainAccountChangeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "商户班列账户变动表");
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
        return Arrays.<Index>asList(Indexes.BUSINESS_TRAIN_ACCOUNT_CHANGE_PRIMARY, Indexes.BUSINESS_TRAIN_ACCOUNT_CHANGE_UK_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BusinessTrainAccountChangeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BUSINESS_TRAIN_ACCOUNT_CHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BusinessTrainAccountChangeRecord> getPrimaryKey() {
        return Keys.KEY_BUSINESS_TRAIN_ACCOUNT_CHANGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BusinessTrainAccountChangeRecord>> getKeys() {
        return Arrays.<UniqueKey<BusinessTrainAccountChangeRecord>>asList(Keys.KEY_BUSINESS_TRAIN_ACCOUNT_CHANGE_PRIMARY, Keys.KEY_BUSINESS_TRAIN_ACCOUNT_CHANGE_UK_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessTrainAccountChange as(String alias) {
        return new BusinessTrainAccountChange(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessTrainAccountChange as(Name alias) {
        return new BusinessTrainAccountChange(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BusinessTrainAccountChange rename(String name) {
        return new BusinessTrainAccountChange(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BusinessTrainAccountChange rename(Name name) {
        return new BusinessTrainAccountChange(name, null);
    }
}
