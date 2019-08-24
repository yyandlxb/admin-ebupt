/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.CollectionFeeBank;

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
public class CollectionFeeBankRecord extends UpdatableRecordImpl<CollectionFeeBankRecord> implements Record13<Integer, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 2146347985;

    /**
     * Setter for <code>st.collection_fee_bank.id</code>.
     */
    public CollectionFeeBankRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.collection_fee_bank.user_name</code>. 收款人姓名
     */
    public CollectionFeeBankRecord setUserName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.user_name</code>. 收款人姓名
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.collection_fee_bank.identity_card</code>. 身份证
     */
    public CollectionFeeBankRecord setIdentityCard(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.identity_card</code>. 身份证
     */
    public String getIdentityCard() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.collection_fee_bank.phone</code>.
     */
    public CollectionFeeBankRecord setPhone(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.phone</code>.
     */
    public String getPhone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.collection_fee_bank.collection_fee_bank_name</code>. 户行开名称
     */
    public CollectionFeeBankRecord setCollectionFeeBankName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.collection_fee_bank_name</code>. 户行开名称
     */
    public String getCollectionFeeBankName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>st.collection_fee_bank.collection_fee_bank_num</code>.
     */
    public CollectionFeeBankRecord setCollectionFeeBankNum(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.collection_fee_bank_num</code>.
     */
    public String getCollectionFeeBankNum() {
        return (String) get(5);
    }

    /**
     * Setter for <code>st.collection_fee_bank.collection_fee_bank_code</code>. 开户行代号
     */
    public CollectionFeeBankRecord setCollectionFeeBankCode(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.collection_fee_bank_code</code>. 开户行代号
     */
    public String getCollectionFeeBankCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>st.collection_fee_bank.collection_fee_bank_branch_name</code>. 开户分行名称
     */
    public CollectionFeeBankRecord setCollectionFeeBankBranchName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.collection_fee_bank_branch_name</code>. 开户分行名称
     */
    public String getCollectionFeeBankBranchName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>st.collection_fee_bank.collection_fee_bank_branch_code</code>. 开户分行代码
     */
    public CollectionFeeBankRecord setCollectionFeeBankBranchCode(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.collection_fee_bank_branch_code</code>. 开户分行代码
     */
    public String getCollectionFeeBankBranchCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>st.collection_fee_bank.collection_fee_bank_province</code>. 省份
     */
    public CollectionFeeBankRecord setCollectionFeeBankProvince(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.collection_fee_bank_province</code>. 省份
     */
    public String getCollectionFeeBankProvince() {
        return (String) get(9);
    }

    /**
     * Setter for <code>st.collection_fee_bank.collection_fee_bank_province_name</code>.
     */
    public CollectionFeeBankRecord setCollectionFeeBankProvinceName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.collection_fee_bank_province_name</code>.
     */
    public String getCollectionFeeBankProvinceName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>st.collection_fee_bank.created_at</code>.
     */
    public CollectionFeeBankRecord setCreatedAt(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>st.collection_fee_bank.updated_at</code>.
     */
    public CollectionFeeBankRecord setUpdatedAt(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_bank.updated_at</code>.
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
    public Row13<Integer, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.IDENTITY_CARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.COLLECTION_FEE_BANK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.COLLECTION_FEE_BANK_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.COLLECTION_FEE_BANK_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.COLLECTION_FEE_BANK_BRANCH_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.COLLECTION_FEE_BANK_BRANCH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.COLLECTION_FEE_BANK_PROVINCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.COLLECTION_FEE_BANK_PROVINCE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return CollectionFeeBank.COLLECTION_FEE_BANK.UPDATED_AT;
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
        return getIdentityCard();
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
    public String component5() {
        return getCollectionFeeBankName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCollectionFeeBankNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCollectionFeeBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCollectionFeeBankBranchName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCollectionFeeBankBranchCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCollectionFeeBankProvince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCollectionFeeBankProvinceName();
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
        return getIdentityCard();
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
    public String value5() {
        return getCollectionFeeBankName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCollectionFeeBankNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCollectionFeeBankCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCollectionFeeBankBranchName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCollectionFeeBankBranchCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCollectionFeeBankProvince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCollectionFeeBankProvinceName();
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
    public CollectionFeeBankRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord value2(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord value3(String value) {
        setIdentityCard(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord value4(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord value5(String value) {
        setCollectionFeeBankName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord value6(String value) {
        setCollectionFeeBankNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord value7(String value) {
        setCollectionFeeBankCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord value8(String value) {
        setCollectionFeeBankBranchName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord value9(String value) {
        setCollectionFeeBankBranchCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord value10(String value) {
        setCollectionFeeBankProvince(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord value11(String value) {
        setCollectionFeeBankProvinceName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord value12(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord value13(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeBankRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Timestamp value12, Timestamp value13) {
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
     * Create a detached CollectionFeeBankRecord
     */
    public CollectionFeeBankRecord() {
        super(CollectionFeeBank.COLLECTION_FEE_BANK);
    }

    /**
     * Create a detached, initialised CollectionFeeBankRecord
     */
    public CollectionFeeBankRecord(Integer id, String userName, String identityCard, String phone, String collectionFeeBankName, String collectionFeeBankNum, String collectionFeeBankCode, String collectionFeeBankBranchName, String collectionFeeBankBranchCode, String collectionFeeBankProvince, String collectionFeeBankProvinceName, Timestamp createdAt, Timestamp updatedAt) {
        super(CollectionFeeBank.COLLECTION_FEE_BANK);

        set(0, id);
        set(1, userName);
        set(2, identityCard);
        set(3, phone);
        set(4, collectionFeeBankName);
        set(5, collectionFeeBankNum);
        set(6, collectionFeeBankCode);
        set(7, collectionFeeBankBranchName);
        set(8, collectionFeeBankBranchCode);
        set(9, collectionFeeBankProvince);
        set(10, collectionFeeBankProvinceName);
        set(11, createdAt);
        set(12, updatedAt);
    }
}