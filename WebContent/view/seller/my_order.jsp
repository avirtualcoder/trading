<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>我的订单</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/seller/my_order.css">
    <script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
</head>

<body>
${message}
    <div id="head">我的交易记录</div>
    <hr><div id="head_nav">
        <ul>
            <li><img src="${pageContext.request.contextPath}/image/seller/publish_button.png"><a href="${pageContext.request.contextPath}/publicOrUpdateGoods.action">发布商品</a></li>
            <li><img src="${pageContext.request.contextPath}/image/seller/order.png"><a href="${pageContext.request.contextPath}/findSellerOrders.action">我的订单</a></li>
            <li><img src="${pageContext.request.contextPath}/image/seller/goods_manage.png"><a href="${pageContext.request.contextPath}/findGoods.action?sellerId=1">商品管理</a></li>
        </ul>
    </div>
    <div id="total_content">
        <div id="table">
            <table border="1" cellspacing="0">
                <tr>
                    <th>订单id</th>
                    <th>商品名称</th>
                    <th>商品图片</th>
                    <th>交易金额</th>
                    <th>买家名称</th>
                    <th>收货人</th>
                    <th>收货地址</th>
                    <th>收货电话</th>
                    <th>支付方式</th>
                    <th>订单状态</th>
                    <th>
                </tr>
              <c:forEach items="${orderList}" var="Order">
					<tr>
					<td>${Order.itemId}</td>
					<td>${Order.goodsName}</td>
					<td><img src="${Order.goodsImg}" style="width: 30px;height: 30px;"/></td>
					<td>￥：${Order.payPrice}元</td>
					<td>${Order.buyer}</td>
					<td>${Order.receiptName}</td>
					<td>${Order.receiptAddress}</td>	
					<td>${Order.receiptTel}</td>					
					<td>${Order.payMent}</td>
					<td>${Order.orderStatus}</td>
                </tr>
                </c:forEach>
            </table>
        </div>
        <div id="control"><a href="${pageContext.request.contextPath}/view/seller/SellerCenter.jsp">返回中心</a></div>
    </div>
    <hr>
</body>

</html>