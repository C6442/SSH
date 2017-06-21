<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form action="userAction!saveUser" method="post">
    	<table border="1" align="center">
    		<tr>
    			<td colspan="2">用户注册</td>
    		</tr>
    		<tr>
    			<td>用户名</td>
    			<td><input type="text" name="user.username" id="name" required></td>
    		</tr>
    		<tr>
    			<td>密码</td>
    			<td><input type="password" name="user.userpass" id="pass" required></td>
    		</tr>
    		<tr>
    			<td>手机号码</td>
    			<td><input type="text" name="user.usertel"></td>
    		</tr>
    		<tr>
    			<td>地址</td>
    			<td><input type="text" name="user.useraddress"></td>
    		</tr>
    		<tr>
    			<td>用户类别</td>
    			<td><input type="radio" name="user.userflag" value="1"/>用户
    				<input type="radio" name="user.userflag" value="2"/>商家</td>
    		</tr>
    		<tr>
    			<td colspan="2">
    				<input type="submit" value="注册">
    				<a href="login.jsp">登录</a>
    			</td>
    		</tr>
    		
    	</table>
    
    </form>
  </body>
</html>
