/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.PackOrder;

import java.math.BigDecimal;
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
public class PackOrderRecord extends UpdatableRecordImpl<PackOrderRecord> {

    private static final long serialVersionUID = 450500560;

    /**
     * Setter for <code>st.pack_order.id</code>.
     */
    public PackOrderRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.pack_order.pack_code</code>.
     */
    public PackOrderRecord setPackCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.pack_code</code>.
     */
    public String getPackCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.pack_order.create_time</code>.
     */
    public PackOrderRecord setCreateTime(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>st.pack_order.depart_time</code>.
     */
    public PackOrderRecord setDepartTime(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.depart_time</code>.
     */
    public Timestamp getDepartTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>st.pack_order.arrive_time</code>.
     */
    public PackOrderRecord setArriveTime(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.arrive_time</code>.
     */
    public Timestamp getArriveTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>st.pack_order.driver_name</code>.
     */
    public PackOrderRecord setDriverName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.driver_name</code>.
     */
    public String getDriverName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>st.pack_order.driver_phone</code>.
     */
    public PackOrderRecord setDriverPhone(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.driver_phone</code>.
     */
    public String getDriverPhone() {
        return (String) get(6);
    }

    /**
     * Setter for <code>st.pack_order.plate_number</code>.
     */
    public PackOrderRecord setPlateNumber(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.plate_number</code>.
     */
    public String getPlateNumber() {
        return (String) get(7);
    }

    /**
     * Setter for <code>st.pack_order.order_number</code>.
     */
    public PackOrderRecord setOrderNumber(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.order_number</code>.
     */
    public Integer getOrderNumber() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>st.pack_order.status</code>. 1 待发车 2 待送达 3 已送达
     */
    public PackOrderRecord setStatus(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.status</code>. 1 待发车 2 待送达 3 已送达
     */
    public String getStatus() {
        return (String) get(9);
    }

    /**
     * Setter for <code>st.pack_order.goods_num</code>. 商品数
     */
    public PackOrderRecord setGoodsNum(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.goods_num</code>. 商品数
     */
    public Integer getGoodsNum() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>st.pack_order.total_price</code>. 运费
     */
    public PackOrderRecord setTotalPrice(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.total_price</code>. 运费
     */
    public BigDecimal getTotalPrice() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>st.pack_order.pack_driver_fee</code>. 司机运费
     */
    public PackOrderRecord setPackDriverFee(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.pack_driver_fee</code>. 司机运费
     */
    public BigDecimal getPackDriverFee() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>st.pack_order.driver_id</code>. st_hm_driver表id
     */
    public PackOrderRecord setDriverId(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.driver_id</code>. st_hm_driver表id
     */
    public Integer getDriverId() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>st.pack_order.st_route_id</code>. 零担线路id
     */
    public PackOrderRecord setStRouteId(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.st_route_id</code>. 零担线路id
     */
    public Integer getStRouteId() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>st.pack_order.hm_route_id</code>. 干线线路id
     */
    public PackOrderRecord setHmRouteId(Integer value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.hm_route_id</code>. 干线线路id
     */
    public Integer getHmRouteId() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>st.pack_order.receiver_phone</code>. 收货人电话
     */
    public PackOrderRecord setReceiverPhone(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.receiver_phone</code>. 收货人电话
     */
    public String getReceiverPhone() {
        return (String) get(16);
    }

    /**
     * Setter for <code>st.pack_order.hm_line_name</code>. 干线线路名称
     */
    public PackOrderRecord setHmLineName(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.hm_line_name</code>. 干线线路名称
     */
    public String getHmLineName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>st.pack_order.hm_order_id</code>. 干线订单表id
     */
    public PackOrderRecord setHmOrderId(Integer value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.hm_order_id</code>. 干线订单表id
     */
    public Integer getHmOrderId() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>st.pack_order.give_time</code>. 打款时间
     */
    public PackOrderRecord setGiveTime(Timestamp value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.give_time</code>. 打款时间
     */
    public Timestamp getGiveTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>st.pack_order.updated_at</code>.
     */
    public PackOrderRecord setUpdatedAt(Timestamp value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>st.pack_order.paid_at</code>.
     */
    public PackOrderRecord setPaidAt(Timestamp value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.paid_at</code>.
     */
    public Timestamp getPaidAt() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>st.pack_order.master_id</code>.
     */
    public PackOrderRecord setMasterId(Integer value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.master_id</code>.
     */
    public Integer getMasterId() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>st.pack_order.merchant_id</code>.
     */
    public PackOrderRecord setMerchantId(Integer value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>st.pack_order.merchant_id</code>.
     */
    public Integer getMerchantId() {
        return (Integer) get(23);
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
     * Create a detached PackOrderRecord
     */
    public PackOrderRecord() {
        super(PackOrder.PACK_ORDER);
    }

    /**
     * Create a detached, initialised PackOrderRecord
     */
    public PackOrderRecord(Integer id, String packCode, Timestamp createTime, Timestamp departTime, Timestamp arriveTime, String driverName, String driverPhone, String plateNumber, Integer orderNumber, String status, Integer goodsNum, BigDecimal totalPrice, BigDecimal packDriverFee, Integer driverId, Integer stRouteId, Integer hmRouteId, String receiverPhone, String hmLineName, Integer hmOrderId, Timestamp giveTime, Timestamp updatedAt, Timestamp paidAt, Integer masterId, Integer merchantId) {
        super(PackOrder.PACK_ORDER);

        set(0, id);
        set(1, packCode);
        set(2, createTime);
        set(3, departTime);
        set(4, arriveTime);
        set(5, driverName);
        set(6, driverPhone);
        set(7, plateNumber);
        set(8, orderNumber);
        set(9, status);
        set(10, goodsNum);
        set(11, totalPrice);
        set(12, packDriverFee);
        set(13, driverId);
        set(14, stRouteId);
        set(15, hmRouteId);
        set(16, receiverPhone);
        set(17, hmLineName);
        set(18, hmOrderId);
        set(19, giveTime);
        set(20, updatedAt);
        set(21, paidAt);
        set(22, masterId);
        set(23, merchantId);
    }
}
