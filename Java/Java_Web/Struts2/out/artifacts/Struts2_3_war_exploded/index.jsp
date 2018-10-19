<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--引用struts标签库--%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body>

<h1>属性驱动</h1>
<form action="<%=path %>/loginAction.action" method="post">
  username:<input type="text" name="username"><br>
  password:<input type="password" name="password"><br>
  <input type="submit" value="提交">
</form>

<h1>模型驱动</h1>
<form action="<%=path %>/muserLogin.action" method="post">
  username:<input type="text" name="username"><br>
  password:<input type="password" name="password"><br>
  <input type="submit" value="提交">
</form>

<h1>标签模型驱动</h1>
  <%--action只需要写配置文件中的名字 不需要写全路径--%>
  <s:form namespace="/" action="suserLogin" method="post">
  <s:textfield name = "user.username"/>用户名：
  <s:password name = "user.password"/>密码：
  <s:submit value="提交"  />
</s:form>
</body>
</html>
