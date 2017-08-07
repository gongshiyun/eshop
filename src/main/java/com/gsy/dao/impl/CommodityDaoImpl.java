package com.gsy.dao.impl;

import com.gsy.dao.ICommodityDao;
import com.gsy.model.Commodity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by 龚士云 on 2017/7/27.
 */
@Repository
public class CommodityDaoImpl implements ICommodityDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(Commodity commodity) throws Exception {

    }

    @Override
    public void delete(Commodity commodity) throws Exception {

    }

    @Override
    public Commodity queryById(long id) throws Exception {
        return null;
    }
}
