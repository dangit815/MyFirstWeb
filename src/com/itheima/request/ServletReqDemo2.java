package com.itheima.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//请求消息头
@WebServlet(name = "ServletReqDemo2", urlPatterns = "/reqdemo2")
public class ServletReqDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        test1(request);
    }

    private void test1(HttpServletRequest request) {
        //请求消息头
        String header = request.getHeader("User-Agent");
        System.out.println(header);

        if(header.toLowerCase().contains("msie")){
            System.out.println("你使用的是IE浏览器");
        }else if(header.toLowerCase().contains("firefox")){
            System.out.println("你使用的是火狐浏览器");
        }else if(header.toLowerCase().contains("chrome")){
            System.out.println("你使用的是谷歌浏览器");
        }else if(header.toLowerCase().contains("safari")){
            System.out.println("你使用的是苹果safari浏览器");
        }else {
            System.out.println("你使用的是其他浏览器");
        }
    }
}
