<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <title>用户注册</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

 </head>
 <body>
  <h1>用户注册</h1>
  <form method="post" action="${pageContext.request.contextPath}/register.action" >
   <ul>
	<li>请输入您的手机：<input required="true" missingMessage="姓名必须填写" size="20" type="text" name="userTel"></input></li>
	<li>请设置您的密码：<input required="true" missingMessage="密码必须设置" size="20" type="password" id="pwd1"></input></li>
	<li>请重新输入密码：<input required="true" missingMessage="密码必须设置" size="20" type="password" name="password" id="pwd2" οnkeyup="validate()"/><span id="tishi"></span></input></li>
	<li>请设置您的昵称：<input required="true" missingMessage="昵称必须设置" size="20" type="text" name="userName"></input></li>
	<li>请输入您的性别：<input required="true" missingMessage="性别必须填写" size="20" type="text" name="sex"></input></li>
	<li>请设置您的邮箱：<input required="true" missingMessage="邮箱必须填写" size="20" type="text" name="userEmail"></input></li>
	<li>请设置您的地址：<input required="true" missingMessage="地址必须填写" size="20" type="text" name="address"></input></li>
	<li><input type="submit" value="提交"></li>
   </ul>
  </form>
  <a href="index.html">返回主菜单</a>

 </body>
</html>