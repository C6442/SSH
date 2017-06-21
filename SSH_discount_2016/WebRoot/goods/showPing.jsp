<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

  </head>
  
  <body>
    <c:forEach items="${pinglist }" var="ping">
    	<div style="margin-left: 45px;margin-top: 15px;">
    		${ping.puserid }: ${ping.pthing }
				<div>
					<c:forEach items="${replylist }" var="reply">
						<c:if test="${reply.rpingid==ping.pid }">商家回复：${reply.rthing } </c:if>
					</c:forEach>
				</div>
    	</div>
    </c:forEach>
    
    <div style="margin-left: 45px;margin-top: 15px;">
    <a href="pingAction!fenyePing?pageNow=1&&ping.pgoodsid=${goodsid }">首页</a>
    <a href="pingAction!fenyePing?pageNow=${pageNow-1 }&&ping.pgoodsid=${goodsid }">上一页</a>
    <a href="pingAction!fenyePing?pageNow=${pageNow+1 }&&ping.pgoodsid=${goodsid }">下一页</a>
    <a href="pingAction!fenyePing?pageNow=${totalPage }&&ping.pgoodsid=${goodsid }">尾页</a>
    </div>
    
    
  </body>
</html>
