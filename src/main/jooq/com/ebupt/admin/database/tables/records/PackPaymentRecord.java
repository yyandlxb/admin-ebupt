/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.PackPayment;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class PackPaymentRecord extends UpdatableRecordImpl<PackPaymentRecord> {

    private static final long serialVersionUID = -2138113855;

    /**
     * Setter for <code>st.pack_payment.id</code>.
     */
    public PackPaymentRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.pack_payment.pack_id</code>.
     */
    public PackPaymentRecord setPackId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.pack_id</code>.
     */
    public Integer getPackId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>st.pack_payment.status</code>.
     */
    public PackPaymentRecord setStatus(Byte value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>st.pack_payment.pack_code</code>.
     */
    public PackPaymentRecord setPackCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.pack_code</code>.
     */
    public String getPackCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.pack_payment.driver_id</code>.
     */
    public PackPaymentRecord setDriverId(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.driver_id</code>.
     */
    public Integer getDriverId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>st.pack_payment.driver_name</code>.
     */
    public PackPaymentRecord setDriverName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.driver_name</code>.
     */
    public String getDriverName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>st.pack_payment.driver_phone</code>.
     */
    public PackPaymentRecord setDriverPhone(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.driver_phone</code>.
     */
    public String getDriverPhone() {
        return (String) get(6);
    }

    /**
     * Setter for <code>st.pack_payment.driver_id_card</code>.
     */
    public PackPaymentRecord setDriverIdCard(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.driver_id_card</code>.
     */
    public String getDriverIdCard() {
        return (String) get(7);
    }

    /**
     * Setter for <code>st.pack_payment.plate_number</code>.
     */
    public PackPaymentRecord setPlateNumber(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.plate_number</code>.
     */
    public String getPlateNumber() {
        return (String) get(8);
    }

    /**
     * Setter for <code>st.pack_payment.bank_account_name</code>.
     */
    public PackPaymentRecord setBankAccountName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.bank_account_name</code>.
     */
    public String getBankAccountName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>st.pack_payment.bank_account_number</code>.
     */
    public PackPaymentRecord setBankAccountNumber(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.bank_account_number</code>.
     */
    public String getBankAccountNumber() {
        return (String) get(10);
    }

    /**
     * Setter for <code>st.pack_payment.opening_bank</code>.
     */
    public PackPaymentRecord setOpeningBank(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.opening_bank</code>.
     */
    public String getOpeningBank() {
        return (String) get(11);
    }

    /**
     * Setter for <code>st.pack_payment.total_price</code>. 总运费，单位为分
     */
    public PackPaymentRecord setTotalPrice(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.total_price</code>. 总运费，单位为分
     */
    public Integer getTotalPrice() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>st.pack_payment.deposit</code>. 定金（现付部分），单位为分
     */
    public PackPaymentRecord setDeposit(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.deposit</code>. 定金（现付部分），单位为分
     */
    public Integer getDeposit() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>st.pack_payment.balance_due</code>. 尾款（到付部分），单位为分
     */
    public PackPaymentRecord setBalanceDue(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.balance_due</code>. 尾款（到付部分），单位为分
     */
    public Integer getBalanceDue() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>st.pack_payment.pay_price</code>. 实际支付金额，单位为分
     */
    public PackPaymentRecord setPayPrice(Integer value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.pay_price</code>. 实际支付金额，单位为分
     */
    public Integer getPayPrice() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>st.pack_payment.sender_name</code>.
     */
    public PackPaymentRecord setSenderName(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.sender_name</code>.
     */
    public String getSenderName() {
        return (String) get(16);
    }

    /**
     * Setter for <code>st.pack_payment.sender_phone</code>.
     */
    public PackPaymentRecord setSenderPhone(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.sender_phone</code>.
     */
    public String getSenderPhone() {
        return (String) get(17);
    }

    /**
     * Setter for <code>st.pack_payment.sent_at</code>.
     */
    public PackPaymentRecord setSentAt(Timestamp value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.sent_at</code>.
     */
    public Timestamp getSentAt() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>st.pack_payment.receiver_name</code>.
     */
    public PackPaymentRecord setReceiverName(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.receiver_name</code>.
     */
    public String getReceiverName() {
        return (String) get(19);
    }

    /**
     * Setter for <code>st.pack_payment.receiver_phone</code>.
     */
    public PackPaymentRecord setReceiverPhone(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.receiver_phone</code>.
     */
    public String getReceiverPhone() {
        return (String) get(20);
    }

    /**
     * Setter for <code>st.pack_payment.received_at</code>.
     */
    public PackPaymentRecord setReceivedAt(Timestamp value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.received_at</code>.
     */
    public Timestamp getReceivedAt() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>st.pack_payment.paid_at</code>.
     */
    public PackPaymentRecord setPaidAt(Timestamp value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.paid_at</code>.
     */
    public Timestamp getPaidAt() {
        return (Timestamp) get(22);
    }

    /**
     * Setter for <code>st.pack_payment.sync_at</code>. 成功同步干线时间
     */
    public PackPaymentRecord setSyncAt(Timestamp value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.sync_at</code>. 成功同步干线时间
     */
    public Timestamp getSyncAt() {
        return (Timestamp) get(23);
    }

    /**
     * Setter for <code>st.pack_payment.created_at</code>.
     */
    public PackPaymentRecord setCreatedAt(Timestamp value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(24);
    }

    /**
     * Setter for <code>st.pack_payment.updated_at</code>.
     */
    public PackPaymentRecord setUpdatedAt(Timestamp value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(25);
    }

    /**
     * Setter for <code>st.pack_payment.bank_name</code>. 银行名称
     */
    public PackPaymentRecord setBankName(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.bank_name</code>. 银行名称
     */
    public String getBankName() {
        return (String) get(26);
    }

    /**
     * Setter for <code>st.pack_payment.bank_code</code>. 银行代码
     */
    public PackPaymentRecord setBankCode(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.bank_code</code>. 银行代码
     */
    public String getBankCode() {
        return (String) get(27);
    }

    /**
     * Setter for <code>st.pack_payment.bank_province</code>. 省份
     */
    public PackPaymentRecord setBankProvince(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.bank_province</code>. 省份
     */
    public String getBankProvince() {
        return (String) get(28);
    }

    /**
     * Setter for <code>st.pack_payment.bank_province_code</code>. 省份代码
     */
    public PackPaymentRecord setBankProvinceCode(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.bank_province_code</code>. 省份代码
     */
    public String getBankProvinceCode() {
        return (String) get(29);
    }

    /**
     * Setter for <code>st.pack_payment.bank_branch_code</code>. 开户行代码
     */
    public PackPaymentRecord setBankBranchCode(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.bank_branch_code</code>. 开户行代码
     */
    public String getBankBranchCode() {
        return (String) get(30);
    }

    /**
     * Setter for <code>st.pack_payment.old</code>. 1-老数据，0-新数据
     */
    public PackPaymentRecord setOld(Boolean value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_payment.old</code>. 1-老数据，0-新数据
     */
    public Boolean getOld() {
        return (Boolean) get(31);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PackPaymentRecord
     */
    public PackPaymentRecord() {
        super(PackPayment.PACK_PAYMENT);
    }

    /**
     * Create a detached, initialised PackPaymentRecord
     */
    public PackPaymentRecord(Integer id, Integer packId, Byte status, String packCode, Integer driverId, String driverName, String driverPhone, String driverIdCard, String plateNumber, String bankAccountName, String bankAccountNumber, String openingBank, Integer totalPrice, Integer deposit, Integer balanceDue, Integer payPrice, String senderName, String senderPhone, Timestamp sentAt, String receiverName, String receiverPhone, Timestamp receivedAt, Timestamp paidAt, Timestamp syncAt, Timestamp createdAt, Timestamp updatedAt, String bankName, String bankCode, String bankProvince, String bankProvinceCode, String bankBranchCode, Boolean old) {
        super(PackPayment.PACK_PAYMENT);

        set(0, id);
        set(1, packId);
        set(2, status);
        set(3, packCode);
        set(4, driverId);
        set(5, driverName);
        set(6, driverPhone);
        set(7, driverIdCard);
        set(8, plateNumber);
        set(9, bankAccountName);
        set(10, bankAccountNumber);
        set(11, openingBank);
        set(12, totalPrice);
        set(13, deposit);
        set(14, balanceDue);
        set(15, payPrice);
        set(16, senderName);
        set(17, senderPhone);
        set(18, sentAt);
        set(19, receiverName);
        set(20, receiverPhone);
        set(21, receivedAt);
        set(22, paidAt);
        set(23, syncAt);
        set(24, createdAt);
        set(25, updatedAt);
        set(26, bankName);
        set(27, bankCode);
        set(28, bankProvince);
        set(29, bankProvinceCode);
        set(30, bankBranchCode);
        set(31, old);
    }
}
