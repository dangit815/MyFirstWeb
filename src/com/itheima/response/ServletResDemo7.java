package com.itheima.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletResDemo7", urlPatterns = "/resdemo7")
public class ServletResDemo7 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("A:我要借钱");
        System.out.println("B:我没钱，但是我可以告诉你谁有钱");

/*        response.setStatus(302); //告诉客户端要进行重定向
        response.setHeader("location","/resdemo8"); //告诉浏览器访问哪个URL*/

        response.sendRedirect("/dw/resdemo8");

        System.out.println("A:我去了");
    }
}
