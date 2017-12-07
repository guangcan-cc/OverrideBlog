package com.blog.service;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.PushPayload;
import com.blog.util.exception.MessageExceptionExecuteStrategy;
import com.blog.util.exception.ThrowsExecuteStrategyImpl;
import com.blog.util.exception.config.ExceptionConfig;
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
    private static final MessageExceptionExecuteStrategy DEFAULT_EXCEPTION_STRATEGY = new ThrowsExecuteStrategyImpl();
    private static Logger logger = Logger.getLogger(JPushService.class);


    //    @Resource
//    private JPushClient jPushClient;

    /**
     * 异常执行器,会加载{@link #pushMesageByjPush(PushPayload.Builder)}所有JPush的可见异常类型的所有父类异常处理方法;
     * 会根据 异常的最亲父类或者本身进行异常处理策略,框架内的策略有:
     * {@link com.blog.util.exception.ThrowRuntimeExceptionExecuteStrategyImpl}抛出运行时异常
     * {@link com.blog.util.exception.ReturnNullExceptionExecuteStrategyImpl}返回空值
     * {@link com.blog.util.exception.ThrowsExecuteStrategyImpl}将原有异常继续向外抛
     * 如果需要自定义异常,请实现{@link MessageExceptionExecuteStrategy}
     * 并 在 {@link ExceptionConfig}中配置合适的异常级别.
     */
    @Component
    public static class ExceptionExecutor {
        @Autowired(required = false)
        private List<MessageExceptionExecuteStrategy<? super APIConnectionException>> apiConnectionExcetionStrategys;


        @Autowired(required = false)
        private List<MessageExceptionExecuteStrategy<? super APIRequestException>> apiRequestExcetionStrategys;

        public PushResult execute(APIConnectionException e) {
            return null;
        }

        public PushResult execute(APIRequestException e) {
            return null;
        }

        public PushResult execute(Exception e) {
            return null;
        }

    }

    @Resource
    private ExceptionExecutor exceptionExecutor;


    /**
     * 在此方法传入 builder 对象 ,开始进行创建和推送消息.
     * 此方法已经被高度封装,
     * {@link #buildPushLoad(PushPayload.Builder)}方法进行PushPayload的创建,
     * {@link #pushMessage(PushPayload.Builder, PushPayload)}方法通过创建的PushPayload方法进行消息发送
     * {@link ExceptionExecutor#execute(Exception)}方法执行对应的异常处理策略,详见{@link ExceptionExecutor}
     * {@link #finallyExecute(PushPayload.Builder, PushResult)}方法执行最终执行函数.
     * <p>
     * 其中 {@link #buildPushLoad(PushPayload.Builder)} 和 {@link #pushMessage(PushPayload.Builder, PushPayload)} 等 已经被Spring框架切入
     * 如果有需要进行如: 1创建前 参数验证,2.发送前 参数验证 等等行为可以进行切入
     * 详细切入点请见{@link AbstractJPushAspect}
     *
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

    protected void finallyExecute(PushPayload.Builder builder, PushResult result) {
        System.out.println("finallyExecute...finally模块执行...");
    }
}
