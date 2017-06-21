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
    
    <title>My JSP 'goodsCar.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script type="text/javascript">
		//选中所有:点击父亲选中所有的儿子
		function checkAll(){
			 //父选框的值
			var all=document.getElementById("all");
			 //
			 var  ones=document.getElementsByName("one");
			 
			 //
			 var allstatu=all.checked;
			 for(var i=0;i<ones.length;i++){
				 var one=ones[i];
				 one.checked=allstatu;
			 }
			 
		}
	
	function checkone(){
		var all=document.getElementById("all");
		 //
		 var  ones=document.getElementsByName("one");
		 
		 var num=ones.length;
		 var count=0;
		 for(var i=0;i<num;i++){
			 var one=ines[i];
			 if(one.checked){
				 count++;
			 }
		 }
		 if(count==num){
			 all.checked=true;
		 }else{
			 all.checked=false;
		 }
	}
	
	//至少选择一条
	 function  confirmAdd(){
    var  ones=document.getElementsByName("one");
    var  count=0;
    for(var  i=0;i<ones.length;i++){
       if(ones[i].checked){
         count++;
       }
    }
     if(count>0){
       return   confirm("是否确认前往结算");
     }else{
       alert("请至少选择一个用户");
       return   false;
     }
  }
	 function addBatch(){
		var form1=document.getElementById("form1");
		 //调用上一个函数
	     var  flag=confirmAdd();
	     if(flag){
	         form1.action="";
	         form1.submit();
	     }
		
	}
	</script>

  </head>
  
  <body>
  这是购物车
      <form action="" method="post" id="form1">
    	<table class="table table-condensed" >
			<tr>
				<td></td>
				<td>商品名称</td>
				<td>商品价格</td>
				<td>商品数量</td>
				<td>总价</td>
				<td>操作</td>
			</tr>    	
    	<c:forEach items="${gclist }" var="gc">
    		<tr>
				<td></td>
				<td><a href="goodsAction!findOneGoods?goods.goodsid=${gc.gcgoodsid }">${gc.gcname }</a></td>
				<td>${gc.gcprice }</td>
				<td>${gc.gcnum }</td>
				<td>${gc.gcprice*gc.gcnum }</td>
				<td><a href="goodsCarAction!deleteGoodsCar?goodsCar.gcid=${gc.gcid }&&gcuserid=${loginuser.userid}">删除</a>
					<a href="goodsCarAction!findOneGoodsCar?goodsCar.gcid=${gc.gcid }">下单</a>
				</td>
			</tr>
    	</c:forEach>
    		
    	</table>
    </form>
    <a href="main.jsp">返回首页</a>
  </body>
</html>
