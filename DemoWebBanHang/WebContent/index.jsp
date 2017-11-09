<%@page import="ptit.hungvu.SanPham"%>
<%@page import="ptit.hungvu.ConnectDB"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Information</title>
</head>
<body>
	<%
		ArrayList<SanPham> lst = new ConnectDB().getAllProducts();
	%>
	<h1 align="center">List Product</h1>
	<table border="1" width="80%" align="center">
		<tr>
			<th>Product's ID</th>
			<th>Product's Name</th>
			<th>Provider</th>
			<th>Unit's Price</th>
			<th colspan="2"><a href="insert.jsp">Insert New</a></th>
		</tr>
		<%
			for (SanPham sp : lst) {
				String editURL = "edit.jsp?masp=" + sp.getMasp();
				String deleteURL = "DeleteServlet?masp=" + sp.getMasp();
		%>
		<tr>
			<td><%=sp.getMasp()%></td>
			<td><%=sp.getTensp()%></td>
			<td><%=sp.getNhacc()%></td>
			<td><%=sp.getGiadv()%></td>
			<td><a href="<%=editURL%>">Edit</a></td>
			<td><a href="<%=deleteURL%>">Delete</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>