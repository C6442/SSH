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
    
    <title>My JSP 'showReply.jsp' starting page</title>
    
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
    	<table  class="table table-condensed">
    		<tr>
    			<td colspan="4">
    			我的回复
    			</td>
    		</tr>
    		<tr>
    			<td>回复编号</td>
    			<td>回复的评价编号</td>
    			<td>回复内容</td>
    			<td>回复的商品编号</td>
    		</tr>
    	<c:forEach items="${replylist }" var="reply">
    		<tr>
    			<td>${reply.rid }</td>
    			<td>${reply.rpingid }</td>
    			<td>${reply.rthing }</td>
    			<td>${reply.rpinggoodsid }</td>
    		</tr>
    	</c:forEach>
    		<tr>
    			<td colspan="4" align="center">
    				<a href="replyAction!findMyReply?reply.ruserid=${loginuser.userid }&&pageNow=1">首页</a>
    				<a href="replyAction!findMyReply?reply.ruserid=${loginuser.userid }&&pageNow=${pageNow-1}">上一页</a>
    				<a href="replyAction!findMyReply?reply.ruserid=${loginuser.userid }&&pageNow=${pageNow+1}">下一页</a>
    				<a href="replyAction!findMyReply?reply.ruserid=${loginuser.userid }&&pageNow=${totalPage}">尾页</a>
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
