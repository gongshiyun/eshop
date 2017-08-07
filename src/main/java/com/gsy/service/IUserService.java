package com.gsy.service;

import com.gsy.model.User;

import java.util.List;

/**
 * Created by 龚士云 on 2017/7/27.
 */
public interface IUserService {
    User getUserById(String id) throws Exception;

    void CreateUser(User user) throws Exception;

    User getLoginUser(String account,String password) throws Exception;

    List<User> getAll() throws Exception;
}
