<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="employeeServlet" method="post">
            Enter name : <input type="text" name="employeeName"><br>
            Enter employeeId : <input type="number" name="employeeId"><br>
            Enter salary : <input type="number" name="salary"><br>
            Enter city : <input type="text" name="city"><br>
            Enter Course :
            <select name="course">
                <option value="Java">Java</option>
                <option value="Spring">Spring</option>
                <option value="Cloud">Cloud</option>
                <option value="Node">Node</option>
            </select>
            <br>
            <input type="submit" name="submit">
        </form>
</body>
</html>