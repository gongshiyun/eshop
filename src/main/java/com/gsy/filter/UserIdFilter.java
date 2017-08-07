package com.gsy.filter;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserIdFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        if(request.getAttribute("userId") != null && !request.getAttribute("userId").equals("")){
            System.out.println("发现用户id");
        }
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
