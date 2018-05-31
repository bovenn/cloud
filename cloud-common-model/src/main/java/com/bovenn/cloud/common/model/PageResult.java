package com.bovenn.cloud.common.model;

import lombok.Data;

import java.util.List;

/**
* @Description: 统一分页封装
* @author kissy
* @date 2017/10/24 下午4:48
*/
@Data
public class PageResult<T> extends InvokeResult<T>{
    private int pageNum;
    private int pageSize;
    private long total;
    private List<T> pageData;
}