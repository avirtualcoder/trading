<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>卖家中心与跑腿系统</title>
    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/css/seller/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
   
</head>

<body>


<div class="container">
	<div class="row clearfix" style="text-align:center;">
		<div class="col-md-12 column" >
			<div class="page-header"  >
				<h1 style="width:auto; padding:10px; background-color:#F5B041 ;">
					卖家中心 <small><label style="font-size: 12px;">管理你的商品或消息</label></small>
				</h1>
			</div>
		</div>
	</div>
	<div class="row clearfix" >
		<div class="col-md-2 column">
			<div class="panel-group" id="panel-680417">
				<div class="panel panel-warning">
					<div class="panel-heading">
						 <a class="panel-title" data-toggle="collapse" data-parent="#panel-680417" href="#panel-element-985520">商品管理</a>
					</div>
					<div id="panel-element-985520" class="panel-collapse in">
						<div class="panel-body">
						<button type="button" class="btn btn-warning btn-block" style="margin-bottom:7px;">发布商品</button>
						<button type="button" class="btn btn-warning btn-block" style="margin-bottom:7px;">在售商品</button>
						<button type="button" class="btn btn-warning btn-block" style="margin-bottom:7px;">下架商品</button>
						<button type="button" class="btn btn-warning btn-block" style="margin-bottom:7px;">待审核商品</button>
						</div>
					</div>
				</div>
				<div class="panel panel-warning">
					<div class="panel-heading">
						 <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-680417" href="#panel-element-126721">订单管理</a>
					</div>
					<div id="panel-element-126721" class="panel-collapse collapse">
						<div class="panel-body">
							<button type="button" class="btn btn-warning btn-block" style="margin-bottom:7px;">我的订单</button>
						</div>
					</div>
				</div>
				<div class="panel panel-warning">
					<div class="panel-heading">
						 <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-680417" href="#panel-element-126722">消息管理</a>
					</div>
					<div id="panel-element-126722" class="panel-collapse collapse">
						<div class="panel-body">
							<button type="button" class="btn btn-warning btn-block" style="margin-bottom:7px;">我的消息</button>
							<button type="button" class="btn btn-warning btn-block" style="margin-bottom:7px;">商品留言</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-8 column">
			<table class="table table-responsive table-hover" >
				<thead>
					<tr>
						<th>
							编号
						</th>
						<th>
							产品
						</th>
						<th>
							交付时间
						</th>
						<th>
							状态
						</th>
						
					</tr>
				</thead>
				<tbody>
					<tr class="success">
						<td>
							在售商品
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							01/04/2012
						</td>
						<td>
							Approved
						</td>
					</tr>
					 
					<tr class="warning">
						<td>
							下架商品
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							03/04/2012
						</td>
						<td>
							Pending
						</td>
					</tr>
					<tr class="info">
						<td>
							待审核商品
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							04/04/2012
						</td>
						<td>
							Call in to confirm
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	<div class="col-md-2 column" >
	<div class="panel panel-warning" style="color:#DC7633; background-color: #EBF5FB ;">
    <div class="panel-heading">卖家信息</div>
    <div class="panel-body">
        <table cellspacing="15">
		<tr>
		<td><img src="${pageContext.request.contextPath}/image/seller/7.png" style="width: 30px;height: 30px;"></td>
		<td>卖家姓名${user_id}</td>
		</tr>
		<td><img src="${pageContext.request.contextPath}/image/seller/xinyu.png" style="width: 30px;height: 30px;"></td>
		<td>
		卖家信用 ${credit}
		</td>
		<tr>
	</table>
    </div>
    <ul class="list-group">
        <li class="list-group-item">广告位招租</li>
        <li class="list-group-item">广告位招租</li>
        <li class="list-group-item">广告位招租</li>
        <li class="list-group-item">广告位招租</li>
        <li class="list-group-item">广告位招租</li>
    </ul>
</div>
		</div>
		
	</div>
	<ul class="pagination pagination-lg" style="margin-left: 30%;">
				<li>
					 <a href="#">上一页</a>
				</li>
				<li>
					 <a href="#">1</a>
				</li>
				<li>
					 <a href="#">2</a>
				</li>
				<li>
					 <a href="#">3</a>
				</li>
				<li>
					 <a href="#">4</a>
				</li>
				<li>
					 <a href="#">5</a>
				</li>
				<li>
					 <a href="#">下一页</a>
				</li>
			</ul>
</div>



<img  src="">
<form action="${pageContext.request.contextPath}/insertOrUpdateGoods.action" method="post" enctype="multipart/form-data">
    <input type="file" name="img"><br/> 
    <input type="submit" name="提交">
</form>


    <h1>卖家中心与跑腿系统</h1>
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
<ol class="breadcrumb">
  <li><div class="dropdown">
        <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
            卖家中心
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
            <li><a href="#">商品发布</a></li>
            <li><a href="#">商品管理</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">我的订单</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">商品留言</a></li>
            <li><a href="#">私聊消息</a></li>
        </ul>
    </div></li>
  <li><div class="dropdown">
        <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
            跑腿中心
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
            <li><a href="#">我的任务</a></li>
            <li><a href="#">任务广场</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">开通服务</a></li>      
        </ul>
    </div></li>
</ol>

<form style="margin-left:450px;width:300px; height: auto;">
  <div class="form-group"  >
    <label for="InputName">真实姓名</label>
    <input type="text" class="form-control" id="InputName" placeholder="TrueName">
  </div>
  <div class="form-group"  >
    <label for="InputTel">工作手机号</label>
    <input type="text" class="form-control" id="InputTel" placeholder="Tel">
  </div>
  <div class="form-group"  >
    <label for="Inputidentify">身份证号码</label>
    <input type="text" class="form-control" id="Inputidentify" placeholder="identify">
  </div>
  <div class="form-group">
    <label for="exampleInputFile">身份证图片</label>
    <input type="file" id="InputFile">
    <p class="help-block"></p>
  </div>
  <div class="checkbox">
    <label>
      <input type="checkbox">同意实名认证
    </label>
  </div>
  <button type="submit" class="btn btn-default">申请开通</button>
</form>


<div class="embed-responsive embed-responsive-16by9">
  <iframe class="embed-responsive-item" src="../pages/SenderCenter.html"></iframe>
</div>
</body>

</html>