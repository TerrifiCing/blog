package com.zmy.blog.entity.enumEntity;

/**
 * @author: zmy
 * @date: 2019/1/15 1:18
 * @function: 角色编码
 */

public enum RoleCode {
    admin("管理员"),

    normal("普通用户");

    private String value;

    private RoleCode(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
