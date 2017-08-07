package com.gsy.model;

import java.io.Serializable;

/**
 * Created by 龚士云 on 2017/7/27.
 */

public class Order implements Serializable{
    private String id;
    private String userId;
    private int commodityPrice;
    private String commodityId;
    private int commodityNum;
    private String createDate;
    private int state;

    public Order(String id, String userId, int commodityPrice, String commodityId, int commodityNum, String createDate, int state) {
        super();
        this.id = id;
        this.userId = userId;
        this.commodityPrice = commodityPrice;
        this.commodityId = commodityId;
        this.commodityNum = commodityNum;
        this.createDate = createDate;
        this.state = state;
    }

    public Order(){super();}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(int commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public int getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(int commodityNum) {
        this.commodityNum = commodityNum;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
