package com.xiaoqi.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoqi.mapper.FirstListMapper;
import com.xiaoqi.pojo.FirstList;
import com.xiaoqi.pojo.vo.PageVo;
import com.xiaoqi.service.FirstListService;
import com.xiaoqi.util.CodeUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : yangfan
 * @Date : 2020/7/1
 **/
@Service
public class FirstListServiceImpl implements FirstListService {
    @Resource
    private FirstListMapper firstListMapper;
    @Override
    public Integer insert(FirstList firstList) {
        //第一列表
        firstList.setFirstCode(CodeUtil.createCode("DYLB"));
        Integer insert = firstListMapper.insert(firstList);
        return insert;
    }

    @Override
    public Integer delete(List<Long> ids) {
        Integer deleteBatchIds = firstListMapper.deleteBatchIds(ids);
        return deleteBatchIds;
    }

    @Override
    public Integer update(FirstList firstList) {
        Integer update = firstListMapper.updateById(firstList);
        return update;
    }

    @Override
    public List<FirstList> getList() {
        List<FirstList> firstLists = firstListMapper.selectList(null);
        return firstLists;
    }

    @Override
    public IPage<FirstList> getPage(PageVo pageVo) {
        Page page=new Page(pageVo.getPage(),pageVo.getPageSize());
        IPage<FirstList> iPage = firstListMapper.selectPage(page, null);
        return iPage;
    }
}
