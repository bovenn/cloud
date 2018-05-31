package com.bovenn.cloud.common.model.exception.rest;

/**
* @Description: 异常处理抽象接口
* @author kissy
* @date 2017/10/24 下午4:46
*/
public interface RestStatus {

    /**
     * the status codes of per restful request.
     *
     * @return 20xxx if succeed, 40xxx if client error, 50xxx if server side crash.
     */
    int code();

    /**
     * status describe
     * @return message summary
     */
    String message();

}
