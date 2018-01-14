<%--
  Created by IntelliJ IDEA.
  User: dingwang
  Date: 2017/10/29
  Time: 下午1:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${5>3}">
        aaaaaaaaa
    </c:if> <br/>

    <c:set var="num" value="${3}"></c:set>

    <c:choose>
        <c:when test="${num==1}">aaa</c:when>
        <c:when test="${num==2}">bbb</c:when>
        <c:when test="${num==3}">ccc</c:when>
        <c:otherwise>ddd</c:otherwise>
    </c:choose>
</body>
</html>
