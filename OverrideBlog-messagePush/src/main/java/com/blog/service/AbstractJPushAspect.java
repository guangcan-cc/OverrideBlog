package com.blog.service;

import cn.jpush.api.push.model.PushPayload;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 这个方法主要提供一个公有的推送服务类
 * 本身通过Spring服务注入.实现单例模式.不支持自己创建.
 *
 * @author Flandre#CtChan
 */
@Aspect
@Component
public abstract class AbstractJPushAspect {
    private static Logger logger = Logger.getLogger(AbstractJPushAspect.class);

    @Pointcut(value = "execution(protected cn.jpush.api.push.model.PushPayload com.blog.service.JPushService.buildPushLoad(builder))")
    public void buildPushLoadAspect(PushPayload.Builder builder) {
    }

    @Pointcut(value = "execution(protected cn.jpush.api.push.model.PushPayload com.blog.service.JPushService.pushMessage(builder,pushPayload))")
    public void pushMessageAspect(PushPayload.Builder builder, PushPayload pushPayload) {

    }

    @Pointcut(value = "execution(protected cn.jpush.api.push.model.PushPayload com.blog.service.JPushService.pushMesageByjPush(builder) )")
    public void pushMessageByJPushAspect(PushPayload.Builder builder) {

    }
}
