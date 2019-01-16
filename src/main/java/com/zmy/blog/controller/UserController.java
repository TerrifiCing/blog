package com.zmy.blog.controller;

import com.zmy.blog.entity.Token;
import com.zmy.blog.entity.UserInfo;
import com.zmy.blog.entity.enumEntity.Msg;
import com.zmy.blog.entity.model.Response;
import com.zmy.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author: zmy
 * @date: 2019/1/15 1:37
 * @function:
 */

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 登录
     */
    @PostMapping("/login")
    public Response login(@RequestBody UserInfo userInfo, HttpServletResponse response){
        Map<String, Object> result = userService.loginUser(userInfo);

        if((boolean) result.get("result")){
            //cookie加入token
            Cookie cookie = new Cookie("token", (String)result.get("token"));
            cookie.setPath("/");
            response.addCookie(cookie);
        }
        return new Response((boolean)result.get("result"), (String)result.get("msg"));
    }
}
