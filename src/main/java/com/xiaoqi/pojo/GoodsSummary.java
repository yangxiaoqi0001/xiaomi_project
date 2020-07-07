package com.xiaoqi.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 概述表
 */
@TableName("biz_goods_summary")
public class GoodsSummary implements Serializable {
    /**
     * 主键Id
     */
    @TableId
    private Long id;
    /**
     * 创 建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    /**
     * 修改人
     */
    @TableLogic
    private String updateUser;
    /**
     * 是否删除
     */
    private Integer isDelete;
    /**
     * 商品编号
     */
    private String goodsCode;
    /**
     * 概述图1
     */
    private String summaryPic1;
    /**
     * 概述图2
     */
    private String summaryPic2;
    /**
     * 概述图3
     */
    private String summaryPic3;
    /**
     * 概述图4
     */
    private String summaryPic4;
    /**
     * 概述图5
     */
    private String summaryPic5;
    /**
     * 概述图6
     */
    private String summaryPic6;
    /**
     * 概述图7
     */
    private String summaryPic7;
    /**
     * 参数图8
     */
    private String summaryPic8;
    /**
     * 概述图9
     */
    private String summaryPic9;
    /**
     * 概述图10
     */
    private String summaryPic10;
    /**
     * 概述图11
     */
    private String summaryPic11;
    /**
     * 概述图12
     */
    private String summaryPic12;
    /**
     * 概述图13
     */
    private String summaryPic13;
    /**
     * 概述图14
     */
    private String summaryPic14;
    /**
     * 概述图15
     */
    private String summaryPic15;
    /**
     * 概述图16
     */
    private String summaryPic16;
    /**
     * 概述图17
     */
    private String summaryPic17;
    /**
     * 概述图18
     */
    private String summaryPic18;
    /**
     * 概述图19
     */
    private String summaryPic19;
    /**
     * 概述图20
     */
    private String summaryPic20;
    /**
     * 概述视频1
     */
    private String summaryVideo1;
    /**
     * 概述视频2
     */
    private String summaryVideo2;
    /**
     * 概述视频3
     */
    private String summaryVideo3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getSummaryPic1() {
        return summaryPic1;
    }

    public void setSummaryPic1(String summaryPic1) {
        this.summaryPic1 = summaryPic1 == null ? null : summaryPic1.trim();
    }

    public String getSummaryPic2() {
        return summaryPic2;
    }

    public void setSummaryPic2(String summaryPic2) {
        this.summaryPic2 = summaryPic2 == null ? null : summaryPic2.trim();
    }

    public String getSummaryPic3() {
        return summaryPic3;
    }

    public void setSummaryPic3(String summaryPic3) {
        this.summaryPic3 = summaryPic3 == null ? null : summaryPic3.trim();
    }

    public String getSummaryPic4() {
        return summaryPic4;
    }

    public void setSummaryPic4(String summaryPic4) {
        this.summaryPic4 = summaryPic4 == null ? null : summaryPic4.trim();
    }

    public String getSummaryPic5() {
        return summaryPic5;
    }

    public void setSummaryPic5(String summaryPic5) {
        this.summaryPic5 = summaryPic5 == null ? null : summaryPic5.trim();
    }

    public String getSummaryPic6() {
        return summaryPic6;
    }

    public void setSummaryPic6(String summaryPic6) {
        this.summaryPic6 = summaryPic6 == null ? null : summaryPic6.trim();
    }

    public String getSummaryPic7() {
        return summaryPic7;
    }

    public void setSummaryPic7(String summaryPic7) {
        this.summaryPic7 = summaryPic7 == null ? null : summaryPic7.trim();
    }

    public String getSummaryPic8() {
        return summaryPic8;
    }

    public void setSummaryPic8(String summaryPic8) {
        this.summaryPic8 = summaryPic8 == null ? null : summaryPic8.trim();
    }

    public String getSummaryPic9() {
        return summaryPic9;
    }

    public void setSummaryPic9(String summaryPic9) {
        this.summaryPic9 = summaryPic9 == null ? null : summaryPic9.trim();
    }

    public String getSummaryPic10() {
        return summaryPic10;
    }

    public void setSummaryPic10(String summaryPic10) {
        this.summaryPic10 = summaryPic10 == null ? null : summaryPic10.trim();
    }

    public String getSummaryPic11() {
        return summaryPic11;
    }

    public void setSummaryPic11(String summaryPic11) {
        this.summaryPic11 = summaryPic11 == null ? null : summaryPic11.trim();
    }

    public String getSummaryPic12() {
        return summaryPic12;
    }

    public void setSummaryPic12(String summaryPic12) {
        this.summaryPic12 = summaryPic12 == null ? null : summaryPic12.trim();
    }

    public String getSummaryPic13() {
        return summaryPic13;
    }

    public void setSummaryPic13(String summaryPic13) {
        this.summaryPic13 = summaryPic13 == null ? null : summaryPic13.trim();
    }

    public String getSummaryPic14() {
        return summaryPic14;
    }

    public void setSummaryPic14(String summaryPic14) {
        this.summaryPic14 = summaryPic14 == null ? null : summaryPic14.trim();
    }

    public String getSummaryPic15() {
        return summaryPic15;
    }

    public void setSummaryPic15(String summaryPic15) {
        this.summaryPic15 = summaryPic15 == null ? null : summaryPic15.trim();
    }

    public String getSummaryPic16() {
        return summaryPic16;
    }

    public void setSummaryPic16(String summaryPic16) {
        this.summaryPic16 = summaryPic16 == null ? null : summaryPic16.trim();
    }

    public String getSummaryPic17() {
        return summaryPic17;
    }

    public void setSummaryPic17(String summaryPic17) {
        this.summaryPic17 = summaryPic17 == null ? null : summaryPic17.trim();
    }

    public String getSummaryPic18() {
        return summaryPic18;
    }

    public void setSummaryPic18(String summaryPic18) {
        this.summaryPic18 = summaryPic18 == null ? null : summaryPic18.trim();
    }

    public String getSummaryPic19() {
        return summaryPic19;
    }

    public void setSummaryPic19(String summaryPic19) {
        this.summaryPic19 = summaryPic19 == null ? null : summaryPic19.trim();
    }

    public String getSummaryPic20() {
        return summaryPic20;
    }

    public void setSummaryPic20(String summaryPic20) {
        this.summaryPic20 = summaryPic20 == null ? null : summaryPic20.trim();
    }

    public String getSummaryVideo1() {
        return summaryVideo1;
    }

    public void setSummaryVideo1(String summaryVideo1) {
        this.summaryVideo1 = summaryVideo1 == null ? null : summaryVideo1.trim();
    }

    public String getSummaryVideo2() {
        return summaryVideo2;
    }

    public void setSummaryVideo2(String summaryVideo2) {
        this.summaryVideo2 = summaryVideo2 == null ? null : summaryVideo2.trim();
    }

    public String getSummaryVideo3() {
        return summaryVideo3;
    }

    public void setSummaryVideo3(String summaryVideo3) {
        this.summaryVideo3 = summaryVideo3 == null ? null : summaryVideo3.trim();
    }

    @Override
    public String toString() {
        return "GoodsSummary{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", updateTime=" + updateTime +
                ", updateUser='" + updateUser + '\'' +
                ", isDelete=" + isDelete +
                ", goodsCode='" + goodsCode + '\'' +
                ", summaryPic1='" + summaryPic1 + '\'' +
                ", summaryPic2='" + summaryPic2 + '\'' +
                ", summaryPic3='" + summaryPic3 + '\'' +
                ", summaryPic4='" + summaryPic4 + '\'' +
                ", summaryPic5='" + summaryPic5 + '\'' +
                ", summaryPic6='" + summaryPic6 + '\'' +
                ", summaryPic7='" + summaryPic7 + '\'' +
                ", summaryPic8='" + summaryPic8 + '\'' +
                ", summaryPic9='" + summaryPic9 + '\'' +
                ", summaryPic10='" + summaryPic10 + '\'' +
                ", summaryPic11='" + summaryPic11 + '\'' +
                ", summaryPic12='" + summaryPic12 + '\'' +
                ", summaryPic13='" + summaryPic13 + '\'' +
                ", summaryPic14='" + summaryPic14 + '\'' +
                ", summaryPic15='" + summaryPic15 + '\'' +
                ", summaryPic16='" + summaryPic16 + '\'' +
                ", summaryPic17='" + summaryPic17 + '\'' +
                ", summaryPic18='" + summaryPic18 + '\'' +
                ", summaryPic19='" + summaryPic19 + '\'' +
                ", summaryPic20='" + summaryPic20 + '\'' +
                ", summaryVideo1='" + summaryVideo1 + '\'' +
                ", summaryVideo2='" + summaryVideo2 + '\'' +
                ", summaryVideo3='" + summaryVideo3 + '\'' +
                '}';
    }
}