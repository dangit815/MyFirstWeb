package com.itheima.session.cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletAddCart", urlPatterns = "/cart/addCart")
public class ServletAddCart extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //获得指定书籍
        String id = request.getParameter("id");
        Book book = DBUtil.findBookById(id);
        //得到一个HttpSession对象
        HttpSession session = request.getSession();
        List<Book> list = (List<Book>) session.getAttribute("cart");
        if(list==null){
            list=new ArrayList<Book>();
        }
        //如果购物车中没有该商品，则添加
        if(!list.contains(book)){
            list.add(book);
        }

        //重新设置session数据
        session.setAttribute("cart",list);

        out.write("添加成功，2秒后回到主界面");
        response.setHeader("refresh","2;url="+request.getContextPath()+"/cart/showAllBooks");
    }
}
