/**
 * File：TestController.java
 * Package：com.sera.controller
 * Author：程金旗<chengjinqi@fang.com>
 * Date：2018-03-28 15:44
 * Copyright (C) 2016-2018 Fang.com 版权所有
 */
package com.sera.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层api测试
 *
 * @author 程金旗 <chengjinqi@fang.com>
 * @created 2018-03-28 15:44
 */
@RestController
@RequestMapping(value = "/hello")
public class TestController {
    /**
     * LOG
     */
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    /**
     * 测试跳转
     *
     * @return String
     */
    @GetMapping("/index")
    public String helloWorld() {
        LOG.debug("test log");
        return "hello world!";
    }
}
