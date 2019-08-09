<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>商品留言</title>
    <link rel="stylesheet" type="text/css" href="../../css/seller/goods_left.css">
</head>

<body>
    <div id="head">商品留言</div>
    <hr>
    <div id="total_content">
        <div id="table">
            <table border="1" cellspacing="0">
                <tr>
                    <th>商品名称</th>
                    <th>买家</th>
                    <th>留言</th>
                    <th>回复</th>
                    <th>操作</th>
                </tr>
                <for>
                    <tr>
                        <td>${goods_name}</td>
                        <td>${user_name}</td>
                        <td>${left_message}</td>
                        <td><input type="text" name="answer" style="height: 23px"></td>
                        <td><button formaction="#">回复</button></td>
                    </tr>
                    <endfor>
            </table>
        </div>
        <div id="control"><a href="./SellerCenter.jsp">返回中心</a></div>
        <hr>
    </div>
</body>

</html>