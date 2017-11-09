<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function alert() {
		alert("Insert success!");
	}
</script>
</head>
<body>
	<form action="AddProductServlet" method="post">
		Name: <input type="text"  name="name"/><br><br>
		Price: <input type="text"  name="price"/><br><br>
		Maker: <input type="text"  name="maker"/><br><br>
		Link Image: <input type="text"  name="linkimg"/><br><br>
		CategoryID: <input type="text"  name="categoryid"/><br><br>
		
		<input type="submit" value="Add" onclick="alert()"/>
	</form>
</body>
</html>