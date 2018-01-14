package com.itheima.response;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "ServletResDemo2", urlPatterns = "/resdemo2")
public class ServletResDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
/*      //告诉服务器应该使用UTF-8解析文本
        response.setCharacterEncoding("UTF-8");

        //告诉客户端（浏览器）要使用什么编码
        response.setHeader("content-type","text/html;charset=UTF-8");*/

        response.setContentType("text/html;charset=UTF-8");

        ServletOutputStream sos = response.getOutputStream();
        sos.write("你好！".getBytes()); //不设置编码方式不行？需查看一下getBytes()的api
    }
}
