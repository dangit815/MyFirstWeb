package com.itheima.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet(name = "ServletReqDemo3", urlPatterns = "/reqdemo3")
public class ServletReqDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //告诉服务器应该使用UTF-8解析文本
        request.setCharacterEncoding("UTF-8");
        //test1(request);
        //test2(request);
        Map<String,String[]> map = request.getParameterMap();

        for (Map.Entry<String,String[]> m : map.entrySet()) {
            
        }
    }

    private void test2(HttpServletRequest request) {
        Enumeration names = request.getParameterNames();
        while(names.hasMoreElements()){
            String name = (String) names.nextElement();
            String[] values = request.getParameterValues(name);
            for(int i=0;values!=null && i<values.length;i++)
            {
                System.out.println(name+"\t"+values[i]);
            }
        }
    }

    private void test1(HttpServletRequest request) throws UnsupportedEncodingException {
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        String sex = request.getParameter("sex");
        String[] hobbys = request.getParameterValues("hobby"); //选取复选框的值

        String city = request.getParameter("city");

        //userName = new String(userName.getBytes("iso-8859-1"),"UTF-8");
        System.out.println(userName);
        System.out.println(pwd);
        System.out.println(sex);

        for (int i = 0;hobbys!=null && i < hobbys.length; i++) {
            System.out.print(hobbys[i]+"\t");
        }
        System.out.println();

        System.out.println(city);
    }
}
