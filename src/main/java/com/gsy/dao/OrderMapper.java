package com.gsy.dao;

import com.gsy.model.Order;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Select("SELECT FROM orders where userId = #{userId}")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "commodityId",  column = "commodityId"),
            @Result(property = "userId",  column = "user_id"),
            @Result(property = "commodityNum",  column = "commodity_number"),
            @Result(property = "createDate",  column = "create_date"),
            @Result(property = "commodityPrice",  column = "commodity_price"),
            @Result(property = "state",  column = "state")
    })
    List<Order> getAllByUserId(@Param("userId") String userId);





    
}
