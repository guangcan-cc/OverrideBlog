package com.blog.web.controller;

import com.blog.exception.NonePrintException;
import com.blog.service.IUserService;
import com.blog.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/register")
    public Map<String, Object> register(UserInfoVO userInfoVO){

        Map<String, Object> resultMap = new HashMap<>();

        try {
            userService.register(userInfoVO);
            resultMap.put("code","0");
            resultMap.put("msg","注册成功");
        } catch (NonePrintException e) {
            resultMap.put("code","1");
            resultMap.put("msg","注册失败");
        }

        return resultMap;
    }

    @RequestMapping("/login")
    public void login(){

    }
}
