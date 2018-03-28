/**
 * File：MyBatisConfig.java
 * Package：com.sera.blog.config
 * Author：程金旗<chengjinqi_upc@foxmail.com>
 * Date：2018-03-28 19:27
 * Copyright (C) 2015-2018 sera.com 版权所有
 */
package com.sera.blog.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Mybatis 配置
 *
 * @author 程金旗 <chengjinqi_upc@foxmail.com>
 * @created 2018-03-28 19:27
 */
@Configuration
public class MyBatisConfig {
    /**
     * 当容器里没有指定的 Bean 的情况下创建该对象
     * @param dataSource DataSource
     * @return SqlSessionFactoryBean
     */
    @Bean
    @ConditionalOnMissingBean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);

        // 设置mybatis的主配置文件
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource mybatisConfigXml = resolver.getResource("classpath:mybatis/mybatis-config.xml");
        sqlSessionFactoryBean.setConfigLocation(mybatisConfigXml);

        // 设置mapper映射文件
        Resource[] mapperXml;
        try {
            mapperXml = resolver.getResources("classpath:mybatis/mapper/*.xml");
            sqlSessionFactoryBean.setMapperLocations(mapperXml);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactoryBean;
    }

    /**
     * 当 SqlSessionFactoryBean 实例存在时创建对象
     * @return MapperScannerConfigurer
     */
    @Bean
    @ConditionalOnBean(SqlSessionFactoryBean.class)
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.sera.blog.dao");
        return mapperScannerConfigurer;
    }
}
