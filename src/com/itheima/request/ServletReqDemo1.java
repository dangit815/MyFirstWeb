package com.itheima.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//请求消息行
@WebServlet(name = "ServletReqDemo1", urlPatterns = "/reqdemo1")
public class ServletReqDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(request.getMethod());//  GET
        System.out.println(request.getRequestURL()); //  http://localhost:8080/reqdemo1
        System.out.println(request.getRequestURI()); //  /reqdemo1
        System.out.println(request.getContextPath()); //
        System.out.println(request.getQueryString()); //  username=dan
    }
}
