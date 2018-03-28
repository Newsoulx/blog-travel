/**
 * File：TestController.java
 * Package：com.sera.blog.controller
 * Author：程金旗<chengjinqi@fang.com>
 * Date：2018-03-28 18:31
 * Copyright (C) 2016-2018 Fang.com 版权所有
 */
package com.sera.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 测试
 *
 * @author 程金旗 <chengjinqi@fang.com>
 * @created 2018-03-28 18:31
 */
@Controller
@RequestMapping(value = "/hello/view")
public class TestController {

    /**
     * 测试页面
     *
     * @param map 参数
     * @return view
     */
    @RequestMapping(value = "/index")
    public String hello(Map<String, Object> map) {
        map.put("msg", "Hello Freemarker!");
        return "index";
    }
}
