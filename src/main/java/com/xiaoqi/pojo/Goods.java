package com.xiaoqi.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName("biz_goods")
public class Goods {
    /**
     * 主键ID
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
     * 名称
     */
    private String name;
    /**
     * 商品编号
     */
    private String goodsCode;
    /**
     * 第一列表编号
     */
    private String firstCode;
    /**
     * 第二列表编号
     */
    private String secondCode;
    /**
     * 商品简介
     */
    private String introduction;
    /**
     * 简介
     */
    private BigDecimal price;
    /**
     * 商品型号1
     */
    private String goodsEdition1;
    /**
     * 商品型号2
     */
    private String goodsEdition2;
    /**
     * 商品型号3
     */
    private String goodsEdition3;
    /**
     * 商品型号4
     */
    private String goodsEdition4;
    /**
     * 商品颜色1
     */
    private String goodsColor1;
    /**
     * 商品颜色2
     */
    private String goodsColor2;
    /**
     * 商品颜色3
     */
    private String goodsColor3;
    /**
     * 商品颜色4
     */
    private String goodsColor4;
    /**
     * 商品图片1
     */
    private String goodsPic1;
    /**
     *商品图片2
     */
    private String goodsPic2;
    /**
     * 商品图片3
     */
    private String goodsPic3;
    /**
     * 商品图片4
     */
    private String goodsPic4;
    /**
     * 商品图片5
     */
    private String goodsPic5;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getFirstCode() {
        return firstCode;
    }

    public void setFirstCode(String firstCode) {
        this.firstCode = firstCode == null ? null : firstCode.trim();
    }

    public String getSecondCode() {
        return secondCode;
    }

    public void setSecondCode(String secondCode) {
        this.secondCode = secondCode == null ? null : secondCode.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getGoodsEdition1() {
        return goodsEdition1;
    }

    public void setGoodsEdition1(String goodsEdition1) {
        this.goodsEdition1 = goodsEdition1 == null ? null : goodsEdition1.trim();
    }

    public String getGoodsEdition2() {
        return goodsEdition2;
    }

    public void setGoodsEdition2(String goodsEdition2) {
        this.goodsEdition2 = goodsEdition2 == null ? null : goodsEdition2.trim();
    }

    public String getGoodsEdition3() {
        return goodsEdition3;
    }

    public void setGoodsEdition3(String goodsEdition3) {
        this.goodsEdition3 = goodsEdition3 == null ? null : goodsEdition3.trim();
    }

    public String getGoodsEdition4() {
        return goodsEdition4;
    }

    public void setGoodsEdition4(String goodsEdition4) {
        this.goodsEdition4 = goodsEdition4 == null ? null : goodsEdition4.trim();
    }

    public String getGoodsColor1() {
        return goodsColor1;
    }

    public void setGoodsColor1(String goodsColor1) {
        this.goodsColor1 = goodsColor1 == null ? null : goodsColor1.trim();
    }

    public String getGoodsColor2() {
        return goodsColor2;
    }

    public void setGoodsColor2(String goodsColor2) {
        this.goodsColor2 = goodsColor2 == null ? null : goodsColor2.trim();
    }

    public String getGoodsColor3() {
        return goodsColor3;
    }

    public void setGoodsColor3(String goodsColor3) {
        this.goodsColor3 = goodsColor3 == null ? null : goodsColor3.trim();
    }

    public String getGoodsColor4() {
        return goodsColor4;
    }

    public void setGoodsColor4(String goodsColor4) {
        this.goodsColor4 = goodsColor4 == null ? null : goodsColor4.trim();
    }

    public String getGoodsPic1() {
        return goodsPic1;
    }

    public void setGoodsPic1(String goodsPic1) {
        this.goodsPic1 = goodsPic1 == null ? null : goodsPic1.trim();
    }

    public String getGoodsPic2() {
        return goodsPic2;
    }

    public void setGoodsPic2(String goodsPic2) {
        this.goodsPic2 = goodsPic2 == null ? null : goodsPic2.trim();
    }

    public String getGoodsPic3() {
        return goodsPic3;
    }

    public void setGoodsPic3(String goodsPic3) {
        this.goodsPic3 = goodsPic3 == null ? null : goodsPic3.trim();
    }

    public String getGoodsPic4() {
        return goodsPic4;
    }

    public void setGoodsPic4(String goodsPic4) {
        this.goodsPic4 = goodsPic4 == null ? null : goodsPic4.trim();
    }

    public String getGoodsPic5() {
        return goodsPic5;
    }

    public void setGoodsPic5(String goodsPic5) {
        this.goodsPic5 = goodsPic5 == null ? null : goodsPic5.trim();
    }
}