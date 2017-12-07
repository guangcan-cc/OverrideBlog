package com.blog.util;

import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.SMS;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;

/**
 * 推送 Builder 创建工厂
 * 通过创建 这里提供一些 常用的推送Builder
 * 此处获得的Builder建议在 {@link com.blog.service.JPushService#pushMesageByjPush(PushPayload.Builder)}
 * 中调用.具体原因请查看{@link com.blog.service.JPushService#pushMesageByjPush(PushPayload.Builder)}
 */
public class JPushBuilderFactory {
    private static PushPayload.Builder allBuilder() {
        return new PushPayload.Builder()
                .setPlatform(Platform.all())
                .setAudience(Audience.all());

    }

    private static PushPayload.Builder alertAllBuilder(String alert) {
        return allBuilder().setNotification(Notification.alert(alert));
    }

    public static PushPayload.Builder alertAllBuilder(String alert, SMS sms) {
        return alertAllBuilder(alert).setSMS(sms);
    }

    public static PushPayload.Builder messageAll(String msgContent) {
        return allBuilder().setMessage(Message.content(msgContent));
    }

    public static PushPayload.Builder messageAll(String msgContent, SMS sms) {
        return allBuilder().setMessage(Message.content(msgContent)).setSMS(sms);
    }

}
