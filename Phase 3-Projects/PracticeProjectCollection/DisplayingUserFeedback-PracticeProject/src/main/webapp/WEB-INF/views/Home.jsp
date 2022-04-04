<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Feedback</title>

</head>
<body>
<div class="container">
    <center>
      <h3 style="color:green">***Welcome, Please Give Your Feedback***</h3><br>
      <form method="post" action="post/feedback">
         Enter FirstName : <input type="text" name="firstName" required/><br><br>
         Enter LastName  : <input type="text" name="lastName" required/><br><br>
         <textarea name="feedBack" placeholder="Write your feedback here..." style="height:200px" required></textarea><br><br>
         <input type="submit" value="Submit Feedback"/>
         
         
      </form>
    </center>
</body>
</html>