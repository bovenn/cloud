package com.bovenn.cloud.common.model.exception;

import com.bovenn.cloud.common.model.exception.rest.RestStatus;

/**
* @Description: 异常处理封装类
* @author kissy
* @date 2017/10/24 下午4:45
*/
public final class Shift {

    private Shift() {
    }

    /**
     * 抛出具体的{@code RestStatus}异常
     *
     * @param status  自定义异常实体
     */
    public static void fatal(RestStatus status) {
        throw new BizException(status);
    }
}