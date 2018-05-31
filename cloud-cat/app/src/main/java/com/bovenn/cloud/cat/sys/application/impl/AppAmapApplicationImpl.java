package com.bovenn.cloud.cat.sys.application.impl;

import com.bovenn.cloud.cat.facade.vo.AppAmapVO;
import com.bovenn.cloud.cat.sys.application.AppAmapApplication;
import com.bovenn.cloud.cat.sys.domain.AppAmap;
import com.bovenn.cloud.common.model.PageResult;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Named;
import java.util.Map;


/**
* 代码生成器自动生成
* Date:2018-5-29 18:03:53
* @author
*/
@Named
@Transactional
public class AppAmapApplicationImpl implements AppAmapApplication {

    @Override
    public void create(AppAmap entity){
        entity.create() ;
    }

    @Override
    public void delete(Integer[] ids) {
        for (int i = 0; i < ids.length; i++) {
            int id = ids[i];
            AppAmap entity = new AppAmap(id);
            entity.delById();
        }
    }
    @Override
    public void update(AppAmap entity){
        entity.update() ;
    }

    @Override
    public AppAmapVO selectDetailById(int id) {
        AppAmapVO vo = AppAmap.selectDetailById(id);
        return vo;
    }
    @Override
    public PageResult<AppAmapVO> getPage( Map<String, String> map) {
        return AppAmap.getPage(map);
    }


}