package com.zhang.upms.rpc.api;

import com.zhangle.common.base.BaseServiceMock;
import com.zhang.upms.dao.mapper.UpmsLogMapper;
import com.zhang.upms.dao.model.UpmsLog;
import com.zhang.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by shuzheng on 2017/12/17.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
