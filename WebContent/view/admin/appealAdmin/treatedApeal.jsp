<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="css/easyui/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/easyui/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="css/easyui/themes/icon.css" />
    <script type="text/javascript" src="css/easyui/jquery.easyui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/admin/common.css"/>
<title>用户申诉管理界面</title>
</head>
<script type="text/javascript">
function test(currentPage,role){
	
	$.ajax({
		type:'post',
		url:'${pageContext.request.contextPath}/serachAppealBypage.action',
		data:{'currentPage':currentPage,
			  'role':role	
		},
		dataType:'json',
		success:function(data){
			var a = data.aList;
			var str="";
			for(var i=0;i<a.length;i++){
				str+="<tr><td>"+a[i].appealId +
					"</td><td>"+a[i].appealTime+
					"</td><td>"+a[i].orderId+
					"</td><td>"+a[i].appealReason+
					"</td><td>"+a[i].appealStatus+
					"</td><td>"+a[i].appealResult+
					 "</td><td><input type='button' value='查看' class='showdata-input inspect-user'/>"+
					"<input type='button' value='修改' class='showdata-input change-user'/>"+
					"<input type='button' value='删除' class='showdata-input delete-user' />"+ 
					"</td></tr>"
			}
			$("#showdata").html(str);
			var page = data.page;
			$(".curpg").text(page[0].currentPage);
			$(".totalPages").text(page[0].totalPages);
		},
		error:function(){
			alert("获取数据失败");
		}
	})
}

		function firstPage(){
		    var num = $(".curpg").text();
		    var role = parseInt($("tbody").find("td").eq(4).text());
			if(parseInt(num)==1){
				alert("已经是首页了");
			}
			else{
				var currentPage = 1;
				test(currentPage,role);
			}	
		}
		
		function prePage(){
			var num = $(".curpg").text();
			var role = parseInt($("tbody").find("td").eq(4).text());
			if(num==1){
				alert("已经是第一页了");
			}
			else{
				var currentPage = num-1;
				test(currentPage,role);
			}
		}
		
		function nextPage(){
			var num = $(".curpg").text();
			var all = $(".totalPages").text();
			var role = parseInt($("tbody").find("td").eq(4).text());
			if(parseInt(num)==parseInt(all)){
				alert("已经是最后一页了");
			}
			else{
				var c=parseInt(num)+1;
				test(c,role);
			}
		}
		
		function lastPage(){
			var num = $(".curpg").text();
			var all = $(".totalPages").text();
			var role = parseInt($("tbody").find("td").eq(4).text());
			if(parseInt(num)==parseInt(all)){
				alert("已经是尾页了");
			}
			else{
				var c=parseInt(all);
				test(c,role);
			}
		}
		
		function assignPage(){
			var assignpage = $("#assign").val();
			var all = $(".totalPages").text();
			var role = parseInt($("tbody").find("td").eq(4).text());
			if(jQuery.isNumeric(assignpage)){
				if(parseInt(assignpage)<1 || parseInt(assignpage)>parseInt(all)){
					alert("指定页面不存在，请检查输入是否有误");
				}
				else{
					test(assignpage,role);
					alert("跳转成功");
				}
			}else{
				alert("输入有误");
			}
			
		}
		
</script>
<body>
   <div style="width: 100%;">
			<table>
				<thead>
			    <tr style="background-color: #F5F5F5;">
			        <th>申诉ID</th>
			        <th>申诉时间</th>
					<th>申诉的订单ID</th>
					<th>申诉原因</th>
					<th>申诉状态</th>
					<th>处理结果</th>
					<th style="width:200px;">操作类型</th>
			    </tr>
				</thead>
				<tbody id="showdata">
					<c:if test="${apealList != null}">
						    <c:forEach items="${apealList}" var="a">
						        <tr>
						            <td>${a.appealId}</td>
									<td>${a.appealTime}</td>
						            <td>${a.orderId}</td>
						            <td>${a.appealReason}</td>
									<td>${a.appealStatus}</td>
									<td>${a.appealResult}</td>
									<td>
										<input type="button" value="查看" class="showdata-input inspectappeal" />
										<input type="button" value="通过" class="showdata-input " />
										<input type="button" value="驳回" class="showdata-input " />
									</td>
						        </tr>
						    </c:forEach>
						</c:if>	
				</tbody>
			</table>
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