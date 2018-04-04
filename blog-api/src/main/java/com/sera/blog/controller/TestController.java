/**
 * File：TestController.java
 * Package：com.sera.blog.controller
 * Author：程金旗<chengjinqi_upc@foxmail.com>
 * Date：2018-03-28 15:44
 * Copyright (C) 2015-2018 sera.com 版权所有
 */
package com.sera.blog.controller;

import com.sera.blog.model.User;
import com.sera.blog.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层api测试
 *
 * @author 程金旗 <chengjinqi_upc@foxmail.com>
 * @created 2018-03-28 15:44
 */
@RestController
@RequestMapping(value = "/hello/api")
public class TestController {
    /**
     * LOG
     */
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);
    /**
     * 自动注入 UserService
     */
    @Autowired
    private UserService userService;

    /**
     * 测试跳转
     *
     * @return String
     */
    @GetMapping("/index")
    public String helloWorld() {
        LOG.debug("test log");
        int i = userService.addUser(new User());
        return "hello world! " + i;
    }

    /**
     * 测试获取用户json
     *
     * @return User
     */
    @GetMapping("/getUserInfo")
    public User getUserInfo() {
        User user = new User();
        user.setId(1L);
        user.setName("chengjinqi");
        user.setPassword("78hjsdhfkjsha9i9");
        userService.addUser(user);
        return user;
    }
}
