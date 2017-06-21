<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'NotAudited.jsp' starting page</title>
    
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
<div style="margin-left: 150px;margin-top: 40px;">
    <table border="1" cellpadding="1" cellspacing="1" class="table">
    <tr>
    	<td>商户名</td>
    	<td>密码</td>
    	<td>地址</td>
    	<td>手机号码</td>	
    	<td>操    作</td>
    </tr>
    <s:iterator value="userlist" var="u">
    <tr>
    	<td><a href=""><s:property value="username"/></a></td>
    	<td><s:property value="userpass"/></td>
    	<td><s:property value="useraddress"/></td>
    	<td><s:property value="usertel"/></td>
    	<td><a href="adminAction!pass?user.userid=<s:property value="userid"/>&&user.userflag=2&&pageNow=${pageNow }">通过</a>/
    	<a href="adminAction!nopass?user.userid=<s:property value="userid"/>&&user.userflag=2&&pageNow=${pageNow }">不通过</a>
    		</td>
    </tr>
    </s:iterator>
    <tr>
    	<td colspan="5">
			<a href="adminAction!fenyeUser?pageNow=1&&user.userflag=2">首页</a>
			<a href="adminAction!fenyeUser?pageNow=${pageNow-1 }&&user.userflag=2">上一页</a>
			<a href="adminAction!fenyeUser?pageNow=${pageNow+1 }&&user.userflag=2">下一页</a>
			<a href="adminAction!fenyeUser?pageNow=${totalPage }&&user.userflag=2">尾页</a>
    	</td>
    </tr>
    </table>
  
    <a href="admin/admin.jsp">返回</a>
      </div>
  </body>
</html>
