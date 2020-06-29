package com.xiaoqi.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * @author : yangfan
 * @Date : 2020/6/28
 **/
@TableName("sys_user")
public class User implements Serializable {
    @TableId
    private Long id;
    /**
     * 创建时间
     */
    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    private Integer isDelete;

    private String username;

    private String password;

    private String telphone;

    private String email;

    private Integer age;

    private String sex;

    private String country;

    private String idcard;

    private String userCode;

    private String pic;
}
