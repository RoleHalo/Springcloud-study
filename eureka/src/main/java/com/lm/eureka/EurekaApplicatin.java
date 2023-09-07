package com.lm.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //启用Eureka服务器
@SpringBootApplication
public class EurekaApplicatin {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicatin.class,args);
    }
}
