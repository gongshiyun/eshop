package com.gsy.dao;

import com.gsy.model.Commodity;

/**
 * Created by 龚士云 on 2017/7/27.
 */
public interface ICommodityDao {
    public void insert(Commodity commodity) throws Exception;
    public void delete(Commodity commodity) throws Exception;
    public Commodity queryById(long id) throws Exception;
}
