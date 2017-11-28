package com.ctchan.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by keyez on 2017/11/28.
 */
@RestController
@RequestMapping("/ctchan")
public class CtChanController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object test() {
        System.out.println("test controller");
        return "into test controller,GET";
    }
}
