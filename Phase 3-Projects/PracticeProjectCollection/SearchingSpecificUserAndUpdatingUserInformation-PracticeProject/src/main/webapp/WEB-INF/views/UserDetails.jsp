<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    <%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserDetails Page</title>
</head>
<body>
	
   <center>
         <c:if test="${mssg }">
	         <h3 style="color:green">User Details are below....</h3>
	         
		          Id : <b style="color:blue"> ${user.userId} , </b>&nbsp;
		          Name : <b style="color:blue"> ${user.userName} , </b>&nbsp;
		           Age : <b style="color:blue">${user.userAge}  </b>&nbsp;
		           Gender :<b style="color:blue">${user.userGender}</b>
		           <br><br>
	           
	           <a href="get/edit/page/${user.userId}">Edit User</a><br><br>
	           <a href="home">Go to Home</a>
	           
        </c:if>
        <c:if test="${!mssg}">
        	<h3 style="color:red">No users are available</h3>
        	<a href="home">Go to Home</a>
        </c:if>
   </center>

</body>
</html>