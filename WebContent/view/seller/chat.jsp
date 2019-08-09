<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>我的消息</title>
	<link rel="stylesheet" type="text/css" href="../../css/seller/chat.css"/>
</head>

<script type="text/javascript">
	//获取节点
var oInput = document.getElementById("msg_input");
var oBtn = document.getElementById("sendbtn");
var oContent = document.getElementById("content");//ul

//点击发送
oBtn.onclick = function()
{
    //内容输出
    var str = oInput.value;//获取输入框的值
    var oLi = document.createElement("li");//创建li标签
    oLi.innerHTML = str;//节点内容
    oContent.appendChild(oLi);//把新建的li标签压入ul中

    //对li添加发送消息的样式
    oLi.className = "msgContent right";

    //清除li的浮动：
    oLi.style.clear = "both";

    //设置发送内容后输入框的数据清空：
    oInput.value = "";

    //保持当前节点对象在最可见区域
    oLi.scrollIntoView();
}

//按下Ctrl+Enter回车键完成发送
oInput.onkeydown = function(e)
{
    e = e || window.event;
    if (e.ctrlKey && e.keyCode == 13)
    {
        oBtn.onclick();//执行发送内容
    }
}

</script>


<body>
	<div id="head">私聊信息</div>
	<hr>
<div id="total_content">
<div id="chat_list">
	<ul>
		<for>
		<li>私聊消息1${uesr_name}</li>
		<li>私聊消息2${uesr_name}</li>
		<endfor>
	</ul>
</div>
<div id="main" class="main">
    <ul id="content" class="content">
        <li class="msgContent left">你好</li>
        <div style="clear: both;"></div>
        <li class="msgContent left">这个是什么</li>
        <div style="clear: both;"></div>

        <li class="msgContent right">。。。。</li>
        <div style="clear: both;"></div>

        <!-- 当点击发送按钮，就在 ul 中添加一条消息记录 -->

    </ul>
    <textarea id="msg_input" class="msgInput"></textarea>
    <button id="sendbtn" class="sendbtn">发送</button>

<div id="control"><a href="./SellerCenter.jsp">返回中心</a></div>


<hr>
</div>
</body>
</html>