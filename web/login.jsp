<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>

        <!-- function changeCode() {
            //得到图片元素
            var imge = document.getElementsByTagName("img")[0];
            imge.src = "/resdemo4?time="+new Date().getTime();
        } -->

</head>
<body>
<form action="/sedemo3" method="post">
    用户名：<input type="text" name="userName"/><br>
    密码：<input type="password" name="pwd"/><br>
    记住用户名：<input type="checkbox" name="remember"/><br>
    <!-- 验证码：<input type="text" name="code"/>
    <img src="/resdemo4" onclick="changeCode()"/><a href="javascript:changeCode()">看不清换一张</a><br> -->
    <input type="submit" value="登录"/><br>
</form>
</body>
</html>