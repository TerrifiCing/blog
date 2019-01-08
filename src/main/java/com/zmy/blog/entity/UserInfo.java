package com.zmy.blog.entity;

/**
 * @author: zmy
 * @date: 2019/1/8 23:27
 */

public class UserInfo {
    private String id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 盐
     */
    private String salt;

    /**
     * 密码密文
     */
    private String password;
}
