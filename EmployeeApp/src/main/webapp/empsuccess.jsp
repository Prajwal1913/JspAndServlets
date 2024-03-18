<%@page import="com.empapp.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
<%

		Employee employee = (Employee) request.getAttribute("employee");

		String employeeName = employee.getEmployeeName();
		out.println("Employee Name : "+employeeName+"<br>");
		Integer employeeId = employee.getEmployeeId();
		out.println("Employee Id : "+employeeId+"<br>");
		String city = employee.getCity();
		out.println("Employee City : "+city+"<br>");
		double salary = employee.getSalary();
		out.println("Employee Salary : "+salary+"<br>");
		String course = employee.getCourse();
		out.println("Employee Course : "+course);


%>
</body>
</html>