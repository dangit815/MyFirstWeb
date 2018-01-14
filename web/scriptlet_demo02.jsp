<%--
  Created by IntelliJ IDEA.
  User: dingwang
  Date: 2017/10/12
  Time: 下午10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    public static final String INFO = "www.MLDNJAVA.cn"; //定义全局常量
%>
<%!
    public int add(int x,int y){ //定义方法
        return x + y;
    }
%>
<%!
    class Person{
        private String name;
        private int age;
        public Person(String name,int age){
            this.name=name;
            this.age=age;
        }

        public String toString() {
            return "name= "+this.name+";age= "+this.age;
        }
    }
%>
<% //运行
   out.println("<h3>INFO= "+INFO+"</h3>");
   out.println("<h3>3+5= "+add(3,5)+"</h3>");
   out.println("<h3>"+new Person("zhangsan",30)+"</h3>");
%>
</body>
</html>
