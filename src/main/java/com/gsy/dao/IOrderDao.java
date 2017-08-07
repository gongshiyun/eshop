package com.gsy.dao;

import com.gsy.model.Order;

/**
 * Created by 龚士云 on 2017/7/27.
 */
public interface IOrderDao {
    public void insert(Order order) throws Exception;
    public void delete(Order order) throws Exception;
    public Order queryById(long id) throws Exception;
}
