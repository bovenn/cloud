package com.bovenn.cloud.cat.sys.infra;

import com.bovenn.cloud.cat.facade.vo.AppAmapVO;
import com.bovenn.cloud.cat.sys.domain.AppAmap;
import com.bovenn.cloud.core.other.MyBatisBaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
* 代码生成器自动生成
* Date:2018-5-29 18:03:53
* @author
*/
@Mapper
public interface AppAmapRepository extends MyBatisBaseMapper<AppAmap>{

    /**
    * 根据主键ID查询AppAmap
    * @param id
    * @return
    */
    AppAmapVO selectDetailById(int id) ;

    List<AppAmapVO> selectPage(Map<String, String> map);

}