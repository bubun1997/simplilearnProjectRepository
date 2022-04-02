<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body bgcolor="cyan">
<center>
    <h3 style="color:green">***Please Provide User Details***</h3>
    
	<form action="add/user" method="post">
		   <input type="text" name="userName" placeholder="Enter  Name..."><br><br>
		   <input type="text" name="userAge" placeholder="Enter  Age...."><br><br>
		   Select  Gender : <input type="radio" name="userGender" value="Male"> Male
								<input type="radio" name="userGender" value="Female"> Female
		   <br><br>
		  <input type="submit" value="Add User"/>
	</form>
</center>
</body>
</html>