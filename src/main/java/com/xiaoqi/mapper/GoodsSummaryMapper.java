package com.xiaoqi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoqi.pojo.GoodsSummary;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品概述持久层接口s
 * @author : yangfan
 * @Date : 2020/7/1
 **/
@Mapper
public interface GoodsSummaryMapper extends BaseMapper<GoodsSummary> {
}
