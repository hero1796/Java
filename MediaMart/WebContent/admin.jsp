<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administrator</title>
<link rel="stylesheet" type="text/css" href="css/styleSheet.css" />
<script type="text/javascript">
function callservletEdit(id) {
   document.location.href="EditProductServlet?id="+id;
   return;
}
function callservletDelete(id) {
	if(confirm("Do you want to delete?")==true){
		document.location.href="DeleteProductServlet?id="+id;
		return;	
	}
	   
}
function callservletAdd() {
	   document.location.href="add-product.jsp";
	   return;
}
</script>
</head>
<body>
	<h2>Manager products</h2>
	<input style="text-align: center;" type="button" value="Add product"
		onclick="callservletAdd()" />
	<table border="1px">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Maker</th>
			<th>CategoryID</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<%
		  ArrayList<Product> listPro = new ArrayList<Product>();
		  ProductDao proDao = new ProductDao();
		  listPro = proDao.getProduct1();
		  for (Product p : listPro) {
		%>
		<tr>
			<td><%=p.getId()%></td>
			<td><%=p.getName()%></td>
			<td><%=p.getPrice()%></td>
			<td><%=p.getMaker()%></td>
			<td><%=p.getCategoryID()%></td>
			<td><input type="button" value="Edit"
				onclick="callservletEdit(<%=p.getId()%>)" /></td>
			<td><input type="button" value="Delete"
				onclick="callservletDelete(<%=p.getId()%>)" /></td>
		</tr>

		<%
		  }
		%>
	</table>
</body>
</html>