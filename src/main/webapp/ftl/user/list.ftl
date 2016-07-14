<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
	<form role="form" id="formQuery" action="list.do" method="post">
		<table>
			<tr>
				<td>用户姓名</td>
				<td><input type="text" name="userName" id="userName" /></td>
				<td>用户帐号</td>
				<td><input type="text" name="userAccount" id="userAccount" /></td>
				<td><input type="submit" id="btnQuery" value="查询" /></td>
			</tr>
		</table>
	</form>
	<table>
		<tr>
			<th>用户姓名</th>
			<th>性别</th>
			<th>用户帐号</th>
		</tr>
		<#list userList as user>
			<tr>
				<td>${user.userName ! ""}</td>
				<#if user.sex == "0">
					<td>女</td>
				<#else>
					<td>男</td>
				</#if>
				<td>${user.userAccount ! ""}</td>
			</tr>
			<#assign totalPage = user.totalPage /> 
			<#assign currentPage = user.currentPage />
		</#list>
		<tr>
			<td colspan="3">
				<#list 0 .. totalPage - 1 as i>
					<#if currentPage == i + 1>
						${i + 1}
					<#else>
						<a href="list.do?currentPage=${i + 1}">${i + 1}</a>
					</#if>
				</#list>
			</td>
		</tr>
	</table>
</body>
</html>