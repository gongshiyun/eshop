package com.gsy.controller.rest;

import com.gsy.dao.impl.CommodityDaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 龚士云 on 2017/7/27.
 */
@Controller
@RequestMapping(value = "/commodity")
public class CommodityController {
    @Autowired
    CommodityDaoImpl commodityDao;

}
