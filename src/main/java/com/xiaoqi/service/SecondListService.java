package com.xiaoqi.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoqi.pojo.SecondList;
import com.xiaoqi.pojo.vo.PageVo;


import java.util.List;

/**
 * 第二列表业务层
 * @author : yangfan
 * @Date : 2020/7/1
 **/
public interface SecondListService {
    /**
     * 添加第二列表
     *
     * @param secondList
     * @return
     */
    Integer insert(SecondList secondList);

    /**
     * 批量删除第二列表
     *
     * @param ids
     * @return
     */
    Integer delete(List<Long> ids);

    /**
     * 修改第二列表
     *
     * @param secondList
     * @return
     */
    Integer update(SecondList secondList);

    /**
     * 查询第二列表
     *
     * @return
     */
    List<SecondList> getList(String firstCode);

    /**
     * 分页查询第二列表
     *
     * @param pageVo
     * @return
     */
    IPage<SecondList> getPage(PageVo pageVo);
}
