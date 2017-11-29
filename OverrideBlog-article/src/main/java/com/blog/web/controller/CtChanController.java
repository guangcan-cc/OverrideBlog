package com.blog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by keyez on 2017/11/29.
 */
@Controller
@RequestMapping("/ctchan")
public class CtChanController {
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public Object test() {
        return "OK";
    }

}



