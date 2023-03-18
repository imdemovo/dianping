package com.hmdp.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Time: 2022/12/19 13:00
 * @author: imdemo
 * description:
 */
@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient() {

        //配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://1.117.156.253:6379");
        //创建RedissonClient对象
        return Redisson.create(config);
    }
}
