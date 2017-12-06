package com.blog.web.controller;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import com.blog.service.JPushService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @author Flandre#CtChan
 */
@Controller
@RequestMapping("/ctchan")
public class CtChanController {
    @Resource
    JPushService jPushService;


    @RequestMapping(value = "test", method = RequestMethod.GET)
    public Object test() {
        return "OK";
    }

    @RequestMapping(value = "test2", method = RequestMethod.GET)
    public Object testAutowareMap() throws APIConnectionException, APIRequestException {
        jPushService.pushMesageByjPush(null);
        return "OK";
    }

}



