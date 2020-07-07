package com.xiaoqi.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoqi.mapper.GoodsMapper;
import com.xiaoqi.pojo.Goods;
import com.xiaoqi.pojo.vo.PageVo;
import com.xiaoqi.service.GoodsService;
import com.xiaoqi.util.CodeUtil;
import org.apache.xmlbeans.impl.xb.ltgfmt.Code;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品类 业务层实现类
 * @author : yangfan
 * @Date : 2020/7/2
 **/
@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public Integer insert(Goods goods) {
        //商品编号
        goods.setGoodsCode(CodeUtil.createCode("SPBH"));
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

    @Override
    public IPage<Goods> getPage(PageVo pageVo) {
        Page page=new Page(pageVo.getPage(),pageVo.getPageSize());
        IPage<Goods> iPage = goodsMapper.selectPage(page, null);
        return iPage;
    }
}
