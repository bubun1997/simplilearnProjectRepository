<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Edit Page</title>
</head>
<body>
   <center>
      <h3>Welcome</h3>
	      <form method="post" action="edit/user">
	      
		      User Id : <input type="text" name="userId" value="${id}"/><br><br>
		       <input type="text" name="userName"/ placeholder="Enter new Name..."><br><br>
		       <input type="text" name="userAge"/ placeholder="Enter new  Age...."><br><br>
		       Select Gender : <input type="radio" name="userGender" value="Male"> Male
									<input type="radio" name="userGender" value="Female"> Female
		       
		       <br><br>
		      	<input type="submit" value="Edit"/><br><br>
		       <a href="home">Go to Home</a>
		      
	      </form>
   </center>
</body>
</html>