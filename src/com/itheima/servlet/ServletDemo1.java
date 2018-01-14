package com.itheima.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo1 implements Servlet {
    //Servlet生命周期的方法
    //在Servlet第一次被访问时被调用
    //实例化
    public ServletDemo1(){
        System.out.println("***********ServletDemo1执行了***********");
    }

    //Servlet生命周期的方法
    //在Servlet第一次被访问时被调用
    //初始化
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("***********init执行了***********");
    }

    //Servlet生命周期的方法
    //每次访问时都会被调用
    //服务
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {
        //System.out.println("Hello Servlet") ;
        System.out.println("***********service执行了***********");
    }

    //Servlet生命周期的方法
    //当应用卸载时调用
    //销毁
    @Override
    public void destroy() {
        System.out.println("***********destroy执行了***********");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }
}
