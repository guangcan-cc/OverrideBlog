package com.blog.web.controller;

import com.blog.vo.UserInfoVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/register")
    public void register(UserInfoVO userInfoVO){

    }
}
