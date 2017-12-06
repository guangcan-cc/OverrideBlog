package com.blog.util.exception;

/**
 * Created by keyez on 2017/12/4.
 */
public class ReturnNullExceptionExecuteStrategyImpl<T extends Throwable> implements JPushMessageExceptionExecuteStrategy<T> {
    @Override
    public Object execute(T e) {
        return null;
    }
}
