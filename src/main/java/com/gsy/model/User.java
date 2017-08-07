package com.gsy.model;

import java.io.Serializable;

/**
 * Created by 龚士云 on 2017/7/27.
 */
public class User implements Serializable{
    private String id;
    private String name;
    private int age;
    private String account;
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
        super();
    }

    public User(String id, String name, int age, String account, String password) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.account = account;
        this.password = password;
    }

}
