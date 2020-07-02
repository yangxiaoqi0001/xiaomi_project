package com.xiaoqi.service.impl;

import com.xiaoqi.mapper.GoodsMapper;
import com.xiaoqi.pojo.Goods;
import com.xiaoqi.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : yangfan
 * @Date : 2020/7/2
 **/
@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public Integer insert(Goods goods) {
        Integer insert = goodsMapper.insert(goods);
        return insert;
    }

    @Override
    public Integer delete(List<Long> ids) {
        Integer deleteBatchIds = goodsMapper.deleteBatchIds(ids);
        return deleteBatchIds;
    }

    @Override
    public Integer update(Goods goods) {
        Integer updateById = goodsMapper.updateById(goods);
        return updateById;
    }

    @Override
    public Goods getById(Long id) {
        Goods goods = goodsMapper.selectById(id);
        return goods;
    }

    @Override
    public List<Goods> getList() {
        List<Goods> goodsList = goodsMapper.selectList(null);
        return goodsList;
    }
}
