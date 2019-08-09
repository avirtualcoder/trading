<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
		*{
			margin:0px;
			padding:0px;
			font-family: "microsoft yahei";
		}
		div.nav2{
			/* display: table; */
			width:1200px;
			height: 1400px;
			margin-left: 80px;
		}/* 主体部分 */
		
		div.item{
			width:220px;
			height:400px;
			padding: 38px 9px 10px;
			border: 1px solid #fff;
			-webkit-transition: border-color .1s ease;
  			transition: border-color .1s ease;
  			float:left;
  			margin-right:20px;
		}
		
		div.thumbnail{
			width:220px;
			height:220px;
		}
		div.show{
			width:1200px;
			margin-left:60px;
		}
		div.order{
			padding:6px 8px;
			background-color:#F1F1F1;
			height:26px;
		}
		div.order-left{
			float:left;
		}
		div.order-left a{
			display:block;
			float:left;
			height:25px;
			border:1px solid #DDDDDD;

		}
		div.order-right{
			float:right;
		}
		a.order-right{
			display:block;
			float:right;
			height:25px;
			border:1px solid #DDDDDD;

		}
		i.order{
			padding:0px 10px;
			color:#666666;
			font: 12px/150% tahoma,arial,Microsoft YaHei,Hiragino Sans GB,"\u5b8b\u4f53",sans-serif;
			valign:middle
		}
		span.USER_NAME{
			color:#999999;
			font-size:12px;
			overflow: hidden;
			text-overflow: ellipsis;
			white-space: nowrap;
		}
		span.CREDIT{
			color:#999999;
			font-size:12px;
		}
		img{
			width:220px;
			height:220px;
		}
		em{
			color:#E4393C;
			font-size:16px;
			font-family:"Verdana";
		}
		i.price{
			color:#E4393C;
			font-size:20px;
			font-family:"Verdana"
		}
		h5{
			font-size:12px;
			overflow: hidden;
			text-overflow: ellipsis;
			white-space: nowrap;
		}
		p{
			font-size:12px;
			overflow: hidden;
			text-overflow: ellipsis;
			/*设置成弹性盒子 */
			display: -webkit-box;
			/*显示的个数 */
			-webkit-line-clamp: 2;
			/* 属性规定框的子元素应该被水平或垂直排列。 */
			-webkit-box-orient: vertical;		
		}
		ul {
		    list-style: none;
		}
		
		.pagebar{
			width:100%; 
			height: 38px; 
 			background: #F2A807; 
 			position:fixed;  
			bottom:0; 
			text-align: center; 
			line-height: 38px; 
		}

		
		
		
			.header{
				height: 29px;
				background-color: #f2a807;
				width:100%;
				line-height: 30px;
				font: 12px/1.5 Microsoft YaHei,tahoma,arial,Hiragino Sans GB,\\5b8b\4f53,sans-serif;
			}
			
			a{
				text-decoration: none;
			}
			
			div.dt1 a{
				color: white;
			}
			
			ul.hx1 li,a{
				color: black;
			}
			
			a.collect{
				line-height: 35px;
				display: inline-block;
				vertical-align:middle;
				color: white;
			}/* 我的收藏 */
			a.menu{
				color:white;
			}
			ul{
				list-style:none;
			}
			
			li.menu{
				text-decoration: none;
				margin: 0 0 15px 0;
			}/* 左边菜单 */
			
			li.key{
				float:left;
				margin-left: 10px;
				display:inline-block;
				width:auto;
			}/* 搜索框关键词 */
			
			li.hx{
				float:left;
				display:inline-block;
				width:88px;
				text-align: center;
			}/* 横向导航栏 */
			
			
			
			ul.fr{
				list-style: none;
				display:inline-block; 
				padding-left:0;
			}/* 导航栏右标签 */
			
			li.fore{
				display:inline-block;
				width:auto;
				text-align: center;
				line-height: 30px;
				margin-left: 30px;
			} /* 导航栏右标签 */
			
			div.w{
				width:1210px;
				margin:0 auto;
				display: table;
			}/* 导航栏 */
			
			div.fl{
				float:left;
				display: table-cell;
			}/* 导航栏左盒子 */
			
			div.dt{
				padding-top: 6px;
				color: white;
			}/* 你的所在地 */
			
			div.fr{
				float: right;	
				display: table-cell;
			}/* 导航栏右盒子 */
			div.dt1{
				padding: 0 10px 0 10px;
			}
			div.nav1{
				width:1300px;
				height: 100px;
			}
			div.nav2{
				/* display: table; */
				width:1210px;
				height: 644px;
				
				margin-left: 80px;
			}/* 主体部分 */
			
			div.nav3{
				width:1210px;
			}
			
			div.menu-top{
				width:210px;
				height:33px;
				background-color: #FF0036;
			}
			
			div.text{
				text-align: center;
				line-height:33px;
				color: white;
				font-size: 16px;
			}
			
			div.menu{
				width:190px;
				height:auto;
				background-color: #666463;
				padding:0 0 0 20px;
				
			}/* 左边菜单 */
			
			div.logo{
				float:left;
				display:inline-block;
				width:100px;
				height:100px;
				background-image: url(../image/logo.jpg);
				background-size:100px 100px;
				background-repeat:no-repeat;
				background-position:center;
				padding: 0 50px 0 100px;
			}/* logo */
			
			div.key{
				width:350px;
				height: 20px;
				font: 12px/1.5 Microsoft YaHei,tahoma,arial,Hiragino Sans GB,\\5b8b\4f53,sans-serif;
				float:right;
				margin:60px 52px 0 0;
			}/* 搜索框关键词 */
			
			ul.hx1{
				display: none;
				z-index: 99;
				position:absolute;
			}
			
			ul.hx1 li{
				height: 24px;
				width: 88px;
				text-align=center;
				background-color: white;
			}
			
			div.hx{
				width:600px;
				height:50px;
				font: 16px/1.5 Microsoft YaHei,tahoma,arial,Hiragino Sans GB,\\5b8b\4f53,sans-serif;
				float: left;
				padding-top: 37.5px;
				padding-left: 38px;
			}/* 横向导航栏 */
			
			div.search{
				float:right;	
				height:100px;
				width:350px;
				margin: 59px auto o auto;
			}/* 搜索框+我的收藏 */
			
			div.collect{
				width:100px;
				height: 35px;
				background-color: white;
				margin-left: 50px;
			}/* 我的收藏 */
			
			img.collect{
				width:20px;
				height: 21px;
				vertical-align: middle;
			}/* 我的收藏 */
			
			div.collect,a.my collect{
				align:center;
				valign:center;
			}/* 我的收藏 */
			
			.parent{
				position: relative;
			}
			
			input.search{
				width: 365px;
				height: 40px;
				border-radius: 18px;
				outline: none;
				border: 1px solid #ccc;
				padding-left: 20px;
				position: absolute;
				margin-top: 20px;
			}/* 搜索框 */
			
			button.search-button {
				height: 35px;
				width: 35px;
				position: absolute;
				background-image: url(../image/search.jpg);
				background-size:100% 100%;
				background-repeat:no-repeat;
				top: 24px;
				right: 32px;
				border: none;
				outline: none;
				cursor: pointer;
			}/* 搜索框的图标 */
			
 			body{ 
 				font: 15px/1.5 Microsoft YaHei,tahoma,arial,Hiragino Sans GB,\\5b8b\4f53,sans-serif; 
 			} 
			
			img.picture{
			    vertical-align: top;
				 width: 1000px;
				height: 526px;
				z-index: 1;
			}
			
			div.box {
			    width: 1000px;
			    height: 526px;
			    border: 1px solid #ccc;
				float:right;
			}
			
			div.inner {
			    width: 1000px;
			    height: 526px;
			    background-color: pink;
			    overflow: hidden;
			    position: relative;
			}
			
			div.inner ul {
			    width: 1000%;
			    position: absolute;
			    top: 0;
			    left: 0;
			}
			
			div.inner li {
			    float: left;
			}
			
			div.square {
			    position: absolute;
			    right: 10px;
			    bottom: 10px;
			}
			
			div.square span {
			    display: inline-block;
			    width: 16px;
			    height: 16px;
			    background-color: #fff;
			    text-align: center;
			    line-height: 16px;
			    cursor: pointer;
			}
			
			div.square span.current {
			    background-color: orangered;
			    color: #fff;
			}
		
	</style>
</head>
<body>
<div class="header">
			<div class="w">
				 <div class="fl">
					  <div class="dt">
					  您的所在地：广东
					  </div>
				  </div>
				  <div class="fr">
					  <ul class="fr">
					    <li class="fore">
					  	<div class="dt1"><a class="top" target="_blank" href="view/index.jsp">首页</a></div>
					    </li>

					    <li class="fore">
					  	<div class="dt1"><a class="top" target="_blank" href="">客服</a></div>
					    </li>

					    <li class="fore">
					  	<div class="dt1"><a class="top" target="_blank" href="">买家个人中心</a></div>
					    </li>

					    <li class="fore">
					    <div class="dt1"><a class="top" target="_blank" href="">卖家个人中心</a></div>
					    </li>

					    <li class="fore">
					  	<div class="dt1"><a class="top" target="_blank" href="view/login.jsp">登陆</a></div>
					    </li>

					    <li class="fore">
					  	<div class="dt1"><a class="top" target="_blank" href="view/register.jsp">注册</a></div>
					    </li>
						<li class="fore">
						<div class="dt1">
							<img class="collect" src="../image/collect1.jpg">
							<a class="collect" target="_blank" href="">我的收藏</a>
						</div>
						</li>
					  </ul>
				  </div>
			</div>
		</div>
		
		<div class="nav1">
			<div class="logo"></div>
			<div class="hx">
				
				<ul class="hx">
					<li class="hx">
						<span>手机</span>
						<ul class="hx1">
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=41">华为手机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=42">小米手机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=43">vivo手机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=44">oppo手机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=45">苹果手机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=46">三星手机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=47">其他手机</a></li>
						</ul>
					</li>
					<li class="hx">
						<span class="">家电</span>
						<ul class="hx1">
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=48">电风扇</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=49">洗衣机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=50">电吹风</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=51">热水壶</a></li>
							
						</ul>
					</li>
					<li class="hx">
						<span class="">出行</span>
						<ul class="hx1">
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=52">自行车</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=53">电动车</a></li>
							
						</ul>
					</li>
					<li class="hx">
						<span class="">书籍</span>
						<ul class="hx1">
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=54">小说</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=55">教材</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=56">考试辅导书</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=57">考研辅导书</a></li>
							
						</ul>
					</li>
					<li class="hx">
						<span class="">电脑</span>
						<ul class="hx1">
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=58">台式机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=59">笔记本</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=60">显示器</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=61">音箱</a></li>
							
						</ul>
					</li>
					<li class="hx">
						<span class="">外设</span>
						<ul class="hx1">
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=62">键盘</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=63">鼠标</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=64">U盘</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=65">移动硬盘</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=66">摄像头</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=67">耳机</a></li>
						</ul>
					</li>
				</ul>
			</div>
			
			<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
			</script>
			<script> 
			$(document).ready(function(){
				
				$("li.hx").mouseover(function(){
					$(this).find("ul").stop().slideDown("fast");
				});
				$("li.hx").mouseover(function(){
					$(this).find("span").css("color","#FF6787");
				});
				$("li.hx").mouseout(function(){
					$(this).find("ul").stop().slideUp("fast");
				});
				$("li.hx").mouseout(function(){
					$(this).find("span").css("color","black");
				});
			});
			</script>
			
			<div class="serach">
				<form action="" class="parent">
					<input type="text" class="search" placeholder="搜索">
					<button type="button" class="search-button" οnclick="">
				</form>
			</div>
			<div class="key">
					<ul class="key">
					<li class="key"><a class="top" target="_blank" href="">电风扇</a></li>
					<li class="key"><a class="top" target="_blank" href="">|&nbsp;&nbsp;自行车</a></li>
					<li class="key"><a class="top" target="_blank" href="">|&nbsp;&nbsp;教材</a></li>
					<li class="key"><a class="top" target="_blank" href="">|&nbsp;&nbsp;台式机</a></li>
					<li class="key"><a class="top" target="_blank" href="">|&nbsp;&nbsp;手机</a></li>
					<li class="key"><a class="top" target="_blank" href="">|&nbsp;&nbsp;数码相机</a></li>
					</ul>				
			</div>
		</div>
		<a href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=${typeId}"></a>
<div class="nav2">
		<div class="order">
			<div class="order-left">
				<a class="order-left-1" href=""><i class="order">综合排序</i></a>
				<a class="order-left-2" href=""><i class="order">价格</i></a>
				<a class="order-left-3" href=""><i class="order">上架时间</i></a>
			</div>
			<div class="order-right">
				<span>${currentpage}</span> /
				<span>${totalpage}</span>
				<a class="order-right" href=""><i class="order">></i></a>
				<a class="order-right" href=""><i class="order"><</i></a>
			</div>
		</div>
		<script>
		$(document).ready(function(){
			$("div.order a").mouseover(function(){
				$(this).find("i").css("color","#E4393C");
			});
			$("div.order a").mouseout(function(){
				$(this).find("i").css("color","#666666");
			});
		});
		
		</script>
		<div class="show">
			<ul class="item">
			 
			<!-- 遍历该类别的商品 -->
			<c:forEach items="${gList }" var="good" varStatus="status">
			<div class="item" id="blockView">
					<li class="span3">
					  <div class="thumbnail">
						<a href="../GoodController/initproducts.action?goodsId=${good.goodsId }"><img  src="../product/${good.goodsImg }" alt="${good.goodsName }"/></a>
						<div class="caption">
						  <em>￥</em>
						  <i class="price">${good.goodPrice }</i>
						  <h5>${good.goodsName }</h5>
						  <p> 
							${good.goodsDetail }
						  </p>
			
						  <span class="USER_NAME"> 
							卖家昵称：${good.USER_NAME }
						  </span>
						  <br>	
						   <span class="CREDIT"> 
							信誉评分：${good.CREDIT }
						  </span>
				
<%-- 						   <h4 style="text-align:center"><a class="btn" href="product_details.html"> <i class="icon-zoom-in"></i></a> <a class="btn" href="../CartController/insertCart.do?userId=${sessionScope.user.id}&goodId=${good.goodsId}&cartNumber=1">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="../CartController/insertCart.do?userId=${sessionScope.user.id}&goodId=${good.goodsId}&cartNumber=1">&euro;${good.goodPrice }</a></h4> --%>
						</div>
					  </div>
					</li>
			</div>
			</c:forEach>
			</ul>
<!-- 			<hr class="soft"/> -->
		</div>
</div>		
		<div class="pagebar">
			<input type="button" value="首页"/>
			<input type="button" value="上一页"/>
			<span>当前为第${currentpage}页</span> |
			<span>总共有${totalpage}页</span>
			<input type="button" value="下一页"/>
			<input type="button" value="尾页"/>
			<input type="text" value="" name=""/>
			<input type="button" value="跳转"/>
		</div>
<!-- 		<script> -->
// 		$('input[type=button]').click(function () {
// 		$.ajax({
// 		    type : 'POST',
// 		    url : '${pageContext.request.contextPath}/GoodController/.do',
// 		    date:firstpage:
		    
<!--     	</script> -->
</body>
</html>