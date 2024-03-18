<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
            Enter name : <input type="text" name="employeeName"><br>
            Enter city : <input type="text" name="city"><br>
            Enter salary : <input type="number" name="salary"><br>
            Enter mobile : <input type="number" name="mobile"><br>
            Select Course :
            <select name="course">
                <option value="Java">Java</option>
                <option value="Spring">Spring</option>
                <option value="Html">Html</option>
                <option value="Html">Node</option>
            </select>
            <br>
            Select Hobby :
            <input type="checkbox" name="hobbies" value="dance">Dance
            <input type="checkbox" name="hobbies" value="music">Music
            <input type="checkbox" name="hobbies" value="sports">Sports
            <input type="checkbox" name="hobbies" value="reading">Travel
            <br>
            <input type="submit" name="submit">
        </form>
</body>
</html>