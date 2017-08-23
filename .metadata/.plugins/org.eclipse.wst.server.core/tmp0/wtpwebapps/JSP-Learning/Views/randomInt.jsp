<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Random" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.println(request.getRequestURI()); %>
<% Random rd = new Random();
int rdNum = rd.nextInt(3);
if(rdNum == 0) {
%>
<h1>Random value = <%= rdNum %></h1> 
<% 
} else if(rdNum == 1) {  
%>
<h2>Random value = <%= rdNum %></h2>
<%
} else {
%>
<h3>Random value = <%= rdNum %></h3>
<%
} 
%>
<a href="<%= request.getRequestURI()%>">Refresh</a>

</body>
</html>