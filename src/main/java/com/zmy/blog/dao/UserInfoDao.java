package com.zmy.blog.dao;

import com.zmy.blog.entity.UserInfo;

/**
 * @author: zmy
 * @date: 2019/1/8 23:27
 */

public interface UserInfoDao {
    /**
     * 新增
     */
    int addUserInfo(UserInfo userInfo);

    /**
     * 查询
     */
    UserInfo getUserInfoById(String id);

    /***
     * 登录
     */
    UserInfo loginUser(UserInfo userInfo);

    /**
     * 用户名是否存在
     */
    int isUserNameExist(String userName);
}
