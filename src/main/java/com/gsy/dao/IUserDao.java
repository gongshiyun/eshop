package com.gsy.dao;

import com.gsy.model.User;

import java.util.List;

/**
 * Created by 龚士云 on 2017/7/27.
 */
public interface IUserDao {

    void insert(User user) throws Exception;

    void delete(User user) throws Exception;

    User queryById(String id) throws Exception;

    User queryLogin(String account,String password) throws Exception;

    List<User> queryAll() throws Exception;
}
