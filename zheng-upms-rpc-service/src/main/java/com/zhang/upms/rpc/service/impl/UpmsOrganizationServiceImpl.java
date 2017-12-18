package com.zhang.upms.rpc.service.impl;

import com.zhangle.common.annotation.BaseService;
import com.zhangle.common.base.BaseServiceImpl;
import com.zhang.upms.dao.mapper.UpmsOrganizationMapper;
import com.zhang.upms.dao.model.UpmsOrganization;
import com.zhang.upms.dao.model.UpmsOrganizationExample;
import com.zhang.upms.rpc.api.UpmsOrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsOrganizationService实现
* Created by shuzheng on 2017/12/17.
*/
@Service
@Transactional
@BaseService
public class UpmsOrganizationServiceImpl extends BaseServiceImpl<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsOrganizationServiceImpl.class);

    @Autowired
    UpmsOrganizationMapper upmsOrganizationMapper;

}