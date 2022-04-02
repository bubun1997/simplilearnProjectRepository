<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Signin</title>
</head>
<body bgcolor="black">
<center>
    <jsp:include page="MainPage.jsp"></jsp:include>
	<h3>Let's get started !!</h4>
	<h4 style="color:green">Please provide your credentials to Register Yourself...</h4>
	<br>
	<form method="post" action="signin/account">
		 <input type="text" name="userName"/ placeholder="Enter username...."><br><br>
		 <input type="password" name="passWord"/ placeholder="Enter password..."><br><br>
		<input type="submit" value="Register"/>
	</form>
</center>
</body>
</html>