<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Welcome</title>
</head>
<body>
	<h2>
		Xin chao,
		<s:property value="userBean.username" />
		!
	</h2>
</body>
</html>