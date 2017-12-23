package com.zhang.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.zhangle.common.base.BaseService;
import com.zhang.upms.dao.model.UpmsPermission;
import com.zhang.upms.dao.model.UpmsPermissionExample;

/**
* UpmsPermissionService接口
* Created by shuzheng on 2017/12/17.
*/
public interface UpmsPermissionService extends BaseService<UpmsPermission, UpmsPermissionExample> {

    JSONArray getTreeByRoleId(Integer roleId);

    JSONArray getTreeByUserId(Integer usereId, Byte type);




}