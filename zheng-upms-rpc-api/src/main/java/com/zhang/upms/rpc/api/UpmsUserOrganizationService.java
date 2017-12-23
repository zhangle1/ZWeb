package com.zhang.upms.rpc.api;

import com.zhangle.common.base.BaseService;
import com.zhang.upms.dao.model.UpmsUserOrganization;
import com.zhang.upms.dao.model.UpmsUserOrganizationExample;

/**
* UpmsUserOrganizationService接口
* Created by shuzheng on 2017/12/17.
*/
public interface UpmsUserOrganizationService extends BaseService<UpmsUserOrganization, UpmsUserOrganizationExample> {

    /**
     * 用户组织
     * @param organizationIds 组织ids
     * @param id 用户id
     * @return
     */
    int organization(String[] organizationIds, int id);



}