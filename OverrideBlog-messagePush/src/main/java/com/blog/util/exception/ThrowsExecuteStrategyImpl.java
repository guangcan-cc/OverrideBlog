package com.blog.util.exception;

/**
 * Created by keyez on 2017/12/4.
 */
public class ThrowsExecuteStrategyImpl<T extends Throwable> implements JPushMessageExceptionExecuteStrategy<T> {
    @Override
    public Object execute(T e) throws T {
        throw e;
    }
}
