<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'findAllGoods.jsp' starting page</title>
    
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
  <form action="" method="post" id="form1">
    	<table class="table table-condensed" >
			<tr>
				<td>商品名称</td>
				<td>商品价格</td>
				<td>商品类型</td>
				<td>商品描述</td>
				<td>操作</td>
			</tr>    	
    	<c:forEach items="${goodslist }" var="g">
    		<tr>
				
				<td>${g.goodsname }</td>
				<td>${g.goodsnowprice }</td>
				<td>${g.goodscategory }</td>
				<td>${g.goodsthing }</td>
				<td><a href="goodsAction!deleteGoods?goods.goodsid=${g.goodsid }">删除</a>
					<a href="goodsAction!findGoods?goods.goodsid=${g.goodsid }">修改</a>
				</td>
			</tr>
    	</c:forEach>
    		<tr>
 				<td colspan="6" align="center">
 				<a href="goodsAction!findAllGoods?pageNow=1&&goodsuserid=${loginuser.userid }">首页</a>
 				<a href="goodsAction!findAllGoods?pageNow=${pageNow-1 }&&goodsuserid=${loginuser.userid }">上一页</a>
 				<a href="goodsAction!findAllGoods?pageNow=${pageNow+1 }&&goodsuserid=${loginuser.userid }">下一页</a>
 				<a href="goodsAction!findAllGoods?pageNow=${totalPage }&&goodsuserid=${loginuser.userid }">尾页</a>
 				</td>
    		</tr>
    	</table>
    </form>
    <a href="main.jsp">返回首页</a>
  
    
  </body>
</html>
