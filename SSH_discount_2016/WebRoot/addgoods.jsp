<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addgoods.jsp' starting page</title>
    
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
    添加商品
    <form action="goodsAction!saveGoods" method="post" enctype="multipart/form-data">
    	<table border="1" align="center">
    		<tr>
    			<td colspan="2">添加商品</td>
    		</tr>
    		<tr>
    			<td>商品名</td>
    			<td><input type="text" name="goods.goodsname"></td>
    		</tr>
    		<tr>
    			<td>商品类别</td>
    			<td>
    				<select name="goods.goodscategory">
    					<option value="nvzhuang">女装</option>
    					<option value="neiyi">内衣</option>
    					<option value="nanzhuang">男装</option>
    					<option value="xiepin">鞋品</option>
    					<option value="ertong">儿童</option>
    					<option value="jiafang">家纺</option>
    					<option value="shipin">食品</option>
    					<option value="wenti">文体</option>
    					<option value="jiadian">家电</option>
    					<option value="shuma">数码</option>
    					
    					<option value="temai" selected="selected">特卖</option>
    				</select>
    			</td>
    		</tr>
    		<tr>
    			<td>展示图片</td>
    			<td><input type="file" name="myFile"/></td>
    		</tr>
    		<tr>
    			<td>商品描述</td>
    			<td><input type="text" name="goods.goodsthing"></td>
    		</tr>
    		<tr>
    			<td>原价</td>
    			<td><input type="text" name="goods.goodsoldprice"></td>
    		</tr>
    		<tr>
    			<td>现价</td>
    			<td><input type="text" name="goods.goodsnowprice"></td>
    		</tr>
    		
    		<tr>
    			<td colspan="2">
    				<input type="hidden" name="goods.goodsuserid" value="${loginuser.userid }">
    				<input type="submit" value="提交">
    			</td>
    		</tr>
    		
    	</table>
    
    </form>
  </body>
</html>
