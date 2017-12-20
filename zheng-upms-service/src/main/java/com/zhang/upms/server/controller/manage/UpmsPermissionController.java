package com.zhang.upms.server.controller.manage;


import com.zhang.upms.rpc.api.UpmsApiService;
import com.zhang.upms.rpc.api.UpmsPermissionService;
import com.zhang.upms.rpc.api.UpmsSystemService;
import com.zhangle.common.base.BaseController;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(value = "权限管理", description = "权限管理")
@RequestMapping("/manage/permission")
public class UpmsPermissionController  extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsPermissionController.class);

    @Autowired
    private UpmsPermissionService upmsPermissionService;

    @Autowired
    private UpmsSystemService upmsSystemService;

    @Autowired
    private UpmsApiService upmsApiService;


}
