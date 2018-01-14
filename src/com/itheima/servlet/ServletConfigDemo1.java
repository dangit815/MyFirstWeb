package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "servletConfigDemo1", urlPatterns = "/configdemo1")
public class ServletConfigDemo1 extends HttpServlet {
    /*initParams = {
        @WebInitParam(name = "encoding",value = "GBK")
    }*/
    /* 第一种方法
    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //获得配置文件中的信息
        //第一种方法
        // String encoding  = config.getInitParameter("encoding");
        //第二种方法
        //String encoding = super.getInitParameter("encoding");
        //第三种方法
        //String encoding = this.getServletConfig().getInitParameter("encoding");
        String encoding = this.getServletContext().getInitParameter("encoding");
        System.out.println(encoding);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }
}
