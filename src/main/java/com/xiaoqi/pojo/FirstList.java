package com.xiaoqi.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
@TableName("biz_first_list")
public class FirstList implements Serializable {
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
     * 第一列表
     */
    private String firstName;
    /**
     * 第一列表编码
     */
    private String firstCode;

    public FirstList() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstCode() {
        return firstCode;
    }

    public void setFirstCode(String firstCode) {
        this.firstCode = firstCode == null ? null : firstCode.trim();
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "FirstList{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", updateTime=" + updateTime +
                ", updateUser='" + updateUser + '\'' +
                ", isDelete=" + isDelete +
                ", firstName='" + firstName + '\'' +
                ", firstCode='" + firstCode + '\'' +
                '}';
    }
}