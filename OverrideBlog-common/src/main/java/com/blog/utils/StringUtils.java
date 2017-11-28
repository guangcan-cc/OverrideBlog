package com.blog.utils;

/**
 * Created by Elvis on 2017/8/30.
 */
public class StringUtils {

    public static boolean isNullEmpty(String text) {
        return null == text || 0 == text.trim().length();
    }
}
