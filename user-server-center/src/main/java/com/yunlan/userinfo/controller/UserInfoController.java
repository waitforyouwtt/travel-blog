package com.yunlan.userinfo.controller;

import com.yunlan.common.views.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: luoxian
 * @Date: 2020/7/25 17:42
 * @Email: 15290810931@163.com
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户信息表相关接口",description = "用户信息表相关接口")
public class UserInfoController {

    @ApiOperation(value = "用于测试接口")
    @GetMapping("/ip")
    public Result ip(HttpServletRequest request) {
        String result = request.getRemoteHost().concat(":").concat(request.getRemotePort() + "");
        return Result.success(result);
    }
}
