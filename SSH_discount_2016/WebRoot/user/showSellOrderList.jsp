<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showSellOrderList.jsp' starting page</title>
    
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
    			<td colspan="7">
    			处理订单
    			</td>
    		</tr>
    		<tr>
    			<td>商品名称</td>
    			<td>收货姓名</td>
				<td>收货地址</td>
				<td>备注</td>
				<td>联系电话</td>
				<td>商品数量</td>
				<td>商品总价</td>
				<td>状态</td>
			</tr>
		<c:if test="${empty orderlist}"><h2>你还没有订单</h2></c:if>
		<c:forEach items="${orderlist }" var="order">
			<tr>
    			<td>${order.ordergoodsname }</td>
    			<td><a href="userAction!sellFindOneUser?user.userid=${order.orderuserid }">${order.ordername }</a></td>
				<td>${order.orderaddress }</td>
				<td>${order.orderremark }</td>
				<td>${order.ordertel }</td>
				<td>${order.ordergoodsnum }</td>
				<td>${order.ordergoodsprice }</td>
				<td>
					<c:if test="${order.orderstate==1 }"><a href="orderListAction!updateOrder2?order.orderid=${order.orderid }">发货</a></c:if>
					<c:if test="${order.orderstate==2 }">已发货</c:if>
					<c:if test="${order.orderstate==3 }">已签收</c:if>
					<c:if test="${order.orderstate==4 }">回复</c:if>
				</td>
			</tr>
		</c:forEach>
			<tr>
    			<td colspan="8">
    			<a href="orderListAction!findOrder?order.orderselluserid=${loginuser.userid }&&pageNow=1">首页</a>
 				<a href="orderListAction!findOrder?order.orderselluserid=${loginuser.userid }&&pageNow=${pageNow-1}">上一页</a>
 				<a href="orderListAction!findOrder?order.orderselluserid=${loginuser.userid }&&pageNow=${pageNow+1}">下一页</a>
 				<a href="orderListAction!findOrder?order.orderselluserid=${loginuser.userid }&&pageNow=${totalPage}">尾页</a>
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
