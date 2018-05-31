package com.bovenn.cloud.common.model.enums;

/**
 * @author Sky$
 * @Description: TODO
 * @date 2017/12/18$ 16:05$
 */
public enum EnumService implements AbstractEnum {


    /**
     * 导航服务
     */
    navigation(0, "导航服务"),
    /**
     * 媒资服务
     */
    media(1, "媒资服务"),

    /**
     * 电商服务
     */
    ecommerce(2, "电商服务"),
    /**
     * 用户服务
     */
    ucenter(3, "用户服务"),

    /**
     * portal服务
     */
    portal(4, "portal服务"),

    /**
     * cms服务
     */
    cms(5, "cms服务") ;

    private int code;
    private String msg;

    EnumService(int code, String msg) {
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
