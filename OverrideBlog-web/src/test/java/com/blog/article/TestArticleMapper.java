package com.blog.article;

import com.blog.base.BaseJunit4Test;
import com.blog.mapper.ArticleMapper;
import com.blog.po.TbArticlePO;
import com.blog.util.PageUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public class TestArticleMapper extends BaseJunit4Test{

//    @Autowired
//    private ArticleMapper articleMapper;
//
//    @Test
//    @Transactional
//    public void testPagehelper() {
//
//        PageInfo<TbArticlePO> pageInfo = PageUtils.getPageInfo(articleMapper::selectArticleList,1,10);
//
//        List<TbArticlePO> list1 = pageInfo.getList();
//
//        List<TbArticlePO> list2 = articleMapper.selectArticleList();
//
//        List<TbArticlePO> list3 = articleMapper.selectArticleList();
//
//
//        System.out.println(list2.size());
//    }
//
//    @Test
//    @Transactional
//    @Rollback(true) //标明使用完此方法后事务不回滚,true时为回滚
//    public void testSave() {
//
//        TbArticlePO po = new TbArticlePO();
//
//        po.setTitle("1中国企业在美获专利数大增：位列全球五大专利国");
//        po.setContent("日前，据彭博社报道，在过去不到10年间，" +
//                "中国企业在美国获得的专利数量翻了十倍。" +
//                "作为世界第二大经济体，中国一直在努力转型，希望从硅谷的工厂变成研究基地。");
//        po.setStatus(1);
//        po.setArticleStatus(1);
//        po.setAuthor(1);
//        po.setCreateTime(new Date());
//
//        articleMapper.save(po);
//
//        LOGGER.debug("执行完成了...");
//    }
//
//    @Test
//    @Transactional
//    @Rollback(false) //标明使用完此方法后事务不回滚,true时为回滚
//    public void testSaveBatch() {
//
//        for(int i = 0; i < 100; i++) {
//            TbArticlePO po = new TbArticlePO();
//
//            po.setTitle("中国企业在美获专利数大增：位列全球五大专利国");
//            po.setContent("日前，据彭博社报道，在过去不到10年间，" +
//                    "中国企业在美国获得的专利数量翻了十倍。" +
//                    "作为世界第二大经济体，中国一直在努力转型，希望从硅谷的工厂变成研究基地。");
//            po.setStatus(1);
//            po.setArticleStatus(1);
//            po.setAuthor(1);
//            po.setCreateTime(new Date());
//
//            articleMapper.save(po);
//        }
//
//
//    }
}
