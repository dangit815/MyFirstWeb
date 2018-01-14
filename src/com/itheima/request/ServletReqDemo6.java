package com.itheima.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletReqDemo6", urlPatterns = "/reqdemo6")
public class ServletReqDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String s = (String) request.getAttribute("s");
        System.out.println("正常结果：" + s);

        //将request对象中的s移除
        request.removeAttribute("s");
        s = (String) request.getAttribute("s");
        System.out.println("移除s之后：" + s);
    }
}
