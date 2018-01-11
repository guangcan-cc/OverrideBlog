package com.blog.web.controller;

import com.blog.service.IArticleService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 文章访问层接口
 *
 * @author Flandre#CtChan
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    IArticleService articleService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object test() {
        return "article/article#GET";
    }

    @RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
    public Object aricleById(@PathVariable("id") Long id) {


        return null;
    }
}
