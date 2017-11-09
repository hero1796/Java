<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Homepage</title>
<link href="${pageContext.request.contextPath}/resources/css/w3.css"
	type="text/css" rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/font-awesome-4.7.0/css/font-awesome.min.css"
	type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resources/css/main.css"
	type="text/css" rel="stylesheet" />
</head>
<body>
	<div class="w3-row" id="header">
		<div class="w3-col m2 w3-hide-medium w3-hide-small" id="logo">
			<img
				src="${pageContext.request.contextPath}/resources/img/lazada-logo.png"
				alt="" class="w3-image">
		</div>
		<div class="w3-col m8" id="search-box">
			<input type="text">
			<button class="w3-btn">
				<i class="fa fa-search" aria-hidden="true"></i>
			</button>
			<i class="fa fa-shopping-cart" aria-hidden="true"></i> <span
				class="w3-badge cart-quantity">0</span>
		</div>
		<div class="w3-col m2 w3-hide-medium w3-hide-small" id="hot-event">
			<img
				src="${pageContext.request.contextPath}/resources/img/hot-event-header.png"
				alt="">
		</div>
	</div>
	<div class="w3-row" id="top-menu">
		<div class="w3-col m1">
			<p></p>
		</div>
		<div class="w3-col m10">
			<a href="${pageContext.request.contextPath}" class="w3-bar-item w3-button">Home</a> <a
				href="${pageContext.request.contextPath}/category/tv"
				class="w3-bar-item w3-button">TV</a> <a
				href="${pageContext.request.contextPath}/category/laptop"
				class="w3-bar-item w3-button">Laptop</a> <a
				href="${pageContext.request.contextPath}/category/phone"
				class="w3-bar-item w3-button">Phone</a> <a
				href="${pageContext.request.contextPath}/category/fridge"
				class="w3-bar-item w3-button">Fridge</a> <a
				href="${pageContext.request.contextPath}/category/washing"
				class="w3-bar-item w3-button">Washing</a>
				<a
				class="w3-bar-item w3-button w3-right" id="loginButton">Login</a>
		</div>
		<div class="w3-col m1">
			<p></p>
		</div>
	</div>
	
<!-- 	Login modal -->
<div id="login-modal" class="w3-modal">
    <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">
        <div class="w3-center"><br>
            <span onclick="document.getElementById('login-modal').style.display='none'"
                  class="w3-button w3-hover-red w3-xxlarge w3-display-topright">&times;</span>
            <img src="img_avatar4.png" alt="Avatar" style="width:30%" class="w3-circle w3-margin-top"></div>
        <div class="w3-container">
            <div class="w3-section">
                <label><b>Username</b></label>
                <input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Username">
                <label><b>Password</b></label>
                <input class="w3-input w3-border" type="password" placeholder="Enter Password">
                <button class="w3-button w3-block w3-green w3-section">Login</button>
                <input class="w3-check" type="checkbox" checked="checked"> Remember me
            </div>
        </div>

        <div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
            <button onclick="document.getElementById('login-modal').style.display='none'" type="button"
                    class="w3-button w3-red">Cancel
            </button>
            <span class="w3-right w3-padding w3-hide-small">Forgot <a href="javascript:void(0)">password?</a></span>
        </div>

    </div>
</div>

<!-- Shopping cart modal -->
<div id="shopping-cart-modal" class="w3-modal">
    <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">
        <table class="w3-table w3-hover-amber">
            <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Points</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Jill</td>
                <td>Smith</td>
                <td>50</td>
            </tr>
            </tbody>


        </table>

        <div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
            <button onclick="document.getElementById('shopping-cart-modal').style.display='none'" type="button"
                    class="w3-button w3-red">Continue shopping
            </button>
            <span class="w3-right w3-padding w3-hide-small"><a href="javascript:void(0)">Checkout</a></span>
        </div>

    </div>
</div>

<!-- Product list -->
	<div class="w3-row" id="product-list">
		<div class="w3-col m1">
			<p></p>
		</div>
		<div class="w3-col m9">
			<div class="w3-row">
				<c:forEach var="product" items="${products }">
					<div class="w3-col l3 m6 s12 product-item">
						<div class="product-card shadow-z1">
							<a
								href="${pageContext.request.contextPath}/Product/${product.id}">
								<ul>
									<li class="product-image w3-center"><img
										src="${pageContext.request.contextPath}/${product.linkImg }" alt=""></li>
									<li class="product-name">${product.name }</li>
									<li class="product-price">${product.price }</li>
								</ul>
							</a> <span class="buy-button">BUY NOW</span>
							<p class="productId" style="display:none">${product.id }</p>
						</div>
					</div>
					
				</c:forEach>

			</div>
		</div>
		<div class="w3-col m2">
			<div id="filter">
				<h3>Filter the products:</h3>
				<div class="brand-filter">
					<h4>Manufacturer:</h4>
					<div class="radio-button-line">
						<input class="w3-radio w3-small" type="radio" name="brand"
							value="lenovo"> <label>Lenovo</label>
					</div>
					<div class="radio-button-line">
						<input class="w3-radio" type="radio" name="brand" value="acer">
						<label>Acer</label>
					</div>
					<div class="radio-button-line">
						<input class="w3-radio" type="radio" name="brand" value="hp">
						<label>Hp</label>
					</div>
				</div>
				<div class="price-filter">
					<h4>Price:</h4>
					<div class="radio-button-line">
						<input class="w3-radio w3-small" type="radio" name="price"
							value="1"> <label>Up to 5M</label>
					</div>
					<div class="radio-button-line">
						<input class="w3-radio" type="radio" name="price" value="2">
						<label>5M - 10M</label>
					</div>
					<div class="radio-button-line">
						<input class="w3-radio" type="radio" name="price" value="3">
						<label>10M - 20M</label>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div id="footer" class="w3-row">
		<div class="w3-col m4">
			<h4>CONTACT LAZADA</h4>
			<ul>
				<li>Mon - Sun: 7.00 - 21.00</li>
				<li>Support center</li>
				<li>Payment</li>
				<li>Order instructions</li>
				<li>Delivery and receipt</li>
			</ul>
		</div>
		<div class="w3-col m4">
			<h4>LAZADA VIETNAM</h4>
			<ul>
				<li>Mon - Sun: 7.00 - 21.00</li>
				<li>Support center</li>
				<li>Payment</li>
				<li>Order instructions</li>
				<li>Delivery and receipt</li>
			</ul>
		</div>
		<div class="w3-col m4">
			<h4>LAZADA SINGAPORE</h4>
			<ul>
				<li>Mon - Sun: 7.00 - 21.00</li>
				<li>Support center</li>
				<li>Payment</li>
				<li>Order instructions</li>
				<li>Delivery and receipt</li>
			</ul>
		</div>
	</div>

	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</body>
</html>