<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>
	<form role="form" id="formLogin" action="/user/login.do" method="post">
		<div>
			<input type="text" value="${user.userAccount!" "}" placeholder="帐号"
				name="userAccount" id="userAccount" autofocus />
		</div>
		<div>
			<input type="password" name="passwd" placeholder="密码" />
		</div>
		<#if errorMsg??>
		<div>${errorMsg}</div>
		</#if>
		<div>
			<input type="submit" id="btnLogin" value="登录" />
		</div>
	</form>
</body>
</html>