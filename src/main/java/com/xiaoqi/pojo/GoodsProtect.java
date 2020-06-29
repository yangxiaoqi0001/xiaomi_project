package com.xiaoqi.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 保质期
 */
@TableName("biz_goods_protect")
public class GoodsProtect implements Serializable {
    /**
     * 主键id
     */
    @TableId
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 修改人
     */
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
     * 意外险
     */
    private String accident;
    /**
     * 碎屏险
     */
    private String screenBreakage;
    /**
     * 延长保修服务
     */
    private String extendedWarranty;
    /**
     * 预留字段1
     */
    private String reserve1;
    /**
     * 预留字段2
     */
    private String reserve2;
    /**
     * 预留字段3
     */
    private String reserve3;
    /**
     * 预留字段4
     */
    private String reserve4;
    /**
     * 预留字段5
     */
    private String reserve5;

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

    public String getAccident() {
        return accident;
    }

    public void setAccident(String accident) {
        this.accident = accident == null ? null : accident.trim();
    }

    public String getScreenBreakage() {
        return screenBreakage;
    }

    public void setScreenBreakage(String screenBreakage) {
        this.screenBreakage = screenBreakage == null ? null : screenBreakage.trim();
    }

    public String getExtendedWarranty() {
        return extendedWarranty;
    }

    public void setExtendedWarranty(String extendedWarranty) {
        this.extendedWarranty = extendedWarranty == null ? null : extendedWarranty.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public String getReserve4() {
        return reserve4;
    }

    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4 == null ? null : reserve4.trim();
    }

    public String getReserve5() {
        return reserve5;
    }

    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5 == null ? null : reserve5.trim();
    }
}