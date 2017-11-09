<%@page import="dao.ProductDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="css/styleSheet.css" />
<title>Laptop</title>
</head>
<body>

	<div id="header">
		<div id="logo">
			<img alt="logo" src="images/logo.png">
		</div>
		<form action="SearchProductServlet">
			<div id="search">
				<input type="text" name="searchname" size="50" style="height: 30px" />
			</div>
			<div id="searchIcon">
			<input type="image" value="submit" src="images/search.png" alt="submit Button" onMouseOver="this.src='images/search.png'">
				<!-- <a href="SearchProductServlet"><img alt="" src="images/search.png"></a> -->
			</div>
		</form>
		<div>
			<a id="giohang" href="Cart.jsp"><img alt=""
				src="images/giohang.png"></a>
		</div>
	</div>
	
	<div id="banner">
		<img alt="" src="images/bannner.png" />
	</div>
	<div id="main">
		<div id="left">
			<div id="leftBar">
				<ul>
					<li><a href="index.jsp">Home</a></li>
					<li><a href="Tivi.jsp">Tivi</a></li>
					<li><a href="Laptop.jsp">Laptop</a></li>
					<li><a href="Phone.jsp">Phone</a></li>
					<li><a href="Fridge.jsp">Fridge</a></li>
					<li><a href="Washing.jsp">Washing</a></li>
					<li><a href="Houseware.jsp">Houseware</a></li>
					<li><a href="Promotions.jsp">Promotions</a></li>
				</ul>
			</div>
			<%
			  ArrayList<Product> listPro = new ArrayList<Product>();
			  ProductDao proDao = new ProductDao();
			  listPro = proDao.getlaptop();
			  for (Product p : listPro) {
			%>
			<div class="tv">
				<a href="ProductServlet?id=<%=p.getId()%>"> <img alt=""
					src="<%=p.getLinkImg()%>"></a>
				<h2><%=p.getName()%></h2>
			</div>

			<%
			  }
			%>
		</div>
		<div id="right">
			<h3>Choice manufacturer</h3>
			<form action="">
				<input type="radio" name="menufacturer" value="sony"> Sony<br>
				<input type="radio" name="menufacturer" value="samsung">
				Samsung<br> <input type="radio" name="menufacturer" value="lg">
				LG<br> <input type="radio" name="menufacturer"
					value="panasonic"> Panasonic<br> <input type="radio"
					name="menufacturer" value="sharp"> Sharp<br>
			</form>
			<h3>Price</h3>
			<form action="">
				<input type="radio" name="cost" value="male">Under 5 milions<br>
				<input type="radio" name="cost" value="female">5-7 milions<br>
				<input type="radio" name="cost" value="other">7-10 milions<br>
				<input type="radio" name="cost" value="female">10-15
				milions<br> <input type="radio" name="cost" value="other">
				Upper 15 milions<br>
			</form>
			<div class="map">
				<iframe
					src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3725.3087121783583!2d105.78619481482701!3d20.980258794808435!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135acce739707cb%3A0xdef9a776670cef73!2zU2nDqnUgVGjhu4sgTWVkaWEgTWFydA!5e0!3m2!1svi!2s!4v1509671892318"
					width="250" height="250" frameborder="0" style="border: 0"
					allowfullscreen></iframe>
			</div>
			<iframe
				src="https://www.facebook.com/plugins/page.php?href=https%3A%2F%2Fwww.facebook.com%2FDienmayMediaMart%2F&tabs&width=250&height=150&small_header=true&adapt_container_width=true&hide_cover=false&show_facepile=true&appId"
				width="250" height="350" style="border: none; overflow: hidden"
				scrolling="no" frameborder="0" allowTransparency="true"></iframe>
		</div>
	</div>
	<div id="footer">

		<div id=thanhtoan>
			<h3>Payment support</h3>
			<br> <img alt="" src="images/thanhtoan.jpg">
		</div>
		<div>
			<h3>Delivery service</h3>
			<br> <img alt="" src="images/giaohang.jpg">
		</div>
		<p>© 2007 Công ty Cổ phần MEDIAMART Việt Nam - ÐCÐK: 29F Hai Ba
			Trung</p>
		<p>Email: hotro@mediamart.com.vn. Ðiện thoại: 024 3936 2099. Fax:
			0243 933 0766</p>
		<p>Website: mediamart.vn / thegioidienmay.com *Ðơn vị tính x 1000d</p>

	</div>
</body>
</html>