<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.empapp.service.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<% Employee employee = (Employee) request.getAttribute("employee");%>
		<%= "Welcome "+employee.getEmployeeName()  %><br>
		<%= "City "+employee.getCity() %><br>
		<%= "Salary "+employee.getSalary()  %><br>
		<%= "EmployeeId "+employee.getEmployeeId()  %><br>

</body>
</html>