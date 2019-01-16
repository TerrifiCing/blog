package com.zmy.blog.entity;

import java.util.Date;

/**
 * @author: zmy
 * @date: 2019/1/15 22:57
 * @function: 登录token
 */

public class Token {
    private String id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * token
     */
    private String token;

    /**
     * 有效期至
     */
    private Date expired;

    /**
     * 是否有效
     */
    private boolean isValid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    public boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(boolean valid) {
        isValid = valid;
    }
}
