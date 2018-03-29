/**
 * File：User.java
 * Package：com.sera.blog.model
 * Author：程金旗<chengjinqi_upc@foxmail.com>
 * Date：2018-03-28 18:48
 * Copyright (C) 2015-2018 sera.com 版权所有
 */
package com.sera.blog.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 *
 * @author 程金旗 <chengjinqi_upc@foxmail.com>
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
    private Long id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 加密密码
     */
    private String password;
    /**
     * 是否删除：0 否 1 是
     */
    private Byte deleted;
    /**
     * 创建人
     */
    private String createuser;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 更新人
     */
    private String updateuser;
    /**
     * 更新时间
     */
    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", deleted=").append(deleted);
        sb.append(", createuser='").append(createuser).append('\'');
        sb.append(", createtime=").append(createtime);
        sb.append(", updateuser='").append(updateuser).append('\'');
        sb.append(", updatetime=").append(updatetime);
        sb.append('}');
        return sb.toString();
    }
}
