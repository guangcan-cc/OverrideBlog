package com.blog.util.exception;

import cn.jpush.api.push.model.PushPayload;

/**
 * 消息异常处理策略
 *
 * @param <T>
 */
public interface MessageExceptionExecuteStrategy<T extends Throwable> {

    Object execute(T e) throws T;
}
