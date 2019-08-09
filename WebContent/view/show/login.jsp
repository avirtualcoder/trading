<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>login</title>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
</script>
<style type="text/css">
*{
	margin: 0;
	padding: 0;
}
#wrap {
	height: 719px;
	width: 100;
	background-image: url(4.jpg);
	background-repeat: no-repeat;
	background-position: center center;
	position: relative;
}
#head {
	height: 120px;
	width: 100;
	background-color: #66CCCC;
	text-align: center;
	position: relative;
}
#foot {
	width: 100;
	height: 126px;
	background-color: #CC9933;
	position: relative;
}
#wrap .logGet {
	height: 408px;
	width: 368px;  
	position: absolute;
	background-color: #FFFFFF;
	top: 20%;
	right: 15%;
}
.logC {
	width: 100%;
	height: 45px;
	background-color: #ee7700;
	border: none;
	color: white;
	font-size: 18px;
}
.logGet .logD.logDtip .p1 {
	display: inline-block;
	font-size: 28px;
	margin-top: 30px;
	width: 86%;
}
#wrap .logGet .logD.logDtip {
	width: 86%;
	border-bottom: 1px solid #ee7700;
	margin-bottom: 60px;
	margin-top: 0px;
	margin-right: auto;
	margin-left: auto;
}
.logGet .lgD img {
	position: absolute;
	top: 12px;
	left: 8px;
}
.logGet .lgD input {
	width: 100%;
	height: 42px;
	text-indent: 2.5rem;
}
#wrap .logGet .lgD {
	width: 86%;
	position: relative;
	margin-bottom: 30px;
	margin-top: 30px;
	margin-right: auto;
	margin-left: auto;
}
#wrap .logGet .logC {
	width: 86%;
	margin-top: 0px;
	margin-right: auto;
	margin-bottom: 0px;
	margin-left: auto;
}
 
 
.title {
	font-family: "宋体";
	color: #FFFFFF;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);  /* 使用css3的transform来实现 */
	font-size: 36px;
	height: 40px;
	width: 30%;
}
 
.copyright {
	font-family: "宋体";
	color: #FFFFFF;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);  /* 使用css3的transform来实现 */
	height: 60px;
	width: 40%;
	text-align:center;
}
	
 
#foot .copyright .img {
	width: 100%;
	height: 24px;
	position: relative;
}
.copyright .img .icon {
	display: inline-block;
	width: 24px;
	height: 24px;
	margin-left: 22px;
	vertical-align: middle;
	background-image: url(%E7%94%B5%E5%AD%90%E9%82%AE%E4%BB%B6.png);
	background-repeat: no-repeat;
	vertical-align: middle;
	margin-right: 5px;
}
	
.copyright .img .icon1 {
	display: inline-block;
	width: 24px;
	height: 24px;
	margin-left: 22px;
	vertical-align: middle;
	background-image: url(%E5%9C%B0%E5%9D%80.png);
	background-repeat: no-repeat;
	vertical-align: middle;
	margin-right: 5px;
}
.copyright .img .icon2 {
	display: inline-block;
	width: 24px;
	height: 24px;
	margin-left: 22px;
	vertical-align: middle;
	background-image: url(%E8%81%94%E7%B3%BB%E6%96%B9%E5%BC%8F.png);
	background-repeat: no-repeat;
	vertical-align: middle;
	margin-right: 5px;
}
#foot .copyright p {
	height: 24px;
	width: 100%;
}
</style>

<script type="text/javascript"> 
    function check(){
        var username = (document.getElementById("username").value).trim();
        var password = (document.getElementById("password").value).trim();
        if(username==''){
        	alert ("用户名不能为空");
        }
        if(password==''){
        	alert ("密码不能为空");
        }
    }
    
    $.ajax({
    	type:"POST",
    	url:"${pageContext.request.contextPath}/login.action",
    	data:{"username":$("input[name='username']").val().trim()
    		,"password":$("input[name='password']").val().trim()},
    	
    	dataType:'json',
    	 success:function(data){
             if(data==null){
                 alert("此用户不存在！")
             }
             else{
                 alert("登录成功")
                 window.location.href ="../view/index.jsp";
             }
          }
    })
    
</script> 

</head>
 
<body>
<div class="header" id="head">
  <div class="title">校园二手交易平台</div>
	
</div>
	
<div class="wrap" id="wrap">
	<div class="logGet">
			<!-- 头部提示信息 -->
			<div class="logD logDtip">
				<p class="p1">登录</p>
			</div>
			<!-- 输入框 -->
			<form action="${pageContext.request.contextPath}/login.action" method="post">
				<div class="lgD">
					<img src="img/logName.png" width="20" height="20" alt=""/>
					<input type="text" name=userTel id="username"
						placeholder="输入用户名" />
				</div>
				<div class="lgD">
					<img src="img/logPwd.png" width="20" height="20" alt=""/>
					<input type="password" name="password" id="password"
						placeholder="输入用户密码" />
				</div>
				<input class="logC" id="login-button" type="submit" value="登陆" onclick="check()">
			</form>	
	</div>
</div>
	
<div class="footer" id="foot">
  <div class="copyright">
    <p>Copyright © 2019 Qunar.com Inc. All Rights Reserved.</p>
    <div class="img">
		<i class="icon"></i><span>联系邮箱：</span>
	</div>
	
	<div class="img">
		<i class="icon1"></i><span>联系地址：</span>
	</div>
	  
	<div class="img">
	  <i class="icon2"></i><span>联系电话：</span>
	</div>
 
 
  </div>
	
</div>
	
	
</body>
</html>