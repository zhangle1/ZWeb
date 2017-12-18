package com.zhang.upms.server;

import com.zhangle.common.base.BaseInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangle on 2017/12/18.
 */
public class Initialize implements BaseInterface {

    private static final Logger LOGGER = LoggerFactory.getLogger(Initialize.class);

    @Override
    public void init() {
        LOGGER.info(">>>>> 系统初始化");
    }


}
