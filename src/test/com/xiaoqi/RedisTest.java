package com.xiaoqi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author : yangfan
 * @Date : 2020/7/7
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Resource
    private RedisTemplate redisTemplate;

    /**
     * redis添加String类型的数据
     */
    @Test
    public void StringTest() {
        redisTemplate.opsForValue().set("张三", "12345677");
        Object z = redisTemplate.opsForValue().get("张三");
        String string = z.toString();
        System.out.println(string);
    }

    /**
     * 添加List拿List
     */
    @Test
    public void ListTest() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");

        redisTemplate.opsForValue().set("List", list);
        redisTemplate.opsForValue().set("List1", list1);
        RedisOperations operations = redisTemplate.opsForValue().getOperations();
        System.out.println(operations);
        Object list2 = redisTemplate.opsForValue().get("List");
        System.out.println(list2);
        //后面追加并求出数量
        Integer list11 = redisTemplate.opsForValue().append("List1", "5");
        System.out.println(list11);
//        Long list12 = redisTemplate.opsForValue().decrement("List1");
//        System.out.println(list12 );
        Long list12 = redisTemplate.opsForValue().increment("List1");
        System.out.println(list12);
    }

    /**
     * 添加Hash
     */
    @Test
    public void hashTest() {

        Map<String, String> map = new HashMap<String, String>();
        map.put("key1","");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        //添加到Hash里面
//        redisTemplate.opsForHash().putAll("map1",map);
        //拿到对应的key的值
        Object o = redisTemplate.opsForHash().get("map1", "key1");
        System.out.println(o);
        //拿到大key下面小key对应的值
        Map map1 = redisTemplate.opsForHash().entries("map1");
        //拿到所有的key
        Set map11 = redisTemplate.opsForHash().keys("map1");
        System.out.println(map11+"####");
        //判断key是否存在
        Boolean aBoolean = redisTemplate.opsForHash().hasKey("map2", "key6");
        System.out.println(aBoolean);
        //获取key对应值的长度
        Long aLong = redisTemplate.opsForHash().lengthOfValue("map1", "key2");
        System.out.println(aLong);
        List map12 = redisTemplate.opsForHash().values("map1");
        System.out.println(map12);
//        Long increment = redisTemplate.opsForHash().increment("map1", "key2", 1L);
//        System.out.println(increment);
        /**
         * 获取小key的数量
         */
        Long map13 = redisTemplate.opsForHash().size("map1");

        System.out.println(map13);
//        RedisOperations operations = redisTemplate.opsForHash().getOperations();
//        redisTemplate.opsForHash().scan("map1",operations)


    }
    @Test
    public void Listtest(){
        //添加全部
//        Long aLong = redisTemplate.opsForList().rightPushAll("name", "age","sex","num");
        //拿到key所对应的值
//        Object name = redisTemplate.opsForList().index("name", 0L);
//        System.out.println(name);
//        System.out.println(aLong);\
        //从第一位拿
//        Object name1 = redisTemplate.opsForList().leftPop("name");
//        Long remove = redisTemplate.opsForList().remove("name", 1l, "num");
//        System.out.println(remove);
//        redisTemplate.opsForList().rightPopAndLeftPush("name","qqq");
        Long qqq = redisTemplate.opsForList().size("qqq");
        System.out.println(qqq);
    }


}
