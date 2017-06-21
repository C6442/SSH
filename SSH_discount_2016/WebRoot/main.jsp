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
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<style type="text/css">
	
	body{
		width: 1000px;
		
	}
	.showgoods{
		float: left;
		margin: 50px 30px 80px 30px;
	}
	
	</style>

  </head>
  
  <body>
  	<h2>折扣网</h2>
  		<div style="margin-left: 50px;margin-top: 50px;">
  			<c:if test="${loginuser==null}"><a href="register.jsp">注册</a> / <a href="login.jsp">登录</a></c:if>
    		<c:if test="${loginuser!=null}"><a href="personal.jsp">个人中心</a>/</c:if>
    		<c:if test="${loginuser!=null}"><a href="userAction!loginout">退出</a></c:if>
    	</div>
    	<div style="margin-left: 550px;margin-top: 50px;">
  			<form action="goodsAction!findSameGoods" method="post">
  				<input type="text" name="cate.category"><input type="submit" value="搜索">
  			</form>
    	</div>
   <div id="left">
    <div id="lefttop"  style="font-size: 24px;margin-top: 20px;">
		<ul class="nav nav-pills">
			<li role="presentation"><a href="goodsAction!fenyeGoods?pageNow=1">全部</a></li>
			<li role="presentation"><a href="goodsAction!fenyeGoods?pageNow=1&&category=temai ">特卖</a></li>
			<li role="presentation"><a href="goodsAction!fenyeGoods?pageNow=1&&category=nvzhuang ">女装</a></li>
			<li role="presentation"><a href="goodsAction!fenyeGoods?pageNow=1&&category=neiyi ">内衣</a></li>
			<li role="presentation"><a href="goodsAction!fenyeGoods?pageNow=1&&category=nanzhuang">男装</a></li>
			<li role="presentation"><a href="goodsAction!fenyeGoods?pageNow=1&&category=xiepin">鞋品</a></li>
			<li role="presentation"><a href="goodsAction!fenyeGoods?pageNow=1&&category=ertong">儿童</a></li>
			<li role="presentation"><a href="goodsAction!fenyeGoods?pageNow=1&&category=jiafang">家纺</a></li>
			<li role="presentation"><a href="goodsAction!fenyeGoods?pageNow=1&&category=shipin">食品</a></li>
			<li role="presentation"><a href="goodsAction!fenyeGoods?pageNow=1&&category=wenti">文体</a></li>
			<li role="presentation"><a href="goodsAction!fenyeGoods?category=jiadian&&pageNow=1">家电</a></li>
			<li role="presentation"><a href="goodsAction!fenyeGoods?category=shuma&&pageNow=1">数码</a></li>
		</ul>
	</div>
	</div>
	
    <div>
    	<c:forEach items="${goodslist }" var="g">
    	<div >
    		<div class="showgoods">
    			<a href="goodsAction!findOneGoods?goods.goodsid=${g.goodsid }">
    			<img alt="ss" src="${g.goodssrc }" style="width: 224px;height: 304px;" ></a><br>
    				<p style="font-size: 20px;">
    				<a href="goodsAction!findOneGoods?goods.goodsid=${g.goodsid }">${g.goodsname }</a><br>
    				<a href="goodsAction!findOneGoods?goods.goodsid=${g.goodsid }">${g.goodsthing }</a><br>
    				</p>
    				<span style="text-decoration:line-through;font-size: 16px;">原价:${g.goodsoldprice }</span><br>
    				<h2 style="color: red;font-size: 20px;">特价:${g.goodsnowprice }</h2>
    				
    		</div>
    		</div>
    	</c:forEach>
    </div>	
    
    
    <div style="text-align: center;margin-top: 75px;float: left;margin-bottom: 75px;margin-left: 45px;">
    	<a href="goodsAction!fenyeGoods?category=${category }&&pageNow=1">首页</a>
    		<a href="goodsAction!fenyeGoods?category=${category }&&pageNow=${pageNow-1 }">上一页</a>
    		<a href="goodsAction!fenyeGoods?category=${category }&&pageNow=${pageNow+1 }">下一页</a>
    		<a href="goodsAction!fenyeGoods?category=${category }&&pageNow=${totalPage }">尾页</a>
    </div>
    	
  </body>
    	
</html>
