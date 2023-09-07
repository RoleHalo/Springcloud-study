package com.lm.order.mapper;

import com.lm.order.pojo.Order;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

    @Select("select * from tb_order where id = #{id}")
    Order selectById(Long id);
}
