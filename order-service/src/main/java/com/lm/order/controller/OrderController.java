package com.lm.order.controller;


import com.lm.feign.clients.UserClient;
import com.lm.feign.pojo.User;
import com.lm.order.pojo.Order;

import com.lm.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    @GetMapping("{orderId}")
    public Order queryOrderByid(@PathVariable("orderId") Long orderId){

        Order order = orderService.queryOrderById(orderId);
        //feign实现远程调用
        User user = userClient.findById(order.getUserId());
        //restTemplate远程调用
//        String url = "http://userservice/user/"+order.getUserId();
//        User user = restTemplate.getForObject(url, User.class);

        //封装user到order
        order.setUser(user);
        return order ;
    }


}
