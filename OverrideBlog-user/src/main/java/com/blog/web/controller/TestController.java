package com.blog.web.controller;

import com.blog.service.IUserService;
import com.blog.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private UserInfoVO userInfoVO = new UserInfoVO();

    @Autowired
    private IUserService userService;

    @RequestMapping("/test1")
    public String test1(){

        userInfoVO.setId(1L);

        System.out.println(userService);

        System.out.println("修改... ");
        return "hello 修改test1!";
    }

    @RequestMapping("/test2")
    public String test2(){

        userInfoVO.setId(2L);

        System.out.println("修改... ");
        return "hello 修改test2!";
    }
}
