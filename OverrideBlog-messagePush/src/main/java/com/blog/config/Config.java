package com.blog.config;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import com.blog.util.exception.JPushMessageExceptionExecuteStrategy;
import com.blog.util.exception.ReturnNullExceptionExecuteStrategyImpl;
import com.blog.util.exception.ThrowRuntimeExceptionExecuteStrategyImpl;
import com.blog.util.exception.ThrowsExecuteStrategyImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by keyez on 2017/12/4.
 */
@Configuration
public class Config {

    @Bean
    public JPushMessageExceptionExecuteStrategy<Exception> exceptionJPushMessageExceptionExecuteStrategy() {
        return new ReturnNullExceptionExecuteStrategyImpl<>();
    }

    @Bean
    public JPushMessageExceptionExecuteStrategy<APIConnectionException> apiConnectionExceptionJPushMessageExceptionExecuteStrategy() {
        return new ThrowRuntimeExceptionExecuteStrategyImpl<>();
    }

    @Bean
    public JPushMessageExceptionExecuteStrategy<APIRequestException> apiRequestExceptionJPushMessageExceptionExecuteStrategy() {
        return new ThrowsExecuteStrategyImpl<>();
    }
}
