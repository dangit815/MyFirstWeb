package com.itheima.request;

//import com.sun.org.apache.xpath.internal.operations.String;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.String;

@WebServlet(name = "ServletReqDemo4", urlPatterns = "/reqdemo4")
public class ServletReqDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //告诉服务器应该使用UTF-8解析文本
        request.setCharacterEncoding("UTF-8");
        //获取表单数据
        ServletInputStream sis = request.getInputStream();
        int len = 1;
        byte[] b = new byte[1024];
        while((len=sis.read(b)) != -1){
            System.out.println(new String(b, 0, len, "UTF-8"));
            //System.out.println(new String(b,0,len));
        }
        sis.close();
    }
}
