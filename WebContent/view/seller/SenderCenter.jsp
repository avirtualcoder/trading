<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>跑腿中心</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/seller/SenderCenter.css">
</head>

<body>
    <div id="head">跑腿中心</div>
    <hr>
    <div id="head_nav">
        <ul>
            <li><img src="${pageContext.request.contextPath}/image/seller/order.png"><a href="${pageContext.request.contextPath}/queryMyTask.action">我的任务</a></li>
            <li><img src="${pageContext.request.contextPath}/image/seller/publish_button.png"><a href="${pageContext.request.contextPath}/takeTaskList.action">任务广场</a></li>
        </ul>
    </div>
    <div id="table">
        <table border="1" cellspacing="0">
            <tr>
                <th>配送id</th>
                <th>配送人</th>
                <th>商品名称</th>
                <th>商品地址</th>
                <th>商品图片</th>
                <th>卖家名称</th>
                <th>卖家电话</th>
                <th>收货人</th>
                <th>收货地址</th>
                <th>收货人电话</th>
                <th>收货时间</th>
                <th>配送进度</th>
            </tr>
            <c:forEach items="${myTaskList}" var="task">
                <tr>
                    <td>${task.senderId}</td>
					<td>${task.senderName}</td>
                    <td>${task.senderTel}</td>
        			<td>${task.goodsName}</td>
        			<td>${task.goodsAdress}</td>
        			<td><img src="${task.goodsImg}" style="width: 30px; height: 30px"/></td>
        			<td>${task.sellerName}</td>
        			<td>${task.sellerTel}</td>
        			<td>${task.receiptPerson}</td>
        			<td>${task.receiptAddress}</td>
        			<td>${task.receiptTel}</td>
        			<td>${task.receiptTime}</td>
        			<td>${task.deliveryPlace}</td>
                                  
                    </tr>
			</c:forEach>
        </table>
    </div>
    <hr>
    </div>
    <a href="${pageContext.request.contextPath}/view/seller/SellerCenter.jsp">返回中心</a>
</body>

</html>