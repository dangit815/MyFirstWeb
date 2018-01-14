package com.itheima.session.cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ServletShowCart", urlPatterns = "/cart/showCart")
public class ServletShowCart extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.write("您的购物车内有以下商品：<br/>");
        //得到一个HttpSession对象
        HttpSession session = request.getSession();
        List<Book> list = (List<Book>) session.getAttribute("cart");
        if(list==null){
            out.write("您的购物车是空的<br/>");
            out.write("<a href='"+request.getContextPath()+"/cart/showAllBooks'>返回主界面</a>");
            return;
        }
        for(Book book : list)
        {
            out.write(book.getName()+"<br/>");
        }
        out.write("<a href='"+request.getContextPath()+"/cart/showAllBooks'>返回主界面</a>");
        //设置session的存活时间，单位是秒，目前为10秒
        //session.setMaxInactiveInterval(10);
        //摧毁session对象
        //session.invalidate();
    }
}
