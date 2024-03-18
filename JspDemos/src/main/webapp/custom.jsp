<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% request.setAttribute("message", "Great Day"); %>
<c:out value="Today is a ${message }"></c:out><br>
<c:set var="msg" value="Good Day" scope="session"></c:set>

<c:out value="Today is a ${sessionScope.msg }"></c:out>


<% List<String> fruits = Arrays.asList("apple","guava","mango","banana","kiwi");
session.setAttribute("fruitsList", fruits);
%>
<h2>Using EL</h2>
${fruitsList }<br>

<h2>Using C:forEach</h2>
<c:forEach items="${fruitsList }" var="fruit" step="2">
${fruit}<br>
</c:forEach>


</body>
</html>