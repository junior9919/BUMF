<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
	<table>
		<tr>
			<td>用户姓名</td>
			<td><input type="text" name="userName" id="userName"
				value="user.userName" /></td>
			<td>用户帐号</td>
			<td><input type="text" name="userAccount" id="userAccount"
				value="user.userAccount" /></td>
		</tr>
	</table>
	<table>
		<tr>
			<th>用户姓名</th>
			<th>性别</th>
			<th>用户帐号</th>
		</tr>
		<#list userList as user>
		<tr>
			<td>${user.userName ! ""}</td>
			<td>${user.sex ! ""}</td>
			<td>${user.userAccount ! ""}</td>
		</tr>
		</#list>
	</table>
</body>
</html>