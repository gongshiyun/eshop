package com.gsy;


import com.gsy.interceptor.RestInterceptor;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * Created by 龚士云 on 2017/7/27.
 */
@SpringBootApplication
@MapperScan("com.gsy.dao")
public class Main extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RestInterceptor());
        super.addInterceptors(registry);
    }

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}
