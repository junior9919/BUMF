<html>
	<head>
	</head>
	<body>
		<h1>Hello ${user.userName}
		<#if user.sex == 1>
			先生</h1>
		<#else>
			女士</h1>
		</#if>
	</body>
</html>