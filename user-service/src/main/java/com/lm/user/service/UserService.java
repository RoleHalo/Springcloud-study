package com.lm.user.service;

import com.lm.user.mapper.UserMapper;
import com.lm.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserByID(Long id){
        return userMapper.selectById(id);
    }
}
