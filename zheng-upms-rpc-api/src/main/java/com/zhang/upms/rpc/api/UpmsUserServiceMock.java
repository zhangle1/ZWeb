package com.zhang.upms.rpc.api;

import com.zhangle.common.base.BaseServiceMock;
import com.zhang.upms.dao.mapper.UpmsUserMapper;
import com.zhang.upms.dao.model.UpmsUser;
import com.zhang.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by shuzheng on 2017/12/17.
*/
    public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    @Override
    public UpmsUser createUser(UpmsUser upmsUser) {
        return null;
    }
}
