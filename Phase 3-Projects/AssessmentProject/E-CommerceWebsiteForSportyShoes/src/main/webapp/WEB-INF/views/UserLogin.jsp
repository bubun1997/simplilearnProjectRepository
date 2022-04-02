<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
  label{
  
    left: 50%;
  
  }
</style>
</head>
<body bgcolor="black">
<center>

 <jsp:include page="MainPage.jsp"></jsp:include>
 
  <h3 style="color:blue">***Welcome To our Website***</h3>
  
  <center><h4 style="color:blue">Please Login</h4></center>
  
	  <form method="post" action="user/login/account">
	     <input type="text"  name="userName"/ placeholder="Enter username...."><br><br>
	    <input type="password"  name="passWord"/ placeholder="Enter password...."><br><br>
	     <input type="submit" value="Login"/>
	     
	  </form>
	  <br> 
	 <a href="user/signin"><button>Sign In</button></a>
	   
 </center>
</body>
</html>