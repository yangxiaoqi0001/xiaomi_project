package com.xiaoqi.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
@TableName("biz_second_list")
public class SecondList implements Serializable {
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
     * 第二列表名称
     */
    private String secondName;
    /**
     * 第二列表编号
     */
    private String secondCode;
    /**
     * 第一列表编号
     */
    private String firstCode;
    /**
     * 第二列表图片
     */
    private String pic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondCode() {
        return secondCode;
    }

    public void setSecondCode(String secondCode) {
        this.secondCode = secondCode == null ? null : secondCode.trim();
    }

    public String getFirstCode() {
        return firstCode;
    }

    public void setFirstCode(String firstCode) {
        this.firstCode = firstCode == null ? null : firstCode.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
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
        this.createUser = createUser;
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
        this.updateUser = updateUser;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "SecondList{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", updateTime=" + updateTime +
                ", updateUser='" + updateUser + '\'' +
                ", isDelete=" + isDelete +
                ", secondName='" + secondName + '\'' +
                ", secondCode='" + secondCode + '\'' +
                ", firstCode='" + firstCode + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }
}