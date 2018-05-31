package com.bovenn.cloud.cat.facade.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 代码生成器自动生成
 * Date:2018-5-29 18:03:53
 * @author
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppAmapVO implements Serializable{

    private static final long serialVersionUID = 1L;

    /** */
    private Integer id;
    /** */
    private String citycode;
    /** */
    private Integer adcode;
    /** */
    private String name;
    /** */
    private String center;
    /** */
    private String level;
    /** */
    private String areacode;

    private Date createDate;
    private Date updateDate;
}