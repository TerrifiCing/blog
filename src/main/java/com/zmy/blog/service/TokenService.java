package com.zmy.blog.service;

import com.zmy.blog.entity.Token;

/**
 * @author: zmy
 * @date: 2019/1/16 23:28
 * @function:
 */

public interface TokenService {
    /**
     * 新增token
     */
    Token addLoginToken(String userId);
}
