package com.itheima.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletReqDemo5", urlPatterns = "/reqdemo5")
public class ServletReqDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String str = "aaaaa";
        request.setAttribute("s",str);

        //请求转发
        request.getRequestDispatcher("/reqdemo6").forward(request,response);

        //重定向
        //response.sendRedirect("/reqdemo6");

        //请求包含,相当于将指定servlet的代码包含进来了
        //request.getRequestDispatcher("/reqdemo6").include(request,response);
    }
}
