package com.zmy.blog.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @author: zmy
 * @date: 2019/1/10 1:06
 */

@WebServlet(urlPatterns = "/druid/*", initParams = {
        @WebInitParam(name = "allow", value = ""),
        @WebInitParam(name = "loginUsername", value = "zmy"),
        @WebInitParam(name = "loginPassword", value = "123456"),
})
public class DruidServlet extends StatViewServlet {
}
