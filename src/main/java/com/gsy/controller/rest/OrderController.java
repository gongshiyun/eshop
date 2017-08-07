package com.gsy.controller.rest;

import com.gsy.model.Order;
import com.gsy.service.IOrderService;
import com.gsy.service.impl.OrderServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 龚士云 on 2017/7/26.
 * Order控制层
 */
@Controller
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;


}
