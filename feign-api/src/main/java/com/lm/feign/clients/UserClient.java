package com.lm.feign.clients;


import com.lm.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * feign 远程调用
 */
@FeignClient("userservice")//feign 远程调用 服务名
//@FeignClient(value = "userservice", configuration = FeignClientConfiguration.class)//feign日志文件局部配置
public interface UserClient {
    @GetMapping("user/{id}")
    User findById(@PathVariable("id") Long id);
}
