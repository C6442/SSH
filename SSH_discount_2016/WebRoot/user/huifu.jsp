<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'huifu.jsp' starting page</title>
    
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
  <div style="margin-left: 250px;margin-top: 150px;border-color: #999;">
    <h1>商品评价</h1>
    
		${ping.puserid }: ${ping.pthing }
		<form action="replyAction!saveReply" method="post">
			<input type="hidden" name="reply.rpinggoodsid" value="${ping.pgoodsid }">
			<input type="hidden" name="reply.rpingid" value="${ping.pid }">
			<textarea rows="5" cols="50" name="reply.rthing"></textarea>
			<input type="hidden" name="reply.ruserid" value="${loginuser.userid }">
			<input type="submit" value="回复">
		</form>
	</div>					
						
				
  </body>
</html>
