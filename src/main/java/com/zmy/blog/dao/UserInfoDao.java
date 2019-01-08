package com.zmy.blog.dao;

import com.zmy.blog.entity.UserInfo;

/**
 * @author: zmy
 * @date: 2019/1/8 23:27
 */

public interface UserInfoDao {
    /**
     * 查询
     */
    UserInfo getUserInfoById(String id);
}
