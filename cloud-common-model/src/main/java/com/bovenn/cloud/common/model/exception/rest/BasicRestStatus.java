package com.bovenn.cloud.common.model.exception.rest;

/**
 * 基础错误代码：100000--199999
 * Created by SunnyWen on 2017/10/19.
 */
public enum BasicRestStatus implements RestStatus {

    /**
     * 参数位空错误
     */
    paramNullErrorStatus(100000, "参数为空！"),
    repeatDataErrorStatus(100001, "重复数据！"),
    nullDataErrorStatus(100002, "数据为空！"),

    paramFormatErrorStatus(101000, "参数格式错误！"),
    paramNumberFormatErrorStatus(101100, "数字型参数格式错误！应为数字格式！"),
    paramIntegerFormatErrorStatus(101101, "整型参数格式错误！应为整型格式！"),
    paramFloatFormatErrorStatus(101102, "参数格式错误！应为浮点型格式！"),
    paramStringFormatErrorStatus(101200, "参数格式错误！应为字符串格式！"),
    paramDateFormatErrorStatus(101201, "参数格式错误！应为日期格式！"),
    paramIdCardFormatErrorStatus(101202, "参数格式错误！应为身份证格式！"),
    paramUrlFormatErrorStatus(101203, "参数格式错误！应为Url格式！"),
    paramPhoneFormatErrorStatus(101204, "参数格式错误！应为电话号码格式！");

    private Integer code;
    private String message;

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }

    BasicRestStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
