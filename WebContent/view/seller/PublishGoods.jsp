<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>商品发布</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/seller/PublishGoods.css">
    <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
    $(function(){ 
    	if(${goods.goodsId}!=""){
    		document.getElementById('portrait').style.display = 'block';
    	}
    	});
    </script>
</head>

<body>

     ${message}
    <div id="head">商品发布</div>
    <hr>
    <div id="head_nav">
        <ul>
            <li><img src="${pageContext.request.contextPath}/image/seller/publish_button.png"><a href="${pageContext.request.contextPath}/publicOrUpdateGoods.action">发布商品</a></li>
            <li><img src="${pageContext.request.contextPath}/image/seller/order.png"><a href="${pageContext.request.contextPath}/findSellerOrders.action">我的订单</a></li>
            <li><img src="${pageContext.request.contextPath}/image/seller/goods_manage.png"><a href="${pageContext.request.contextPath}/findGoods.action?sellerId=1">商品管理</a></li>
        </ul>
    </div>
    <div id="total_content">
        <form action="${pageContext.request.contextPath}/insertOrUpdateGoods.action" enctype="multipart/form-data" method="post">
            <div id="submit_info">
            <input type="hidden" name="goodsId" value="${goods.goodsId}">
                <table>
                    <tr>
                        <td>商品名称:</td>
                        <td><input class="goods_info_input" style="width: 100px" type="text" name="goodsName" value="${goods.goodsName}"></td>
                    </tr>
                    <tr>
                        <td>商品类型:</td>
                        <td><select class="goods_info_input" style="width: 100px" type="text" name="typeId" value="${goods.typeId}">
                                <option value="${goods.typeId}">${goods.typeId}</option>
                                <option value="1">手机类</option>
                                <option value="2">家电类</option>
                                <option value="3">出行类</option>
                                <option value="4">书籍类</option>
                                <option value="5">电脑类</option>
                                <option value="6">外设类</option>
                                <option value="7">电子类</option>
                            </select> </td>
                    </tr>
                    <tr>
                        <td>商品价格:</td>
                        <td><input class="goods_info_input" style="width: 50px" type="text" name="goodPrice" value="${goods.goodPrice}">元</td>
                    </tr>
                    <tr>
                        <td>商品数量:</td>
                        <td><input class="goods_info_input" style="width: 25px" type="textarea" name="goodsLeft" value="${goods.goodsLeft}">件</td>
                    </tr>
                    <tr>
                        <td>商品地区:</td>
                        <td><input class="goods_info_input" type="text" name="goodsAdress" value="${goods.goodsAdress}"></td>
                    </tr>
                    <tr>
                        <td>商品图片</td>
                        <td><input type="file" name="img" onchange="showPreview(this)"><img id="portrait" src="${goods.goodsImg}" style="display:none;width: 50px;height: 50px" /><input name="goodsImg" type="hidden" value="${goods.goodsImg }"></td>
                    </tr>
                    <tr>
                        <td>商品详情:</td>
                        <td><textarea name="goodsDetail"  rows="5" cols="50" style="font-size: 25px OVERFLOW:hidden">${goods.goodsDetail}</textarea></td>
                        <td><button type="submit" style="margin-left:20px; background-color: #4CAF50;border: none;color: white;padding: 15px 32px;text-align: center;text-decoration: none;display: inline-block;font-size: 16px;">发布</button></td>
                    </tr>
                </table>
        </form>
 
    </div>
    <div id="control"><a href="${pageContext.request.contextPath}/view/seller/SellerCenter.jsp">返回中心</a></div>
    <hr> 
    </div>
    <script type="text/javascript">
    function showPreview(source) {
        var file = source.files[0];
        if (window.FileReader) {
            var fr = new FileReader();
            console.log(fr);
            var portrait = document.getElementById('portrait');
            fr.onloadend = function(e) {
                portrait.src = e.target.result;
            };
            fr.readAsDataURL(file);
            portrait.style.display = 'block';
        }
    }
     
    </script>
</body>

</html>