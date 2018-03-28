/**
 * File：SpringbootApplication.java
 * Package：com.sera.controller.main
 * Author：程金旗<chengjinqi@fang.com>
 * Date：2018-03-28 16:00
 * Copyright (C) 2016-2018 Fang.com 版权所有
 */
package com.sera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目入口
 *
 * @author 程金旗 <chengjinqi@fang.com>
 * @created 2018-03-28 16:00
 */
@SpringBootApplication
public class SpringbootApplication {

    /**
     * 主程序入口
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}