<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>卖家中心</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/seller/SellerCenter.css">
</head>
<body>
	<div id="head">卖家中心</div>
	<hr>
<div id="total_content">
<div id="right_nav">
<ul>
            <li><img src="${pageContext.request.contextPath}/image/seller/publish_button.png"><a href="${pageContext.request.contextPath}/publicOrUpdateGoods.action">发布商品</a></li>
            <li><img src="${pageContext.request.contextPath}/image/seller/order.png"><a href="${pageContext.request.contextPath}/findSellerOrders.action">我的订单</a></li>
            <li><img src="${pageContext.request.contextPath}/image/seller/goods_manage.png"><a href="${pageContext.request.contextPath}/findGoods.action?sellerId=1">商品管理</a></li>
        </ul>
<a href="${pageContext.request.contextPath}/queryMyTask.action">前往跑腿</a>
<a href="./registered.jsp">前往开通</a>
</div>

<div id='seller_info'>
	<table cellspacing="15">
		<tr>
			<td><img src="${pageContext.request.contextPath}/image/seller/7.png"></td>
			<td>卖家姓名${user_id}</td>
		</tr>
		<td><img src="${pageContext.request.contextPath}/image/seller/xinyu.png"></td>
		<td>
		卖家信用 ${credit}
		</td>
		<tr>
	</table>
	<ul>
	<li>
	<a href="${pageContext.request.contextPath}/view/seller/goods_left.jsp">商品留言</a></li>
	<li><a href="${pageContext.request.contextPath}/view/seller/chat.jsp">我的消息</a></li>
</div>
<hr>
</div>

</body>
</html>