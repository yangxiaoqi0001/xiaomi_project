package com.xiaoqi.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoqi.pojo.User;
import com.xiaoqi.pojo.vo.PageVo;

import java.util.List;

/**
 * 用户 业务层接口
 *
 * @author : yangfan
 * @Date : 2020/7/1
 **/
public interface UserService {
    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    Integer insert(User user);

    /**
     * 删除用户
     *
     * @param ids
     * @return
     */
    Integer delete(List<Long> ids);

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    Integer update(User user);

    /**
     * 查询列表
     *
     * @param pageVo
     * @return
     */
    List<User> getList(PageVo pageVo);

    /**
     * 分页查询用户
     *
     * @param pageVo
     * @return
     */
    IPage<User> getPage(PageVo pageVo);
}
