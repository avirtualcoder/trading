<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>后台管理登录</title>
		<style>
			*{
				margin:0px;
				padding:0px;
			}
			body{
				background-image: url('/test/image/admin/adminLogin.jpg');
				background-size: cover;
				
			}
			
			header{
				height:51px;
				width:100%;
				background:#b9b0b0;
				color:white;
				font-size:26px;
				opacity:0.9;
				text-align: center;
				line-height: 51px;
				letter-spacing:27px;
			}
			
			.wrap{
				width:617px;
				height: 330px;
				position:absolute;
				top:139px;
				left:370px;
				background: gray;
				opacity: 0.9;
			}
			
			.formwrap{
				display: block;
				padding-top:38px;
			}
			
			.row{
				margin-top:25px;
			}
			
			.row input{
				padding:8px;
				boder:none;
				width:310px;
				height: 21px;
				font-size:16px;
			}
			
			.lable-i{
				float:left;
				width:121px;
				height: 18px;
				
			}
			
			.lable-i img{
				float:right;
				margin-top:3px;
				padding-right: 9px;
			}
			
			#btn-sbm{
				margin-left: 118px;
				margin-top:38px;
				width:100px;
				height: 39px;
				color:white;
				border:none;
				background: green;
				border-radius: 5%;
			}
		</style>
		<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
		<script type="text/javascript">
			
		</script>
	</head>
	<body>
		<header>管理员登录界面</header>
		<div class="wrap">
			<form class="formwrap" action="${pageContext.request.contextPath}/adminLogin.action" method="post">
				<div class="row">
					<lable for="row-user" class="lable-i"><img src="/test/image/admin/1.png"></lable>
					<div class="row-user">
						<input type="text" name="userTel" placeholder="账户"/>
					</div>
				</div>
				<div class="row">
					<lable for="row-password" class="lable-i"><img src="/test/image/admin/2.png" style="margin-top:8px;"></lable>
					<div class="row-password">
						<input type="password" name="password"placeholder="密码"/>
					</div>
				</div>
				<div class="row">
					<input type="submit" value="提交" id="btn-sbm"/>
				</div>
				<span style="color:white;font-size:21px;padding-left:121px;margin-top:16px;display:block">
					${error }
				</span>
			</form>
		</div>
	</body>
</html>
