package com.bovenn.cloud.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.bovenn.cloud.common.model.exception.rest.RestStatus;
import com.bovenn.cloud.common.model.exception.rest.StatusCode;
import lombok.Data;

import java.io.Serializable;

/**
* @Description: rest调用通用封装体
* @author kissy
* @date 2017/10/24 下午4:47
*/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvokeResult<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    public static InvokeResult status(RestStatus restStatus){
        InvokeResult invokeResult = new InvokeResult();
        invokeResult.setCode(restStatus.code());
        invokeResult.setMsg(restStatus.message());

        return invokeResult;
    }

    public static InvokeResult ok(){
        InvokeResult invokeResult = new InvokeResult();
        invokeResult.setMsg(StatusCode.OK.message());
        invokeResult.setCode(StatusCode.OK.code());
        return invokeResult;
    }

    public static InvokeResult ok(Object data){
        InvokeResult invokeResult = new InvokeResult();
        invokeResult.setData(data);
        invokeResult.setMsg(StatusCode.OK.message());
        invokeResult.setCode(StatusCode.OK.code());
        return invokeResult;
    }

    public static InvokeResult failure(String msg){
        InvokeResult invokeResult = new InvokeResult();
        invokeResult.setMsg(msg);
        invokeResult.setCode(StatusCode.INVALID_MODEL_FIELDS.code());
        return invokeResult;
    }

    public static InvokeResult error(){
        InvokeResult invokeResult = new InvokeResult();
        invokeResult.setCode(StatusCode.SERVER_INTERNAL_ERROR.code());
        invokeResult.setMsg(StatusCode.SERVER_INTERNAL_ERROR.message());
        return invokeResult;
    }

    public static InvokeResult passNoData(){
        InvokeResult invokeResult = new InvokeResult();
        invokeResult.setCode(StatusCode.OK_NO_DATA.code());
        invokeResult.setMsg(StatusCode.OK_NO_DATA.message());
        return invokeResult;
    }

    public static InvokeResult valueOf(RestStatus status){
        return status(status);
    }
}
