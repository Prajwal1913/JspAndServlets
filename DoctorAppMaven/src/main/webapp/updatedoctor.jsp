<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Doctor</title>
<style>
form{
    border: 2px solid rgb(74, 74, 74);
    padding: 20px;
    width: 400px;
    margin-top:50px;
    height: 350px;
}
input,select{
    width: 100px;
    height: 30px;
    border: 1px solid rgb(121, 121, 121);
    box-shadow: 2px 1px 7px 1px;
}
input:hover{
    width: 102px;
    height: 32px;
    border: 2px solid rgb(43, 43, 43);
    box-shadow: 2px 1px 7px 1px;
}
</style>
</head>
<body>
<h2>Update Doctor Details</h2>
    <form action="addServlet">
            Doctor Name : <input type="text" name="doctorName"><br><br>
            Doctor Id : <input type="number" name="doctorId"><br><br>
            Select Speciality :
            <select name="speciality">
                <option value="none"></option>
            	<option value="ORTHOPEDICIAN">ORTHOPEDICIAN</option>
                <option value="DERMATOLOGIST">DERMATOLOGIST</option>
                <option value="PULMONOLOGIST">PULMONOLOGIST</option>
                <option value="NEUROLOGIST">NEUROLOGIST</option>
            </select><br><br>
            Doctor Fees : <input type="number" name="fees"><br><br>
            Doctor Ratings : <input type="number" name="ratings" min="1" max="5"><br><br>
            Doctor Experience : <input type="number" name="experience"><br><br>
     <input type="submit" name="submit">
    </form>
</body>
</html>