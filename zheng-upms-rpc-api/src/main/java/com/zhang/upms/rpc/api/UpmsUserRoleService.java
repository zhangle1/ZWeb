package com.zhang.upms.rpc.api;

import com.zhangle.common.base.BaseService;
import com.zhang.upms.dao.model.UpmsUserRole;
import com.zhang.upms.dao.model.UpmsUserRoleExample;

/**
* UpmsUserRoleService接口
* Created by shuzheng on 2017/12/17.
*/
public interface UpmsUserRoleService extends BaseService<UpmsUserRole, UpmsUserRoleExample> {

    /**
     * 用户角色
     * @param roleIds 角色ids
     * @param id 用户id
     * @return
     */
    int role(String[] roleIds, int id);



}