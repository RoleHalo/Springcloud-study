package com.lm.order;


import com.lm.feign.clients.UserClient;
import com.lm.feign.config.FeignClientConfiguration;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("com.lm.order.mapper")
@SpringBootApplication
//@EnableFeignClients//开启feign的自动装配
//@EnableFeignClients(basePackages = "com.lm.feign")//feign抽出后扫描feign下所有包
@EnableFeignClients(clients = UserClient.class,defaultConfiguration = FeignClientConfiguration.class)//feign抽出后只指定扫描feign下需要的客户端包  开启feign的日志全局配置
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//    @Bean  //全体微服务都会改变为自定义的负载均衡方式
//    public IRule RandomRule(){
//        return new RandomRule();
//    }
}
