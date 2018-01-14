package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@WebServlet(name = "servletPropertiesDemo1", urlPatterns = "/prodemo1")
public class ServletPropertiesDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        test3();
        //test2();
        //test1();
    }

    //获取/WEB-INF/classes/com/itheima/servlet/c.properties文件
    private void test3() throws IOException {
        String path = this.getServletContext().getRealPath("/WEB-INF/classes/com/itheima/servlet/c.properties");
        Properties pro = new Properties();
        pro.load(new FileInputStream(path));
        System.out.println(pro.getProperty("key"));
    }

    //获取/WEB-INF/classes/b.properties文件
    private void test2() throws IOException {
        String path = this.getServletContext().getRealPath("/WEB-INF/classes/b.properties");
        Properties pro = new Properties();
        pro.load(new FileInputStream(path));
        System.out.println(pro.getProperty("key"));
    }

    //获取/WEB-INF/a.properties文件
    private void test1() throws IOException {
        String path = this.getServletContext().getRealPath("/WEB-INF/a.properties");
        Properties pro = new Properties();
        pro.load(new FileInputStream(path));
        System.out.println(pro.getProperty("key"));
    }
}
