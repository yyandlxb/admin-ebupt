/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.OrderGoods;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class OrderGoodsRecord extends UpdatableRecordImpl<OrderGoodsRecord> implements Record17<Integer, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, String, Timestamp, Timestamp, String, String, String> {

    private static final long serialVersionUID = 528216446;

    /**
     * Setter for <code>st.order_goods.id</code>.
     */
    public OrderGoodsRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.order_goods.order_code</code>. 订单code
     */
    public OrderGoodsRecord setOrderCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.order_code</code>. 订单code
     */
    public String getOrderCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.order_goods.goods_name</code>. 货物名称
     */
    public OrderGoodsRecord setGoodsName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.goods_name</code>. 货物名称
     */
    public String getGoodsName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.order_goods.goods_unit</code>. 单位
     */
    public OrderGoodsRecord setGoodsUnit(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.goods_unit</code>. 单位
     */
    public String getGoodsUnit() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.order_goods.goods_number</code>. 数量
     */
    public OrderGoodsRecord setGoodsNumber(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.goods_number</code>. 数量
     */
    public String getGoodsNumber() {
        return (String) get(4);
    }

    /**
     * Setter for <code>st.order_goods.insure_price_amount</code>. 保价金额
     */
    public OrderGoodsRecord setInsurePriceAmount(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.insure_price_amount</code>. 保价金额
     */
    public BigDecimal getInsurePriceAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>st.order_goods.insure_price_fee</code>. 保价费
     */
    public OrderGoodsRecord setInsurePriceFee(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.insure_price_fee</code>. 保价费
     */
    public BigDecimal getInsurePriceFee() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>st.order_goods.insurance_amount</code>. 保险金额
     */
    public OrderGoodsRecord setInsuranceAmount(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.insurance_amount</code>. 保险金额
     */
    public BigDecimal getInsuranceAmount() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>st.order_goods.insurance_fee</code>. 保险费
     */
    public OrderGoodsRecord setInsuranceFee(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.insurance_fee</code>. 保险费
     */
    public BigDecimal getInsuranceFee() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>st.order_goods.forbid_goods</code>. 1 非禁止 2禁止
     */
    public OrderGoodsRecord setForbidGoods(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.forbid_goods</code>. 1 非禁止 2禁止
     */
    public String getForbidGoods() {
        return (String) get(9);
    }

    /**
     * Setter for <code>st.order_goods.valuable_goods</code>. 1 非贵重物品 2 贵重物品
     */
    public OrderGoodsRecord setValuableGoods(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.valuable_goods</code>. 1 非贵重物品 2 贵重物品
     */
    public String getValuableGoods() {
        return (String) get(10);
    }

    /**
     * Setter for <code>st.order_goods.check_goods</code>. 1 不查验 2查验
     */
    public OrderGoodsRecord setCheckGoods(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.check_goods</code>. 1 不查验 2查验
     */
    public String getCheckGoods() {
        return (String) get(11);
    }

    /**
     * Setter for <code>st.order_goods.update_time</code>.
     */
    public OrderGoodsRecord setUpdateTime(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>st.order_goods.create_time</code>. 创建时间
     */
    public OrderGoodsRecord setCreateTime(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>st.order_goods.remark</code>. 备注
     */
    public OrderGoodsRecord setRemark(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(14);
    }

    /**
     * Setter for <code>st.order_goods.effective</code>. 1 有效 2 无效
     */
    public OrderGoodsRecord setEffective(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.effective</code>. 1 有效 2 无效
     */
    public String getEffective() {
        return (String) get(15);
    }

    /**
     * Setter for <code>st.order_goods.transportNum</code>. 运输号
     */
    public OrderGoodsRecord setTransportnum(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>st.order_goods.transportNum</code>. 运输号
     */
    public String getTransportnum() {
        return (String) get(16);
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
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, String, Timestamp, Timestamp, String, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, String, Timestamp, Timestamp, String, String, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return OrderGoods.ORDER_GOODS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return OrderGoods.ORDER_GOODS.ORDER_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OrderGoods.ORDER_GOODS.GOODS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OrderGoods.ORDER_GOODS.GOODS_UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return OrderGoods.ORDER_GOODS.GOODS_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return OrderGoods.ORDER_GOODS.INSURE_PRICE_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return OrderGoods.ORDER_GOODS.INSURE_PRICE_FEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return OrderGoods.ORDER_GOODS.INSURANCE_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return OrderGoods.ORDER_GOODS.INSURANCE_FEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return OrderGoods.ORDER_GOODS.FORBID_GOODS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return OrderGoods.ORDER_GOODS.VALUABLE_GOODS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return OrderGoods.ORDER_GOODS.CHECK_GOODS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return OrderGoods.ORDER_GOODS.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return OrderGoods.ORDER_GOODS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return OrderGoods.ORDER_GOODS.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return OrderGoods.ORDER_GOODS.EFFECTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return OrderGoods.ORDER_GOODS.TRANSPORTNUM;
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
        return getOrderCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGoodsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getGoodsUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGoodsNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getInsurePriceAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getInsurePriceFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getInsuranceAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getInsuranceFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getForbidGoods();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getValuableGoods();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCheckGoods();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getEffective();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getTransportnum();
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
        return getOrderCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGoodsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGoodsUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGoodsNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getInsurePriceAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getInsurePriceFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getInsuranceAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getInsuranceFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getForbidGoods();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getValuableGoods();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCheckGoods();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getEffective();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getTransportnum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value2(String value) {
        setOrderCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value3(String value) {
        setGoodsName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value4(String value) {
        setGoodsUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value5(String value) {
        setGoodsNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value6(BigDecimal value) {
        setInsurePriceAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value7(BigDecimal value) {
        setInsurePriceFee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value8(BigDecimal value) {
        setInsuranceAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value9(BigDecimal value) {
        setInsuranceFee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value10(String value) {
        setForbidGoods(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value11(String value) {
        setValuableGoods(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value12(String value) {
        setCheckGoods(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value13(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value14(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value15(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value16(String value) {
        setEffective(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord value17(String value) {
        setTransportnum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRecord values(Integer value1, String value2, String value3, String value4, String value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, BigDecimal value9, String value10, String value11, String value12, Timestamp value13, Timestamp value14, String value15, String value16, String value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderGoodsRecord
     */
    public OrderGoodsRecord() {
        super(OrderGoods.ORDER_GOODS);
    }

    /**
     * Create a detached, initialised OrderGoodsRecord
     */
    public OrderGoodsRecord(Integer id, String orderCode, String goodsName, String goodsUnit, String goodsNumber, BigDecimal insurePriceAmount, BigDecimal insurePriceFee, BigDecimal insuranceAmount, BigDecimal insuranceFee, String forbidGoods, String valuableGoods, String checkGoods, Timestamp updateTime, Timestamp createTime, String remark, String effective, String transportnum) {
        super(OrderGoods.ORDER_GOODS);

        set(0, id);
        set(1, orderCode);
        set(2, goodsName);
        set(3, goodsUnit);
        set(4, goodsNumber);
        set(5, insurePriceAmount);
        set(6, insurePriceFee);
        set(7, insuranceAmount);
        set(8, insuranceFee);
        set(9, forbidGoods);
        set(10, valuableGoods);
        set(11, checkGoods);
        set(12, updateTime);
        set(13, createTime);
        set(14, remark);
        set(15, effective);
        set(16, transportnum);
    }
}
