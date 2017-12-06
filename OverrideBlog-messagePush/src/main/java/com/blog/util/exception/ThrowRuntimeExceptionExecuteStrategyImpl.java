package com.blog.util.exception;

/**
 * Created by keyez on 2017/12/4.
 */
public class ThrowRuntimeExceptionExecuteStrategyImpl<T extends Throwable> implements JPushMessageExceptionExecuteStrategy<T> {
    @Override
    public Object execute(T e) {
        throw new RuntimeException(e);
    }
}
