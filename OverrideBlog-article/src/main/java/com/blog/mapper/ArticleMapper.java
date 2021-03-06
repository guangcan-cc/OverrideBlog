package com.blog.mapper;

import com.blog.po.TbArticlePO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by keyez on 2017/11/29.
 */
public interface ArticleMapper {

    @Insert({"insert into tb_article(title,content,author,create_time,article_status,status) " +
            "values(#{title},#{content},#{author},#{createTime},#{articleStatus},#{status})"})
    int save(TbArticlePO articlePO);

    @Select({"select * from tb_article"})
    List<TbArticlePO> selectArticleList();
}
