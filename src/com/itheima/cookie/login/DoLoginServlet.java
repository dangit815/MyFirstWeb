package com.itheima.cookie.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DoLoginServlet", urlPatterns = "/dologin")
public class DoLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //获取表单数据
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        String remember = request.getParameter("remember");

        //新建保存用户名信息的cookie
        Cookie ck = new Cookie("userName",userName);
        //新建保存密码信息的cookie
        //Cookie ckpwd = new Cookie("pwd",pwd);

        ck.setPath("/");//设置保存路径
        //ckpwd.setPath("/");//设置保存路径
        //处理业务逻辑
        //分发转向
        if("Tom".equals(userName) && "123".equals(pwd))
        {
            if(remember!=null)
            {
                ck.setMaxAge(Integer.MAX_VALUE);//设置cookie在磁盘的存活时间
                //ckpwd.setMaxAge(Integer.MAX_VALUE);//设置cookie在磁盘的存活时间
            }else{
                ck.setMaxAge(0);
                //ckpwd.setMaxAge(0);
            }
            response.addCookie(ck);
            //response.addCookie(ckpwd);
            out.write("登陆成功");
        }else{
            out.write("登录失败");
            //设置2秒跳到重新登录
            response.setHeader("refresh","2;url="+request.getContextPath()+"/login");
        }
    }
}
