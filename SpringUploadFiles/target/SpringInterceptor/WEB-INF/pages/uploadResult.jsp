<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload result</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<h3>Uploaded files:</h3>
	Description: ${description}
	<br>
<c:forEach items="${uploadesFiles}" var="file">
# ${file} <br>
</c:forEach>
</body>
</html>