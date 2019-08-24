/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.UserIdCard;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class UserIdCardRecord extends UpdatableRecordImpl<UserIdCardRecord> implements Record7<Integer, String, String, String, Timestamp, String, String> {

    private static final long serialVersionUID = -519335251;

    /**
     * Setter for <code>st.user_id_card.id</code>. 主键
     */
    public UserIdCardRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.user_id_card.id</code>. 主键
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.user_id_card.name</code>. 姓名
     */
    public UserIdCardRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.user_id_card.name</code>. 姓名
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.user_id_card.id_card_num</code>. 身份证号
     */
    public UserIdCardRecord setIdCardNum(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.user_id_card.id_card_num</code>. 身份证号
     */
    public String getIdCardNum() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.user_id_card.phone</code>. 电话
     */
    public UserIdCardRecord setPhone(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.user_id_card.phone</code>. 电话
     */
    public String getPhone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.user_id_card.create_time</code>. 创建时间
     */
    public UserIdCardRecord setCreateTime(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.user_id_card.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>st.user_id_card.role</code>. 1 发货人 2收货人 3提货人
     */
    public UserIdCardRecord setRole(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.user_id_card.role</code>. 1 发货人 2收货人 3提货人
     */
    public String getRole() {
        return (String) get(5);
    }

    /**
     * Setter for <code>st.user_id_card.id_card_address</code>. 收货人身份证地址
     */
    public UserIdCardRecord setIdCardAddress(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.user_id_card.id_card_address</code>. 收货人身份证地址
     */
    public String getIdCardAddress() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, Timestamp, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, Timestamp, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserIdCard.USER_ID_CARD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserIdCard.USER_ID_CARD.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserIdCard.USER_ID_CARD.ID_CARD_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UserIdCard.USER_ID_CARD.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UserIdCard.USER_ID_CARD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UserIdCard.USER_ID_CARD.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UserIdCard.USER_ID_CARD.ID_CARD_ADDRESS;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getIdCardNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPhone();
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
    public String component6() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getIdCardAddress();
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIdCardNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPhone();
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
    public String value6() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getIdCardAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIdCardRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIdCardRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIdCardRecord value3(String value) {
        setIdCardNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIdCardRecord value4(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIdCardRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIdCardRecord value6(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIdCardRecord value7(String value) {
        setIdCardAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIdCardRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserIdCardRecord
     */
    public UserIdCardRecord() {
        super(UserIdCard.USER_ID_CARD);
    }

    /**
     * Create a detached, initialised UserIdCardRecord
     */
    public UserIdCardRecord(Integer id, String name, String idCardNum, String phone, Timestamp createTime, String role, String idCardAddress) {
        super(UserIdCard.USER_ID_CARD);

        set(0, id);
        set(1, name);
        set(2, idCardNum);
        set(3, phone);
        set(4, createTime);
        set(5, role);
        set(6, idCardAddress);
    }
}
