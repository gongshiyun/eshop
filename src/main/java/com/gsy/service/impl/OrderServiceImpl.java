package com.gsy.service.impl;

import com.gsy.dao.IOrderDao;
import com.gsy.dao.impl.OrderDaoImpl;
import com.gsy.model.Order;
import com.gsy.service.IOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by 龚士云 on 2017/7/27.
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderDaoImpl orderDao;

    @Override
    public Order getOrderById(long id) {
        return null;
    }
}
