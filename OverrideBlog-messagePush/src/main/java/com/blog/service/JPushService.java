package com.blog.service;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.PushPayload;
import com.blog.util.exception.JPushMessageExceptionExecuteStrategy;
import com.blog.util.exception.ThrowsExecuteStrategyImpl;
import com.blog.utils.CtChanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 这个方法主要提供一个公有的推送服务类
 * 本身通过Spring服务注入.实现单例模式.不支持自己创建.
 *
 * @author Flandre#CtChan
 */
@Service
public class JPushService {
    private static final JPushMessageExceptionExecuteStrategy DEFAULT_EXCEPTION_STRATEGY = new ThrowsExecuteStrategyImpl();
    private static Logger logger = Logger.getLogger(JPushService.class);


    //    @Resource
//    private JPushClient jPushClient;
    @Component
    public static class ExceptionExecutor {
        @Autowired(required = false)
        private List<JPushMessageExceptionExecuteStrategy<? super APIConnectionException>> apiConnectionExcetionStrategys;


        @Autowired(required = false)
        private List<JPushMessageExceptionExecuteStrategy<? super APIRequestException>> apiRequestExcetionStrategys;

        public PushResult execute(APIConnectionException e) {


            return null;
        }

        public PushResult execute(APIRequestException e) {

            return null;
        }

        public PushResult execute(Exception e) {

            CtChanUtils.bubbleExecuteSuperClass(e.getClass(), (supperClass) -> {

            });

            return null;
        }

    }

    @Resource
    private ExceptionExecutor exceptionExecutor;


    /**
     * @param builder
     * @return
     */
    public PushResult pushMesageByjPush(PushPayload.Builder builder) throws APIConnectionException, APIRequestException {
        PushPayload pushPayload = buildPushLoad(builder);
        PushResult result = null;
        try {
            result = pushMessage(builder, pushPayload);
            return result;
        } catch (/*APIConnectionException | APIRequest*/Exception e) {
            return exceptionExecutor.execute(e);
        } finally {
            finallyExecute(builder, result);
        }
    }

    protected PushPayload buildPushLoad(PushPayload.Builder builder) {
//        return builder.build();
        System.out.println("builderPushLoad...创建发送体");
        return null;
    }

    protected PushResult pushMessage(PushPayload.Builder builder, PushPayload pushPayload) throws APIConnectionException, APIRequestException {
//        return jPushClient.sendPush(pushPayload);
        System.out.println("pushMessage...发送消息");
        throw new APIConnectionException("异常测试", new Exception());
    }

    protected <T extends Exception> PushResult exceptionReturnStrategy(T e) {
        System.out.println("exceptionReturnStrategy...异常处理:");
        e.printStackTrace();
        return null;

    }

    protected void finallyExecute(PushPayload.Builder builder, PushResult result) {
        System.out.println("finallyExecute...finally模块执行...");
    }
}
