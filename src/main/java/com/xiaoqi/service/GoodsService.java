package com.xiaoqi.service;

import com.xiaoqi.pojo.Goods;

import java.util.List;

/**
 * 商品类 业务层接口
 *
 * @author : yangfan
 * @Date : 2020/7/2
 **/
public interface GoodsService {
    /**
     * 添加商品
     * @param goods
     * @return
     */
    Integer insert(Goods goods);

    /**
     * 根据id批量删除
     * @param ids
     * @return
     */
    Integer delete(List<Long> ids);

    /**
     * 修改商品
     * @param goods
     * @return
     */
    Integer update(Goods goods);

    /**
     * 根据id查找商品
     * @param id
     * @return
     */
    Goods getById(Long id);

    /**
     * 查找商品列表
     * @return
     */
    List<Goods> getList();
}
