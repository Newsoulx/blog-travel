/**
 * File：UserServiceImpl.java
 * Package：com.sera.blog.service.impl
 * Author：程金旗<chengjinqi_upc@foxmail.com>
 * Date：2018-03-29 10:06
 * Copyright (C) 2016-2018 sera.com 版权所有
 */
package com.sera.blog.service.user;

import com.sera.blog.dao.user.UserDao;
import com.sera.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户管理Service实现层
 *
 * @author 程金旗 <chengjinqi_upc@foxmail.com>
 * @created 2018-03-29 10:06
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * 自动注入 UserDao
     */
    @Autowired
    private UserDao userDao;

    /**
     * 新增用户
     *
     * @param user user
     * @return int
     */
    @Override
    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    /**
     * 获取用户详情
     *
     * @param id id
     * @return User
     */
    @Override
    public User getUserDetail(Long id) {
        return userDao.selectUserDetail(id);
    }
}
