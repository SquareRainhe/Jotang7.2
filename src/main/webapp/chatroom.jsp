<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/10/4
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>聊天室</title>
</head>
<frameset rows="70%,30%" frameborder="1" bordercolor="black">
    <frame src="msg.jsp">
    <% response.setHeader("refresh", "10"); %>
<frame src="send.jsp">
</frameset>
</html>
