<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

<h2 style="color:green">***Welcome***</h2>

<form action="add" method="post">
  Enter productId : <input type="text" name="id"/><br><br>
  Enter productName : <input type="text" name="name"/><br><br>
  Enter productprice : <input type="text" name="price"/><br><br>
  <input type="submit" value="Add Product"/>
</form>

</body>
</html>