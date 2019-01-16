package com.zmy.blog.entity.enumEntity;

/**
 * @author: zmy
 * @date: 2019/1/17 0:33
 * @function:
 */

public enum Msg {
    login_success("登录成功");

    private String value;

    private Msg(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
