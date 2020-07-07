package com.xiaoqi.contorller;

import cn.hutool.core.util.ObjectUtil;
import com.xiaoqi.pojo.Goods;
import com.xiaoqi.pojo.vo.ResultVO;
import com.xiaoqi.service.GoodsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品 控制层
 *
 * @author : yangfan
 * @Date : 2020/7/3
 **/
@RestController
@RequestMapping("/goods")
public class GoodsContorller {
    @Resource
    private GoodsService goodsService;

    /**
     * 添加商品
     *
     * @param goods
     * @return
     */
    @RequestMapping("/insert")
    public ResultVO insert(@RequestBody Goods goods) {
        if (ObjectUtil.isNull(goods)) {
            return ResultVO.paramsError("参数位空");
        }
        Integer insert = goodsService.insert(goods);
        if (insert > 0) {
            return ResultVO.success(insert);
        } else {
            return ResultVO.error("添加失败");
        }
    }

    /**
     * 删除商品
     *
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public ResultVO delete(@RequestBody List<Long> ids) {
        if (ObjectUtil.isNull(ids)) {
            return ResultVO.paramsError("参数位空");
        }
        Integer delete = goodsService.delete(ids);
        if (delete > 0) {
            return ResultVO.success(delete);
        } else {
            return ResultVO.error("删除失败");
        }
    }

    /**
     * 修改商品
     *
     * @param goods
     * @return
     */
    public ResultVO update(@RequestBody Goods goods) {
        if (ObjectUtil.isNull(goods)) {
            return ResultVO.paramsError("参数为空");
        }
        if (goods.getId() == null) {
            return ResultVO.paramsError("商品id为空");
        }
        Integer update = goodsService.update(goods);
        if (update > 0) {
            return ResultVO.success(update);
        } else {
            return ResultVO.error("修改失败");
        }
    }
}
