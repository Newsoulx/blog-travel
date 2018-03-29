/**
 * File：UserService.java
 * Package：com.sera.blog.service.impl
 * Author：程金旗<chengjinqi@fang.com>
 * Date：2018-03-29 10:04
 * Copyright (C) 2016-2018 Fang.com 版权所有
 */
package com.sera.blog.service.user;

import com.sera.blog.model.User;

/**
 * 用户管理Service接口层
 *
 * @author 程金旗 <chengjinqi@fang.com>
 * @created 2018-03-29 10:04
 */
public interface UserService {
    /**
     * 新增用户
     *
     * @param user user
     * @return int
     */
    int addUser(User user);

    /**
     * 获取用户详情
     *
     * @param id id
     * @return User
     */
    User getUserDetail(Long id);
}
