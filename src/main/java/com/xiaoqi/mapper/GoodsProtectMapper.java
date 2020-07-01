package com.xiaoqi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoqi.pojo.GoodsProtect;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品保质期持久层接口
 * @author : yangfan
 * @Date : 2020/7/1
 **/
@Mapper
public interface GoodsProtectMapper extends BaseMapper<GoodsProtect> {
}
