package com.zmy.blog.util;

import java.util.List;

/**
 * @author: zmy
 * @date: 2019/1/15 0:34
 */

public class ValidatorUtil {
    /**
     * 非空验证
     */
    public static boolean isEmpty(Object object){
        return object == null;
    }

    /**
     * 非空验证
     */
    public static boolean isEmpty(String string){
        return string == null || "".equals(string.trim());
    }

    /**
     * 非空验证
     */
    public static boolean isEmpty(List<?> list){
        return list == null || list.size() == 0;
    }

    /**
     * 字符串长度
     */
    public static boolean isLengthValid(String string, int min, int max){
        if(string == null){
            return true;
        }
        return string.length() < max && string.length() > min;
    }

    /**
     * 数字大小
     */
    public static boolean isSizeValid(int number, int min, int max){
        return number < max && number > min;
    }
}
