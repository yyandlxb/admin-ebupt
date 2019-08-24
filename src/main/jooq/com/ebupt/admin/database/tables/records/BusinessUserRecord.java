/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.BusinessUser;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BusinessUserRecord extends UpdatableRecordImpl<BusinessUserRecord> implements Record13<Integer, String, String, String, Timestamp, Integer, String, String, Byte, Boolean, Boolean, Timestamp, Timestamp> {

    private static final long serialVersionUID = -120790008;

    /**
     * Setter for <code>st.business_user.id</code>.
     */
    public BusinessUserRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.business_user.user_name</code>. 用户名
     */
    public BusinessUserRecord setUserName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.user_name</code>. 用户名
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.business_user.user_phone</code>. 用户手机号
     */
    public BusinessUserRecord setUserPhone(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.user_phone</code>. 用户手机号
     */
    public String getUserPhone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.business_user.password</code>. 密码
     */
    public BusinessUserRecord setPassword(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.password</code>. 密码
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.business_user.create_time</code>. 创建时间
     */
    public BusinessUserRecord setCreateTime(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>st.business_user.business_id</code>. 商户ID
     */
    public BusinessUserRecord setBusinessId(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.business_id</code>. 商户ID
     */
    public Integer getBusinessId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>st.business_user.route_code</code>. 线路code字符串
     */
    public BusinessUserRecord setRouteCode(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.route_code</code>. 线路code字符串
     */
    public String getRouteCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>st.business_user.is_delete</code>. 0,启动，1，删除
     */
    public BusinessUserRecord setIsDelete(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.is_delete</code>. 0,启动，1，删除
     */
    public String getIsDelete() {
        return (String) get(7);
    }

    /**
     * Setter for <code>st.business_user.type</code>. 用户类型：1超级管理员；2自主办票员
     */
    public BusinessUserRecord setType(Byte value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.type</code>. 用户类型：1超级管理员；2自主办票员
     */
    public Byte getType() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>st.business_user.disabled</code>. 封号标识位
     */
    public BusinessUserRecord setDisabled(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.disabled</code>. 封号标识位
     */
    public Boolean getDisabled() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>st.business_user.deleted</code>. 删除标志位
     */
    public BusinessUserRecord setDeleted(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.deleted</code>. 删除标志位
     */
    public Boolean getDeleted() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>st.business_user.created_at</code>.
     */
    public BusinessUserRecord setCreatedAt(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>st.business_user.updated_at</code>.
     */
    public BusinessUserRecord setUpdatedAt(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>st.business_user.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, Timestamp, Integer, String, String, Byte, Boolean, Boolean, Timestamp, Timestamp> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, Timestamp, Integer, String, String, Byte, Boolean, Boolean, Timestamp, Timestamp> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return BusinessUser.BUSINESS_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BusinessUser.BUSINESS_USER.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BusinessUser.BUSINESS_USER.USER_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BusinessUser.BUSINESS_USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return BusinessUser.BUSINESS_USER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return BusinessUser.BUSINESS_USER.BUSINESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return BusinessUser.BUSINESS_USER.ROUTE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return BusinessUser.BUSINESS_USER.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return BusinessUser.BUSINESS_USER.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return BusinessUser.BUSINESS_USER.DISABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return BusinessUser.BUSINESS_USER.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return BusinessUser.BUSINESS_USER.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return BusinessUser.BUSINESS_USER.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUserPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getBusinessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getRouteCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getDisabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUserPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getBusinessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRouteCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getDisabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value2(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value3(String value) {
        setUserPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value4(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value6(Integer value) {
        setBusinessId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value7(String value) {
        setRouteCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value8(String value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value9(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value10(Boolean value) {
        setDisabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value11(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value12(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord value13(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessUserRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, Integer value6, String value7, String value8, Byte value9, Boolean value10, Boolean value11, Timestamp value12, Timestamp value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BusinessUserRecord
     */
    public BusinessUserRecord() {
        super(BusinessUser.BUSINESS_USER);
    }

    /**
     * Create a detached, initialised BusinessUserRecord
     */
    public BusinessUserRecord(Integer id, String userName, String userPhone, String password, Timestamp createTime, Integer businessId, String routeCode, String isDelete, Byte type, Boolean disabled, Boolean deleted, Timestamp createdAt, Timestamp updatedAt) {
        super(BusinessUser.BUSINESS_USER);

        set(0, id);
        set(1, userName);
        set(2, userPhone);
        set(3, password);
        set(4, createTime);
        set(5, businessId);
        set(6, routeCode);
        set(7, isDelete);
        set(8, type);
        set(9, disabled);
        set(10, deleted);
        set(11, createdAt);
        set(12, updatedAt);
    }
}
