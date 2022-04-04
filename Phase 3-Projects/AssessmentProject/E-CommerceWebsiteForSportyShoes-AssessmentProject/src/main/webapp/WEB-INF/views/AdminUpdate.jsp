<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Admin</title>
</head>
<body>
  <center>
  
         <jsp:include page="MainPage.jsp"></jsp:include>
         
	     <h3 style="color:green">Please Update Your Credentials</h3>   
	     
	     <form method="post" action="update/credentials">
		       <input type="text" name="userName"/ placeholder=" Enter New UserName...."><br><br>
		       <input type="password" name="password"/  placeholder="New Password..."><br><br>
		       <input type="submit" value="Update"/>
	    </form> 
  </center>
</body>
</html>