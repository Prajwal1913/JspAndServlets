<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Movies available are : </h2>
<%
out.println("SessionId "+session.getId()+"<br>");
out.println("MaxinactiveIn "+session.getMaxInactiveInterval()+"<br>");
String username = (String) session.getAttribute("username");
out.println("Welcome "+username);

    List<String> movieslist = (List<String>) request.getAttribute("details");
	for(String movie:movieslist){
		out.println(movie+"<br> ");
	}
%>
</body>
</html>