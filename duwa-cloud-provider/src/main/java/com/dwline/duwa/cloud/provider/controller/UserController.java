package com.dwline.duwa.cloud.provider.controller;

import com.dwline.duwa.cloud.provider.entity.User;
import com.dwline.duwa.cloud.provider.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags = "Users")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取所有用户信息", notes = "获取所有用户信息")
    @GetMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = userService.getUsers();
        return users;
    }

}
