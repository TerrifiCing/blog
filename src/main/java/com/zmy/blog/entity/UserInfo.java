package com.zmy.blog.entity;

import java.util.Date;

/**
 * @author: zmy
 * @date: 2019/1/8 23:27
 */

public class UserInfo {
    private String id;

    /**
     * 用户名 4-20
     */
    private String userName;

    /**
     * 昵称 1-20
     */
    private String nickName;

    /**
     * 头像 255
     */
    private String headPic;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 盐 5
     */
    private String salt;

    /**
     * 密码(传进来是明文，存密文)
     */
    private String password;

    /**
     * 创建日期
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
