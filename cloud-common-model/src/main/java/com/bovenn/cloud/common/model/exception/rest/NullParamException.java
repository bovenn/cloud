package com.bovenn.cloud.common.model.exception.rest;

import com.bovenn.cloud.common.model.exception.BizException;

/**
 * Created by SunnyWen on 2017/10/19.
 */
public class NullParamException extends BizException {


    private BasicRestStatus status = BasicRestStatus.paramNullErrorStatus;

    public NullParamException() {
        super(BasicRestStatus.paramNullErrorStatus);
    }

    public static void validateParam(Object paramValue) throws NullParamException {
        NullParamException e = null;
        boolean flag = false;
        if (null == paramValue) {
            flag = true;
        }
        if (paramValue instanceof String) {
            if (((String) paramValue).length() <= 0) {
                flag = true;
            }
        }
        if (flag) {
            e = new NullParamException();
            throw e;
        }
    }


}
