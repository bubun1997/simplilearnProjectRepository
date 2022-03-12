<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.Map , com.soumya.pojo.Product, java.util.Set" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info</title>
<style type="text/css">
   table, th, td {
  border: 6px solid blue;
  border-collapse: collapse;
    padding: 15px;
  
}
h3{
color:green
}
</style>
</head>
<body>
    <h3>***Your Product Details***</h3>
  <table>
     <tr>
        <td>Product Id</td>
        <td>Product Name</td>
        <td>Product Price</td>
        <td>Purchase Date</td>
     </tr>
   <%
        
    	   Product pro = (Product) request.getAttribute("product");
       
       %>
       <tr>
            <td><%= pro.getProductId() %></td>
            <td><%= pro.getProductName() %></td>
      		<td><%= pro.getProductPrice() %></td>
            <td><%= pro.getDateOfPurchase() %></td>
       </tr>
      
  </table>
  <br><br>
  <a href="Home.html"><button>Go Back To Home Page</button></a>
</body>
</html>