<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>我的商品</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/seller/goods_manage.css">
</head>

<body>
访问消息：${message}
<%-- 开始：
<c:forEach var="goods" items=${GoodsList}>
循环：${goods.goodsId}
</c:forEach>
结束 --%>
    <div id="head">商品管理</div>
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
                    <th>商品id</th>
                    <th>商品名称</th>
                    <th>商品图片</th>
                    <th>商品价格</th>
                    <th>商品状态</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${GoodsList}" var="Goods">
                    <tr>
                        <td>${Goods.goodsId}</td>
                        <td>${Goods.goodsName}</td>
                        <td><img  src="${Goods.goodsImg }" style="width: 30px;height: 30px;"><input type="hidden" value="${Goods.goodsImg }"></td>
                        <td>${Goods.goodPrice}</td>
                        <td>${Goods.goodsStatus}</td>
                        <td>
                        <a href="${pageContext.request.contextPath}/updateGoodsStatus.action?goodsId=${Goods.goodsId}&goodsStatus=1">下架</a>
                        <a href="${pageContext.request.contextPath}/updateGoodsStatus.action?goodsId=${Goods.goodsId}&goodsStatus=0">上架</a>
                        <a href="${pageContext.request.contextPath}/publicOrUpdateGoods.action?goodsId=${Goods.goodsId}">编辑</a>
                        <a href="${pageContext.request.contextPath}/deleteGoods.action?goodsId=${Goods.goodsId}">删除</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div id="control">
        <a href="${pageContext.request.contextPath}/view/seller/SellerCenter.jsp">返回中心</a></div>
        <hr>
    </div>
</body>

</html>