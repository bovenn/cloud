package com.bovenn.cloud.common.model.ddd;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
* @Description: 领域模型抽象模版
* @author kissy
* @date 2017/10/24 下午4:43
*/
@Data
public abstract class AbstractEntity<T> implements com.bovenn.cloud.common.model.ddd.Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fd_id")
    /**主键 */
    private Integer id;
    /**创建时间*/
    @Column(name = "fd_updateDate")
    private Date updateDate;
    /**更新时间*/
    @Column(name = "fd_createDate")
    private Date createDate;
    /**保留字段1*/
    @Column(name = "fd_reserved1")
    private String reserved1;
    /**保留字段2*/
    @Column(name = "fd_reserved2")
    private String reserved2;

    @Transient
    private T repository;

    public T getRepository(Class<T> clazz){
        if(null==repository){
            repository = InstanceFactory.getInstance(clazz);
        }
        return repository;
    }
}
