package com.xiaoqi.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * mybatis-plus字段自动填充 处理类
 *
 * @author Zhao Yahui
 * @date 2020-04-05
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static final Logger LOG = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    /**
     * 插入记录时的自动填充
     *
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    /**
     * 修改记录时的自动填充
     *
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
