package com.bovenn.cloud.cat.sys.rest;

import com.bovenn.cloud.cat.facade.api.AppAmapService;
import com.bovenn.cloud.cat.facade.command.AppAmapCreateCommand;
import com.bovenn.cloud.cat.facade.command.AppAmapUpdateCommand;
import com.bovenn.cloud.cat.facade.vo.AppAmapVO;
import com.bovenn.cloud.cat.sys.application.AppAmapApplication;
import com.bovenn.cloud.cat.sys.assembler.AppAmapAssembler;
import com.bovenn.cloud.cat.sys.domain.AppAmap;
import com.bovenn.cloud.common.model.InvokeResult;
import com.bovenn.cloud.common.model.PageResult;
import com.bovenn.cloud.common.model.model.CommonDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;


/**
* 代码生成器自动生成
* Date:2018-5-29 18:03:53
* @author
*/
@RestController
public class AppAmapController implements AppAmapService {

    @Inject
    private AppAmapApplication application;


    @Override
    public InvokeResult create(@Valid @RequestBody AppAmapCreateCommand command){
        application.create(AppAmapAssembler.toAppAmap(command));
        return InvokeResult.ok();
    }

    @Override
    public InvokeResult delete(@RequestBody CommonDTO commonDTO) {
        application.delete(commonDTO.getIds());
        return InvokeResult.ok();
    }

    @Override
    public InvokeResult<AppAmapVO> update(AppAmapUpdateCommand command) {
        AppAmap appAmap = AppAmapAssembler.toAppAmap(command);
        application.update(appAmap);
        return InvokeResult.ok();
    }

    @Override
    public InvokeResult<AppAmapVO> getDetailById(@RequestParam("id") @NotNull int id) {
        InvokeResult invokeResult;
        AppAmapVO vo = application.selectDetailById(id);
        if (null == vo) {
             invokeResult = InvokeResult.passNoData();
        } else {
             invokeResult = InvokeResult.ok(vo);
        }
        return invokeResult;
    }
    @Override
    public InvokeResult getPage(@RequestParam Map<String, String> map){
        InvokeResult invokeResult = InvokeResult.ok();
        PageResult<AppAmapVO> page= application.getPage(map);
        if (null == page) {
            invokeResult = InvokeResult.passNoData();
        } else {
            invokeResult.setData(page);
        }
        return invokeResult;
    }
}