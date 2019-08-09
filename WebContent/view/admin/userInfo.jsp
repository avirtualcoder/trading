<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息页</title>
<script src="https://lib.sinaapp.com/js/jquery/2.0.2/jquery-2.0.2.min.js"></script>
<script>
	$(document).ready(function(){
		
		$(".change-img").click(function(){
			$(".select-img").css("display","block");
		});
		
	});
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
		background:rgb(255, 255, 200);
	}
	header{
		height:31px;
		width:100%;
		background:#b9b0b0;
		color:white;
		font-size:18px;
		opacity:0.8;
		text-align: center;
		line-height: 31px;
		letter-spacing:27px;
	}
	
	
	.info-mindle{
		margin-left:66px;
		width:501px;
		height:501px;
		float:left;
	}
	
	.info-mindle p{
		padding-left: 26px;
		width: 100%;
		height: 51px;
		font-size: 16px;
		line-height: 51px;
	}
	
	.info-mindle input{
		width: 61%;
		height: 29px;
		border: 1px solid darkgray;
	}
	
	.info-right{
		width:501px;
		height:501px;
		float:left;
	}
	
	.info-right-img{
		width:186px;
		height: 186px;
		border: 1px  solid black;
		margin: auto;
		margin-top:66px;
	}
	
	.info-right-btn{
		width:  286px;
		height: 186px;
		margin: auto;
		margin-top:6px;
	}
	
	.info-right-btn input{
		width: 86px;
		height: 36px;
		border: 1px solid darkgray;
	}
	
	footer{
		width:100%;
		height: 36px;
		background: gray;
		position:fixed; 
		bottom:0;
		line-height: 38px;
	}
	
	footer input{
		width:86px;
		height: 36px;
		margin-left: 266px;
	}
</style>
</head>
<body>
	<header>个人信息管理</header>
	<div style="margin:auto">
		<div class="info-mindle">
			<from>
				<p>用户ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp:<input type="text" name="userId" value="${user.userId }" readonly="true"></p>
				<p>用户昵称&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="userName" value="${user.userName }" readonly="true"></p>
				<p>用户密码&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="password" value="${user.password }" readonly="true"></p>
				<p>真实姓名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="realName" value="${user.realName }" readonly="true"></p>
				<p>联系电话&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="userTel" value="${user.userTel }" readonly="true"></p>
				<p>绑定邮箱&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="userEmail" value="${user.userEmail }" readonly="true"></p>
				<p>当前信誉&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="credit" value="${user.credit }" readonly="true"></p>
				<p>用户类型&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="role" value="${user.role }" readonly="true"></p>
				<p>支付宝账号&nbsp;:<input type="text" name="alipay" value=""></p>
			</from>
		</div>
		<div class="info-right">
			<div class="info-right-img">
				<img src=""/>
			</div>
			<div class="info-right-btn">
				<input type="file" style="width:266px;height:26px;display: none;" class="select-img"/><br>
				<input type="button" class="change-img" value="修改" style="margin-left:96px;"/><br>
				<input type="submit" value="提交" style="display: none;"/>
			</div>
		</div>
	</div>
	<footer>
		<input type="button" value="修改" id="serach"/>
		<input type="button" value="提交" id="serach"/>
	</footer>
</body>
</html>