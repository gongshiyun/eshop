package com.gsy.dao.impl;

import com.gsy.dao.IUserDao;
import com.gsy.dao.UserMapper;
import com.gsy.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.annotation.Resource;

/**
 * Created by 龚士云 on 2017/7/27.
 */
@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(User user) throws Exception {
        userMapper.insert(user);
    }

    @Override
    public void delete(User user) throws Exception {

    }

    @Override
    public User queryById(String id) throws Exception {
        return userMapper.getById(id);
    }

    @Override
    public List<User> queryAll() throws Exception {
        return userMapper.getAll();
    }

    @Override
    public User queryLogin(String account, String password) throws Exception {
        return userMapper.getLogin(account,password);
    }
}
