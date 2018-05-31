package com.bovenn.cloud.cat.facade.api;

import com.bovenn.cloud.cat.facade.command.AppAmapCreateCommand;
import com.bovenn.cloud.cat.facade.command.AppAmapUpdateCommand;
import com.bovenn.cloud.cat.facade.vo.AppAmapVO;
import com.bovenn.cloud.common.model.InvokeResult;
import com.bovenn.cloud.common.model.model.CommonDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;

/**
* 代码生成器自动生成
* Date:2018-5-29 18:03:53
* @author
*/
@Api(value = "AppAmapService", description = "AppAmap相关AIP")
@RequestMapping(value = "appAmap")
public interface AppAmapService{

    /**
    * 创建AppAmap
    * @param command
    * @return
    */
    @PostMapping("create")
    @ApiOperation(value = "根据Id，更新AppAmap", notes = "xxx")
    InvokeResult<AppAmapVO> create(@RequestBody @Valid AppAmapCreateCommand command);

    /**
    * 根据Id，删除AppAmap
    * @return
    */
    @PostMapping("delete")
    @ApiOperation(value = "根据Id，删除AppAmap", notes = "xxx")
    InvokeResult delete(@RequestBody CommonDTO commonDTO);

    /**
    * 根据Id，更新AppAmap
    * @param command
    * @return
    */
    @PostMapping("update")
    @ApiOperation(value = "根据Id，更新AppAmap", notes = "xxx")
    InvokeResult<AppAmapVO> update(@RequestBody @Valid AppAmapUpdateCommand command);

    /**
    * 根据ID获取AppAmap
    * @param id
    * @return
    */
    @GetMapping("getDetailById")
    @ApiOperation(value = "根据ID获取AppAmap", notes = "xxx")
    InvokeResult<AppAmapVO> getDetailById(@RequestParam("id") @NotNull int id);

    /**
    * 查询AppAmap
    * @return
    */
    @GetMapping("getPage")
    @ApiOperation(value = "获取AppAmap列表", notes = "xxx")
    InvokeResult getPage(Map<String, String> map);



}