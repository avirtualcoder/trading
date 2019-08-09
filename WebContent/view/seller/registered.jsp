<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>开通跑腿服务</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../../css/seller/SenderCenter.css">
</head>

<body>
    <div id="head">开通跑腿服务</div>
    <hr>
    <form  action="${pageContext.request.contextPath}/senderRegister.action" method="post" enctype="application/x-www-form-urlencoded" style="margin-left:450px;width:300px; height: auto;padding:10px;background-color: #ffff99">
  <div class="form-group"  >
    <label for="InputName">真实姓名</label>
    <input type="text" class="form-control" name="senderName" placeholder="TrueName">
  </div>
  <div class="form-group"  >
    <label for="InputTel">工作手机号</label>
    <input type="text" class="form-control" name="senderTel" placeholder="Tel">
  </div>
  <div class="form-group"  >
    <label for="Inputidentify">身份证号码</label>
    <input type="text" class="form-control" name="senderIdentity" placeholder="identify">
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
  <button style="margin-left: 20px" type="submit" class="btn btn-default">申请开通</button>
</form>
    <hr>
    </div>
    <a href="${pageContext.request.contextPath}/view/seller/SellerCenter.jsp">返回中心</a>
</body>

</html>