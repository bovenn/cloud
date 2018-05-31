package com.bovenn.cloud.cat.facade.command;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 代码生成器自动生成
 * Date:2018-5-29 18:03:53
 * @author
 */
@Data
public class AppAmapCreateCommand implements Serializable{

    /** */
    @NotNull(message = "不能为空")
    private Integer id;
    /** */
    @NotBlank(message = "不能为空")
    @Length(max = 10,message = "不能超过10位")
    private String citycode;
    /** */
    @NotNull(message = "不能为空")
    private Integer adcode;
    /** */
    @NotBlank(message = "不能为空")
    @Length(max = 20,message = "不能超过20位")
    private String name;
    /** */
    @NotBlank(message = "不能为空")
    @Length(max = 50,message = "不能超过50位")
    private String center;
    /** */
    @NotBlank(message = "不能为空")
    @Length(max = 10,message = "不能超过10位")
    private String level;
    /** */
    @NotBlank(message = "不能为空")
    @Length(max = 20,message = "不能超过20位")
    private String areacode;

}