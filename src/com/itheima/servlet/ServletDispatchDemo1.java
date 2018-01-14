package com.itheima.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "servletDispatchDemo1", urlPatterns = "/pademo1")
public class ServletDispatchDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("我要办事");
        System.out.println("你的事我办不了，我可以帮你找人办");
        ServletContext application = this.getServletContext();
        /*RequestDispatcher rd = application.getRequestDispatcher("/servlet/pademo2");
        rd.forward(request,servlet);*/
        //将请求向下传递
        application.getRequestDispatcher("/pademo2").forward(request,response);

        System.out.println("事办完了");
    }
}
