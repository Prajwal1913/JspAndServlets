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
			<!-- Expression Language -->
		Welcome ${employee.employeeName}<br>
		City ${employee.city}<br>
		Salary ${employee.salary}<br>
		EmployeeId ${employee.employeeId}<br>


<br>
${message }<br>
${message1 }<br>
${sessionScope.message1 }<br>

</body>
</html>