<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/easyui/css/default.css" />
    <link rel="stylesheet" type="text/css" href="css/easyui/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="css/easyui/themes/icon.css" />
    <script type="text/javascript" src="css/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="css/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src='css/easyui/js/outlook2.js'> </script>
	 <script type="text/javascript">
	 var _menus = {"menus":[
						{"menuid":"1","icon":"","menuname":"待处理申诉管理",
							"menus":[
									{"menuid":"11","menuname":"未处理的用户申诉","icon":"icon-exam","url":"${pageContext.request.contextPath}/getUntreatedApeal.action"},
								]
						},
						{"menuid":"2","icon":"","menuname":"已处理申诉管理",
							"menus":[
									{"menuid":"21","menuname":"申诉通过管理","icon":"icon-exam","url":"${pageContext.request.contextPath}/gettreatedApeal.action"},
									{"menuid":"22","menuname":"申诉未通过管理","icon":"icon-exam","url":"${pageContext.request.contextPath}/gettreatedUnApeal.action"},
								]
						},
						{"menuid":"3","icon":"","menuname":"个人信息管理",
							"menus":[
									{"menuid":"31","menuname":"个人信息","icon":"icon-exam","url":"${pageContext.request.contextPath}/getUserInfo.action"},
								    ]
						},
						
						
				]};

    </script>
<title>商品审核管理员管理界面</title>
</head>
<body>
	<body class="easyui-layout" style="overflow-y: hidden"  scroll="no">
	<noscript>
		<div style=" position:absolute; z-index:100000; height:2046px;top:0px;left:0px; width:100%; background:white; text-align:center;">
		    <img src="images/noscript.gif" alt='抱歉，请开启脚本支持！' />
		</div>
	</noscript>
    <div region="north" border="false" style="overflow: hidden; height: 39px;
        background: #00a6a7 repeat-x center 50%;
        line-height: 39px;color: #fff; font-family: Verdana, 微软雅黑,黑体">
        <span style="float:right; padding-right:20px;" class="head">
        	<span style="color:red; font-weight:bold;">${adminname }</span>
        	&nbsp;您好 &nbsp;|&nbsp;
        	<a href="SystemServlet?method=LoginOut" id="loginOut">退出登录</a>
        	 <span> 头像预留位</span>
        </span>
        <span style="padding-left:10px; font-size: 16px; ">校园二手交易管理员后台</span>
       
    </div>
    <div region="west" hide="true" title="系统功能菜单" style="width:200px;" id="west">
	<div id="nav" class="easyui-accordion" fit="true" border="false">
		<!--  导航内容 -->
	</div>
	
    </div>
    <div id="mainPanle" region="center" style="background: #eee; overflow-y:hidden">
        <div id="tabs" class="easyui-tabs"  fit="true" border="false" >
			
		</div>
    </div>
</body>
</body>
</html>