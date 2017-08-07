package com.gsy.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by 龚士云 on 2017/7/27.
 */
public class Commodity implements Serializable{
    private String id;
    private String name;
    private int price;
    private int stock;//库存
    private String kind;
    private int state;

    public Commodity(){super();}

    public Commodity(String id, String name, int price, int stock, String kind, int state) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.kind = kind;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
