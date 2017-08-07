package com.gsy.dao.impl;

import com.gsy.dao.IOrderDao;
import com.gsy.model.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by 龚士云 on 2017/7/27.
 */
@Repository
public class OrderDaoImpl implements IOrderDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(Order order) throws Exception {

    }

    @Override
    public void delete(Order order) throws Exception {

    }

    @Override
    public Order queryById(long id) throws Exception {
        return null;
    }
}
