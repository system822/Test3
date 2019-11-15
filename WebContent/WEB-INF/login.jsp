<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do">
		<input placeholder="请输入账号" name="acc_no"><br/>
		<input placeholder="请输入密码" type="password" name="acc_password">
		<input value="登录" type="submit">${msg}
	</form>
</body>
</html>