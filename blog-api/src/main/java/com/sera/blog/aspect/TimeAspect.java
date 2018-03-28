/**
 * File：TimeAspect.java
 * Package：com.sera.blog.aspect
 * Author：程金旗<chengjinqi_upc@foxmail.com>
 * Date：2018-03-28 19:01
 * Copyright (C) 2015-2018 sera.com 版权所有
 */
package com.sera.blog.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 时间相关AOP
 *
 * @author 程金旗 <chengjinqi_upc@foxmail.com>
 * @created 2018-03-28 19:01
 */
@Aspect
@Component
public class TimeAspect {
    /**
     * LOG
     */
    private static final Logger LOG = LoggerFactory.getLogger(TimeAspect.class);

    /**
     * api controller 耗时
     *
     * @param pjp 切点
     * @return Object
     * @throws Throwable 异常
     */
    @Around("execution(* com.sera.blog.controller.TestController..*(..))")
    public Object method(ProceedingJoinPoint pjp) throws Throwable {
        LOG.debug("time aspect start.");

        // 获取当前执行方法
        Signature sig = pjp.getSignature();
        if (!(sig instanceof MethodSignature)) {
            throw new IllegalArgumentException("该注解只能用于方法");
        }
        MethodSignature methodSignature = (MethodSignature) sig;
        Object target = pjp.getTarget();
        Method currentMethod = target.getClass().getMethod(methodSignature.getName(), methodSignature.getParameterTypes());

        long start = System.currentTimeMillis();
        Object object = pjp.proceed();
        LOG.debug("time aspect end. {} time used: {}ms", currentMethod, (System.currentTimeMillis() - start));

        return object;
    }
}
