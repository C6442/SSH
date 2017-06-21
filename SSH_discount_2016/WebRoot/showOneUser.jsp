<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showOneUser.jsp' starting page</title>
    
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
    <form action="userAction!updateUser" method="post">
    <input type="hidden" value="${loginuser.userid }"  name="user.userid"><br/>
     用户名:<input type="hidden" value="${loginuser.username }"  name="user.username">${loginuser.username }<br/>
    用户密码:<input type="text" value="${loginuser.userpass }" name="user.userpass"><br/>
    用户余额:<input type="hidden" value="${loginuser.userbalance }" name="user.userbalance">${loginuser.userbalance }<a href="user/chongzhi.jsp">充值</a><br/>
    用户收货地址:<input type="text" value="${loginuser.useraddress }" name="user.useraddress"><br/>
    手机号:<input type="text" value="${loginuser.usertel }" name="user.usertel"><br/>
    
   用户类型:<c:if test="${loginuser.userflag==1 }">用户</c:if> <br/>
    <c:if test="${loginuser.userflag==3 }">商家</c:if> <br/>
    <input type="hidden" value="${loginuser.userflag }"  name="user.userflag">
    <input type="submit" value="修改">
    
    </form>
  </body>
</html>
