<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://lib.sinaapp.com/js/jquery/2.0.2/jquery-2.0.2.min.js"></script>
<script>
	
</script>
<style>
	*{
		margin:0px;
		padding:0px;
		font-family: "microsoft yahei";
	}
	
	body{
		width:100%;
		height:100%;
		background: rgb(255, 255, 200);
	}
	header{
		height:36px;
		width:100%;
		background:#b9b0b0;
		color:white;
		font-size:26px;
		opacity:0.8;
		text-align: center;
		line-height: 36px;
		letter-spacing:27px;
	}
	
	.info-left{
		width:33%;
		height:526px;
		float:left;
		border:1px solid blue;
	}
	
	.info-mindle{
		width:33%;
		height:526px;
		float:left;
		border:1px solid blue;
	}
	
	.info-right{
		width:33%;
		height:526px;
		float:left;
		border:1px solid blue;
	}
	
	 p{
		padding-left: 26px;
		width: 100%;
		height: 36px;
		font-size: 16px;
		line-height: 36px;
	}
	input{
		width: 61%;
		height: 29px;
		border: 1px solid darkgray;
	}
	
	footer{
		width:100%;
		height: 51px;
		background: gray;
		position:fixed; 
		bottom:0;
		line-height: 38px;
	}
	
	footer input{
		width:86px;
		height: 36px;
		margin-left: 386px;
	}
</style>
</head>
<body>
	<header>申诉管理</header>
	<div style="margin:auto">
		<div class="info-left">
			<h2>商品详情</h2>
			<p>商品类型：<input type="text" name="typeId" value="${goods.typeId}" /></p>
			<p>卖家姓名：<input type="text" name="userName" value="${seller.userName }" /></p>
			<p>商品名称：<input type="text" name="goodsName" value="${goods.goodsName}" /></p>
			<p>商品图片：</p>
			<p style="width: 166px;height:166px;border:1px solid red;margin-bottom:6px;padding:0px;margin-left:126px;"><img src="${goods.goodsImg }" name="goodsImg" style="width:100%;height:100%;" /></p>
			<p>商品价格：<input type="text" name="goodPrice" value="${goods.goodPrice }" /></p>
			<p>商品说明：<input type="text" name="goodsDetail" value="${goods.goodsDetail }" /></p>
			
		</div>
		<div class="info-mindle">
			<h2>订单详情</h2>
			<p>交易时间：<input type="text" name="" value="" /></p>
			<p>购买商品：<input type="text" name="goodsName" value="" /></p>
			<p>卖家姓名：<input type="text" name="userName" value="${seller.userName }" /></p>
			<p>卖家信誉：<input type="text" name="credit" value="${seller.credit }" /></p>
			<p>买家名称：<input type="text" name="userName" value="${buyer.userName }" /></p>
			<p>购买数量：<input type="text" name="" value="" /></p>
			<p>付款金额：<input type="text" name="" value="" /></p>
			<p>订单状态：<input type="text" name="" value="" /></p>
			
		</div>
		<div class="info-right">
			<h2>申诉详情</h2>
			<p>申诉时间：<input type="text" name="appealTime" value="${appeal.appealTime}" /></p>
			<p>申诉状态：<input type="text" name="appealStatus" value="${appeal.appealStatus}" /></p>
			<p>申诉图片：</p>
			<p style="width: 166px;height:166px;border:1px solid red;margin-bottom:6px;padding:0px;margin-left:126px;"><img src="${appeal.appealImg }" name="appealImg" style="width:100%;height:100%;" /></p>
			<p>申诉原因：<input type="text" name="appealReason" value="${appeal.appealReason}"/></p>
		</div>
	</div>
	<footer>
		<input type="button" value="同意" />
		<input type="button" value="返回" />
	</footer>
</body>
</html>