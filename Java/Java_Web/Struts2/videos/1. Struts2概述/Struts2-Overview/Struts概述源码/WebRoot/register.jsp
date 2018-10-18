<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  </head>
  
  <body>
   	<form action="saveUser.action" method="post">
   		<input type="text" name="username">
   		<input type="password" name="password">
   		<input type="password" name="password1">
   		<input type="submit" value="提交">
   	</form>
  </body>
</html>
