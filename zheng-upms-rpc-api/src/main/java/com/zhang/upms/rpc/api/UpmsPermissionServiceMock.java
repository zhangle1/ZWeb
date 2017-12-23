package com.zhang.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.zhangle.common.base.BaseServiceMock;
import com.zhang.upms.dao.mapper.UpmsPermissionMapper;
import com.zhang.upms.dao.model.UpmsPermission;
import com.zhang.upms.dao.model.UpmsPermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsPermissionService接口
* Created by shuzheng on 2017/12/17.
*/
public class UpmsPermissionServiceMock extends BaseServiceMock<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsPermissionServiceMock.class);


    @Override
    public JSONArray getTreeByRoleId(Integer roleId) {

        LOGGER.info("UpmsPermissionServiceMock => getTreeByRoleId");
        return null;
    }

    @Override
    public JSONArray getTreeByUserId(Integer usereId, Byte type) {

        LOGGER.info("UpmsPermissionServiceMock => getTreeByUserId");
        return null;
    }
}
