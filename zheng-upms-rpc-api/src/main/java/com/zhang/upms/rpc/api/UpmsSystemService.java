package com.zhang.upms.rpc.api;

import com.zhangle.common.base.BaseService;
import com.zhang.upms.dao.model.UpmsSystem;
import com.zhang.upms.dao.model.UpmsSystemExample;

/**
* UpmsSystemService接口
* Created by shuzheng on 2017/12/17.
*/
public interface UpmsSystemService extends BaseService<UpmsSystem, UpmsSystemExample> {


    /**
     * 根据name获取UpmsSystem
     * @param name
     * @return
     */
    UpmsSystem selectUpmsSystemByName(String name);

}