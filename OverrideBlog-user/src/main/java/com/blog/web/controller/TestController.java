package com.blog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {

    @RequestMapping("/test")
    public void test(HttpServletResponse response){

        response.setStatus(404);
    }
}
