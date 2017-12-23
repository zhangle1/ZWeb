package com.zhang.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.zhangle.common.base.BaseServiceMock;
import com.zhang.upms.dao.mapper.UpmsUserPermissionMapper;
import com.zhang.upms.dao.model.UpmsUserPermission;
import com.zhang.upms.dao.model.UpmsUserPermissionExample;

/**
* 降级实现UpmsUserPermissionService接口
* Created by shuzheng on 2017/12/17.
*/
public class UpmsUserPermissionServiceMock extends BaseServiceMock<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {

    @Override
    public int permission(JSONArray datas, int id) {
        return 0;
    }
}
