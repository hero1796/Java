<%@page import="dao.CartDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="model.Cart"%>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.CartDao"%>
<%@page import="dao.ProductDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>
<script type="text/javascript">
function callservletDelete(id) {
	if(confirm("Do you want to delete?")==true){
		document.location.href="DeleteCartServlet?id="+id;
		return;	
	}
}
function callservletPay() {
	if(confirm("Do you want to pay now?")==true){
		document.location.href="PayServlet";
		return;
	}
}
function callIndex() {
	document.location.href="index.jsp";
	return;
}
</script>
</head>
<body>
	
	<table border="1px">
		<tr>
			<th>ID Product</th>
			<th>Name Product</th>
			<th>Price</th>
			<th>Number</th>
			<th>Cost</th>
		</tr>
		<%
		  ArrayList<Cart> listCart = new ArrayList<Cart>();
		  CartDao cartDao = new CartDao();
		  ProductDao pDao = new ProductDao();
		  listCart = cartDao.getCart();
		  long total = 0;
		  for (Cart c : listCart) {
		    Product p = (Product) pDao.getProductById(c.getIdProduct());
		    int cost = p.getPrice() * c.getNumber();
		    total = total + cost;
		%>
		<tr>
			<td><%=p.getId()%></td>
			<td><%=p.getName()%></td>
			<td><%=p.getPrice()%></td>
			<td><%=c.getNumber()%></td>
			<td><%=cost%></td>

			<td><input type="button" value="Delete"
				onclick="callservletDelete(<%=c.getId()%>)" /></td>
		</tr>

		<%
		  }
		%>

	</table>
	Total:<input style="text-align: center;" type="text" value="<%=total%>" disabled="disabled"/><br/>
	
	
	<input style="color: red" type="button" value="Thanh toan"
		onclick="callservletPay()" />
		<input type="submit" value="Tiep tuc mua hang" onclick="callIndex()" />
</body>
</html>