<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<style>
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
				background-image: url(image/logo.jpg);
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
				background-image: url(image/search.jpg);
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
		
		
		
		<title></title>
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
					  	<div class="dt1"><a class="top" target="_blank" href="../trading/view/login.jsp">登陆</a></div>
					    </li>

					    <li class="fore">
					  	<div class="dt1"><a class="top" target="_blank" href="../trading/view/register.jsp">注册</a></div>
					    </li>
						<li class="fore">
						<div class="dt1">
							<img class="collect" src="image/collect1.jpg">
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
		
		<div class="nav2">
			<div class="box" id="box">
			    <div class="inner" style="z-index: 1;">
			        <ul>
			            <li><a target="_blank" href="#"><img class="picture" src="image/1.jpg" /></a></li>
			            <li><a target="_blank" href="#"><img class="picture" src="image/2.jpg" /></a></li>
			            <li><a target="_blank" href="#"><img class="picture" src="image/3.jpg" /></a></li>
						<li><a target="_blank" href="#"><img class="picture" src="image/1.jpg" /></a></li>
						<li><a target="_blank" href="#"><img class="picture" src="image/2.jpg" /></a></li>
			        </ul>
			        <div class="square">
			            <span class="current">1</span>
			            <span>2</span>
			            <span>3</span>
			            <span>4</span>
			            <span>5</span>
			        </div>
			    </div>
			</div>
			
			<script type="text/javascript">
			        //鼠标经过按钮 按钮排他
			        var box = document.getElementById("box");
			        var inner = box.children[0];            //获取box下的第一个元素，也就是inner
			        var ul = inner.children[0];             //获取inner下的ul
			        var squareList = inner.children[1];     //获取inner下的第二个元素
			        var squares = squareList.children;      //获取所有的按钮
			        var imgWidth = inner.offsetWidth;
			//      alert(imgWidth);
			        //给每个按钮注册鼠标经过事件
			        for(var i=0; i<squares.length; i++){
			            squares[i].index = i;           //把索引保存在自定义属性中
			            squares[i].onmouseover = function(){    //鼠标经过事件
			                //排他  干掉所有人 
			                for(var j=0; j<squares.length; j++){
			                    squares[j].className = "";
			                }
			                //留下我自己
			                this.className = "current";
			                //以动画的方式把ul移动到指定的位置
			                //目标 和当前按钮索引有关，和图片宽度有关 而且是负数
			                var target = -this.index * imgWidth;    //获取到索引
			                animate(ul,target);
			            }
			        }
			
			
			        function animate(obj, target) {
			            clearInterval(obj.timer);
			            obj.timer = setInterval(function () {
			                var step = 20;
			                var step = obj.offsetLeft < target ? step : -step;
			                if (Math.abs(obj.offsetLeft - target) > Math.abs(step)) {
			                    obj.style.left = obj.offsetLeft + step + "px";
			                } else {
			                    obj.style.left = target + "px";
			                    clearInterval(obj.timer);
			                }
			            }, 15)
			        }
			    </script>
			
			<div class="menu-top">
				<div class="text">商品分类</div>
			</div>
			
			<div class="menu">
				<ul class="menu">
					
					<li class="menu">
						<a class="menu" target="_blank" href="">手机类</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=41"">华为手机</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=42">小米手机</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=43">vivo手机</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=44">oppo手机</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=45">苹果手机</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=46">三星手机</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=47">其他手机</a>
						
					</li>	
					<li class="menu">
						<a class="menu" target="_blank" href="">家电类</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=48">电风扇</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=49">洗衣机</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=50">电吹风</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=51">热水壶</a>
						<br>
					</li>
					<li class="menu">
						<a class="menu" target="_blank" href="">出行类</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=52">自行车</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=53">电动车</a>
						<br>
					</li>
					<li class="menu">
						<a class="menu" target="_blank" href="">书籍类</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=54">小说</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=55">教材</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=56">考试辅导书</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=57">考研辅导书</a>
						<br>
					</li>
					<li class="menu">
						<a class="menu" target="_blank" href="">电脑类</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=58">台式机</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=59">笔记本</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=60">显示器</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=61">音箱</a>
						<br>
					</li>
					
					<li class="menu">
						<a class="menu" target="_blank" href="">外设类</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=62">键盘</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=63">鼠标</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=64">U盘</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=65">移动硬盘</a>
						<br/ >
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=66">摄像头</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=67">耳机</a>
						<br/ >
					</li>
					
					<li class="menu">
						<a class="menu" target="_blank" href="">电子类</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=68">单反相机</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=69">数码相机</a>
						<br>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=70">镜头</a>
						<span class="cate_menu_line">/</span>
						<a class="menu" target="_blank" href="${pageContext.request.contextPath}/GoodController/initDetails.action?typeId=71">内存卡</a>
						<br>
					</li>
				</ul>
			</div>
			
			<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
			</script>
			<script> 
			$(document).ready(function(){
				$("a.menu").mouseover(function(){
					$(this).css("color","#FF6787");
				});
				$("a.menu").mouseout(function(){
					$(this).css("color","white");
				});
			});
			</script>
		</div>
		
		<div class="nav3">
			<
		</div>

	</body>
</html>
