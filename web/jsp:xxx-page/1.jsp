<%@ page import="com.itheima.cookie.BooksHistory.Book" %><%--
  Created by IntelliJ IDEA.
  User: dingwang
  Date: 2017/10/28
  Time: 下午3:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" --%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Book book = new Book();
%>
<%--声明一个book1的对象--%>
<jsp:useBean id="book1" class="com.itheima.cookie.BooksHistory.Book"></jsp:useBean>
<%--给book对象的name属性赋值--%>
<jsp:setProperty name="book1" property="name" value="易筋经"></jsp:setProperty>
<%--取出book1对象的name属性值--%>
<jsp:getProperty name="book1" property="name"></jsp:getProperty>
    aaaaaaaaaa
    <%--@include file="2.jsp"静态包含--%>
    <%--<jsp:include page="2.jsp"></jsp:include>动态包含--%>
    <%--能用静态包含，就不用动态包含--%>
<%--请求转发--%>
<jsp:forward page="2.jsp">
    <jsp:param name="name" value="123"></jsp:param>
</jsp:forward>
</body>
</html>
