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
    Enter productName : <input type="text" name="pname"/><br><br>
    Enter productPrice : <input type="text" name="price"/><br><br>
    <input type="submit" value="Add Product"/>
  </form>
  
  <br>
   
  <a href="View.jsp"><button>View Products</button></a>
</body>
</html>