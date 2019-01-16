package com.zmy.blog.dao;

import com.zmy.blog.entity.Token;

/**
 * @author: zmy
 * @date: 2019/1/16 23:20
 * @function:
 */

public interface TokenDao {
    /**
     * 新增
     */
    int addToken(Token token);

    /**
     * 查询
     */
    Token getTokenByToken(String token);

    /**
     * 更改状态
     */
    int updateTokenStatus(String token, boolean status);
}
