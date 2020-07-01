package com.xiaoqi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoqi.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户持久层接口
 * @author : yangfan
 * @Date : 2020/7/1
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
