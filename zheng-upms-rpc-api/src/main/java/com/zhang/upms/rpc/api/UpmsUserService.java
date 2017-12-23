package com.zhang.upms.rpc.api;

import com.zhangle.common.base.BaseService;
import com.zhang.upms.dao.model.UpmsUser;
import com.zhang.upms.dao.model.UpmsUserExample;

/**
* UpmsUserService接口
* Created by shuzheng on 2017/12/17.
*/
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {

    UpmsUser createUser(UpmsUser upmsUser);


}