package com.itheima.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletSessionDemo2", urlPatterns = "/sedemo2")
public class ServletSessionDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //得到一个HttpSession对象
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        if(name!=null){
            out.print(name);
        }else{
            out.print("你不能直接访问此资源！");
        }
        out.print(session.getId());
    }
}
