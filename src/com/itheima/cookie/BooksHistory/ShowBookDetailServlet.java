package com.itheima.cookie.BooksHistory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

@WebServlet(name = "ShowBookDetailServlet", urlPatterns = "/showBookDetail")
public class ShowBookDetailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //获得id
        String id = request.getParameter("id");
        System.out.println(id);
        Book book = DBUtil.findBookById(id);
        PrintWriter out = response.getWriter();
        //显示图书的详细信息
        out.print(book);

        //将当前浏览过的书的id写回到客户端
        String historyBookId = organizeId(id,request);
        Cookie ck = new Cookie("historyBookId",historyBookId);
        ck.setPath("/");
        ck.setMaxAge(Integer.MAX_VALUE);//设置存活时间

        response.addCookie(ck);
    }

    /**
     * 计算正确的id信息，格式为1-2-3，最多三本书
     * @param id
     * @param request
     * @return
     */
    private String organizeId(String id, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if(cookies==null){
            return id;
        }
        Cookie historyBook = null;
        for(int i=0;i<cookies.length;i++)
        {
            if("historyBookId".equals(cookies[i].getName()))
            {
                historyBook = cookies[i];
            }
        }
        if(historyBook==null){
            return id;
        }
        String value = historyBook.getValue();
        String[] values = value.split("-");
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(values));

        //分两种情况
        //1.浏览历史少于2本书，格式为1-2或1
        //2.浏览历史为3本书，格式为1-2-3
        if(list.size()<3){
            if(list.contains(id)){
                list.remove(id);
            }
        }else {
            if(list.contains(id)){
                list.remove(id);
            }else{
                list.removeLast();
            }
        }
        list.addFirst(id);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<list.size();i++)
        {
            if(i>0){
                sb.append("-");
            }
            sb.append(list.get(i));
        }
        System.out.println(sb); //1-2-3
        return sb.toString();
    }
}
