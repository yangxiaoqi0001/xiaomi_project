package com.xiaoqi.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("biz_goods_comment_pic")
public class GoodsCommentPic implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long id;
    /**
     * 评论编码
     */
    private String commentCode;
    /**
     * 评论图片1
     */
    private String commentPic1;
    /**
     * 评论图片2
     */
    private String commentPic2;
    /**
     * 评论图片3
     */
    private String commentPic3;
    /**
     * 评论图片4
     */
    private String commentPic4;
    /**
     * 评论图片5
     */
    private String commentPic5;
    /**
     * 评论图片6
     */
    private String commentPic6;
    /**
     * 评论图片7
     */
    private String commentPic7;
    /**
     * 评论图片8
     */
    private String commentPic8;
    /**
     * 评论图片9
     */
    private String commentPic9;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentCode() {
        return commentCode;
    }

    public void setCommentCode(String commentCode) {
        this.commentCode = commentCode == null ? null : commentCode.trim();
    }

    public String getCommentPic1() {
        return commentPic1;
    }

    public void setCommentPic1(String commentPic1) {
        this.commentPic1 = commentPic1 == null ? null : commentPic1.trim();
    }

    public String getCommentPic2() {
        return commentPic2;
    }

    public void setCommentPic2(String commentPic2) {
        this.commentPic2 = commentPic2 == null ? null : commentPic2.trim();
    }

    public String getCommentPic3() {
        return commentPic3;
    }

    public void setCommentPic3(String commentPic3) {
        this.commentPic3 = commentPic3 == null ? null : commentPic3.trim();
    }

    public String getCommentPic4() {
        return commentPic4;
    }

    public void setCommentPic4(String commentPic4) {
        this.commentPic4 = commentPic4 == null ? null : commentPic4.trim();
    }

    public String getCommentPic5() {
        return commentPic5;
    }

    public void setCommentPic5(String commentPic5) {
        this.commentPic5 = commentPic5 == null ? null : commentPic5.trim();
    }

    public String getCommentPic6() {
        return commentPic6;
    }

    public void setCommentPic6(String commentPic6) {
        this.commentPic6 = commentPic6 == null ? null : commentPic6.trim();
    }

    public String getCommentPic7() {
        return commentPic7;
    }

    public void setCommentPic7(String commentPic7) {
        this.commentPic7 = commentPic7 == null ? null : commentPic7.trim();
    }

    public String getCommentPic8() {
        return commentPic8;
    }

    public void setCommentPic8(String commentPic8) {
        this.commentPic8 = commentPic8 == null ? null : commentPic8.trim();
    }

    public String getCommentPic9() {
        return commentPic9;
    }

    public void setCommentPic9(String commentPic9) {
        this.commentPic9 = commentPic9 == null ? null : commentPic9.trim();
    }

    @Override
    public String toString() {
        return "GoodsCommentPic{" +
                "id=" + id +
                ", commentCode='" + commentCode + '\'' +
                ", commentPic1='" + commentPic1 + '\'' +
                ", commentPic2='" + commentPic2 + '\'' +
                ", commentPic3='" + commentPic3 + '\'' +
                ", commentPic4='" + commentPic4 + '\'' +
                ", commentPic5='" + commentPic5 + '\'' +
                ", commentPic6='" + commentPic6 + '\'' +
                ", commentPic7='" + commentPic7 + '\'' +
                ", commentPic8='" + commentPic8 + '\'' +
                ", commentPic9='" + commentPic9 + '\'' +
                '}';
    }
}