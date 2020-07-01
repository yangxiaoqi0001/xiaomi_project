package com.xiaoqi.pojo.vo;


import com.xiaoqi.constant.ResultEnum;

/**
 * 接口返回结果 值对象
 * @author Zhao Yahui
 * @date 2020-04-01
 */
public class ResultVO {
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private Object data;

    /**
     * 无参构造方法
     */
    public ResultVO() {
    }

    /**
     * 自定义接口返回结果
     * @param success 是否成功
     * @param code 返回码
     * @param msg 返回信息
     * @param data 返回数据
     * @return
     */
    public ResultVO(boolean success, Integer code, String msg, Object data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 成功（有数据）
     * @param data 返回数据
     */
    public static ResultVO success(Object data){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(true);
        resultVO.setCode(ResultEnum.OK.getCode());
        resultVO.setData(data);
        resultVO.setMsg(ResultEnum.OK.getMsg());
        return resultVO;
    }

    /**
     * 成功（无数据）
     */
    public static ResultVO success(){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(true);
        resultVO.setCode(ResultEnum.OK.getCode());
        resultVO.setData(null);
        resultVO.setMsg(ResultEnum.OK.getMsg());
        return resultVO;
    }

    /**
     * 发生异常
     * @param msg
     */
    public static ResultVO error(String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(false);
        resultVO.setCode(ResultEnum.ERROR.getCode());
        resultVO.setData(null);
        resultVO.setMsg(ResultEnum.ERROR.getMsg() + msg);
        return resultVO;
    }

    /**
     * 权限异常
     * @param msg
     */
    public static ResultVO unauthorized(String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(false);
        resultVO.setCode(ResultEnum.UNAYTHORIZED.getCode());
        resultVO.setData(null);
        resultVO.setMsg(ResultEnum.UNAYTHORIZED.getMsg() + msg);
        return resultVO;
    }

    /**
     * 参数错误
     * @param msg
     */
    public static ResultVO paramsError(String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(false);
        resultVO.setCode(ResultEnum.PARAMS_ERROR.getCode());
        resultVO.setData(null);
        resultVO.setMsg(ResultEnum.PARAMS_ERROR.getMsg() + msg);
        return resultVO;
    }

    /**
     * 访问失败
     * @param msg
     */
    public static ResultVO failed(String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(false);
        resultVO.setCode(ResultEnum.FAILED.getCode());
        resultVO.setData(null);
        resultVO.setMsg(ResultEnum.FAILED.getMsg() + msg);
        return resultVO;
    }

    /**
     * 服务器异常
     * @param msg
     */
    public static ResultVO serverError(String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(false);
        resultVO.setCode(ResultEnum.SERVER_ERROR.getCode());
        resultVO.setData(null);
        resultVO.setMsg(ResultEnum.SERVER_ERROR.getMsg() + msg);
        return resultVO;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "success=" + success +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
