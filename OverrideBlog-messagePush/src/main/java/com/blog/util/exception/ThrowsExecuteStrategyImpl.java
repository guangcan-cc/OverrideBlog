package com.blog.util.exception;

/**
 * 异常处理策略,直接向外抛
 *
 * @param <T>
 */
public class ThrowsExecuteStrategyImpl<T extends Throwable> implements MessageExceptionExecuteStrategy<T> {
    @Override
    public Object execute(T e) throws T {
        throw e;
    }
}
