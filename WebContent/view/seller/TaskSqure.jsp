<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>跑腿中心</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/seller/TaskSquare.css">
</head>

<body>
    <div id="head">任务广场</div>
    <hr>
    <div id="head_nav">
        <ul>
            <li><img src="${pageContext.request.contextPath}/image/seller/order.png"><a href="${pageContext.request.contextPath}/queryMyTask.action">我的任务</a></li>
            <li><img src="${pageContext.request.contextPath}/image/seller/publish_button.png"><a href="${pageContext.request.contextPath}/takeTaskList.action">任务广场</a></li>
        </ul>
    </div>
    <hr>
    </div>
    <div id="search_by_area">
        <label>任务地区   </label><input style="height: 30px" type="text" name="search">   <button style="width: auto;height: 30px">搜索</button>
    </div>
    <div id="table">
        <table border="1" cellspacing="0">
            <tr>
                <th>商品名称</th>
                <th>商品图片</th>
                <th>商家名称</th>
                <th>商家电话</th>
                <th>发货地址</th>
                <th>买家名称</th>
                <th>买家姓名</th>
                <th>买家电话</th>
                <th>收货地址</th>
                <th>订单时间</th>
                <th>任务状态</th>
                <th>操作</th>
            </tr>
           <c:forEach items="${taskList}" var="task">
                <tr>
                    <td>${task.goodsName}</td>
					<td><img src="${task.goodsImg}" style="width: 30px;height: 30px;"></td>
                    <td>${task.sellerName}</td>
                    <td>${task.sellerTel}</td>
                    <td>${task.goodsAdress}</td>
                    <td>${task.buyer}</td>
                    <td>${task.buyerName}</td>
                    <td>${task.buyerTel}</td>
                    <td>${task.buyerAddress}</td>
                    <td>${task.orderTime}</td>
                    <td>${task.pickTask}</td>
                    <td><a href="${pageContext.request.contextPath}/addDelivery.action">领取</a></td>

                    </tr>
			</c:forEach>
			</table>
			</div>
</body>

</html>