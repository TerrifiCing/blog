package com.zmy.blog.service.impl;

import com.zmy.blog.dao.TokenDao;
import com.zmy.blog.entity.Token;
import com.zmy.blog.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * @author: zmy
 * @date: 2019/1/16 23:30
 * @function:
 */

@Service
public class TokenServiceImpl implements TokenService {
    @Autowired
    private TokenDao tokenDao;

    /**
     * 新增token
     *
     * @param userId
     */
    @Override
    public Token addLoginToken(String userId) {
        Token token = new Token();
        token.setId(UUID.randomUUID().toString());
        token.setIsValid(true);
        token.setUserId(userId);
        //有效时间10小时
        token.setExpired(new Date(new Date().getTime() + 10*3600*1000));
        token.setToken(token.getId().replaceAll("-",""));

        if(tokenDao.addToken(token) == 1){
            return token;
        }else {
            return null;
        }
    }
}
