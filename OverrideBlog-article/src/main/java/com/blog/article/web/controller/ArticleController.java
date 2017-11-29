package com.blog.article.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章访问层接口
 *
 * @author Flandre#CtChan
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public Object test() {
        return "article/test#GET";
    }
}
