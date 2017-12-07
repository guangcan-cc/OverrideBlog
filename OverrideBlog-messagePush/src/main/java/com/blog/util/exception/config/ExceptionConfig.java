package com.blog.util.exception.config;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import com.blog.util.exception.MessageExceptionExecuteStrategy;
import com.blog.util.exception.ReturnNullExceptionExecuteStrategyImpl;
import com.blog.util.exception.ThrowRuntimeExceptionExecuteStrategyImpl;
import com.blog.util.exception.ThrowsExecuteStrategyImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by keyez on 2017/12/4.
 */
@Configuration
public class ExceptionConfig {

    /**
     * 配置Exception的异常处理策略
     *
     * @return
     */
    @Bean
    public MessageExceptionExecuteStrategy<Exception> exceptionMessageExceptionExecuteStrategy() {
        return new ReturnNullExceptionExecuteStrategyImpl<>();
    }

    /**
     * 配置APIConnectionException的异常处理策略
     *
     * @return
     */
    @Bean
    public MessageExceptionExecuteStrategy<APIConnectionException> apiConnectionExceptionMessageExceptionExecuteStrategy() {
        return new ThrowRuntimeExceptionExecuteStrategyImpl<>();
    }

    /**
     * 配置APIRequestException的异常处理策略
     *
     * @return
     */
    @Bean
    public MessageExceptionExecuteStrategy<APIRequestException> apiRequestExceptionMessageExceptionExecuteStrategy() {
        return new ThrowsExecuteStrategyImpl<>();
    }
}
