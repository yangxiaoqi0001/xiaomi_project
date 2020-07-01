package com.xiaoqi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoqi.pojo.GoodsComment;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评论持久层接口
 * @author : yangfan
 * @Date : 2020/7/1
 **/
@Mapper
public interface GoodsCommentMapper extends BaseMapper<GoodsComment> {
}
