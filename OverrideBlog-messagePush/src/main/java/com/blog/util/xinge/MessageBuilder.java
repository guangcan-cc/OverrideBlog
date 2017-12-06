package com.blog.util.xinge;


import com.tencent.xinge.ClickAction;
import com.tencent.xinge.Message;
import com.tencent.xinge.TimeInterval;

/**
 * Created by keyez on 2017/12/1.
 */
public class MessageBuilder {
    protected Message message;


    public MessageBuilder() {
        message = new Message();
        message.setAction(new ClickAction());

    }

}
