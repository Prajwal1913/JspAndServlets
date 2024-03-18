<%@page import="com.doctorapp.model.Doctor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Doctor Details</h2>
<%

		Doctor doctor = (Doctor) request.getAttribute("doctor");

		String doctorName = doctor.getDoctorName();
		out.println("Doctor Name : "+doctorName+"<br>");
		Integer doctorId = doctor.getDoctorId();
		out.println("Doctor Id : "+doctorId+"<br>");
		String speciality = doctor.getSpeciality();
		out.println("Doctor Specialization : "+speciality+"<br>");
		double fees = doctor.getFees();
		out.println("Doctor Fees : "+fees+"<br>");
		int ratings = doctor.getRatings();
		out.println("Doctor Ratings : "+ratings+"<br>");
		int experience = doctor.getExperience();
		out.println("Doctor Experience : "+experience);

%>
</body>
</html>