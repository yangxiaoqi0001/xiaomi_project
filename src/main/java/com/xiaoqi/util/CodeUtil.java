package com.xiaoqi.util;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * 编号 工具类
 *
 * @author Zhao Yahui
 * @date 2020-04-08
 */
public class CodeUtil {

    public static String createCode(String type) {
        return type + DateUtil.format(new Date(), "yyMMddHHmmss");
    }

}
