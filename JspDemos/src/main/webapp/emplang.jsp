<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 

pageContext.setAttribute("message","welcome");
request.setAttribute("message", "good day");
session.setAttribute("message","bad day");
application.setAttribute("message", "fun day");

%>
<h2>using scripting</h2>
<% 
String msg1 = (String) request.getAttribute("message");
String msg2 = (String) session.getAttribute("message");
String msg3 = (String) application.getAttribute("message");
%>
<%=msg1 %><br>
<%=msg2 %><br>
<%=msg3 %><br>

<h2>using EL</h2>
${message}
${requestScope.message}
${sessionScope.message}
${applicationScope.message}

</body>
</html>