package com.blog.util.exception;

import cn.jpush.api.push.model.PushPayload;

/**
 * Created by keyez on 2017/12/4.
 */
public interface JPushMessageExceptionExecuteStrategy<T extends Throwable> {

    Object execute(T e) throws T;
}
