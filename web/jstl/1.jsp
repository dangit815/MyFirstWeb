<%--
  Created by IntelliJ IDEA.
  User: dingwang
  Date: 2017/10/29
  Time: 下午12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:set var="num" value="10" scope="session"></c:set>

    输出变量:<c:out value="${num}"></c:out><br/>

    <c:remove var="num" scope="session"></c:remove>

    输出变量:<c:out value="${num}"></c:out><br/>
    输出变量:<c:out value="${num}" default="aaa"></c:out><br/>
</body>
</html>
