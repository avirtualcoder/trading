<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<style>
	li.active{
		display:inline;
		float:left;
	}
	img.goodsmallpicture{
		width:420px;
		height:420px;
		position: absolute;
        left:15%;
	}
	div.nav2{
		/* display: table; */
		width:1200px;
		height: 1400px;
		margin-left: 80px;
	}/* 主体部分 */
	div.type{
		width:1200px;
	}
	div.picture{
		width:700px;
		height:420px;
		float:left;
	}

	div.span6{
		width:420px;
		height:200px;
		float:left;
	}
	div.control-label{
		padding:12px 0px 5px;
	}
	span.text{
		font-size:14px;
	}
	span.price{
		font-size: 24px;
		color: #ff4400;

	}
	h3{
		font-size:22px;
		width:440px;
		height:31px;
	}
	div.goodsDetail{
		font: 15px/1.5 Microsoft YaHei,tahoma,arial,Hiragino Sans GB,\\5b8b\4f53,sans-serif;
		padding:12px 0px 5px;
	}
	div.adress{
		font: 15px/1.5 Microsoft YaHei,tahoma,arial,Hiragino Sans GB,\\5b8b\4f53,sans-serif;
		padding:12px 0px 5px;
	}
	div.left{
		font: 15px/1.5 Microsoft YaHei,tahoma,arial,Hiragino Sans GB,\\5b8b\4f53,sans-serif;
		padding:12px 0px 5px;
	}
	div.controls{
	font: 15px/1.5 Microsoft YaHei,tahoma,arial,Hiragino Sans GB,\\5b8b\4f53,sans-serif;	
		padding:12px 0px 20px;
	}
	a.buy{
		display: inline-block;
	    text-align: center;
	    vertical-align: middle;
	    height: 45px;
	    margin: 0 0 10px;
		background-color:#FF4400;
	    width: 202px;
	   	font-size: 18px;
   		font-family: "microsoft yahei";
   		font-weight: 700;
   		color: #fff;
   		line-height: 45px;
	}
	
	
			*{
				padding:0;
				margin:0;
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

		<script type="text/javascript">
			//取到文本框的内容，传到Controller中，将评论添加到数据库中
			function addComment(goodId,userId,personName){
			
			//创建请求对象
			var request = new XMLHttpRequest();
			request.onreadystatechange = function(){
				if(request.readyState==4){
					//传过来的数据
					var returnValue = request.responseText;
					if(returnValue==1){
					var value = document.getElementById("userComment").value;
					//获取时间
					var time = getNowFormatDate();
					//去到评论的div
					var commentDiv = document.getElementById("comment");
					//创建新元素
					var newDiv = document.createElement("div");
					newDiv.innerHTML="<div>"+personName+"   "+time+"</div><div>"+value+"</div><hr>";
					//添加新元素
					commentDiv.appendChild(newDiv);
					//清空textarea的内容
					document.getElementById("userComment").value="";
					document.getElementById("userComment").style.display="none";
					document.getElementById("commentButton").style.display="none";
					}
					else{
						alert("购买后才可以参与评论");
					}
				}
			};
			request.open("post","../CommentController/insertComment.do",true);
			request.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			//发送
			var value = document.getElementById("userComment").value;
			request.send("value="+value+"&userId="+userId+"&goodId="+goodId);
			}
			
			function getNowFormatDate() {
		    var date = new Date();
		    var seperator1 = "-";
		    var seperator2 = ":";
		    var month = date.getMonth() + 1;
		    var strDate = date.getDate();
		    if (month >= 1 && month <= 9) {
		        month = "0" + month;
		    }
		    if (strDate >= 0 && strDate <= 9) {
		        strDate = "0" + strDate;
		    }
		    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
		            + " " + date.getHours() + seperator2 + date.getMinutes()
		            + seperator2 + date.getSeconds();
		    return currentdate;
		}
			function addToCart(goodId,userId){
			var number = document.getElementById("cartNumber").value;
			var path="http://localhost:8080/sheji_3/CartController/insertCart.do?userId="+userId+"&goodId="+goodId+"&cartNumber="+number;
			window.location=path;
			}
			</script>
			
<title>Insert title here</title>
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
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=41">华为手机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=42">小米手机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=43">vivo手机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=44">oppo手机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=45">苹果手机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=46">三星手机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=47">其他手机</a></li>
						</ul>
					</li>
					<li class="hx">
						<span class="">家电</span>
						<ul class="hx1">
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=48">电风扇</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=49">洗衣机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=50">电吹风</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=51">热水壶</a></li>
							
						</ul>
					</li>
					<li class="hx">
						<span class="">出行</span>
						<ul class="hx1">
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=52">自行车</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=53">电动车</a></li>
							
						</ul>
					</li>
					<li class="hx">
						<span class="">书籍</span>
						<ul class="hx1">
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=54">小说</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=55">教材</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=56">考试辅导书</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=57">考研辅导书</a></li>
							
						</ul>
					</li>
					<li class="hx">
						<span class="">电脑</span>
						<ul class="hx1">
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=58">台式机</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=59">笔记本</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=60">显示器</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=61">音箱</a></li>
							
						</ul>
					</li>
					<li class="hx">
						<span class="">外设</span>
						<ul class="hx1">
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=62">键盘</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=63">鼠标</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=64">U盘</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=65">移动硬盘</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=66">摄像头</a></li>
							<li><a class="top" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.do?typeId=67">耳机</a></li>
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

		<div class="nav2">
			<div class="type">
				<ul class="breadcrumb">
				<li class="active"><a href="../">首页</a><span class="divider">/</span></li>
				<li class="active"><a href="../">商品种类 </a></li>
	
				</ul>
				<br>
			</div>	
			<div class="picture">	  
		        <a class="goodsbigpicture" href="../product/${requestScope.good.goodsImg }" title="${requestScope.good.goodsName }">
					<img class="goodsmallpicture" src="../product/${requestScope.good.goodsImg }"  alt=""/>
		        </a>
		    </div>

				<div class="span6">
					<h3>${requestScope.good.goodsName }  </h3>

					<form class="form-horizontal qtyFrm">
					  <div class="control-group">
						<div class="control-label">
							<span class="text">转卖价：</span>
							<b>￥</b>
							<span class="price">${requestScope.good.goodPrice }</span>	
						</div>
<!-- 						<hr class="soft"/> -->

						<div class="adress">所在地：${requestScope.good.goodsAdress }</div>
						
						<div class="left">库存:${requestScope.good.goodsLeft }</div>
						
						<div class="goodsDetail">
						商品详情：<br/>
						${requestScope.good.goodsDetail }
						</div>


						
						<div class="controls">
						<input type="number" class="span1" placeholder="Qty." id="cartNumber" value="1"/>
						  <input type="button" value="添加至购物车" class="btn btn-large btn-primary pull-right" onclick="addToCart(${requestScope.good.goodsId},${sessionScope.user.id })"> <!-- Add to cart <i class=" icon-shopping-cart"></i> -->
						</div>
					  </div>
					</form>
					

					<a class="buy" href="">立即购买</a>

				</div>

		        
		        <!--商品评论部分  -->
<!-- 		        <div id="comment"> -->
<%-- 		        <c:forEach items="${requestScope.cList}" var="comment"> --%>
<!-- 		        <div> -->
<%-- 		        	<div>${comment.user.personName }  ${comment.time }</div> --%>
<%-- 		        	<div>${comment.value }</div> --%>
<!-- 		        </div> -->
<!-- 		        <hr> -->
<!-- 		        </c:forEach> -->
<!-- 		        </div> -->
<!-- 		        <textarea rows="5" cols="10" id="userComment"></textarea><br> -->
<%-- 		        <button width="100px" id="commentButton" onclick="addComment(${requestScope.good.goodsId },${sessionScope.user.id },'${sessionScope.user.personName }')">添加评论</button> --%>

</body>
</html>