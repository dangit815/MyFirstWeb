<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: dingwang
  Date: 2017/10/29
  Time: 下午1:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:forEach var="i" begin="1" end="10" step="1">
        ${i} <br/>
    </c:forEach>

    <%
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        request.setAttribute("list",list);
    %>
    <c:forEach items="${list}" var="l">
        ${l} <br/>
    </c:forEach>
</body>
</html>
