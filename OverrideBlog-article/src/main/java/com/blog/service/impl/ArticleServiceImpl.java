package com.blog.service.impl;

import com.blog.mapper.IArticleDao;
import com.blog.service.IArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Flandre#CtChan
 */
@Service("articleService")
public class ArticleServiceImpl implements IArticleService {

    @Resource
    private IArticleDao articleDao;

}
