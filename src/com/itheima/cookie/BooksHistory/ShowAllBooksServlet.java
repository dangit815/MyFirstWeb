package com.itheima.cookie.BooksHistory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "ShowAllBooksServlet", urlPatterns = "/showAllBooks")
public class ShowAllBooksServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.write("本网站有以下好书：<br/>");
        Map<String,Book> books = DBUtil.findAllBooks();//获得所有书籍数据
        for (Map.Entry<String,Book> book : books.entrySet()) {
            out.write("<a href='"+request.getContextPath()+"/showBookDetail?id="+book.getKey()+"'target='_blank'>"+book.getValue().getName()+"</a><br/>");
        }

        out.write("<hr/>您最近浏览过的书有：<br/>");
        Cookie[] cookies = request.getCookies();
        for(int i=0;cookies!=null && i<cookies.length;i++)
        {
            if("historyBookId".equals(cookies[i].getName()))
            {
                String value = cookies[i].getValue();
                String[] values = value.split("-");
                for(int j=0;j<values.length;j++)
                {
                    out.print(DBUtil.findBookById(values[j]).getName()+"<br/>");
                }
            }
        }
    }
}
