package com.zhang.upms.rpc.service.impl;

import com.zhangle.common.annotation.BaseService;
import com.zhangle.common.base.BaseServiceImpl;
import com.zhang.upms.dao.mapper.UpmsRolePermissionMapper;
import com.zhang.upms.dao.model.UpmsRolePermission;
import com.zhang.upms.dao.model.UpmsRolePermissionExample;
import com.zhang.upms.rpc.api.UpmsRolePermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsRolePermissionService实现
* Created by shuzheng on 2017/12/17.
*/
@Service
@Transactional
@BaseService
public class UpmsRolePermissionServiceImpl extends BaseServiceImpl<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsRolePermissionServiceImpl.class);

    @Autowired
    UpmsRolePermissionMapper upmsRolePermissionMapper;

}