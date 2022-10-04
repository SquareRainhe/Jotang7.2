<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/10/4
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<form action="msg" method="post">
    <input type="text" name="message"><button>发送</button><span style="color: red;font-size: 12px">${msg}</span>
</form>
</body>
</html>
