package com.itheima.session.cart;

import com.itheima.cookie.BooksHistory.Book;
import com.itheima.cookie.BooksHistory.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "ServletShowAllBooks", urlPatterns = "/cart/showAllBooks")
public class ServletShowAllBooks extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.write("本网站有以下好书：<br/>");
        Map<String,com.itheima.cookie.BooksHistory.Book> books = DBUtil.findAllBooks();//获得所有书籍数据
        for (Map.Entry<String,Book> book : books.entrySet()) {
            out.write("<a href='"+request.getContextPath()+"/cart/addCart?id="+book.getKey()+"'>"+book.getValue().getName()+"</a><br/>");
        }
        //查看购物车
        out.write("<a href='"+request.getContextPath()+"/cart/showCart'>查看购物车</a> <br/>");
    }
}
