<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.soumya.products.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Info</title>
</head>
<body>
   <h2 style="color:blue">***Your Product Info***</h2>
   <br>
   
     <%
            Product pro = (Product) session.getAttribute("product");// Getting the Product instance from the current Session
            session.invalidate();// Invalidating / Killing the current session
      %>
      
      <!--  Displaying Product details  -->
      Product Id : <%= pro.getProductId() %><br>
      Product Name : <%= pro. getProductName() %><br>
      Product Price : <%= pro.getProductPrice() %><br>
      Date Added : <%= pro.getDateAdded()  %><br>
      
      
      
      <h3 style="color:blue">***Thank You***</h3>
      
   
</body>
</html>