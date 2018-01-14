<%--
  Created by IntelliJ IDEA.
  User: dingwang
  Date: 2017/10/28
  Time: 下午7:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //pageContext.setAttribute("p","pp");
    pageContext.setAttribute("p","pp",PageContext.PAGE_SCOPE);

    pageContext.setAttribute("p","request",PageContext.REQUEST_SCOPE);
    //request.setAttribute("p","request");

    //pageContext.setAttribute("p","session",PageContext.SESSION_SCOPE);
    session.setAttribute("p","session");

    //application是ServletContext对象
    //pageContext.setAttribute("p","application",PageContext.APPLICATION_SCOPE);
    application.setAttribute("p","application");

    //request.getRequestDispatcher("2.jsp").forward(request,response);
    //response.sendRedirect("2.jsp");
    //pageContext对象转发
    pageContext.forward("2.jsp");
%>
</body>
</html>
