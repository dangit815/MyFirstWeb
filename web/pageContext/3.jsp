<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: dingwang
  Date: 2017/10/28
  Time: 下午9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        request.setAttribute("list",list);

        Map map = new HashMap();
        map.put("a","aaa");
        map.put("b","bbb");
        map.put("c","ccc");

        request.setAttribute("map",map);
    %>
    ${list}
    ${list[1]} <%--bbb--%>
    <br/>
    ${map["c"]}<br/>
    ${map.a}
</body>
</html>
