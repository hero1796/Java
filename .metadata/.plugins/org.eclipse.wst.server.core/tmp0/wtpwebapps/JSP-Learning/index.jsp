<%@page import="sun.rmi.server.Dispatcher"%>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home jsp</title>
</head>
<body>
<h1>hello</h1>
<% Date date = new Date(); %>
<h2>Date la: <%=date.toString() %> </h2>
<% out.println("<h1>Hom nay la: " + new Date() +"</h1>"); 
out.println(request.getServerName());
//response.sendRedirect("http://eclipse.org");
%>
</body>
</html>