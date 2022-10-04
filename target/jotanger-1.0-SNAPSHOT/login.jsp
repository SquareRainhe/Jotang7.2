<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/10/4
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="loginServlet" method="post">
    账号:<input type="text" name="uname"><br>
    密码:<input type="password" name="upwd"><br>
    <button>登录</button><span style="color: red;font-size: 12px">${msg}</span>
</form>
</body>
</html>
