package com.zmy.blog.dao;

import com.zmy.blog.entity.RoleInfo;

/**
 * @author: zmy
 * @date: 2019/1/15 1:06
 */

/**
 * 角色不做太复杂了，和用户一对一
 */
public interface RoleInfoDao {
    /**
     * 新增角色
     */
    int addRoleInfo(RoleInfo roleInfo);

    /**
     * 查询
     */
    RoleInfo getRoleInfoById(String id);

    /**
     * 编码查询
     */
    RoleInfo getRoleInfoByRoleCode(String roleCode);
}
