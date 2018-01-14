package com.itheima.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletSessionDemo3", urlPatterns = "/sedemo3")
public class ServletSessionDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        HttpSession session = request.getSession();

        if("Tom".equals(userName) && "123".equals(pwd)){
            out.write("登陆成功");
        }else {
            session.setAttribute("error","登录失败");
        }

        //session.setAttribute("error","出现错误");

        String s = (String) session.getAttribute("error");
        if(s!=null){
            out.write(s);
            session.removeAttribute("error");
        }
    }
}
