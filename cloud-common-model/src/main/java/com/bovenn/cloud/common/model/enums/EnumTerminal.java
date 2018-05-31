package com.bovenn.cloud.common.model.enums;

/**
 * @author Sky$
 * @Description: TODO
 * @date 2017/12/18$ 16:05$
 */
public enum EnumTerminal implements AbstractEnum {


    /**
     * 电脑端
     */
    pc(0, "电脑端"),
    /**
     * 移动端
     */
    mobile(1, "移动端"),

    /**
     * 客户端
     */
    client(2, "客户端"),
    /**
     * 网页端
     */
    web(3, "网页端"),

    /**
     * 微信端
     */
    weChat(4, "微信端"),
    /**
     * app端
     */
    app(5, "app端"),
    /**
     * 安卓端
     */
    android(6, "安卓端"),
    /**
     * IOS端
     */
    ios(7, "IOS端"),
    /**
     * 平板端
     */
    pad(8, "平板端");

    private int code;
    private String msg;

    EnumTerminal(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
