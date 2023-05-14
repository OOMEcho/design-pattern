package com.framework.utls;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/14 19:43
 * @Description:
 */
public class StringUtils {

    private StringUtils() {
    }

    public static String getSetterMethodName(String fieldName) {
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }
}
