<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="css/easyui/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/easyui/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="css/easyui/themes/icon.css" />
    <script type="text/javascript" src="css/easyui/jquery.easyui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/admin/common.css"/>
<title>用户管理</title>
</head>

<style>
.left-info p{
	margin:0px;
	padding:0px;
	height:36px;
}
</style>

<script type="text/javascript">
	function test(currentPage){
		
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath}/publishgoodslist.action',
			data:{'currentPage':currentPage},
			dataType:'json',
			success:function(data){
				var str="";
				var u = data.ulist;
				for(var i=0;i<u.length;i++){
					str+="<tr><td>"+u[i].userId +
						"</td><td>"+u[i].userName+
						"</td><td>"+u[i].password+
						"</td><td>"+u[i].userTel+
						"</td><td>"+u[i].sex+
						"</td><td>"+u[i].credit+
						"</td><td>"+u[i].realName+
						 "</td><td><input type='button' value='查看' class='showdata-input inspect-user'/>"+
						"<input type='button' value='修改' class='showdata-input change-user'/>"+
						"<input type='button' value='删除' class='showdata-input delete-user' />"+ 
						"</td></tr>"
				}
				
				$("#showdata").html(str);
				var page = data.page;
				$(".curpg").text(page[0].currentPage);
				$(".totalPages").text(page[0].totalPages)
			},
			error:function(){
				alert("获取数据失败");
			}
		})
	}
	
			function firstPage(){
				var num = $(".curpg").text();
				if(parseInt(num)==1){
					alert("已经是首页了");
				}
				else{
					var currentPage = 1;
					test(currentPage);
				}
				
			}
			
			function prePage(){
				var num = $(".curpg").text();
				if(num==1){
					alert("已经是第一页了");
				}
				else{
					var currentPage = num-1;
					test(currentPage)
				}
			}
			
			function nextPage(){
				var num = $(".curpg").text();
				var all = $(".totalPages").text();
				if(parseInt(num)==parseInt(all)){
					alert("已经是最后一页了");
				}
				else{
					console.log(num);
					var c=parseInt(num)+1;
					test(c);
				}
			}
			
			function lastPage(){
				var num = $(".curpg").text();
				var all = $(".totalPages").text();
				if(parseInt(num)==parseInt(all)){
					alert("已经是尾页了");
				}
				else{
					console.log(all);
					var c=parseInt(all);
					test(c);
				}
			}
			
			function assignPage(){
				var assignpage = $("#assign").val();
				var all = $(".totalPages").text();
				if(jQuery.isNumeric(assignpage)){
					if(parseInt(assignpage)<1 || parseInt(assignpage)>parseInt(all)){
						alert("指定页面不存在，请检查输入是否有误");
					}
					else{
						test(assignpage);
						alert("跳转成功");
					}
				}else{
					alert("输入有误");
				}
				
			}
			
			/* 删除指定用户 */
			$(function(){	
				$(".delete-user").click(function(){					
				    var g = $(this).closest('tr').find('td').eq(3).text();
					confirm = confirm("确实要删除该用户吗"); 
					if(confirm!=0){
						$.ajax({
							type:"post",
							url:"${pageContext.request.contextPath}/deleteuser.action",
							data:{
								userTel:g,
							},
					});
					}
					test(1);
				});	
				
				
				//查看用户
				$(".inspect-user").click(function(){
					var a = $(this).closest('tr').find('td').eq(0).text();
					var id = parseInt(a);
					$.ajax({
						type:'post',
						data:{
							"userid":id,
						},
						dataType:"json",
						url:"${pageContext.request.contextPath}/searchUserByAssign.action",
						success:function(data){
							 $("input[name='userId']").val(data[0].userId);
							 $("input[name='userName']").val(data[0].userName);
							 $("input[name='password']").val(data[0].password);
							 $("input[name='userTel']").val(data[0].userTel);
							 $("input[name='sex']").val(data[0].sex);
							 $("input[name='credit']").val(data[0].credit);
							 $("input[name='realName']").val(data[0].realName);
							 $("input[name='role']").val(data[0].role);
							 $("input[name='alipay']").val(data[0].alipay);
							 $("#img-url").attr("src",data[0].userImg);
							 console.log(data)
						}	
					}); 
					$("#win").window("open");
				}); 
				
				$("#cancel-inspect").click(function(){
					$("#win").window("closed");
				});
				
				//修改用户信息
				$(".change-user").click(function(){
					var a = $(this).closest('tr').find('td').eq(0).text();
					var id = parseInt(a);
					$.ajax({
						type:'post',
						data:{
							"userid":id,
						},
						dataType:"json",
						url:"${pageContext.request.contextPath}/searchUserByAssign.action",
						success:function(data){
							 $("input[name='userId']").val(data[0].userId);
							 $("input[name='userName']").val(data[0].userName);
							 $("input[name='password']").val(data[0].password);
							 $("input[name='userTel']").val(data[0].userTel);
							 $("input[name='sex']").val(data[0].sex);
							 $("input[name='credit']").val(data[0].credit);
							 $("input[name='realName']").val(data[0].realName);
							 $("input[name='role']").val(data[0].role);
							 $("input[name='alipay']").val(data[0].alipay);
							 $("#img-url").attr("src",data[0].userImg);
							 console.log(data)
						}	
					}); 
					$("#change").window("open");
				}); 
				
				$("#cancel-change").click(function(){
					$("#change").window("closed");
				});
				
				
				
			});
			
			
			
</script>
	<body>
		<div style="width: 100%;">
			<table>
				<thead>
			    <tr style="background-color: #F5F5F5;">
			        <th>用户ID</th>
			        <th>用户名</th>
					<th>用户密码</th>
					<th>用户手机号</th>
					<th>用户性别</th>
					<th>用户信誉</th>
					<th>用户真实姓名</th>
					<th style="width:200px;">操作类型</th>
			    </tr>
				</thead>
				<tbody id="showdata">
						<c:if test="${ulist != null}">
						    <c:forEach items="${ulist}" var="u">
						        <tr>
						            <td>${u.userId}</td>
									<td>${u.userName}</td>
						            <td>${u.password}</td>
									<td>${u.userTel}</td>
						            <td>${u.sex}</td>
									<td>${u.credit}</td>
						            <td>${u.realName}</td>
									<td>
										<input type="button" value="查看" class="showdata-input inspect-user" />
										<input type="button" value="修改" class="showdata-input change-user" />
										<input type="button" value="删除" class="showdata-input delete-user" />
									</td>
						        </tr>
						    </c:forEach>
						</c:if>
				</tbody>
			</table>
		</div>
		
		<div id="win" class="easyui-window" closed="true" title="用户详情" style="width: 700px; height: 489px; position: relative; background: rgb(255, 255, 200);">
					<div style="width: 61%" class="left">
			<form style="background: rgb(255, 255, 200);" class="left-info">
				<p>
					用户ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="userId" value="" disabled="disable">
				</p>
				<p>
					用户名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="userName" value="" disabled="disable">
				</p>
				<p>
					用户密码&nbsp;&nbsp;&nbsp;: <input type="text" name="password" value="" disabled="disable">
				</p>
				<p>
					用户手机号: <input type="text" name="userTel" value="" disabled="disable">
				</p>
				<p>
					用户性别&nbsp;&nbsp;&nbsp;: <input type="text" name="sex" value="" disabled="disable">
				</p>
				<p>
					用户信誉&nbsp;&nbsp;&nbsp;: <input type="text" name="credit" value="" disabled="disable">
				</p>
				<p>
					真实姓名&nbsp;&nbsp;&nbsp;: <input type="text" name="realName" value="" disabled="disable">
				</p>
				<p>
					用户类型&nbsp;&nbsp;&nbsp;: <input type="text" name="role" value="" disabled="disable">
				</p>
				<p>
					支付宝账号: <input type="text" name="alipay" value="" disabled="disable">
				</p>
				<div style="padding: 5px; text-align: center; position: absolute; bottom: 16px;">

					<button value="返回" style="margin-left:266px; id="cancel-inspect">返回</button>
				</div>
			</form>
		</div>
		<div class="right">
			<p style="font-size:18px;text-align:center;margin:26px 0px 16px 0px;">用户头像</p>
			<div class="right-img">
				<img src="?" id="img-url" style="width: 100%; height: 100%;" />
			</div>
		</div>
	    </div>
	    
	    
	    <div id="change" class="easyui-window" closed="true" title="商品详情" style="width: 700px; height: 489px; position: relative; background: rgb(255, 255, 200);">
			<div style="width: 61%" class="left">
			<form style="background: rgb(255, 255, 200);" class="left-info" method="post" action="${pageContext.request.contextPath}/updateUserInfo.action"" enctype="application/x-www-form-urlencoded">
				<p>
					用户ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="userId" value="" readonly="true">
				</p>
				<p>
					用户名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="userName" value="">
				</p>
				<p>
					用户密码&nbsp;&nbsp;&nbsp;: <input type="text" name="password" value="">
				</p>
				<p>
					用户手机号: <input type="text" name="userTel" value="" readonly="true">
				</p>
				<p>
					用户性别&nbsp;&nbsp;&nbsp;: <input type="text" name="sex" value="">
				</p>
				<p>
					用户信誉&nbsp;&nbsp;&nbsp;: <input type="text" name="credit" value="">
				</p>
				<p>
					真实姓名&nbsp;&nbsp;&nbsp;: <input type="text" name="realName" value="">
				</p>
				<p>
					用户类型&nbsp;&nbsp;&nbsp;: <input type="text" name="role" value="">
				</p>
				<p>
					支付宝账号: <input type="text" name="alipay" value="">
				</p>
				<div style="padding: 5px; text-align: center; position: absolute; bottom: 16px;">
					<button type="submit" value="提交修改" id="changeuserinfo">提交修改</button>
					<button value="返回" id="cancel-change">返回</button>
				</div>
			</form>
		</div>
		<div class="right">
			<p style="font-size:18px;text-align:center;margin:26px 0px 16px 0px;">用户头像</p>
			<div class="right-img">
				<img src="?" id="img-url" style="width: 100%; height: 100%;" />
			</div>
		</div>
	    </div>
		
		
		<div class="pagebar">
			<input type="button" value="首页" onclick="firstPage()"/>
			<input type="button" value="上一页" onclick="prePage()"/>
			<span>当前为第<span class="curpg">${page.currentPage}</span>页</span> |
			<span>总共有<span class="totalPages">${page.totalPages}</span>页</span>
			<input type="button" value="下一页" onclick="nextPage()"/>
			<input type="button" value="尾页" onclick="lastPage()"/>
			<input type="text" id="assign"/>
			<input type="button" value="跳转" onclick="assignPage()"/>
		</div>
	</body>
</html>
