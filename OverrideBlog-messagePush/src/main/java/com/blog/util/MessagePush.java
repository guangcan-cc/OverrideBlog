package com.blog.util;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.PushPayload;
import com.tencent.xinge.XingeApp;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 这个方法主要提供一个公有的推送服务类
 * 本身通过Spring服务注入.实现单例模式.不支持自己创建.
 *
 * @author Flandre#CtChan
 */
@Component
public class MessagePush {
    private static Logger logger = Logger.getLogger(MessagePush.class);

    @Resource
    private JPushClient jPushClient;

    @Resource
    private XingeApp xingeAppIOS;

    @Resource
    private XingeApp xingeAppAndroid;

    /**
     * @param builder
     * @return
     */
    public PushResult pushMesageByjPush(PushPayload.Builder builder) {
        PushPayload pushPayload = builder.build();
        PushResult result = null;
        try {
            result = jPushClient.sendPush(pushPayload);
            return result;
        } catch (APIConnectionException | APIRequestException e) {
            logger.error(e);
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }
}
