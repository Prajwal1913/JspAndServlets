<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>User Details</h2>
<% 
        String employeeName = (String)request.getAttribute("employeeName");
		String city = (String)request.getAttribute("city");
	 	double salary = (Double)request.getAttribute("salary");
		String course = (String)request.getAttribute("course");
		long mobile = (Long)request.getAttribute("mobile");
		String hobbies[] = (String[])request.getParameterValues("hobbies"); 
		
		out.println("welcome "+employeeName+"<br>");
		out.println("Your city is "+city+"<br>");
		out.println("Your salary is "+salary+"<br>");
		out.println("Your mobile number is "+mobile+"<br>");
		out.println("course offered is "+course+"<br>");
		out.println("Your Hobbies are ");
		for(String hobby:hobbies) {
			out.println(" "+hobby.toUpperCase()+"<br>");
		} 
%>
</body>
</html>