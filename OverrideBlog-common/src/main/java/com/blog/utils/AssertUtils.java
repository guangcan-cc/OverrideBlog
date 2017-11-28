package com.blog.utils;

import java.util.Collection;

/**
 * Created by Elvis on 2017/8/30.
 */
public class AssertUtils {

    public static <T> boolean isEmpty(T[] obj) {
        return null == obj || 0 == obj.length;
    }

    public static boolean isEmpty(Object obj) {
        return null == obj || (obj instanceof String ? StringUtils.isNullEmpty((String) obj) : (obj instanceof Number ? false : false));
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }
}
