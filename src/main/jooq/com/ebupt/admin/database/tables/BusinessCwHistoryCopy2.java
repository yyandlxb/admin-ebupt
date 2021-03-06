/*
 * This file is generated by jOOQ.
*/
package com.ebupt.admin.database.tables;


import com.ebupt.admin.database.Indexes;
import com.ebupt.admin.database.Keys;
import com.ebupt.admin.database.St;
import com.ebupt.admin.database.tables.records.BusinessCwHistoryCopy2Record;

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
public class BusinessCwHistoryCopy2 extends TableImpl<BusinessCwHistoryCopy2Record> {

    private static final long serialVersionUID = 719534807;

    /**
     * The reference instance of <code>st.business_cw_history_copy2</code>
     */
    public static final BusinessCwHistoryCopy2 BUSINESS_CW_HISTORY_COPY2 = new BusinessCwHistoryCopy2();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BusinessCwHistoryCopy2Record> getRecordType() {
        return BusinessCwHistoryCopy2Record.class;
    }

    /**
     * The column <code>st.business_cw_history_copy2.id</code>.
     */
    public final TableField<BusinessCwHistoryCopy2Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>st.business_cw_history_copy2.ticketor</code>.
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> TICKETOR = createField("ticketor", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>st.business_cw_history_copy2.line_code</code>.
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> LINE_CODE = createField("line_code", org.jooq.impl.SQLDataType.VARCHAR(11).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>st.business_cw_history_copy2.business_id</code>.
     */
    public final TableField<BusinessCwHistoryCopy2Record, Integer> BUSINESS_ID = createField("business_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>st.business_cw_history_copy2.statistics_time</code>. 对账日期
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> STATISTICS_TIME = createField("statistics_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "对账日期");

    /**
     * The column <code>st.business_cw_history_copy2.rb_qc_ps_order_id</code>. 订单ID 组
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_QC_PS_ORDER_ID = createField("rb_qc_ps_order_id", org.jooq.impl.SQLDataType.CLOB, this, "订单ID 组");

    /**
     * The column <code>st.business_cw_history_copy2.rb_qc_ps</code>. 日报表——期初结余——票数
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_QC_PS = createField("rb_qc_ps", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——期初结余——票数");

    /**
     * The column <code>st.business_cw_history_copy2.rb_qc_je</code>. 日报表——期初结余——金额
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_QC_JE = createField("rb_qc_je", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——期初结余——金额");

    /**
     * The column <code>st.business_cw_history_copy2.rb_qc_yf</code>. 日报表——期初结余——运费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_QC_YF = createField("rb_qc_yf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——期初结余——运费");

    /**
     * The column <code>st.business_cw_history_copy2.rb_qc_dshk</code>. 日报表——期初结余——代收货款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_QC_DSHK = createField("rb_qc_dshk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——期初结余——代收货款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_qc_dfk</code>. 日报表——期初结余——垫付款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_QC_DFK = createField("rb_qc_dfk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——期初结余——垫付款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_bq_ps</code>. 日报表——本期到货——票数
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_BQ_PS = createField("rb_bq_ps", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——本期到货——票数");

    /**
     * The column <code>st.business_cw_history_copy2.rb_bq_je</code>. 日报表——本期到货——金额
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_BQ_JE = createField("rb_bq_je", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——本期到货——金额");

    /**
     * The column <code>st.business_cw_history_copy2.rb_bq_yf</code>. 日报表——本期到货——运费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_BQ_YF = createField("rb_bq_yf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——本期到货——运费");

    /**
     * The column <code>st.business_cw_history_copy2.rb_bq_dshk</code>. 日报表——本期到货——代收货款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_BQ_DSHK = createField("rb_bq_dshk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——本期到货——代收货款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_bq_dfk</code>. 日报表——本期到货——垫付款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_BQ_DFK = createField("rb_bq_dfk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——本期到货——垫付款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_xj_ps</code>. 日报表——小计——票数
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_XJ_PS = createField("rb_xj_ps", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——小计——票数");

    /**
     * The column <code>st.business_cw_history_copy2.rb_xj_je</code>. 日报表——小计——金额
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_XJ_JE = createField("rb_xj_je", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——小计——金额");

    /**
     * The column <code>st.business_cw_history_copy2.rb_xj_yf</code>. 日报表——小计——运费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_XJ_YF = createField("rb_xj_yf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——小计——运费");

    /**
     * The column <code>st.business_cw_history_copy2.rb_xj_dshk</code>. 日报表——小计——代收货款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_XJ_DSHK = createField("rb_xj_dshk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——小计——代收货款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_xj_dfk</code>. 日报表——小计——垫付款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_XJ_DFK = createField("rb_xj_dfk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——小计——垫付款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_tf_ps</code>. 日报表——提付——票数
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_TF_PS = createField("rb_tf_ps", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——提付——票数");

    /**
     * The column <code>st.business_cw_history_copy2.rb_tf_je</code>. 日报表——提付——金额
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_TF_JE = createField("rb_tf_je", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——提付——金额");

    /**
     * The column <code>st.business_cw_history_copy2.rb_tf_yf</code>. 日报表——提付——运费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_TF_YF = createField("rb_tf_yf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——提付——运费");

    /**
     * The column <code>st.business_cw_history_copy2.rb_tf_dshk</code>. 日报表——提付——代收货款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_TF_DSHK = createField("rb_tf_dshk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——提付——代收货款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_tf_dfk</code>. 日报表——提付——垫付款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_TF_DFK = createField("rb_tf_dfk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——提付——垫付款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_xf_ps</code>. 日报表——现付——票数
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_XF_PS = createField("rb_xf_ps", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——现付——票数");

    /**
     * The column <code>st.business_cw_history_copy2.rb_xf_je</code>. 日报表——现付——金额
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_XF_JE = createField("rb_xf_je", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——现付——金额");

    /**
     * The column <code>st.business_cw_history_copy2.rb_xf_yf</code>. 日报表——现付——运费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_XF_YF = createField("rb_xf_yf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——现付——运费");

    /**
     * The column <code>st.business_cw_history_copy2.rb_xf_dshk</code>. 日报表——现付——代收货款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_XF_DSHK = createField("rb_xf_dshk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——现付——代收货款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_xf_dfk</code>. 日报表——现付——垫付款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_XF_DFK = createField("rb_xf_dfk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——现付——垫付款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_fhd_ps</code>. 日报表——返单,回单——票数
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_FHD_PS = createField("rb_fhd_ps", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——返单,回单——票数");

    /**
     * The column <code>st.business_cw_history_copy2.rb_fhd_je</code>. 日报表——返单,回单——金额
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_FHD_JE = createField("rb_fhd_je", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——返单,回单——金额");

    /**
     * The column <code>st.business_cw_history_copy2.rb_fhd_yf</code>. 日报表——返单,回单——运费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_FHD_YF = createField("rb_fhd_yf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——返单,回单——运费");

    /**
     * The column <code>st.business_cw_history_copy2.rb_fhd_dshk</code>. 日报表——返单,回单——代收货款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_FHD_DSHK = createField("rb_fhd_dshk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——返单,回单——代收货款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_fhd_dfk</code>. 日报表——返单,回单——垫付款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_FHD_DFK = createField("rb_fhd_dfk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——返单,回单——垫付款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_yc_ps</code>. 日报表——异常处理——票数
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_YC_PS = createField("rb_yc_ps", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——异常处理——票数");

    /**
     * The column <code>st.business_cw_history_copy2.rb_yc_je</code>. 日报表——异常处理——金额
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_YC_JE = createField("rb_yc_je", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——异常处理——金额");

    /**
     * The column <code>st.business_cw_history_copy2.rb_yc_yf</code>. 日报表——异常处理——运费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_YC_YF = createField("rb_yc_yf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——异常处理——运费");

    /**
     * The column <code>st.business_cw_history_copy2.rb_yc_dshk</code>. 日报表——异常处理——代收货款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_YC_DSHK = createField("rb_yc_dshk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——异常处理——代收货款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_yc_dfk</code>. 日报表——异常处理——垫付款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_YC_DFK = createField("rb_yc_dfk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——异常处理——垫付款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_qm_ps_order_id</code>.
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_QM_PS_ORDER_ID = createField("rb_qm_ps_order_id", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>st.business_cw_history_copy2.rb_qm_ps</code>. 日报表——期末结余——票数
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_QM_PS = createField("rb_qm_ps", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——期末结余——票数");

    /**
     * The column <code>st.business_cw_history_copy2.rb_qm_je</code>. 日报表——期末结余——金额
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_QM_JE = createField("rb_qm_je", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——期末结余——金额");

    /**
     * The column <code>st.business_cw_history_copy2.rb_qm_yf</code>. 日报表——期末结余——运费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_QM_YF = createField("rb_qm_yf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——期末结余——运费");

    /**
     * The column <code>st.business_cw_history_copy2.rb_qm_dshk</code>. 日报表——期末结余——代收货款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_QM_DSHK = createField("rb_qm_dshk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——期末结余——代收货款");

    /**
     * The column <code>st.business_cw_history_copy2.rb_qm_dfk</code>. 日报表——期末结余——垫付款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_QM_DFK = createField("rb_qm_dfk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "日报表——期末结余——垫付款");

    /**
     * The column <code>st.business_cw_history_copy2.dsk_ssdsk</code>. 代收款对账——实收代收款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> DSK_SSDSK = createField("dsk_ssdsk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "代收款对账——实收代收款");

    /**
     * The column <code>st.business_cw_history_copy2.dsk_dsksxf</code>. 代收款对账——代收款手续费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> DSK_DSKSXF = createField("dsk_dsksxf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "代收款对账——代收款手续费");

    /**
     * The column <code>st.business_cw_history_copy2.dsk_fhdsk</code>. 代收款对账——返还代收款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> DSK_FHDSK = createField("dsk_fhdsk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "代收款对账——返还代收款");

    /**
     * The column <code>st.business_cw_history_copy2.dsk_ssdfk</code>. 代收款对账——实收垫付款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> DSK_SSDFK = createField("dsk_ssdfk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "代收款对账——实收垫付款");

    /**
     * The column <code>st.business_cw_history_copy2.dsk_dfksxf</code>. 代收款对账——垫付款手续费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> DSK_DFKSXF = createField("dsk_dfksxf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "代收款对账——垫付款手续费");

    /**
     * The column <code>st.business_cw_history_copy2.dsk_fhdfk</code>. 代收款对账——返还垫付款
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> DSK_FHDFK = createField("dsk_fhdfk", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "代收款对账——返还垫付款");

    /**
     * The column <code>st.business_cw_history_copy2.dsk_fhhj</code>. 代收款对账——返还合计
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> DSK_FHHJ = createField("dsk_fhhj", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "代收款对账——返还合计");

    /**
     * The column <code>st.business_cw_history_copy2.yf_ssyf</code>. 运费对账——实收运费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> YF_SSYF = createField("yf_ssyf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "运费对账——实收运费");

    /**
     * The column <code>st.business_cw_history_copy2.yf_drdhyfze</code>. 运费对账——当日到货运费总额
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> YF_DRDHYFZE = createField("yf_drdhyfze", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "运费对账——当日到货运费总额");

    /**
     * The column <code>st.business_cw_history_copy2.yf_sxfxf</code>. 运费对账——运费手续费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> YF_SXFXF = createField("yf_sxfxf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "运费对账——运费手续费");

    /**
     * The column <code>st.business_cw_history_copy2.yf_sjyfze</code>. 运费对账——司机运费总额
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> YF_SJYFZE = createField("yf_sjyfze", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "运费对账——司机运费总额");

    /**
     * The column <code>st.business_cw_history_copy2.yf_sjyf1</code>. 运费对账——司机运费1
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> YF_SJYF1 = createField("yf_sjyf1", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "运费对账——司机运费1");

    /**
     * The column <code>st.business_cw_history_copy2.yf_sjyf2</code>. 运费对账——司机运费2
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> YF_SJYF2 = createField("yf_sjyf2", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "运费对账——司机运费2");

    /**
     * The column <code>st.business_cw_history_copy2.yf_hfsyyf</code>. 运费对账——返还剩余运费
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> YF_HFSYYF = createField("yf_hfsyyf", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "运费对账——返还剩余运费");

    /**
     * The column <code>st.business_cw_history_copy2.rb_msg_status</code>. 1:未发送 2:已发送 3：等待确认 4：已完成
     */
    public final TableField<BusinessCwHistoryCopy2Record, Integer> RB_MSG_STATUS = createField("rb_msg_status", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "1:未发送 2:已发送 3：等待确认 4：已完成");

    /**
     * The column <code>st.business_cw_history_copy2.dsk_msg_status</code>. 1:未发送 2:已发送 3：等待确认 4：已完成
     */
    public final TableField<BusinessCwHistoryCopy2Record, Integer> DSK_MSG_STATUS = createField("dsk_msg_status", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "1:未发送 2:已发送 3：等待确认 4：已完成");

    /**
     * The column <code>st.business_cw_history_copy2.yf_msg_status</code>. 1:未发送 2:已发送 3：等待确认 4：已完成
     */
    public final TableField<BusinessCwHistoryCopy2Record, Integer> YF_MSG_STATUS = createField("yf_msg_status", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "1:未发送 2:已发送 3：等待确认 4：已完成");

    /**
     * The column <code>st.business_cw_history_copy2.rb_send_time</code>. 日报表——已发送时间
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_SEND_TIME = createField("rb_send_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "日报表——已发送时间");

    /**
     * The column <code>st.business_cw_history_copy2.rb_business_time</code>. 日报表——商家认确时间
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_BUSINESS_TIME = createField("rb_business_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "日报表——商家认确时间");

    /**
     * The column <code>st.business_cw_history_copy2.rb_confirm_time</code>. 日报表——务财确认时间
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> RB_CONFIRM_TIME = createField("rb_confirm_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "日报表——务财确认时间");

    /**
     * The column <code>st.business_cw_history_copy2.dsk_send_time</code>. 代收款对账——已发送时间
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> DSK_SEND_TIME = createField("dsk_send_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "代收款对账——已发送时间");

    /**
     * The column <code>st.business_cw_history_copy2.dsk_business_time</code>. 代收款对账——商家确认时间
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> DSK_BUSINESS_TIME = createField("dsk_business_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "代收款对账——商家确认时间");

    /**
     * The column <code>st.business_cw_history_copy2.dsk_confirm_time</code>. 代收款对账——务财确认时间
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> DSK_CONFIRM_TIME = createField("dsk_confirm_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "代收款对账——务财确认时间");

    /**
     * The column <code>st.business_cw_history_copy2.yf_send_time</code>. 运费对账——已发送时间
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> YF_SEND_TIME = createField("yf_send_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "运费对账——已发送时间");

    /**
     * The column <code>st.business_cw_history_copy2.yf_business_time</code>. 运费对账——商家确认时间
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> YF_BUSINESS_TIME = createField("yf_business_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "运费对账——商家确认时间");

    /**
     * The column <code>st.business_cw_history_copy2.yf_confirm_time</code>. 运费对账——财务确认时间
     */
    public final TableField<BusinessCwHistoryCopy2Record, String> YF_CONFIRM_TIME = createField("yf_confirm_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "运费对账——财务确认时间");

    /**
     * Create a <code>st.business_cw_history_copy2</code> table reference
     */
    public BusinessCwHistoryCopy2() {
        this(DSL.name("business_cw_history_copy2"), null);
    }

    /**
     * Create an aliased <code>st.business_cw_history_copy2</code> table reference
     */
    public BusinessCwHistoryCopy2(String alias) {
        this(DSL.name(alias), BUSINESS_CW_HISTORY_COPY2);
    }

    /**
     * Create an aliased <code>st.business_cw_history_copy2</code> table reference
     */
    public BusinessCwHistoryCopy2(Name alias) {
        this(alias, BUSINESS_CW_HISTORY_COPY2);
    }

    private BusinessCwHistoryCopy2(Name alias, Table<BusinessCwHistoryCopy2Record> aliased) {
        this(alias, aliased, null);
    }

    private BusinessCwHistoryCopy2(Name alias, Table<BusinessCwHistoryCopy2Record> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.BUSINESS_CW_HISTORY_COPY2_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BusinessCwHistoryCopy2Record, Integer> getIdentity() {
        return Keys.IDENTITY_BUSINESS_CW_HISTORY_COPY2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BusinessCwHistoryCopy2Record> getPrimaryKey() {
        return Keys.KEY_BUSINESS_CW_HISTORY_COPY2_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BusinessCwHistoryCopy2Record>> getKeys() {
        return Arrays.<UniqueKey<BusinessCwHistoryCopy2Record>>asList(Keys.KEY_BUSINESS_CW_HISTORY_COPY2_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessCwHistoryCopy2 as(String alias) {
        return new BusinessCwHistoryCopy2(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusinessCwHistoryCopy2 as(Name alias) {
        return new BusinessCwHistoryCopy2(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BusinessCwHistoryCopy2 rename(String name) {
        return new BusinessCwHistoryCopy2(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BusinessCwHistoryCopy2 rename(Name name) {
        return new BusinessCwHistoryCopy2(name, null);
    }
}
