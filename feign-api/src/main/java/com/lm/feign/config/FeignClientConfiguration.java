package com.lm.feign.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * feign日志配置注解形式要先声明一个Logger.Level作为bean
 */
public class FeignClientConfiguration {
    @Bean
    public Logger.Level feignLogger(){
        return Logger.Level.BASIC;
    }
}
