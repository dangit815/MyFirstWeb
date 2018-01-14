<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: dingwang
  Date: 2017/10/29
  Time: 下午1:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <style type="text/css">
        .odd{
            background-color: greenyellow;
        }
        .even{
            background-color: red;
        }
    </style>
    <%
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        request.setAttribute("list",list);
    %>

    <table border="1">
        <tr>
            <td>数据</td>
            <td>索引</td>
            <td>计数</td>
            <td>第一个</td>
            <td>最后一个</td>
        </tr>

        <c:forEach items="${list}" var="l" varStatus="vs">
            <tr style="${vs.count%2==0 ? "background-color:lime" : "background-color:red"}">
                <td>${l}</td>
                <td>${vs.index}</td>
                <td>${vs.count}</td>
                <td>${vs.first}</td>
                <td>${vs.last}</td>
            </tr>
        </c:forEach>

        <c:forEach items="${list}" var="l" varStatus="vs">
            <tr class="${vs.count%2==0 ? "odd" : "even"}">
                <td>${l}</td>
                <td>${vs.index}</td>
                <td>${vs.count}</td>
                <td>${vs.first}</td>
                <td>${vs.last}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
