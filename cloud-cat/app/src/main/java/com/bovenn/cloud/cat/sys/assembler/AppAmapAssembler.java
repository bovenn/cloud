package com.bovenn.cloud.cat.sys.assembler;

import com.bovenn.cloud.cat.facade.command.AppAmapCreateCommand;
import com.bovenn.cloud.cat.facade.command.AppAmapUpdateCommand;
import com.bovenn.cloud.cat.sys.domain.AppAmap;

/**
* 代码生成器自动生成
* Date:2018-5-29 18:03:53
* @author
*/
public class AppAmapAssembler{
    public static AppAmap toAppAmap(AppAmapCreateCommand appAmapCreateCommand){
        AppAmap appAmap = new AppAmap();
        /** */
        appAmap.setId(appAmapCreateCommand.getId());
        /** */
        appAmap.setCitycode(appAmapCreateCommand.getCitycode());
        /** */
        appAmap.setAdcode(appAmapCreateCommand.getAdcode());
        /** */
        appAmap.setName(appAmapCreateCommand.getName());
        /** */
        appAmap.setCenter(appAmapCreateCommand.getCenter());
        /** */
        appAmap.setLevel(appAmapCreateCommand.getLevel());
        /** */
        appAmap.setAreacode(appAmapCreateCommand.getAreacode());

        return appAmap;
    }

    public static AppAmap toAppAmap(AppAmapUpdateCommand appAmapUpdateCommand){
        AppAmap appAmap = new AppAmap();
        /** */
        appAmap.setId(appAmapUpdateCommand.getId());
        /** */
        appAmap.setCitycode(appAmapUpdateCommand.getCitycode());
        /** */
        appAmap.setAdcode(appAmapUpdateCommand.getAdcode());
        /** */
        appAmap.setName(appAmapUpdateCommand.getName());
        /** */
        appAmap.setCenter(appAmapUpdateCommand.getCenter());
        /** */
        appAmap.setLevel(appAmapUpdateCommand.getLevel());
        /** */
        appAmap.setAreacode(appAmapUpdateCommand.getAreacode());

        return appAmap;
    }
}