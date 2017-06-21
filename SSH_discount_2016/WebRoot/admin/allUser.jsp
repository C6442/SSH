<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'allUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
  </head>
  
  <body>
    <table border="1" class="table">
    	<tr>
    		<td>用户id</td>
    		<td>用户名</td>
    		<td>用户密码</td>
    		<td>用户余额</td>
    		<td>手机号码</td>
    		<td>地址</td>
    		<td>操作</td>
    	</tr>
    <c:forEach items="${userlist }" var="u">
    	<tr>
    		<td>${u.userid }</td>
    		<td>${u.username }</td>
    		<td>${u.userpass }</td>
    		<td>${u.userbalance }</td>
    		<td>${u.usertel }</td>
    		<td>${u.useraddress }</td>
    		<td><a href="adminAction!delUser?user.userid=${u.userid }&user.userflag=${u.userflag }&pageNow=${pageNow}">删除</a>
    		</td>
    	</tr>
    </c:forEach>
    <tr>
    	<td colspan="7" align="center">
    		<a href="adminAction!fenyeUser?user.userflag=${user.userflag }&&pageNow=1">首页</a>
    		<a href="adminAction!fenyeUser?user.userflag=${user.userflag }&&pageNow=${pageNow-1 }">上一页</a>
    		<a href="adminAction!fenyeUser?user.userflag=${user.userflag }&&pageNow=${pageNow+1 }">下一页</a>
    		<a href="adminAction!fenyeUser?user.userflag=${user.userflag }&&pageNow=${totalPage }">尾页</a>
    	</td>
    </tr>
    </table>
      <a href="admin/admin.jsp">返回</a>
  </body>
</html>
