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
    
    <title>My JSP 'showOneGoods.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
body{
width: 800px;

margin-bottom:300px;
text-align: center;
}
	
</style>

  </head>
  
  <body>
  
  
    <div>
    <c:if test="${loginuser!=null }"><a href="goodsCarAction!findAllGoodsCar?gcuserid=${loginuser.userid }">购物车</a></c:if><br>
			<img alt="ss" src="${goods.goodssrc }" style="width: 224px;height: 304px;" ><br>
				<h2 style="font-size: 30px;">${goods.goodsname }</h2><br>
				<h2 style="font-size: 30px;">${goods.goodsthing }</h2><br>
				<span style="text-decoration:line-through;font-size: 16px;">原价:${goods.goodsoldprice }</span><br>
				<h2 style="color: red;font-size: 20px;">特价:${goods.goodsnowprice }</h2>
				
				<form action="goodsCarAction!saveGoodsCar?goodsid=${goods.goodsid }" method="post">
					<input type="hidden" name="goodsCar.gcname" value="${goods.goodsname }">
					<input type="hidden" name="goodsCar.gcgoodsid" value="${goods.goodsid }">
					<input type="hidden" name="goodsCar.gcprice" value="${goods.goodsnowprice }">
					购买数量:<input type="text" name="goodsCar.gcnum" value="1"><br>
					<!-- 买家的id就是登录的id  卖家的Id就是商品里面保存的Id -->
					<input type="hidden" name="goodsCar.gcselluserid" value="${goods.goodsuserid }">
					<input type="hidden" name="goodsCar.gcuserid" value="${loginuser.userid }">
					<c:if test="${loginuser==null }">您还未登录,请<a href="login.jsp">登录</a>后加入购物车</c:if><br>
					<c:if test="${loginuser!=null }"><button type="submit" style="font-size: 38px;">加入购物车</button></c:if>
					
				</form>
	<!-- 评价 -->
				<div>
					<h1>商品评价</h1>
					
					<c:forEach items="${pinglist }" var="ping">
					<div  style="margin-top: 15px;">
						${ping.puserid }: ${ping.pthing }
						<div>
							<c:forEach items="${replylist }" var="reply">
								<c:if test="${reply.rpingid==ping.pid }">商家回复：${reply.rthing }<br> </c:if>
							</c:forEach>
						</div>
						<c:if test="${loginuser.userid==goods.goodsuserid }"><a href="pingAction!findOnePing?ping.pid=${ping.pid }">回复</a></c:if>
						<br/>
						</div>
					</c:forEach>
					<div style="margin-top: 50px;">
					<c:if test="${pinglist.size()>10 }"><a href="pingAction!fenyePing?pageNow=1&&ping.pgoodsid=${goods.goodsid }">查看更多评价</a></c:if>
					<c:if test="${pinglist.size()<10 }">暂无更多评价</c:if>
					</div>
				</div>
				
				
				
				<div style="margin-top: 75px;">
				<a href="main.jsp">返回首页</a>
				</div>
 		</div>
  </body>
</html>
