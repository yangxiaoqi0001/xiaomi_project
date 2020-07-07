package com.xiaoqi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoqi.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品类持久层接口
 * @author : yangfan
 * @Date : 2020/7/1
 **/
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
}
