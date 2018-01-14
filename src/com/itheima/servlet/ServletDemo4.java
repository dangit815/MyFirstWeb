package com.itheima.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletDemo4", urlPatterns = "/demo4")
public class ServletDemo4 extends HttpServlet {

    //private ServletConfig config;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //this.config = config;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //String encoding  = "UTF-8";
        String value = this.getServletConfig().getInitParameter("encoding");
        System.out.println(value);
        //System.out.println("*********ServletDemo4*********");
    }
}
