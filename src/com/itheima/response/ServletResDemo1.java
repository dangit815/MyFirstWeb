package com.itheima.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletResDemo1", urlPatterns = "/resdemo1")
public class ServletResDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //服务器中默认的编码为ISO-8859-1，它不支持中文，tomcat规定的
 /*     //告诉服务器应该使用UTF-8解析文本
        response.setCharacterEncoding("UTF-8");

        //告诉客户端（浏览器）要使用什么编码
        response.setHeader("content-type","text/html;charset=UTF-8");*/

        //告诉服务器应该使用UTF-8解析文本,告诉客户端（浏览器）要使用什么编码
        response.setContentType("text/html;charset=UTF-8");

        //得到一个字符输出流
        PrintWriter out = response.getWriter();

        //向客户端响应文本内容
        out.write("你好！");
        //out.write("<html><head><meta charset='UTF-8'></head><body>你好！</body></html>");
    }
}
