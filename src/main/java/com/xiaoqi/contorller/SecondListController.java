package com.xiaoqi.contorller;

import cn.hutool.core.util.ObjectUtil;
import com.xiaoqi.pojo.SecondList;
import com.xiaoqi.pojo.vo.ResultVO;
import com.xiaoqi.service.SecondListService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : yangfan
 * @Date : 2020/7/1
 **/
@RestController
@RequestMapping("/secondList")
public class SecondListController {

    @Resource
    private SecondListService secondListService;

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
    @RequestMapping("/delete")
    public ResultVO delete(@RequestBody List<Long> ids){
        if (ObjectUtil.isNull(ids)){
            return ResultVO.paramsError("参数为空");
        }
        Integer delete = secondListService.delete(ids);
        if (delete> 0){
            return ResultVO.success(delete);
        }else {
            return ResultVO.error("删除失败");
        }
    }

}
