package com.bovenn.cloud.cat.sys.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.bovenn.cloud.cat.facade.vo.AppAmapVO;
import com.bovenn.cloud.cat.sys.infra.AppAmapRepository;
import com.bovenn.cloud.common.model.PageResult;
import com.bovenn.cloud.common.model.ddd.AbstractEntity;
import com.bovenn.cloud.common.model.ddd.InstanceFactory;
import lombok.Data;
import org.apache.commons.lang.StringUtils;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Map;

/**
 * 代码生成器自动生成
 * Date:2018-5-29 18:03:53
 * @author
 */
@Data
@Table(name = "sys_app_amap")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppAmap extends AbstractEntity<AppAmapRepository> implements Serializable{

    private static final long serialVersionUID = 1L;

    /** */
    @Column(name = "fd_citycode")
    private String citycode;
    /** */
    @Column(name = "fd_adcode")
    private Integer adcode;
    /** */
    @Column(name = "fd_name")
    private String name;
    /** */
    @Column(name = "fd_center")
    private String center;
    /** */
    @Column(name = "fd_level")
    private String level;
    /** */
    @Column(name = "fd_areacode")
    private String areacode;

    public AppAmap(){}

    public AppAmap(Integer id){setId(id);}

    @Override
    public Serializable getKey() {
        return getId();
    }

    @Override
    public boolean existed() {
        return false;
    }

    public boolean existedByX() {
        Example example = new Example(AppAmap.class);
        example.createCriteria().andEqualTo("id", this.getId());
        int count = getAppAmapRepository().selectCountByExample(example);
        return count > 0;
    }




    private static AppAmapRepository appAmapRepository;
    public static AppAmapRepository getAppAmapRepository(){
        if(null==appAmapRepository){
            appAmapRepository = InstanceFactory.getInstance(AppAmapRepository.class);
        }
        return appAmapRepository;
    }

    /**
    *增加AppAmap
    * @param
    * @return
    */
    public void create() {
        getAppAmapRepository().insertSelective(this);
    }
    /**
    *删除AppAmap
    * @param
    * @return
    */
    public void delById() {
        getAppAmapRepository().deleteByPrimaryKey(this);
    }
    /**
    * 根据Id，更新AppAmap
    * @param
    * @return
    */
    public void update() {
        getAppAmapRepository().updateByPrimaryKeySelective(this);
    }
    /**
    * 根据主键ID查询AppAmap
    * @param id
    * @return
    */
    public static AppAmapVO selectDetailById(int id) {
        AppAmapVO vo = getAppAmapRepository().selectDetailById(id);
        return vo;
    }

    public static PageResult<AppAmapVO> getPage(Map<String, String> map ) {
        PageResult<AppAmapVO> page=new PageResult<>();
        int pageNum=1;
        int pageSize=10;
        if (!StringUtils.isEmpty(map.get("pageNum"))){
            pageNum=Integer.parseInt(map.get("pageNum"));
        }
        if (!StringUtils.isEmpty(map.get("pageSize"))){
            pageSize=Integer.parseInt(map.get("pageSize"));
        }
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<AppAmapVO> pageInfo = new PageInfo<AppAmapVO>(getAppAmapRepository().selectPage(map));
        page.setTotal(pageInfo.getTotal());
        page.setPageData(pageInfo.getList());
        page.setPageSize(pageSize);
        page.setPageNum(pageNum);
        return page;
    }


}