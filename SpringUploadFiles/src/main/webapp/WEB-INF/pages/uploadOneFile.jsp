<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload one file</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<h3>Upload one file</h3>
	<form:form modelAttribute="uploadForm" method="POST" action="" enctype="multipart/form-data">
	Description:<br>
	<form:input path="description" style="width:300px"/>
	<br><br>
	File to upload: <form:input path="fileDatas" type="file"/>
	<br>
	<input type="submit" value="Upload">
	</form:form>
</body>
</html>