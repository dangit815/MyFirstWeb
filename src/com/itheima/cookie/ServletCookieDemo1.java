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

@WebServlet(name = "ServletCookieDemo1", urlPatterns = "/cookiedemo1")
public class ServletCookieDemo1 extends HttpServlet {
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
        out.print("<a href='/clearcookie'>clear</a>");
        //创建cookie
        Cookie ck = new Cookie("lastAccessTime",System.currentTimeMillis()+"");
        //设置cookie的有效时间,单位是秒
        //保存时间为5分钟,存到磁盘文件，如果没有这句话，cookie保存在当前浏览器会话窗口的缓存中
        ck.setMaxAge(60*5);
        ck.setPath("/");
        response.addCookie(ck);
    }
}
