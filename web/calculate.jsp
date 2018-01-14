<%--
  Created by IntelliJ IDEA.
  User: dingwang
  Date: 2017/10/27
  Time: 下午8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%! //声明
    int num1 = 10;
%>
<%  //运行
    int num2 = 10;
    num1++;
    num2++;
%>
<%--输出--%>
<%= num1 %>
<%= num2 %>
</body>
</html>
