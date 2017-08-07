package com.gsy.service.impl;

import com.gsy.dao.impl.CommodityDaoImpl;
import com.gsy.dao.impl.UserDaoImpl;
import com.gsy.model.Commodity;
import com.gsy.service.ICommodityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 龚士云 on 2017/7/27.
 */
@Service
public class CommodityServiceImpl implements ICommodityService {

    @Autowired
    private CommodityDaoImpl commodityDao;

    @Override
    public Commodity getCommodityById(long id) {
        return null;
    }
}
