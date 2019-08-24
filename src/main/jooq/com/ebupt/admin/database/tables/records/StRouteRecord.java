/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables.records;


import com.ebupt.admin.database.tables.StRoute;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StRouteRecord extends TableRecordImpl<StRouteRecord> implements Record16<Integer, String, String, String, String, byte[], String, String, byte[], String, String, String, String, Integer, String, Byte> {

    private static final long serialVersionUID = -11150144;

    /**
     * Setter for <code>st.st_route.id</code>.
     */
    public StRouteRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>st.st_route.start_point</code>. 起点
     */
    public StRouteRecord setStartPoint(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.start_point</code>. 起点
     */
    public String getStartPoint() {
        return (String) get(1);
    }

    /**
     * Setter for <code>st.st_route.end_point</code>. 重点
     */
    public StRouteRecord setEndPoint(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.end_point</code>. 重点
     */
    public String getEndPoint() {
        return (String) get(2);
    }

    /**
     * Setter for <code>st.st_route.create_time</code>.
     */
    public StRouteRecord setCreateTime(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.create_time</code>.
     */
    public String getCreateTime() {
        return (String) get(3);
    }

    /**
     * Setter for <code>st.st_route.route_status</code>.
     */
    public StRouteRecord setRouteStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.route_status</code>.
     */
    public String getRouteStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>st.st_route.operation_username</code>.
     */
    public StRouteRecord setOperationUsername(byte... value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.operation_username</code>.
     */
    public byte[] getOperationUsername() {
        return (byte[]) get(5);
    }

    /**
     * Setter for <code>st.st_route.route_code</code>.
     */
    public StRouteRecord setRouteCode(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.route_code</code>.
     */
    public String getRouteCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>st.st_route.lobby</code>. 办票大厅地址
     */
    public StRouteRecord setLobby(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.lobby</code>. 办票大厅地址
     */
    public String getLobby() {
        return (String) get(7);
    }

    /**
     * Setter for <code>st.st_route.user_phone</code>.
     */
    public StRouteRecord setUserPhone(byte... value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.user_phone</code>.
     */
    public byte[] getUserPhone() {
        return (byte[]) get(8);
    }

    /**
     * Setter for <code>st.st_route.give_phone</code>. 办票大厅电话
     */
    public StRouteRecord setGivePhone(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.give_phone</code>. 办票大厅电话
     */
    public String getGivePhone() {
        return (String) get(9);
    }

    /**
     * Setter for <code>st.st_route.is_storage</code>.
     */
    public StRouteRecord setIsStorage(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.is_storage</code>.
     */
    public String getIsStorage() {
        return (String) get(10);
    }

    /**
     * Setter for <code>st.st_route.is_securitysetting</code>.
     */
    public StRouteRecord setIsSecuritysetting(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.is_securitysetting</code>.
     */
    public String getIsSecuritysetting() {
        return (String) get(11);
    }

    /**
     * Setter for <code>st.st_route.is_lobby_exist</code>.
     */
    public StRouteRecord setIsLobbyExist(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.is_lobby_exist</code>.
     */
    public String getIsLobbyExist() {
        return (String) get(12);
    }

    /**
     * Setter for <code>st.st_route.hm_id</code>. 对应干线线路
     */
    public StRouteRecord setHmId(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.hm_id</code>. 对应干线线路
     */
    public Integer getHmId() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>st.st_route.hm_route_name</code>. 对应干线线路名称
     */
    public StRouteRecord setHmRouteName(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.hm_route_name</code>. 对应干线线路名称
     */
    public String getHmRouteName() {
        return (String) get(14);
    }

    /**
     * Setter for <code>st.st_route.is_long_line</code>. 线路模式
     */
    public StRouteRecord setIsLongLine(Byte value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>st.st_route.is_long_line</code>. 线路模式
     */
    public Byte getIsLongLine() {
        return (Byte) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, String, String, String, String, byte[], String, String, byte[], String, String, String, String, Integer, String, Byte> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, String, String, String, String, byte[], String, String, byte[], String, String, String, String, Integer, String, Byte> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StRoute.ST_ROUTE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return StRoute.ST_ROUTE.START_POINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return StRoute.ST_ROUTE.END_POINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return StRoute.ST_ROUTE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return StRoute.ST_ROUTE.ROUTE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field6() {
        return StRoute.ST_ROUTE.OPERATION_USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return StRoute.ST_ROUTE.ROUTE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return StRoute.ST_ROUTE.LOBBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field9() {
        return StRoute.ST_ROUTE.USER_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return StRoute.ST_ROUTE.GIVE_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return StRoute.ST_ROUTE.IS_STORAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return StRoute.ST_ROUTE.IS_SECURITYSETTING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return StRoute.ST_ROUTE.IS_LOBBY_EXIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return StRoute.ST_ROUTE.HM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return StRoute.ST_ROUTE.HM_ROUTE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field16() {
        return StRoute.ST_ROUTE.IS_LONG_LINE;
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
        return getStartPoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEndPoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRouteStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component6() {
        return getOperationUsername();
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
        return getLobby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component9() {
        return getUserPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getGivePhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getIsStorage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getIsSecuritysetting();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getIsLobbyExist();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getHmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getHmRouteName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component16() {
        return getIsLongLine();
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
        return getStartPoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEndPoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRouteStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value6() {
        return getOperationUsername();
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
        return getLobby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value9() {
        return getUserPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getGivePhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getIsStorage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getIsSecuritysetting();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getIsLobbyExist();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getHmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getHmRouteName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value16() {
        return getIsLongLine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value2(String value) {
        setStartPoint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value3(String value) {
        setEndPoint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value4(String value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value5(String value) {
        setRouteStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value6(byte... value) {
        setOperationUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value7(String value) {
        setRouteCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value8(String value) {
        setLobby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value9(byte... value) {
        setUserPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value10(String value) {
        setGivePhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value11(String value) {
        setIsStorage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value12(String value) {
        setIsSecuritysetting(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value13(String value) {
        setIsLobbyExist(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value14(Integer value) {
        setHmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value15(String value) {
        setHmRouteName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord value16(Byte value) {
        setIsLongLine(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StRouteRecord values(Integer value1, String value2, String value3, String value4, String value5, byte[] value6, String value7, String value8, byte[] value9, String value10, String value11, String value12, String value13, Integer value14, String value15, Byte value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StRouteRecord
     */
    public StRouteRecord() {
        super(StRoute.ST_ROUTE);
    }

    /**
     * Create a detached, initialised StRouteRecord
     */
    public StRouteRecord(Integer id, String startPoint, String endPoint, String createTime, String routeStatus, byte[] operationUsername, String routeCode, String lobby, byte[] userPhone, String givePhone, String isStorage, String isSecuritysetting, String isLobbyExist, Integer hmId, String hmRouteName, Byte isLongLine) {
        super(StRoute.ST_ROUTE);

        set(0, id);
        set(1, startPoint);
        set(2, endPoint);
        set(3, createTime);
        set(4, routeStatus);
        set(5, operationUsername);
        set(6, routeCode);
        set(7, lobby);
        set(8, userPhone);
        set(9, givePhone);
        set(10, isStorage);
        set(11, isSecuritysetting);
        set(12, isLobbyExist);
        set(13, hmId);
        set(14, hmRouteName);
        set(15, isLongLine);
    }
}