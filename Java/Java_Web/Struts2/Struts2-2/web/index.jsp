<%--
  Created by IntelliJ IDEA.
  User: DreamMax
  Date: 2018/10/19
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="<%=path%>/new/login.action" method="post">
       用户名：<input type="text" name="username">
       密码：<input type="password" name="password">
        <input type="submit" value="提交">
    </form>

  </body>
</html>
