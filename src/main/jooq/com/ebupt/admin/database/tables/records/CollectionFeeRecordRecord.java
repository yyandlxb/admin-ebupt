/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.CollectionFeeRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
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
public class CollectionFeeRecordRecord extends UpdatableRecordImpl<CollectionFeeRecordRecord> implements Record21<Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1026131476;

    /**
     * Setter for <code>st.collection_fee_record.id</code>.
     */
    public CollectionFeeRecordRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.collection_fee_record.line_code</code>.
     */
    public CollectionFeeRecordRecord setLineCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.line_code</code>.
     */
    public String getLineCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.collection_fee_record.business_id</code>.
     */
    public CollectionFeeRecordRecord setBusinessId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.business_id</code>.
     */
    public Integer getBusinessId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>st.collection_fee_record.early_moeny</code>. 期初结余金额
     */
    public CollectionFeeRecordRecord setEarlyMoeny(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.early_moeny</code>. 期初结余金额
     */
    public Integer getEarlyMoeny() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>st.collection_fee_record.early_num</code>. 期初结余票数
     */
    public CollectionFeeRecordRecord setEarlyNum(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.early_num</code>. 期初结余票数
     */
    public Integer getEarlyNum() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>st.collection_fee_record.finished_today_money</code>. 当日办结代收款金额
     */
    public CollectionFeeRecordRecord setFinishedTodayMoney(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.finished_today_money</code>. 当日办结代收款金额
     */
    public Integer getFinishedTodayMoney() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>st.collection_fee_record.finished_today_num</code>. 当日办结代收款票数
     */
    public CollectionFeeRecordRecord setFinishedTodayNum(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.finished_today_num</code>. 当日办结代收款票数
     */
    public Integer getFinishedTodayNum() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>st.collection_fee_record.extract_collection_fee</code>. 客户已提代收款金额
     */
    public CollectionFeeRecordRecord setExtractCollectionFee(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.extract_collection_fee</code>. 客户已提代收款金额
     */
    public Integer getExtractCollectionFee() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>st.collection_fee_record.extract_collection_fee_num</code>. 客户已提代收款票数
     */
    public CollectionFeeRecordRecord setExtractCollectionFeeNum(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.extract_collection_fee_num</code>. 客户已提代收款票数
     */
    public Integer getExtractCollectionFeeNum() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>st.collection_fee_record.service_charge_hlvan</code>. 凌华手续费
     */
    public CollectionFeeRecordRecord setServiceChargeHlvan(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.service_charge_hlvan</code>. 凌华手续费
     */
    public Integer getServiceChargeHlvan() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>st.collection_fee_record.service_charge_hlvan_num</code>. 凌华手续费票数
     */
    public CollectionFeeRecordRecord setServiceChargeHlvanNum(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.service_charge_hlvan_num</code>. 凌华手续费票数
     */
    public Integer getServiceChargeHlvanNum() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>st.collection_fee_record.service_charge_business</code>. 托运部手续费金额
     */
    public CollectionFeeRecordRecord setServiceChargeBusiness(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.service_charge_business</code>. 托运部手续费金额
     */
    public Integer getServiceChargeBusiness() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>st.collection_fee_record.service_charge_business_num</code>. 托运部手续费票数
     */
    public CollectionFeeRecordRecord setServiceChargeBusinessNum(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.service_charge_business_num</code>. 托运部手续费票数
     */
    public Integer getServiceChargeBusinessNum() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>st.collection_fee_record.actual_extract_moeny</code>. 实际提取金额
     */
    public CollectionFeeRecordRecord setActualExtractMoeny(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.actual_extract_moeny</code>. 实际提取金额
     */
    public Integer getActualExtractMoeny() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>st.collection_fee_record.actual_extract_num</code>. 实际提取票数
     */
    public CollectionFeeRecordRecord setActualExtractNum(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.actual_extract_num</code>. 实际提取票数
     */
    public Integer getActualExtractNum() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>st.collection_fee_record.final_moeny</code>. 期末结余金额
     */
    public CollectionFeeRecordRecord setFinalMoeny(Integer value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.final_moeny</code>. 期末结余金额
     */
    public Integer getFinalMoeny() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>st.collection_fee_record.final_num</code>. 期末结余票数
     */
    public CollectionFeeRecordRecord setFinalNum(Integer value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.final_num</code>. 期末结余票数
     */
    public Integer getFinalNum() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>st.collection_fee_record.remrak</code>. 备注
     */
    public CollectionFeeRecordRecord setRemrak(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.remrak</code>. 备注
     */
    public String getRemrak() {
        return (String) get(17);
    }

    /**
     * Setter for <code>st.collection_fee_record.payment_at</code>.
     */
    public CollectionFeeRecordRecord setPaymentAt(Timestamp value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.payment_at</code>.
     */
    public Timestamp getPaymentAt() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>st.collection_fee_record.created_at</code>.
     */
    public CollectionFeeRecordRecord setCreatedAt(Timestamp value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>st.collection_fee_record.updated_at</code>.
     */
    public CollectionFeeRecordRecord setUpdatedAt(Timestamp value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>st.collection_fee_record.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(20);
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
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.LINE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.BUSINESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.EARLY_MOENY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.EARLY_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.FINISHED_TODAY_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.FINISHED_TODAY_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.EXTRACT_COLLECTION_FEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.EXTRACT_COLLECTION_FEE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.SERVICE_CHARGE_HLVAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.SERVICE_CHARGE_HLVAN_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.SERVICE_CHARGE_BUSINESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.SERVICE_CHARGE_BUSINESS_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.ACTUAL_EXTRACT_MOENY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.ACTUAL_EXTRACT_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.FINAL_MOENY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.FINAL_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.REMRAK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.PAYMENT_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field20() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field21() {
        return CollectionFeeRecord.COLLECTION_FEE_RECORD.UPDATED_AT;
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
        return getLineCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getBusinessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getEarlyMoeny();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getEarlyNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getFinishedTodayMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getFinishedTodayNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getExtractCollectionFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getExtractCollectionFeeNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getServiceChargeHlvan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getServiceChargeHlvanNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getServiceChargeBusiness();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getServiceChargeBusinessNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getActualExtractMoeny();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getActualExtractNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component16() {
        return getFinalMoeny();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component17() {
        return getFinalNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getRemrak();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component19() {
        return getPaymentAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component20() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component21() {
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
        return getLineCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getBusinessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getEarlyMoeny();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getEarlyNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getFinishedTodayMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getFinishedTodayNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getExtractCollectionFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getExtractCollectionFeeNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getServiceChargeHlvan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getServiceChargeHlvanNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getServiceChargeBusiness();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getServiceChargeBusinessNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getActualExtractMoeny();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getActualExtractNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getFinalMoeny();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getFinalNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getRemrak();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getPaymentAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value20() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value21() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value2(String value) {
        setLineCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value3(Integer value) {
        setBusinessId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value4(Integer value) {
        setEarlyMoeny(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value5(Integer value) {
        setEarlyNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value6(Integer value) {
        setFinishedTodayMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value7(Integer value) {
        setFinishedTodayNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value8(Integer value) {
        setExtractCollectionFee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value9(Integer value) {
        setExtractCollectionFeeNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value10(Integer value) {
        setServiceChargeHlvan(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value11(Integer value) {
        setServiceChargeHlvanNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value12(Integer value) {
        setServiceChargeBusiness(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value13(Integer value) {
        setServiceChargeBusinessNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value14(Integer value) {
        setActualExtractMoeny(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value15(Integer value) {
        setActualExtractNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value16(Integer value) {
        setFinalMoeny(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value17(Integer value) {
        setFinalNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value18(String value) {
        setRemrak(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value19(Timestamp value) {
        setPaymentAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value20(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord value21(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectionFeeRecordRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Integer value14, Integer value15, Integer value16, Integer value17, String value18, Timestamp value19, Timestamp value20, Timestamp value21) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollectionFeeRecordRecord
     */
    public CollectionFeeRecordRecord() {
        super(CollectionFeeRecord.COLLECTION_FEE_RECORD);
    }

    /**
     * Create a detached, initialised CollectionFeeRecordRecord
     */
    public CollectionFeeRecordRecord(Integer id, String lineCode, Integer businessId, Integer earlyMoeny, Integer earlyNum, Integer finishedTodayMoney, Integer finishedTodayNum, Integer extractCollectionFee, Integer extractCollectionFeeNum, Integer serviceChargeHlvan, Integer serviceChargeHlvanNum, Integer serviceChargeBusiness, Integer serviceChargeBusinessNum, Integer actualExtractMoeny, Integer actualExtractNum, Integer finalMoeny, Integer finalNum, String remrak, Timestamp paymentAt, Timestamp createdAt, Timestamp updatedAt) {
        super(CollectionFeeRecord.COLLECTION_FEE_RECORD);

        set(0, id);
        set(1, lineCode);
        set(2, businessId);
        set(3, earlyMoeny);
        set(4, earlyNum);
        set(5, finishedTodayMoney);
        set(6, finishedTodayNum);
        set(7, extractCollectionFee);
        set(8, extractCollectionFeeNum);
        set(9, serviceChargeHlvan);
        set(10, serviceChargeHlvanNum);
        set(11, serviceChargeBusiness);
        set(12, serviceChargeBusinessNum);
        set(13, actualExtractMoeny);
        set(14, actualExtractNum);
        set(15, finalMoeny);
        set(16, finalNum);
        set(17, remrak);
        set(18, paymentAt);
        set(19, createdAt);
        set(20, updatedAt);
    }
}
