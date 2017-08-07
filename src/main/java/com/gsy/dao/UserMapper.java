package com.gsy.dao;

import com.gsy.model.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "name",  column = "name"),
            @Result(property = "age", column = "age"),
            @Result(property = "id", column = "id"),
            @Result(property = "account", column = "account"),
            @Result(property = "password", column = "password")
    })
    List<User> getAll();

    @Select("SELECT * FROM users where id = #{id}")
    @Results({
            @Result(property = "name",  column = "name"),
            @Result(property = "age", column = "age"),
            @Result(property = "id", column = "id"),
            @Result(property = "account", column = "account"),
            @Result(property = "password", column = "password")
    })
    User getById(@Param("id") String id);

    @Insert({"INSERT INTO users(id,name,age,account,password) VALUES(#{user.id}, #{user.name}, #{user.age},#{user.account},#{user.password})"})
    void insert(@Param("user") User user);

    @Select("SELECT * FROM users where account = #{account} and password = #{password}")
    @Results({
            @Result(property = "name",  column = "name"),
            @Result(property = "age", column = "age"),
            @Result(property = "id", column = "id"),
            @Result(property = "account", column = "account"),
            @Result(property = "password", column = "password")
    })
    User getLogin(@Param("account") String account,@Param("password") String password);

}
