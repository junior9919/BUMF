<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑用户</title>
</head>
<body>
<#if user.id??>
	<#assign formAction = "update" />
<#else>
	<#assign formAction = "insert" />
</#if>
<form action="/" id="formEdit" method="post">
<table>
	<tr>
		<td colspan="2">
			<input type="hidden" name="id" value="${user.id!""}" />
		</td>
	</tr>
	<tr>
		<th>选择角色</th>
		<td>
			<select name="role">
				<#list roleList as role>
					<option value="${role.id}" <#if user.roleId == role.id>selected="selected"</#if>>${role.roleName!""}</option>
				</#list>
			</select>
		</td>
	</tr>
	<tr>
		<th>用户名称</th>
		<td>
			<#if formAction == "insert">
				<input type="text" name="userName" id="userName" data-rule="用户名称:required;userName;length[0~50];remote[unique]" />
			<#else>
				<input type="text" name="userName" id="userName" value="${user.userName!""}" />
			</#if>
		</td>
	</tr>
	<tr>
		<th>性别</th>
		<td>
			<select name="sex">
				<option value="${user.sex}" <#if user.sex == "1">selected="selected"</#if>>男</option>
				<option value="${user.sex}" <#if user.sex == "0">selected="selected"</#if>>女</option>
			</select>
		</td>
	</tr>
	<tr>
		<th>用户帐号</th>
		<td>
			<#if formAction == "insert">
				<input type="text" name="userAccount" id="userAccount" data-rule="用户帐号:required;userAccount;length[0~50];remote[unique]" />
			<#else>
				<input type="text" name="userAccount" id="userAccount" value="${user.userAccount!""}" />
			</#if>
		</td>
	</tr>
	<tr>
		<th>密码</th>
		<td>
			<input type="password" name="passwd" id="passwd" data-rule="密码:passwd;length[6~50;]" />
		</td>
	</tr>
	<tr>
		<td colspan="2"><#if formAction == "update">不输入代表不修改密码</#if></td>
	</tr>
	<tr>
		<th>确认密码</th>
		<td>
			<input type="password" name="confirmPasswd" id="confirmPasswd" data-rule="match(passwd)" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<#if formAction == "insert">
				<button method="insert.do">新增</button>	
			<#else>
				<button method="update.do">保存</button>
			</#if>			
		</td>
	</tr>
</table>
</form>
</body>
</html>