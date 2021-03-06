package com.xiaoqi.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 参数表
 */
@TableName("biz_goods_parameter")
public class GoodsParameter implements Serializable {
    @TableId
    private Long id;
    /**
     *创建时间
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
    private String updateUser;
    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;
    /**
     * 商品编号
     */
    private String goodsCode;
    /**
     * 产数图片1
     */
    private String parameterPic1;
    /**
     * 产数图片2
     */
    private String parameterPic2;
    /**
     * 产数图片3
     */
    private String parameterPic3;
    /**
     * 产数图片4
     */
    private String parameterPic4;
    /**
     * 产数图片5
     */
    private String parameterPic5;
    /**
     * 产数图片6
     */
    private String parameterPic6;
    /**
     * 产数图片7
     */
    private String parameterPic7;
    /**
     * 产数图片8
     */
    private String parameterPic8;
    /**
     * 产数图片9
     */
    private String parameterPic9;
    /**
     * 产数图片10
     */
    private String parameterPic10;
    /**
     * 产数图片11
     */
    private String parameterPic11;
    /**
     * 产数图片12
     */
    private String parameterPic12;
    /**
     * 产数图片13
     */
    private String parameterPic13;
    /**
     * 产数图片14
     */
    private String parameterPic14;
    /**
     * 产数图片15
     */
    private String parameterPic15;
    /**
     * 产数图片16
     */
    private String parameterPic16;
    /**
     * 产数图片17
     */
    private String parameterPic17;
    /**
     * 产数图片18
     */
    private String parameterPic18;
    /**
     * 产数图片19
     */
    private String parameterPic19;
    /**
     * 产数图片20
     */
    private String parameterPic20;

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

    public String getParameterPic1() {
        return parameterPic1;
    }

    public void setParameterPic1(String parameterPic1) {
        this.parameterPic1 = parameterPic1 == null ? null : parameterPic1.trim();
    }

    public String getParameterPic2() {
        return parameterPic2;
    }

    public void setParameterPic2(String parameterPic2) {
        this.parameterPic2 = parameterPic2 == null ? null : parameterPic2.trim();
    }

    public String getParameterPic3() {
        return parameterPic3;
    }

    public void setParameterPic3(String parameterPic3) {
        this.parameterPic3 = parameterPic3 == null ? null : parameterPic3.trim();
    }

    public String getParameterPic4() {
        return parameterPic4;
    }

    public void setParameterPic4(String parameterPic4) {
        this.parameterPic4 = parameterPic4 == null ? null : parameterPic4.trim();
    }

    public String getParameterPic5() {
        return parameterPic5;
    }

    public void setParameterPic5(String parameterPic5) {
        this.parameterPic5 = parameterPic5 == null ? null : parameterPic5.trim();
    }

    public String getParameterPic6() {
        return parameterPic6;
    }

    public void setParameterPic6(String parameterPic6) {
        this.parameterPic6 = parameterPic6 == null ? null : parameterPic6.trim();
    }

    public String getParameterPic7() {
        return parameterPic7;
    }

    public void setParameterPic7(String parameterPic7) {
        this.parameterPic7 = parameterPic7 == null ? null : parameterPic7.trim();
    }

    public String getParameterPic8() {
        return parameterPic8;
    }

    public void setParameterPic8(String parameterPic8) {
        this.parameterPic8 = parameterPic8 == null ? null : parameterPic8.trim();
    }

    public String getParameterPic9() {
        return parameterPic9;
    }

    public void setParameterPic9(String parameterPic9) {
        this.parameterPic9 = parameterPic9 == null ? null : parameterPic9.trim();
    }

    public String getParameterPic10() {
        return parameterPic10;
    }

    public void setParameterPic10(String parameterPic10) {
        this.parameterPic10 = parameterPic10 == null ? null : parameterPic10.trim();
    }

    public String getParameterPic11() {
        return parameterPic11;
    }

    public void setParameterPic11(String parameterPic11) {
        this.parameterPic11 = parameterPic11 == null ? null : parameterPic11.trim();
    }

    public String getParameterPic12() {
        return parameterPic12;
    }

    public void setParameterPic12(String parameterPic12) {
        this.parameterPic12 = parameterPic12 == null ? null : parameterPic12.trim();
    }

    public String getParameterPic13() {
        return parameterPic13;
    }

    public void setParameterPic13(String parameterPic13) {
        this.parameterPic13 = parameterPic13 == null ? null : parameterPic13.trim();
    }

    public String getParameterPic14() {
        return parameterPic14;
    }

    public void setParameterPic14(String parameterPic14) {
        this.parameterPic14 = parameterPic14 == null ? null : parameterPic14.trim();
    }

    public String getParameterPic15() {
        return parameterPic15;
    }

    public void setParameterPic15(String parameterPic15) {
        this.parameterPic15 = parameterPic15 == null ? null : parameterPic15.trim();
    }

    public String getParameterPic16() {
        return parameterPic16;
    }

    public void setParameterPic16(String parameterPic16) {
        this.parameterPic16 = parameterPic16 == null ? null : parameterPic16.trim();
    }

    public String getParameterPic17() {
        return parameterPic17;
    }

    public void setParameterPic17(String parameterPic17) {
        this.parameterPic17 = parameterPic17 == null ? null : parameterPic17.trim();
    }

    public String getParameterPic18() {
        return parameterPic18;
    }

    public void setParameterPic18(String parameterPic18) {
        this.parameterPic18 = parameterPic18 == null ? null : parameterPic18.trim();
    }

    public String getParameterPic19() {
        return parameterPic19;
    }

    public void setParameterPic19(String parameterPic19) {
        this.parameterPic19 = parameterPic19 == null ? null : parameterPic19.trim();
    }

    public String getParameterPic20() {
        return parameterPic20;
    }

    public void setParameterPic20(String parameterPic20) {
        this.parameterPic20 = parameterPic20 == null ? null : parameterPic20.trim();
    }

    @Override
    public String toString() {
        return "GoodsParameter{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", updateTime=" + updateTime +
                ", updateUser='" + updateUser + '\'' +
                ", isDelete=" + isDelete +
                ", goodsCode='" + goodsCode + '\'' +
                ", parameterPic1='" + parameterPic1 + '\'' +
                ", parameterPic2='" + parameterPic2 + '\'' +
                ", parameterPic3='" + parameterPic3 + '\'' +
                ", parameterPic4='" + parameterPic4 + '\'' +
                ", parameterPic5='" + parameterPic5 + '\'' +
                ", parameterPic6='" + parameterPic6 + '\'' +
                ", parameterPic7='" + parameterPic7 + '\'' +
                ", parameterPic8='" + parameterPic8 + '\'' +
                ", parameterPic9='" + parameterPic9 + '\'' +
                ", parameterPic10='" + parameterPic10 + '\'' +
                ", parameterPic11='" + parameterPic11 + '\'' +
                ", parameterPic12='" + parameterPic12 + '\'' +
                ", parameterPic13='" + parameterPic13 + '\'' +
                ", parameterPic14='" + parameterPic14 + '\'' +
                ", parameterPic15='" + parameterPic15 + '\'' +
                ", parameterPic16='" + parameterPic16 + '\'' +
                ", parameterPic17='" + parameterPic17 + '\'' +
                ", parameterPic18='" + parameterPic18 + '\'' +
                ", parameterPic19='" + parameterPic19 + '\'' +
                ", parameterPic20='" + parameterPic20 + '\'' +
                '}';
    }
}