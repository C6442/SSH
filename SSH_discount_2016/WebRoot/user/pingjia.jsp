<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'pingjia.jsp' starting page</title>
    
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
  评价页面
  <div style="margin-left: 200px;">
		<img alt="ss" src="${goods.goodssrc }" style="width: 224px;height: 304px;" ><br>
		<h2 style="font-size: 30px;">${goods.goodsname }</h2><br>
		<h2 style="font-size: 30px;">${goods.goodsthing }</h2><br>
		<span style="text-decoration:line-through;font-size: 16px;">原价:${goods.goodsoldprice }</span><br>
		<h2 style="color: red;font-size: 20px;">特价:${goods.goodsnowprice }</h2>
  	</div>
  	<div style="margin-left: 200px;margin-bottom: 100px;">
    <form action="pingAction!savePing" method="post">
    	<input type="hidden" name="ping.puserid" value="${loginuser.userid }">
    	<input type="hidden" name="ping.pgoodsid" value="${goods.goodsid }">
    	<textarea rows="5" cols="50" name="ping.pthing"></textarea>
    	<input type="submit" value="评价">
    </form>
    </div>
  </body>
</html>
