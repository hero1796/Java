<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.Product"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit product</title>
</head>
<body>
	<%
	  Product p = (Product)request.getAttribute("PRODUCT");
	%>
	<form style="text-align: center;" action="EditProductConfirm" method="post">
		ID: <input type="text" value="<%=p.getId()%>" name="id" disabled="disabled"/><br><br>
		Name: <input type="text" value="<%=p.getName()%>" name="name"/><br><br>
		Price: <input type="text" value="<%=p.getPrice()%>" name="price"/><br><br>
		Maker: <input type="text" value="<%=p.getMaker()%>" name="maker"/><br><br>
		CategoryID: <input type="text" value="<%=p.getCategoryID()%>" name="categoryid"/><br><br>
		<input type="submit" value="Edit" />
	</form>
</body>
</html>