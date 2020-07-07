package com.xiaoqi.service.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoqi.mapper.SecondListMapper;
import com.xiaoqi.pojo.SecondList;
import com.xiaoqi.pojo.vo.PageVo;
import com.xiaoqi.service.SecondListService;
import com.xiaoqi.util.CodeUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : yangfan
 * @Date : 2020/7/1
 **/
@Service
public class SecondListServiceImpl implements SecondListService {
    @Resource
    private SecondListMapper secondListMapper;

    @Override
    public Integer insert(SecondList secondList) {
        secondList.setSecondCode(CodeUtil.createCode("第二列表"));
        Integer insert = secondListMapper.insert(secondList);
        return insert;
    }

    @Override
    public Integer delete(List<Long> ids) {
        int delete = secondListMapper.deleteBatchIds(ids);
        return delete;
    }

    @Override
    public Integer update(SecondList secondList) {
        int update = secondListMapper.updateById(secondList);
        return update;
    }

    @Override
    public List<SecondList> getList(String firstCode) {
        QueryWrapper<SecondList> secondListQueryWrapper = new QueryWrapper<>();
        secondListQueryWrapper.eq("first_code", firstCode);
        List<SecondList> secondLists = secondListMapper.selectList(secondListQueryWrapper);
        return secondLists;
    }

    @Override
    public IPage<SecondList> getPage(PageVo pageVo) {
        Integer pageNum = pageVo.getPage();
        Integer pageSize = pageVo.getPageSize();
        String type = pageVo.getType();
        String condition = pageVo.getCondition();
        IPage iPage = null;
        QueryWrapper<SecondList> queryWrapper = new QueryWrapper<>();
        Page page = new Page(pageNum, pageSize);
        if (type.equals("first")) {
            queryWrapper.eq("first_name", condition);
        }
        if (type.equals("second")) {
            queryWrapper.eq("second_name", condition);
        }
        if (!type.equals("")) {
            if (type.equals("first")) {
                queryWrapper.eq("first_name", condition);
            }
            if (type.equals("second")) {
                queryWrapper.eq("second_name", condition);
            }
            iPage = secondListMapper.selectPage(page, queryWrapper);
        } else {
            iPage = secondListMapper.selectPage(page, null);
        }

        return iPage;
    }
}
