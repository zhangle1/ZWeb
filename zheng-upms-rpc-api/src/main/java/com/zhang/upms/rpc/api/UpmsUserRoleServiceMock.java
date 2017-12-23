package com.zhang.upms.rpc.api;

import com.zhangle.common.base.BaseServiceMock;
import com.zhang.upms.dao.mapper.UpmsUserRoleMapper;
import com.zhang.upms.dao.model.UpmsUserRole;
import com.zhang.upms.dao.model.UpmsUserRoleExample;

/**
* 降级实现UpmsUserRoleService接口
* Created by shuzheng on 2017/12/17.
*/
public class UpmsUserRoleServiceMock extends BaseServiceMock<UpmsUserRoleMapper, UpmsUserRole, UpmsUserRoleExample> implements UpmsUserRoleService {

    @Override
    public int role(String[] roleIds, int id) {
        return 0;
    }
}
