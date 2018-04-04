/**
 * File：MybatisConfig.java
 * Package：com.sera.blog.config
 * Author：程金旗<chengjiniqi_upc@foxmail.com>
 * Date：2018-04-04 18:11
 * Copyright (C) 2016-2018 sera.com 版权所有
 */
package com.sera.blog.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置
 *
 * @author 程金旗 <chengjiniqi_upc@foxmail.com>
 * @created 2018-04-04 18:11
 */
@Configuration
@MapperScan("com.sera.blog.dao")
public class MybatisConfig {
}
