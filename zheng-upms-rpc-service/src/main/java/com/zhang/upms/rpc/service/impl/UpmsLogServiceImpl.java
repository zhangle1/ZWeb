package com.zhang.upms.rpc.service.impl;

import com.zhangle.common.annotation.BaseService;
import com.zhangle.common.base.BaseServiceImpl;
import com.zhang.upms.dao.mapper.UpmsLogMapper;
import com.zhang.upms.dao.model.UpmsLog;
import com.zhang.upms.dao.model.UpmsLogExample;
import com.zhang.upms.rpc.api.UpmsLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsLogService实现
* Created by shuzheng on 2017/12/17.
*/
@Service
@Transactional
@BaseService
public class UpmsLogServiceImpl extends BaseServiceImpl<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsLogServiceImpl.class);

    @Autowired
    UpmsLogMapper upmsLogMapper;

}