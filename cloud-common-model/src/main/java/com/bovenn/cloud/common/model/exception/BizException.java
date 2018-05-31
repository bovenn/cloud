package com.bovenn.cloud.common.model.exception;

import com.bovenn.cloud.common.model.exception.rest.RestStatus;

/**
* @Description: 业务处理异常类
* @author kissy
* @date 2017/10/24 下午4:45
*/
public class BizException extends RuntimeException{
    private static final long serialVersionUID = -2359843215972162510L;
    private RestStatus restStatus;

    public BizException() {
    }

    public BizException(RestStatus status) {
        super(status.message());
        this.restStatus = status;
    }

    public RestStatus getRestStatus() {
        return restStatus;
    }
}