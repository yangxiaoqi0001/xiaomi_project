package com.xiaoqi.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoqi.pojo.FirstList;
import com.xiaoqi.pojo.vo.PageVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 第一列表业务层接口
 *
 * @author : yangfan
 * @Date : 2020/7/1
 **/
public interface FirstListService {
    /**
     * 添加第一列表
     *
     * @param firstList
     * @return
     */
    Integer insert(FirstList firstList);

    /**
     * 批量删除第一列表
     *
     * @param ids
     * @return
     */
    Integer delete(List<Long> ids);

    /**
     * 修改第一列表
     *
     * @param firstList
     * @return
     */
    Integer update(FirstList firstList);

    /**
     * 查询第一列表
     *
     * @return
     */
    List<FirstList> getList();

    /**
     * 分页查询第一列表
     *
     * @param pageVo
     * @return
     */
    IPage<FirstList> getPage(PageVo pageVo);
}
