package com.zhang.upms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhangle on 2017/12/17.
 */
public class ZhengUpmsRpcServiceApplication {


    private static final Logger LOGGER = LoggerFactory.getLogger(ZhengUpmsRpcServiceApplication.class);

    public static void main(String[] args) {
        LOGGER.info(">>>>> zheng-upms-rpc-service 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
        LOGGER.info(">>>>> zheng-upms-rpc-service 启动完成 <<<<<");


//				LOGGER.info(AESUtil.aesDecode("qRyobzXW+4ipIuir28YmEg=="));



    }

}
