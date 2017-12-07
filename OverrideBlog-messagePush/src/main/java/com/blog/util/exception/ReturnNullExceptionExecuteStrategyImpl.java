package com.blog.util.exception;

/**
 * 异常处理策略,返回空值
 *
 * @param <T>
 */
public class ReturnNullExceptionExecuteStrategyImpl<T extends Throwable> implements MessageExceptionExecuteStrategy<T> {
    @Override
    public Object execute(T e) {
        return null;
    }
}
