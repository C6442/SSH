<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'admin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body style="margin-left: 50px;">
    管理员<br />
    <a href="adminAction!fenyeUser?pageNow=1&&user.userflag=2">审核商户</a>
    <a href="adminAction!fenyeUser?pageNow=1&&user.userflag=1">查看用户</a>
    <a href="adminAction!fenyeUser?pageNow=1&&user.userflag=3">查看商家</a>
    <a href="adminAction!fenyeUser?pageNow=1&&user.userflag=0">审核未通过</a>
    <a href="goodsAction!fenyeAllGoods?pageNow=1">查看商品</a>
    
  </body>
</html>
