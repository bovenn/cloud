package com.bovenn.cloud.common.model.exception.rest;

/**
* @Description: 平台公用状态码
* @author kissy
* @date 2017/10/24 下午4:46
*/
public enum StatusCode implements RestStatus {
    // 成功
    OK(20000, "请求成功"),

    /**
     * 请求数据为空
     */
    OK_NO_DATA(20001, "请求数据为空"),

    /**
     * 40xxx 客户端不合法的请求
     */
    INVALID_MODEL_FIELDS(40000, "字段校验非法"),

    /**
     * 无权操作
     */
    UNAUTHORIZED(40001,"无权操作"),

    /**
     * 参数类型非法，常见于SpringMVC中String无法找到对应的enum而抛出的异常
     */
    INVALID_PARAMS_CONVERSION(40002, "参数类型非法"),

    /**
     * 认证失败
     */
    INVALID_AUTH(40003, "认证失败"),

    // 成功接收请求, 但是处理失败
    /**
     * Duplicate Key
     */
    DUPLICATE_KEY(42001, "操作过快, 请稍后再试"),

    /**
     * 用于处理未知的服务端错误
     */
    SERVER_INTERNAL_ERROR(50000, "服务端异常, 请稍后再试");

    private final int code;

    private final String message;


    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }

}
