package com.qfedu.jedis;

import com.qfedu.utils.JedisUtils;
import redis.clients.jedis.Jedis;

public class App {

    public static void main(String[] args) {

        //创建jedis对象
        Jedis jedis = new Jedis("139.155.22.25", 6379);

        //设置密码，如果没有在配置文件中设置密码则不需要密码
        //jedis.auth("password");

        //根据key值获取字符串类型内容
//        String name = jedis.get("name");
//        System.out.println(name);


        //设置值
        jedis.set("hoppy","cooding");
        System.out.println(jedis.get("hoppy"));

        //获取hash结构中的value值
        String name = jedis.hget("hh", "name");
        System.out.println(name);

        //关闭
        jedis.close();

        jedisPoolTest();


    }

    public static void jedisPoolTest() {

        Jedis jedis = JedisUtils.getJedis();
        System.out.println(jedis.get("age"));

        //System.out.println("zaiyishunjian");
        System.out.println("wdawdaw");

        JedisUtils.closeJedis(jedis);

    }


}
