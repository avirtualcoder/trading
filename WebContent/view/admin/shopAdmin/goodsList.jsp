<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="css/easyui/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/easyui/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="css/easyui/themes/icon.css" />
    <script type="text/javascript" src="css/easyui/jquery.easyui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/admin/common.css"/>
<title>用户管理</title>
</head>
<style>
.left-info p {
	padding-left: 16px;
	width: 100%;
	height: 36px;
	font-size: 16px;
	line-height: 36px;
}
</style>
<script type="text/javascript">
	function test(currentPage){
		/* alert("test"); */
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath}/serachGoodsBypage.action',
			data:{'currentPage':currentPage,'role':0},
			dataType:'json',
			success:function(data){
				var str="";
				var g = data.glist;
				for(var i=0;i<g.length;i++){
					str+="<tr><td>"+g[i].goodsId +
					    "</td><td>"+g[i].sellerId+
					    "</td><td>"+g[i].goodsName+
						"</td><td>"+g[i].typeId+
						"</td><td>"+g[i].goodPrice+
						"</td><td>"+g[i].goodsLeft+
						"</td><td>"+g[i].goodsStatus+
						"</td><td>"+g[i].goodsDetail+
						"</td><td><input type='button' value='查看' class='showdata-input inspect'/>"+
						"<input type='button' value='同意' class='showdata-input agree'/>"+
						"<input type='button' value='拒绝' class='showdata-input disagree'/>"+ 
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
				if(parseInt(assignpage)<1 || parseInt(assignpage)>parseInt(all)){
					alert("指定页面不存在，请检查输入是否有误");
				}
				else{
					test(assignpage);
					alert("跳转成功");
				}
			}
			
			$(function(){
				$(".agree").click(function(){
				    var con = '';
					con = confirm("确定同意发布该商品吗？");
					var id = $(this).closest('tr').find('td').eq(0).text();
				    if(con!=0){
						$.ajax({
							type:"post",
							data:{
								goodsid:id,
							},
							url:"${pageContext.request.contextPath}/updategoods.action"
						});
						test(1);
					}
					
				});	
				
				
				$(".inspect").click(function(){
					var a = $(this).closest('tr').find('td').eq(0).text();
					var inta = parseInt(a);
					$.ajax({
						type:"post",
						data:{goodsId:inta},
						dataType:"json",
						url:"${pageContext.request.contextPath}/searchGoodsByID.action",
						success:function(data){
							 $("input[name='goodsId']").val(data[0].goodsId);
							 $("input[name='typeId']").val(data[0].typeId);
							 $("input[name='goodsName']").val(data[0].goodsName);
							 $("input[name='goodPrice']").val(data[0].goodPrice);
							 $("input[name='sellerId']").val(data[0].sellerId);
							 $("input[name='goodsLeft']").val(data[0].goodsLeft);
							 $("input[name='goodsStatus']").val(data[0].goodsStatus);
							 $("input[name='auditResult']").val(data[0].auditResult==0?"待审核":(auditResult==1?"审核通过":"审核未通过"));
							 $("input[name='publishUp']").val(data[0].publishUp==0?"未上架":data[0].publishUp);
							 $("input[name='publishDown']").val(data[0].publishDown);
							 $("input[name='goodsDetail']").val(data[0].goodsDetail);
							 $(".right-img img").attr("src",data[0].goodsImg);
						}
					});
					$(".left-info input").attr("disabled","true");
					$("#win").window('open');
				}); 
				
				$("#confirm-btm").click(function(){
					$("#win").window('close');
				});
				
				
				/* 拒绝窗口处理 */
				$(".disagree").click(function(){
					var goodsid = $(this).closest('tr').find('td').eq(0).text();
					var goodsname = $(this).closest('tr').find('td').eq(2).text();
					$("input[name='refuseTypeId']").val(goodsid);
					$("input[name='refuseGoodsName']").val(goodsname);
					$("#refuse").window('open');
				});
				
				//拒绝窗口提交事件
				$("#refuse-btn").click(function(){
					var goodsid = parseInt($("input[name='refuseTypeId']").val());
					var reasontext = document.getElementById('refuseReason').value;
					$.ajax({
						type:"post",
						data:{
							goodsId:goodsid,
							reason:reasontext,
							status:"2"
						},
						url:"${pageContext.request.contextPath}/refuseGoodsPublish.action",
					});
					test(1);
				});
				
				
			});	
			
			
			
			
</script>
<body>
	<div style="width: 100%;">
		<table>
			<thead>
				<tr style="background-color: #F5F5F5;">
					<th>商品ID</th>
					<th>卖家ID</th>
					<th>商品名称</th>
					<th>商品类型</th>
					<th>商品价格</th>
					<th>商品库存</th>
					<th>商品状态</th>
					<th>商品详情</th>
					<th style="width: 200px;">操作类型</th>
				</tr>
			</thead>
			<tbody id="showdata">
				<c:if test="${glist != null}">
					<c:forEach items="${glist}" var="g">
						<tr>
							<td>${g.goodsId}</td>
							<td>${g.sellerId}</td>
							<td>${g.goodsName}</td>
							<td>${g.typeId}</td>						
							<td>${g.goodPrice}</td>
							<td>${g.goodsLeft}</td>
							<td>${g.goodsStatus}</td>
							<td>${g.goodsDetail}</td>
							<td><input type="button" value="查看 "
								class="showdata-input inspect" /> <input type="button"
								value="同意" class="showdata-input agree" /> <input type="button"
								value="拒绝" class="showdata-input disagree" /></td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>
	
	<!-- 拒绝窗口 -->
	<div id="refuse" class="easyui-window" title="商品详情" closed="true"
		style="width: 500px; height: 389px; position: relative; background: rgb(255, 255, 200);">
		<div style="width: 61%" class="left">
			<form style="background: rgb(255, 255, 200);" class="left-info refuse-form">
				<p>
					商品ID:&nbsp;&nbsp;&nbsp; <input type="text" name="refuseTypeId" value="" readonly="true"/>
				</p>
				<p>
					商品名称: <input type="text" name="refuseGoodsName" value="" readonly="true">
				</p>
				<p>
					拒绝发布的理由：<textarea rows="5" cols="36" maxlength="100" id="refuseReason"></textarea>
				</p>
				<div style="padding: 5px; text-align: center; position: absolute; bottom: 16px;">
					<button type="submit" value="提交" style="margin-left:66px;" id="refuse-btn">提交</button>
					<button value="返回" style="margin-left:126px;">返回</button>
					
				</div>
			</form>
		</div>
		</div>
	
	
	<!-- 查看商品详情窗口 -->
	<div id="win" class="easyui-window" title="商品详情" closed="true"
		style="width: 700px; height: 489px; position: relative; background: rgb(255, 255, 200);">
		<div style="width: 61%" class="left">
			<form style="background: rgb(255, 255, 200);" class="left-info">
				<p>
					商品ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="goodsId" value="">
				</p>
				<p>
					卖家ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="sellerId" value="">
				</p>
				<p>
					商品名称&nbsp;&nbsp;&nbsp;: <input type="text" name="goodsName" value="">
				</p>
				<p>
					商品类型&nbsp;&nbsp;&nbsp;: <input type="text" name="typeId" value="">
				</p>
				<p>
					商品价格&nbsp;&nbsp;&nbsp;: <input type="text" name="goodPrice" value="">
				</p>
				<p>
					商品库存&nbsp;&nbsp;&nbsp;: <input type="text" name="goodsLeft" value="">
				</p>
				<p>
					审核状态&nbsp;&nbsp;&nbsp;: <input type="text" name="auditResult" value="">
				</p>
				<p>
					发布时间&nbsp;&nbsp;&nbsp;: <input type="text" name="publishUp" value="">
				</p>
				<p>
					下架时间&nbsp;&nbsp;&nbsp;: <input type="text" name="publishDown" value="">
				</p>
				<p>
					商品详情&nbsp;&nbsp;&nbsp;: <input type="text" name="goodsDetail" value="" style="height:51px;width:326px">
				</p>
				<div style="padding: 5px; text-align: center; position: absolute; bottom: 6px;">
					<button value="确定" style="margin-left:250px; id="confirm-btm"">确定</button>
				</div>
			</form>
		</div>
		<div class="right">
			<p style="font-size:18px;text-align:center;margin:26px 0px 16px 0px;">商品图片</p>
			<div class="right-img">
				<img src="?" id="img-url" style="width: 100%; height: 100%;" />
			</div>
		</div>
	</div>

	<!-- 分页栏 -->
	<div class="pagebar">
		<input type="button" value="首页" onclick="firstPage()" /> <input
			type="button" value="上一页" onclick="prePage()" /> <span>当前为第<span
			class="curpg">${page.currentPage}</span>页
		</span> | <span>总共有<span class="totalPages">${page.totalPages}</span>页
		</span> <input type="button" value="下一页" onclick="nextPage()" /> <input
			type="button" value="尾页" onclick="lastPage()" /> <input type="text"
			id="assign" /> <input type="button" value="跳转" onclick="assignPage()" />
		<%-- <span>当前是第条----第条</span> |
			<span>总共有${page}条</span> --%>
	</div>
</body>
</html>
