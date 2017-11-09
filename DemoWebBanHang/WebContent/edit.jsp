<%@page import="ptit.hungvu.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Product</title>
</head>
<body>
	<%
		SanPham sp = new ConnectDB().getProductByID(request.getParameter("masp"));
	%>
	<form action="UpdateServlet">
		<h1>Edit Product</h1>
		<table>
			<tr>
				<td>Product's ID</td>
				<td><input type="text" name="masp" value="<%=sp.getMasp()%>"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>Product's Name</td>
				<td><input type="text" name="tensp" value="<%=sp.getTensp()%>"></td>
			</tr>
			<tr>
				<td>Provider</td>
				<td><input type="text" name="nhacc" value="<%=sp.getNhacc()%>" /></td>
			</tr>
			<tr>
				<td>Unit's Price</td>
				<td><input type="text" name="giadv" value="<%=sp.getGiadv()%>" /></td>
			</tr>
			<tr>

				<td colspan="2" align="right">
					<button type="submit" name="update">Update</button>
					<button type="reset" name="reset">Reset</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>