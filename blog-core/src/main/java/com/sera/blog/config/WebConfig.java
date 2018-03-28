/**
 * File：WebConfig.java
 * Package：com.sera.blog.config
 * Author：程金旗<chengjinqi_upc@foxmail.com>
 * Date：2018-03-28 18:45
 * Copyright (C) 2015-2018 sera.com 版权所有
 */
package com.sera.blog.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * 配置管理类
 *
 * @author 程金旗 <chengjinqi_upc@foxmail.com>
 * @created 2018-03-28 18:45
 */
@Configuration
public class WebConfig {
    /**
     * fastjson 配置
     *
     * @return HttpMessageConverters
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;
        return new HttpMessageConverters(converter);
    }
}
