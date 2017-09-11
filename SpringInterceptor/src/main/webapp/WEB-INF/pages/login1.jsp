<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset= ISO-8859-1">
<title><spring:message code="label.title" /></title>
</head>
<body>
	<div
		style="text-align: right; padding: 5px; margin: 5px 0px;">
		<a href="${pageContext.request.contextPath}/login1?lang=en">Login (English)</a>&nbsp;&nbsp;
		<a href="${pageContext.request.contextPath}/login1?lang=fr">Login (France)</a>&nbsp;&nbsp;
		<a href="${pageContext.request.contextPath}/login1?lang=vi">Login (Vietnamese)</a>
	</div>
	<form action="" method="post">
		<table>
			<tr>
				<td><strong><spring:message code="label.userName" /></strong></td>
				<td><input name="userName"></td>
			</tr>
			<tr>
				<td><strong><spring:message code="label.password" /></strong></td>
				<td><input name="password"></td>
			</tr>
			<tr>
				<td colspan="2">
					<spring:message code="label.submit" var="labelSubmit"/>
					<input type="submit" value="${labelSubmit}">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>