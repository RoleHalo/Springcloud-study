package com.lm.order.service;

import com.lm.order.mapper.OrderMapper;
import com.lm.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    public OrderMapper orderMapper;
    public Order queryOrderById(Long orderId){
        return orderMapper.selectById(orderId);
    }
}
