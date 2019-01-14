package com.zmy.blog.service;

import com.zmy.blog.entity.UserInfo;

import java.util.Map;

/**
 * @author: zmy
 * @date: 2019/1/14 23:38
 */

public interface UserService {
    /**
     * 登录
     */
    Map<String, Object> loginUser(UserInfo userInfo);

    /**
     * 注册
     */
    Map<String, Object> registerUser(UserInfo userInfo);

    /**
     * 查询
     */
    UserInfo getUserInfoById(String id);

    /**
     * 验证
     */
    Map<String, Object> registerValidator(UserInfo userInfo);

    /**
     * 用户名是否存在
     */
    boolean isUserNameExist(String userName);
}
