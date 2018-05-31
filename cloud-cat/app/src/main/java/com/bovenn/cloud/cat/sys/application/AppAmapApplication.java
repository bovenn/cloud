package com.bovenn.cloud.cat.sys.application;

import com.bovenn.cloud.cat.facade.vo.AppAmapVO;
import com.bovenn.cloud.cat.sys.domain.AppAmap;
import com.bovenn.cloud.common.model.PageResult;

import java.util.Map;


/**
* 代码生成器自动生成
* Date:2018-5-29 18:03:53
* @author
*/

public interface AppAmapApplication{

    /**
    *创建AppAmap
    */
    public void create(AppAmap entity);

    /**
    *删除AppAmap
    */
    public void delete(Integer[] ids);


    /**
    * 根据Id，更新AppAmap
    */
    public void update(AppAmap entity);

    /**
    * 根据主键ID查询AppAmap
    */
    public AppAmapVO selectDetailById(int id);

    /**
    *查询AppAmap
    */
    public PageResult<AppAmapVO> getPage(Map<String, String> map);
}