package com.blog.util;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 分页通用方法:使用前保证项目为Mybatis项目,PageHelper 拦截器已经注入 mybatis 中.
 *
 * @author Flandre#CtChan
 */
public class PageUtils {

    /**
     * 执行业务方法并获取分页信息(包括分页数,类型总数,页数等等)
     *
     * @param select 需要执行的业务方法
     * @param pageNum  页数
     * @param pageSize 分页大小
     * @param <T>      返回的实体对象类型
     * @retur
     */
    public static <T> PageInfo<T> getPageInfo(ISelect select, final Integer pageNum, final Integer pageSize) {
        return PageHelper.startPage(pageNum, pageSize, true).doSelectPageInfo(select);
    }

    /**
     * 执行业务方法并获取分页(只包括分页后的数据)
     *
     * @param select 需要执行的业务方法
     * @param pageNum  页数
     * @param pageSize 分页大小
     * @param <T>      返回的实体对象类型
     * @retur
     */
    public static <T> Page<T> getPage(ISelect select, final Integer pageNum, final Integer pageSize) {
        return PageHelper.startPage(pageNum, pageSize, false).doSelectPage(select);
    }
}
