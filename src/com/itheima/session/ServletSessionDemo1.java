package com.itheima.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ServletSessionDemo1", urlPatterns = "/sedemo1")
public class ServletSessionDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        if(name!=null){
            name = new String(name.getBytes("iso-8859-1"),"UTF-8");
        }
        //得到一个HttpSession对象
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        response.getWriter().write(session.getId());
        //response.getWriter().write((String) session.getAttribute("name"));
    }
}
