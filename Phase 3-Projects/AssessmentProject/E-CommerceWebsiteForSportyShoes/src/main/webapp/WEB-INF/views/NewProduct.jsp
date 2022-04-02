<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>
 <center>
   <jsp:include page="MainPage.jsp"></jsp:include>
    <h3 style="color:green">***Please Add Your Product To the Store***</h3>
    <form method="post" action="new/product">
       <input type="text" name="productName"/ placeholder="Enter product name...."><br><br>
      <input type="text" name="productPrice"/ placeholder="Enter product price..."><br><br>
      <input type="submit" value="Add Product"/>
    </form>
 </center>
</body>
</html>