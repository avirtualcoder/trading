<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="css/easyui/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/easyui/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="css/easyui/themes/icon.css" />
    <script type="text/javascript" src="css/easyui/jquery.easyui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/admin/common.css"/>
<title>发布商品管理</title>
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
			data:{'currentPage':currentPage,'role':1},
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
						"<input type='button' value='修改' class='showdata-input revise'/>"+
						"<input type='button' value='下架' class='showdata-input impublich'/>"+ 
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
			
			//时间戳转日期
			  function getMyDate(str){
		            var oDate = new Date(str),
		                oYear = oDate.getFullYear(),//年
		                oMonth = oDate.getMonth()+1,//月
		                oDay = oDate.getDate(),//日
		                oHour = oDate.getHours(),//时
		                oMin = oDate.getMinutes(),//分
		                oSen = oDate.getSeconds(),//秒
		                oFf=oDate.getMilliseconds()//毫秒
		                oTime = oYear +'-'+ getzf(oMonth) +'-'+ getzf(oDay) +' '+ getzf(oHour) +':'+ getzf(oMin) +':'+getzf(oSen)+':'+getzf(oFf);//最后拼接时间
		            return oTime;
		        };
		        //补0操作
		        function getzf(num){
		            if(parseInt(num) < 10){
		                num = '0'+num;
		            }
		            return num;
		        }
			
			$(function(){
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
							 $("input[name='auditResult']").val(data[0].auditResult==1?"审核通过":"状态错误");
							 $("input[name='publishUp']").val(getMyDate(data[0].publishUp));
							 $("input[name='publishDown']").val(data[0].publishDown);
							 $("input[name='goodsDetail']").val(data[0].goodsDetail);
							 $(".right-img img").attr("src",data[0].goodsImg);
						}
					});
					$("#win input").attr("disabled","true");
					$("#win").window('open');
				});
				
				//关闭查看窗口
				$("#confirm-btm").click(function(){
					$("#win").window('close');
				});
				
				//修改信息窗口
				$(".revise").click(function(){
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
							 $("input[name='auditResult']").val(data[0].auditResult);
							 $("input[name='publishUp']").val(getMyDate(data[0].publishUp));
							 $("input[name='publishDown']").val(data[0].publishDown);
							 $("input[name='goodsDetail']").val(data[0].goodsDetail);
							 $(".right-img img").attr("src",data[0].goodsImg);
							 console.log(getMyDate(data[0].publishUp));
						}
				    });
					
					$("#changegoods").window("open");
			   });
				
			  $(".closeinfog").click(function(){
				  $("#changegoods").window("close");
			  })
			   
			 //提交修改信息
			 $(".submitinfo").click(function(){
				 var id= $(".changeinfoform input[name='goodsId']").val();
				 var name= $(".changeinfoform input[name='goodsName']").val();
				 var price = $(".changeinfoform input[name='goodPrice']").val();
				 var type = $(".changeinfoform input[name='typeId']").val();
				 var status=$(".changeinfoform input[name='auditResult']").val();
				 var detail= $(".changeinfoform input[name='goodsDetail']").val();
				 alert(id + name + price + type + status + detail);
				 $.ajax({
					 type:"post",
					 url:"${pageContext.request.contextPath}/updategoodsInfoByGoods.action",
					 data:{
						 "goodsId":id,
						 "typeId":type,
						 "goodsName":name,
						 "goodsDetail":detail,
						 "goodPrice":status,
						 "goodPrice":price,
					 },
					 
				 })
				 
			 })
				//商品下架
				$(".impublish").click(function(){
					var a = $(this).closest('tr').find('td').eq(0).text();
					var id = parseInt(a);
				      $.ajax({
						type:"post",
						url:"${pageContext.request.contextPath}/refuseGoodsPublish.action",
						data:{
							"goodsId":id,
							"aResult":2,
						},
						
					}); 
				      test(1);//下架完跳回第一页
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
									<td>
										<input type="button" value="查看 " class="showdata-input inspect"/>
										<input type="button" value="修改" class="showdata-input revise"/>
										<input type="button" value="下架" class="showdata-input impublish" />
									</td>
						        </tr>
						    </c:forEach>
						</c:if>
				</tbody>
			</table>
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
				<div style="padding: 5px; text-align: center; position: absolute; bottom: 16px;">
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
		
		<!-- 修改商品详情窗口 -->
	  <div id="changegoods" class="easyui-window" title="修改商品信息" closed="true"
		  style="width: 700px; height: 489px; position: relative; background: rgb(255, 255, 200);">
		 <div style="width: 61%" class="left">
			<form style="background: rgb(255, 255, 200);" class="left-info changeinfoform" method="post" action="${pageContext.request.contextPath}/updategoodsInfoByGoods.action">
				<p>
					商品ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="goodsId" value="" readonly="true">
				</p>
				<p>
					卖家ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="sellerId" value="" readonly="true">
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
					商品库存&nbsp;&nbsp;&nbsp;: <input type="text" name="goodsLeft" value="" readonly="true">
				</p>
				<p>
					审核状态&nbsp;&nbsp;&nbsp;: <input type="text" name="auditResult" value="" placeholder="1为审核通过，2为审核未通过">
				</p>
				<p>
					发布时间&nbsp;&nbsp;&nbsp;: <input type="text" name="publishUp" value="" readonly="true">
				</p>
				<p>
					下架时间&nbsp;&nbsp;&nbsp;: <input type="text" name="publishDown" value="" readonly="true">
				</p>
				<p>
					商品详情&nbsp;&nbsp;&nbsp;: <input type="text" name="goodsDetail" value="" style="height:51px;width:326px">
				</p>
				
				<div style="padding: 5px; text-align: center; position: absolute; bottom: 16px;" class="bbttnn">
					<input type="button" name="submit" class="submitinfo" value="提交" style="display:block;width:56px;float:left;margin-left:186px;"/>
					<input type="button" name="closeinfog" class="closeinfog" value="返回" style="display:block;width:56px;float:left;margin-left:186px;"/>
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
			<input type="button" value="首页" onclick="firstPage()"/>
			<input type="button" value="上一页" onclick="prePage()"/>
			<span>当前为第<span class="curpg">${page.currentPage}</span>页</span> |
			<span>总共有<span class="totalPages">${page.totalPages}</span>页</span>
			<input type="button" value="下一页" onclick="nextPage()"/>
			<input type="button" value="尾页" onclick="lastPage()"/>
			<input type="text" id="assign"/>
			<input type="button" value="跳转" onclick="assignPage()"/>
			<%-- <span>当前是第条----第条</span> |
			<span>总共有${page}条</span> --%>
		</div>
	</body>
</html>
