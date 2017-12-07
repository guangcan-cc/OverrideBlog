package com.blog.util.exception;

/**
 * 异常处理策略,将异常转为Runtime异常,向外抛
 *
 * @param <T>
 */
public class ThrowRuntimeExceptionExecuteStrategyImpl<T extends Throwable> implements MessageExceptionExecuteStrategy<T> {
    @Override
    public Object execute(T e) {
        throw new RuntimeException(e);
    }
}
