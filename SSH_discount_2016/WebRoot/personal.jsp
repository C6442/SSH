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
    
    <title>My JSP 'personal.jsp' starting page</title>
    
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
  <a href="showOneUser.jsp">个人资料</a> <br/>

    <c:if test="${loginuser.userflag==3 }"><a href="addgoods.jsp">发布商品</a>  <br/></c:if>
    <c:if test="${loginuser.userflag==3 }"><a href="goodsAction!findAllGoods?pageNow=1&&goodsuserid=${loginuser.userid }">查看商品</a>  <br/></c:if>
    <c:if test="${loginuser.userflag==3 }"><a href="orderListAction!findOrder?order.orderselluserid=${loginuser.userid }&&pageNow=1">处理订单</a>  <br/></c:if>
    <a href="goodsCarAction!findAllGoodsCar?gcuserid=${loginuser.userid }">我的购物车</a> <br/>
    <a href="orderListAction!findAllOrder?order.orderuserid=${loginuser.userid }&&pageNow=1">历史订单</a> <br/>
    <a href="pingAction!findMyPing?ping.puserid=${loginuser.userid }&&pageNow=1">我的评价</a><br/>
    <c:if test="${loginuser.userflag==3 }"><a href="replyAction!findMyReply?reply.ruserid=${loginuser.userid }&&pageNow=1">我的回复</a><br/></c:if>
    <a href="main.jsp">返回首页</a>
    
  </body>
</html>
