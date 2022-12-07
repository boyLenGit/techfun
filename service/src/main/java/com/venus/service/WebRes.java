package com.venus.service;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/12/6 19:32
 */
public class WebRes<T> {

    public static final int SUCCESS = 0;
    public static final int FAILURE = 1;

    // 常见错误码
    public static final int UNAUTHORIZED = 1000;
    public static final int FORBIDDEN = 1100;

    private T data;

    private int code;

    private String msg;

    public static final String DEFAULT_SUCCESS_MESSAGE = "OK";

    public static final String DEFAULT_FAIL_MESSAGE = "Failed";

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 返回成功的结果。结果中code字段为0，msg为字符串"OK"。
     * @param data 返回结果中包含的数据
     * @param <T> 返回结果中data的类型
     * @return
     */
    public static <T> WebRes<T> success(T data) {
        WebRes<T> responseResult = new WebRes<>();
        responseResult.setData(data);
        responseResult.setCode(SUCCESS);
        responseResult.setMsg(DEFAULT_SUCCESS_MESSAGE);

        return responseResult;
    }

    /**
     * 返回不带数据的成功结果。结果中code字段为0，msg为字符串"OK"。
     * @return
     */
    public static WebRes success() {
        WebRes responseResult = new WebRes();
        responseResult.setCode(SUCCESS);
        responseResult.setMsg(DEFAULT_SUCCESS_MESSAGE);

        return responseResult;
    }

    /**
     * 返回不带数据的失败结果。结果中code字段为1，msg为字符串"Failed"。
     * @return
     * @since 1.8.0
     */
    public static WebRes fail() {
        WebRes responseResult = new WebRes<>();
        responseResult.setCode(FAILURE);
        responseResult.setMsg(DEFAULT_FAIL_MESSAGE);
        return responseResult;
    }

    /**
     * 返回带数据的失败结果。结果中code字段为1，msg为字符串"Failed"。
     * @param data 返回结果中包含的数据
     * @param <T> 返回结果data类型
     * @return
     */
    public static <T> WebRes<T> fail(T data) {
        WebRes<T> responseResult = new WebRes<>();
        responseResult.setData(data);
        responseResult.setCode(FAILURE);
        responseResult.setMsg(DEFAULT_FAIL_MESSAGE);
        return responseResult;
    }

    /**
     * 返回指定错误码和指定错误信息的结果。
     * @param code 错误码
     * @param msg 错误信息
     * @return
     */
    public static WebRes fail(int code, String msg) {
        WebRes responseResult = new WebRes();
        responseResult.setCode(code);
        responseResult.setMsg(msg);
        return responseResult;
    }

    /**
     * 返回带数据且指定错误码和指定错误信息的结果。
     * @param data 返回结果中包含的数据
     * @param code 错误码
     * @param msg 错误信息
     * @param <T> 返回结果data类型
     * @return
     */
    public static <T> WebRes<T> fail(T data, int code, String msg) {
        WebRes<T> responseResult = new WebRes<>();
        responseResult.setData(data);
        responseResult.setCode(code);
        responseResult.setMsg(msg);
        return responseResult;
    }
}
