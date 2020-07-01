package com.xiaoqi.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @author yangfan
 */
@TableName("biz_goods_comment")
public class GoodsComment {
    /**
     * 主键id
     */
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
     * 评论类型编号
     */
    private String commentTypeCode;
    /**
     * 商品评论
     */
    private String comment;
    /**
     * 是否含有图片
     */
    private Integer isHavepic;
    /**
     * 商品评价编码
     */
    private String commentCode;

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

    public String getCommentTypeCode() {
        return commentTypeCode;
    }

    public void setCommentTypeCode(String commentTypeCode) {
        this.commentTypeCode = commentTypeCode == null ? null : commentTypeCode.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getIsHavepic() {
        return isHavepic;
    }

    public void setIsHavepic(Integer isHavepic) {
        this.isHavepic = isHavepic;
    }

    public String getCommentCode() {
        return commentCode;
    }

    public void setCommentCode(String commentCode) {
        this.commentCode = commentCode == null ? null : commentCode.trim();
    }

    @Override
    public String toString() {
        return "GoodsComment{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", updateTime=" + updateTime +
                ", updateUser='" + updateUser + '\'' +
                ", isDelete=" + isDelete +
                ", goodsCode='" + goodsCode + '\'' +
                ", commentTypeCode='" + commentTypeCode + '\'' +
                ", comment='" + comment + '\'' +
                ", isHavepic=" + isHavepic +
                ", commentCode='" + commentCode + '\'' +
                '}';
    }
}