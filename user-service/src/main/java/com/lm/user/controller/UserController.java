package com.lm.user.controller;

import com.lm.user.config.PatternProperties;
import com.lm.user.service.UserService;
import com.lm.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
//@RefreshScope//热更新
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
      //获取Nacos统一配置属性值
//    @Value("${pattern.dateformat}")
//    private String dateformat;

    @Autowired
    private PatternProperties patternProperties;

    @GetMapping("{id}")
    public User queryByID(@PathVariable("id") Long id){
        return userService.queryUserByID(id);
    }

    @GetMapping("now")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(patternProperties.getDateformat()));
    }
    @GetMapping("prop")
    public PatternProperties prop(){
        return patternProperties;
    }
}
