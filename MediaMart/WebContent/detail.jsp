<%@ page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detail product</title>
<link rel="stylesheet" type="text/css" href="css/styleSheet.css" />
<script type="text/javascript">
function callservletBuy(id,num) {
	   document.location.href="ByProductServlet?id="+id;
	   return;
}
function validateSelectBox(obj)
{
    // Lấy danh sách các options
    var options = obj.children;

    // Biến lưu trữ các chuyên mục đa chọn
    var html = '';

    // lặp qua từng option và kiểm tra thuộc tính selected
    for (var i = 0; i < options.length; i++){
        if (options[i].selected){
            html += '<li>'+options[i].value+'</li>';
        }
    }

    // Gán kết quả vào div#result
    return html;
}
</script>
</head>
<body>

	<div id="banner">
		<img alt="" src="images/bannner.png" />
	</div>
	<div id="leftBar">
		<ul>
			<li><a href="index.jsp">Home</a></li>
			<li><a href="manager_category.jsp">Tivi</a></li>
			<li><a href="manager_product.jsp">Laptop</a></li>
			<li><a href="manager_bill.jsp">Phone</a></li>
			<li><a href="${root}/shop/ChartServlet">Fridge</a></li>
			<li><a href="manager_bill.jsp">Washing</a></li>
			<li><a href="manager_bill.jsp">Houseware</a></li>
			<li><a href="manager_bill.jsp">Promotions</a></li>
		</ul>
	</div>
	<%
	  Product p = (Product) request.getAttribute("PRODUCT");
	%>
	<div class="detailtv">
		<img src="<%=p.getLinkImg()%>" />
		<h2><%=(String) p.getName()%></h2>
		<h1 style="color: red">
			Giá bán:
			<%=(int) p.getPrice()%></h1>

		<button style="color: red"
			onclick="callservletBuy(<%=p.getId()%>)">Mua hàng</button>
	</div>
	<div id="footer">
		<p>© 2007 Công ty Cổ phần MEDIAMART Việt Nam - ĐCĐK: 29F Hai Bà
			Trưng</p>
		<p>Email: hotro@mediamart.com.vn. Điện thoại: 024 3936 2099. Fax:
			0243 933 0766</p>
		<p>Website: mediamart.vn / thegioidienmay.com *Đơn vị tính x 1000đ</p>
	</div>
</body>
</html>