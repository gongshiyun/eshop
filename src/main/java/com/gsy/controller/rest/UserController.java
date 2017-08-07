package com.gsy.controller.rest;

import com.gsy.model.User;
import com.gsy.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by 龚士云 on 2017/7/27.
 */
@RestController
@RequestMapping({"/user"})
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/testGet")
    @ResponseBody
    public String user(){
        User user = new User();
        try{
            user = userService.getUserById("1");
        }catch (Exception e){
            e.printStackTrace();
        }
        return user.getName() + "----" + user.getAge();
    }

    @RequestMapping(value = "/testInsert")
    @ResponseBody
    public String TestInsert(){
        User user = new User("2","zz",12,"aaa","1234");
        try{
            user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            userService.CreateUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "insert";
    }

    @RequestMapping(value = "/register")
    public void register(User user){
        try {
            user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            userService.CreateUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "/login")
    public void login(String account,String password){
        User user = new User();
        try {
            user = userService.getLoginUser(account,password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
