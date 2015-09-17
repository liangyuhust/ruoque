<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="登陆界面">
    <meta name="author" content="梁誉">
    <title>登陆界面</title>

    <link href="css/login.css" rel="stylesheet">
</head>

<body>
<div class="login"> 
  <div class="loginContent">
     <h1>用户登录</h1>
     <form action="./attempt" method="post">
         <div class="loginup cf"><input type="text" id="username" name="username" class="txtUsername" /></div>
         <div class="loginpw cf"><input type="password" id="password" name="password" class="txtPassword" /></div>
         <div class="loginbtn"><input type="submit" id="btn_submit" class="subLogin" value="登录" /></div>
     </form>
  </div>
  <div class="copyRight">
    <p>COPYRIGHT &copy; 2015  版权所有：金华若缺房地产营销有限公司  </p>
  </div>
</div>
</body>
</html>