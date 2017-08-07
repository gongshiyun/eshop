package com.gsy.service.impl;

import com.gsy.dao.IUserDao;
import com.gsy.dao.impl.OrderDaoImpl;
import com.gsy.dao.impl.UserDaoImpl;
import com.gsy.model.User;
import com.gsy.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 龚士云 on 2017/7/27.
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserDaoImpl userDao;

    @Override
    public User getUserById(String id) throws Exception {
        return userDao.queryById(id);
    }

    @Override
    public void CreateUser(User user) throws Exception {
        userDao.insert(user);
    }

    @Override
    public User getLoginUser(String account, String password) throws Exception {
        return userDao.queryLogin(account,password);
    }

    @Override
    public List<User> getAll() throws Exception {
        return userDao.queryAll();
    }
}
