<%@page import="java.io.InputStream"%>
<%@page import="java.io.DataOutputStream"%>
<%@page import="java.io.StringWriter"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>
</head>
<body>
<h1>Some error in page</h1>
Message:
<%= exception.getMessage() %>
<h2>StackTrace: </h2>
<%
StringWriter stringWr = new StringWriter();
PrintWriter pr = new PrintWriter(stringWr);
exception.printStackTrace(pr);
out.println("<pre>");
out.println(stringWr);
out.println("</pre>");
pr.close();
stringWr.close();
%>
</body>
</html>