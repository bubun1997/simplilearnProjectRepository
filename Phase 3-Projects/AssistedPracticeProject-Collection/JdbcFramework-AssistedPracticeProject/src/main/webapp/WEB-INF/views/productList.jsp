<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
<style type="text/css">
table, th, td {
  border: 3px solid green;
}
</style>
</head>
<body>
<center>
    Product Details are given Below
   <table>
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Date Added</th>
        
      </tr>
      
      <c:forEach items = "${products}" var = "product">
        <tr>
          <td>${product.productId}</td>
          <td>${product.productName}</td>
          <td>${product.productPrice}</td>
          <td>${product.dateAdded}</td>
        </tr>
      </c:forEach>
   </table>
   <br>
   <br>
   <a href="home">Back to Home Page</a>
</center>
</body>
</html>