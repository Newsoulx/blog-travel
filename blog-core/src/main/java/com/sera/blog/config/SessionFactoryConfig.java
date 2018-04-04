/**
 * File：SessionFactoryConfig.java
 * Package：com.sera.blog.config
 * Author：程金旗<chengjiniqi_upc@foxmail.com>
 * Date：2018-04-04 18:13
 * Copyright (C) 2016-2018 sera.com 版权所有
 */
package com.sera.blog.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Session Factory配置
 *
 * @author 程金旗 <chengjiniqi_upc@foxmail.com>
 * @created 2018-04-04 18:13
 */
@Configuration
@Mapper
public class SessionFactoryConfig {
    /**
     * mybatis配置路径
     */
    private static final String MYBATIS_CONFIG = "mybatis/mybatis-config.xml";
    /**
     * mapper文件路径
     */
    private static final String MAPPER_PATH = "mybatis/mapper/**.xml";
    /**
     * 实体路径
     */
    private static final String TYPE_ALIAS_PACKAGE = "com.sera.blog.model";

    /**
     * 自动注入数据源
     */
    @Qualifier("dataSource")
    @Autowired
    private DataSource dataSource;

    /**
     * 创建sql session factory 实例
     *
     * @return SqlSessionFactoryBean
     * @throws IOException IO异常
     */
    @Bean
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(MYBATIS_CONFIG));
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + MAPPER_PATH;
        sqlSessionFactoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources(packageSearchPath));
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(TYPE_ALIAS_PACKAGE);
        return sqlSessionFactoryBean;
    }
}
