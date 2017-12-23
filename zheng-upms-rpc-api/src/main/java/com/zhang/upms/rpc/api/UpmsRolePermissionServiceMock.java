package com.zhang.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.zhangle.common.base.BaseServiceMock;
import com.zhang.upms.dao.mapper.UpmsRolePermissionMapper;
import com.zhang.upms.dao.model.UpmsRolePermission;
import com.zhang.upms.dao.model.UpmsRolePermissionExample;

/**
* 降级实现UpmsRolePermissionService接口
* Created by shuzheng on 2017/12/17.
*/
public class UpmsRolePermissionServiceMock extends BaseServiceMock<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {

    @Override
    public int rolePermission(JSONArray datas, int id) {
        return 0;
    }
}
