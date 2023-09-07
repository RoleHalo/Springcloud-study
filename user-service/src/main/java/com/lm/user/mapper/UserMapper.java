package com.lm.user.mapper;


import com.lm.user.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from tb_user where id = #{id}")
    User selectById(Long id);
}
