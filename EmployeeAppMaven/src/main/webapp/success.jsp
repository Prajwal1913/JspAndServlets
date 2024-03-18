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
<%
		Employee employee = (Employee) request.getAttribute("employee");
		String employeeName = employee.getEmployeeName();
		out.println("Employee Name : "+employeeName+"<br>");
		int employeeId = employee.getEmployeeId();
		out.println("Employee Id : "+employeeId+"<br>");
		double salary = employee.getSalary();
		out.println("Employee Salary : "+salary+"<br>");
		String city  = employee.getCity();
		out.println("Employee City : "+city+"<br>");
%>
</body>
</html>