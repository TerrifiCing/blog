package com.zmy.blog.entity;

import java.util.Date;

/**
 * @author: zmy
 * @date: 2019/1/15 1:04
 */

public class RoleInfo {
    /**
     * 主键
     */
    private String id;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除
     */
    private boolean isDel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(boolean del) {
        isDel = del;
    }
}
