<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>------</h2>
<%
	out.println("SessionId "+session.getId()+"<br>");
	out.println("MaxinactiveIn "+session.getMaxInactiveInterval()+"<br>");
    String username = (String) session.getAttribute("username");
    //session.setMaxInactiveInterval(10);
	out.println("Welcome "+username);
%>
<form action="movieServlet">
Select Language Category :
            <select name="language">
                <option value="Kannada">Kannada</option>
                <option value="English">English</option>
                <option value="Hindi">Hindi</option>
                <option value="Tamil">Tamil</option>
                <option value="Telugu">Telugu</option>
            </select>
            <input type="submit" name="submit">
            <br>
</form>
</body>
</html>