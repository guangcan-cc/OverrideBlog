package com.blog.utils;

import java.lang.reflect.Executable;

/**
 * Created by Elvis on 2017/8/30.
 */
public class CtChanUtils {
    public interface Executable {
        void execute(Class currentClass);
    }

    public static void bubbleExecuteSuperClass(Class<?> clazz, Executable executable) {
        Class<?> superClass = clazz.getSuperclass();
        if (superClass != null) {
            executable.execute(superClass);
            bubbleExecuteSuperClass(superClass, executable);
        }
    }

}
