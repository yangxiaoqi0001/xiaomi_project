package com.xiaoqi.contorller;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoqi.pojo.SecondList;
import com.xiaoqi.pojo.vo.PageVo;
import com.xiaoqi.pojo.vo.ResultVO;
import com.xiaoqi.service.SecondListService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 第二列表控制层接口
 * @author : yangfan
 * @Date : 2020/7/1
 **/
@RestController
@RequestMapping("/secondList")
public class SecondListController {

    @Resource
    private SecondListService secondListService;

    /**
     * 添加第二列表
     * @param secondList
     * @return
     */
    @RequestMapping("/insert")
    public ResultVO insert(@RequestBody SecondList secondList) {
        if (ObjectUtil.isNull(secondList)) {
            return ResultVO.paramsError("参数为空");
        }
        Integer insert = secondListService.insert(secondList);
        if (insert > 0) {
            return ResultVO.success(insert);
        } else {
            return ResultVO.error("添加失败");
        }
    }

    /**
     * 删除第二列表
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public ResultVO delete(@RequestBody List<Long> ids) {
        if (ObjectUtil.isNull(ids)) {
            return ResultVO.paramsError("参数为空");
        }
        Integer delete = secondListService.delete(ids);
        if (delete > 0) {
            return ResultVO.success(delete);
        } else {
            return ResultVO.error("删除失败");
        }
    }

    @RequestMapping("/update")
    public ResultVO update(@RequestBody SecondList secondList) {
        if (ObjectUtil.isNull(secondList)) {
            return ResultVO.paramsError("参数为空");
        }
        if (secondList.getId() == null) {
            return ResultVO.paramsError("ID为空");
        }
        Integer update = secondListService.update(secondList);
        if (update > 0) {
            return ResultVO.success(update);
        } else {
            return ResultVO.error("修改失败");
        }
    }

    /**
     * 查询第二列表集合
     * @param secondList
     * @return
     */
    @RequestMapping("/getList")
    public ResultVO getList(@RequestBody SecondList secondList) {
        if (ObjectUtil.isNull(secondList)) {
            return ResultVO.paramsError("参数为空");
        }
        if (secondList.getFirstCode() == null) {
            return ResultVO.paramsError("第一列表编号为空");
        }
        List<SecondList> list = secondListService.getList(secondList.getFirstCode());
        if (list.size() > 0) {
            return ResultVO.success(list);
        } else {
            return ResultVO.error("查询结果为空");
        }
    }

    /**
     * 查询第二集合分页
     * @param pageVo
     * @return
     */
    @RequestMapping("/getPage")
    public ResultVO getPage(@RequestBody PageVo pageVo){
        if (ObjectUtil.isNull(pageVo)){
            return ResultVO.paramsError("产数为空");
        }
        if(pageVo.getPage()==null|| pageVo.getPageSize().equals("")){
            return ResultVO.paramsError("页数为空");
        }
        if (pageVo.getPageSize()==null || pageVo.getPageSize().equals("")){
            return ResultVO.paramsError("pageSize为空");
        }
        IPage<SecondList> page = secondListService.getPage(pageVo);
        if (page.getRecords().size()>0){
           return ResultVO.success(page);
        }else {
            return ResultVO.error("查询失败");
        }
    }

}
