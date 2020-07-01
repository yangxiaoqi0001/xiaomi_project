package com.xiaoqi.constant;

/**
 * 返回结果常量枚举
 *
 * @author Zhao Yahui
 * @date 2020-04-01
 */
public enum ResultEnum {

    /**
     * 结果集
     */
    OK(200, "OK!"),
    ERROR(400, "Error!"),
    UNAYTHORIZED(401, "Unauthorized!"),
    PARAMS_ERROR(4002, "Invalid Parameter!"),
    FAILED(4003, "Failed!"),
    SERVER_ERROR(500, "Server exception!");

    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
