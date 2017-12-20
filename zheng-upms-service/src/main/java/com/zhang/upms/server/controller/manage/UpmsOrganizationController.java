package com.zhang.upms.server.controller.manage;


import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.zhang.upms.common.constant.UpmsResult;
import com.zhang.upms.common.constant.UpmsResultConstant;
import com.zhang.upms.dao.model.UpmsOrganization;
import com.zhang.upms.dao.model.UpmsOrganizationExample;
import com.zhang.upms.rpc.api.UpmsOrganizationService;
import com.zhangle.common.base.BaseController;
import com.zhangle.common.validator.LengthValidator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(value = "组织管理", description = "组织管理")
@RequestMapping("/manage/organization")
public class UpmsOrganizationController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsOrganizationController.class);

    @Autowired
    private UpmsOrganizationService upmsOrganizationService;

    @ApiOperation(value = "组织首页")
    @RequiresPermissions("upms:organization:read")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/manage/organization/index.jsp";
    }


    @ApiOperation(value = "组织列表")
    @RequiresPermissions("upms:organization:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, defaultValue = "", value = "search") String search,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        UpmsOrganizationExample upmsOrganizationExample = new UpmsOrganizationExample();
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            upmsOrganizationExample.setOrderByClause(sort + " " + order);
        }
        if (StringUtils.isNotBlank(search)) {
            upmsOrganizationExample.or()
                    .andNameLike("%" + search + "%");
        }
        List<UpmsOrganization> rows = upmsOrganizationService.selectByExampleForOffsetPage(upmsOrganizationExample, offset, limit);
        long total = upmsOrganizationService.countByExample(upmsOrganizationExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }


    @ApiOperation(value = "新增组织")
    @RequiresPermissions("upms:organization:create")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {
        return "/manage/organization/create.jsp";
    }

    @ApiOperation(value = "新增组织")
    @RequiresPermissions("upms:organization:create")
    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Object create(UpmsOrganization upmsOrganization) {
        ComplexResult result = FluentValidator.checkAll()
                .on(upmsOrganization.getName(), new LengthValidator(1, 20, "名称"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new UpmsResult(UpmsResultConstant.INVALID_LENGTH, result.getErrors());
        }
        long time = System.currentTimeMillis();
        upmsOrganization.setCtime(time);
        int count = upmsOrganizationService.insertSelective(upmsOrganization);
        return new UpmsResult(UpmsResultConstant.SUCCESS, count);
    }



}
