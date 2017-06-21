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
    
    <title>My JSP 'showPing.jsp' starting page</title>
    
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
    <form action="" method="post">
    <c:if test="${empty pinglist}"><h2>你还没有评价过！</h2></c:if>
    	<c:if test="${!empty pinglist}">
    	<table  class="table table-condensed">
    		<tr>
    			<td colspan="3">
    			我的评价
    			</td>
    		</tr>
    		<tr>
    			<td>评价编号</td>
    			<td>评价内容</td>
    			<td>评价的商品编号</td>
    		</tr>
    	
    	<c:forEach items="${pinglist }" var="ping">
    		<tr>
    			<td>${ping.pid }</td>
    			<td>${ping.pthing }</td>
    			<td>${ping.pgoodsid }</td>
    		</tr>
    	</c:forEach>
    		<tr>
    			<td colspan="3" align="center">
    				<a href="pingAction!findMyPing?ping.puserid=${loginuser.userid }&&pageNow=1">首页</a>
    				<a href="pingAction!findMyPing?ping.puserid=${loginuser.userid }&&pageNow=${pageNow-1}">上一页</a>
    				<a href="pingAction!findMyPing?ping.puserid=${loginuser.userid }&&pageNow=${pageNow+1}">下一页</a>
    				<a href="pingAction!findMyPing?ping.puserid=${loginuser.userid }&&pageNow=${totalPage}">尾页</a>
    			</td>
    		</tr>
    	</table>
    	</c:if>
    </form>
  </body>
</html>
