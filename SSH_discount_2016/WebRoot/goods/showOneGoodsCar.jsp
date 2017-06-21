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
    
    <title>My JSP 'showOneGoodsCar.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function check(){
			var x=document.getElementById("pa").value;
			var y=document.getElementById("pass").value;
			
			if(x!=y){
				document.getElementById("a").innerHTML="密码错误";
				return false;
			}
		}
		function test(){
			document.getElementById("a").innerHTML="";
		}
	
	</script>

  </head>
  
  <body>
    <div style="margin-left: 100px;">
    <form action="orderListAction!saveOrder" method="post" onsubmit="return check()">
    	商品的Id：<input type="hidden" name="order.ordergoodsid" value="${goodsCar.gcgoodsid }">${goodsCar.gcgoodsid }<br />
    	商品名称： <input type="hidden" name="order.ordergoodsname"  value="${goodsCar.gcname }">${goodsCar.gcname } <br />
    	商品总价： <input type="hidden" name="order.ordergoodsnum"  value="${goodsCar.gcnum }">${goodsCar.gcnum }件<br />
    	商品总价： <input type="hidden" name="order.ordergoodsprice"  value="${goodsCar.gcnum*goodsCar.gcprice  }">${goodsCar.gcnum*goodsCar.gcprice } 元<br />
    	收货姓名： <input type="text" name="order.ordername"  value="${loginuser.username }"><br />
    	收货号码： <input type="text" name="order.ordertel"  value="${loginuser.usertel }"><br />
    	收货地址： <input type="text" name="order.orderaddress"  value="${loginuser.useraddress }"><br />
    	备注： <input type="text" name="order.orderremark"  value="无"><br />
    	<input type="hidden" value="${loginuser.userbalance }">
    	
    	<input type="hidden" name="order.orderstate" value="1">
    	<input type="hidden" name="order.orderselluserid" value="${goodsCar.gcselluserid }">
    	<input type="hidden" name="order.orderuserid" value="${loginuser.userid }">
    	<input type="hidden" name="goodsC.gcid" value="${goodsCar.gcid }">
    	
		<c:if test="${loginuser.userbalance ge goodsCar.gcnum*gcprice}">
			<input type="hidden" id="pa" value="${loginuser.userpass }">
			密码：<input type="password" id="pass" onfocus="test()"><span id="a"></span><br/>
			<input type="submit" value="结算"></c:if>
		<c:if test="${loginuser.userbalance lt goodsCar.gcnum*gcprice}"><input type="submit" value="余额不足，请前往"><a href="user/chongzhi.jsp">充值</a></c:if>
    
    </form>
    </div>
  </body>
</html>
