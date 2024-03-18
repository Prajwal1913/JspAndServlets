<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
        <legend>Login Form</legend>
        <form action="loginServlet">
            Enter Username : <input type="username" name="username"><br><br>
            Enter Password :  <input type="password" name="password"><br><br>
            <input id="loginbtn" type="submit" value="Login">
        </form>
    </fieldset>
</body>
</html>