<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor App</title>
</head>
<body>
<form action="doctorServlet" method="post">
			Enter Doctor Name : <input type="text" name="doctorName"><br>
            Enter Doctor Id : <input type="number" name="doctorId"><br>
            Select Speciality :
            <select name="speciality">
            	<option value="ORTHOPEDICIAN">ORTHOPEDICIAN</option>
                <option value="DERMATOLOGIST">DERMATOLOGIST</option>
                <option value="PULMONOLOGIST">PULMONOLOGIST</option>
                <option value="NEUROLOGIST">NEUROLOGIST</option>
            </select><br>
            Enter Fees : <input type="number" name="fees"><br>
            Enter Ratings : <input type="number" name="ratings" min="1" max="5"><br>
            Enter Experience : <input type="number" name="experience"><br>
    
            <input type="submit" name="submit">
</form>
</body>
</html>