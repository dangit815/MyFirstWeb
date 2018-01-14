<%--
  Created by IntelliJ IDEA.
  User: dingwang
  Date: 2017/10/28
  Time: 下午7:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        //String s = (String) request.getAttribute("p");
        //String s = (String) session.getAttribute("p");
        //out.write(s);
    %>
    <%--= request.getAttribute("p")%>
    <%= session.getAttribute("p")%>
    <%= application.getAttribute("p")--%>
    <%--findAttribute()自动从page request session application依次查找，找到了就取值，结束查找，取到空值会输出"null"--%>
    <%= pageContext.findAttribute("pp")%>
    ${pp} <%--等价于<%= pageContext.findAttribute("p")%> , 取到空值会输出空字符串，而非null值--%>
</body>
</html>
