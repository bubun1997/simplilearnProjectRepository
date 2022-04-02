<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style type="text/css">
  *{
    color: black;
  }
</style>
</head>
<body >
<center>

  <jsp:include page="MainPage.jsp"></jsp:include>
  
  <h1>***Welcome Back Admin***</h1>
  
   <form action="admin/login" method="post">
     <input type="text" name="userName"/ placeholder="Enter username..."><br><br>
     <input type="password" name="password"/ placeholder="Enter password..."><br><br>
     <input type="submit" value="Login"/>      
   </form>
   
   <br><br>
   
   <a href="admin/update"><button>Update Credentials</button></a>
</center>
</body>
</html>