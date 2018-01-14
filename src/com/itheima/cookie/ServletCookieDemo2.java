package com.itheima.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "ServletCookieDemo2", urlPatterns = "/cookiedemo2")
public class ServletCookieDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Cookie[] cookies = request.getCookies();
        for(int i=0;cookies!=null && i<cookies.length;i++)
        {
            if("lastAccessTime".equals(cookies[i].getName()))
            {
                long l = Long.parseLong(cookies[i].getValue());
                out.write("您的最近访问时间是"+new Date(l).toLocaleString());
            }
        }
    }
}
