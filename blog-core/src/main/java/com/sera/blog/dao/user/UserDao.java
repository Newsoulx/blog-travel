/**
 * File：UserDao.java
 * Package：com.sera.blog.dao
 * Author：程金旗<chengjinqi@fang.com>
 * Date：2018-03-29 9:53
 * Copyright (C) 2016-2018 Fang.com 版权所有
 */
package com.sera.blog.dao.user;

import com.sera.blog.model.User;

/**
 * 用户管理Dao层
 *
 * @author 程金旗 <chengjinqi@fang.com>
 * @created 2018-03-29 9:53
 */
public interface UserDao {
    /**
     * 新增用户
     *
     * @param user user
     * @return int
     */
    int insertUser(User user);

    /**
     * 获取用户详情
     *
     * @param id id
     * @return User
     */
    User selectUserDetail(Long id);
}
