/**
 * File：User.java
 * Package：com.sera.blog.model
 * Author：程金旗<chengjinqi@fang.com>
 * Date：2018-03-28 18:48
 * Copyright (C) 2016-2018 Fang.com 版权所有
 */
package com.sera.blog.model;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author 程金旗 <chengjinqi@fang.com>
 * @created 2018-03-28 18:48
 */
public class User implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = -7032845662935171712L;
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 加密密码
     */
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
