package com.xiaoqi.contorller;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoqi.pojo.FirstList;
import com.xiaoqi.pojo.vo.PageVo;
import com.xiaoqi.pojo.vo.ResultVO;
import com.xiaoqi.service.FirstListService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 第一列表 控制层接口
 * @author : yangfan
 * @Date : 2020/7/1
 **/
@RestController
@RequestMapping("/firstLsit")
public class FirstListController {

    @Resource
    private FirstListService firstListService;

    /**
     * 添加第一接口
     * @param firstList
     * @return
     */
    @RequestMapping("/insert")
    public ResultVO insert(@RequestBody FirstList firstList) {
        if (ObjectUtil.isNull(firstList)){
            return ResultVO.paramsError("参数为空");
        }
        Integer insert = firstListService.insert(firstList);
        if (insert > 0) {
            return ResultVO.success(insert);
        } else {
            return ResultVO.error("添加失败");
        }
    }

    /**
     * 删除第一接口
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public ResultVO delete(@RequestBody List<Long> ids){
        if (ObjectUtil.isNull(ids)){
            return ResultVO.paramsError("参数为空");
        }
        Integer delete = firstListService.delete(ids);
        if (delete > 0){
            return ResultVO.success(delete);
        }else {
            return ResultVO.error("删除失败");
        }
    }

    /**
     * 修改第一接口
     * @param firstList
     * @return
     */
    @RequestMapping("/update")
    public ResultVO update(@RequestBody FirstList firstList){
        if (ObjectUtil.isNull(firstList)){
            return ResultVO.paramsError("参数为空");
        }
        Integer update = firstListService.update(firstList);
        if (update > 0){
            return ResultVO.success(update);
        } else {
            return ResultVO.error("修改失败");
        }
    }

    /**
     * 列表查询第一接口
     * @return
     */
    @RequestMapping("/getList")
    public ResultVO getList(){
        List<FirstList> list = firstListService.getList();
        if (list.size()>0){
            return ResultVO.success(list);
        } else {
            return ResultVO.error("暂无数据");
        }
    }

    /**
     * 分页查询第一接口
     * @param pageVo
     * @return
     */
    @RequestMapping("/getPage")
    public ResultVO getPage(@RequestBody PageVo pageVo){
        if (ObjectUtil.isNull(pageVo)){
            return ResultVO.paramsError("参数为空");
        }
        if (pageVo.getPage()==null || pageVo.getPage().equals("")){
            return ResultVO.paramsError("页码参数为空");
        }
        if (pageVo.getPageSize()==null ||pageVo.getPageSize().equals("")){
            return ResultVO.paramsError("每页数量为空");
        }
        IPage<FirstList> page = firstListService.getPage(pageVo);
        if (page.getRecords().size()> 0){
            return ResultVO.success(page);
        }else {
            return ResultVO.error("暂无数据");
        }
    }

}
