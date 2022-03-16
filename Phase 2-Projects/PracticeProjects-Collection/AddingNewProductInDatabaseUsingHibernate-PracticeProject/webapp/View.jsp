<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.hibernate.Session , org.hibernate.SessionFactory , com.soumya.hibernateutil.HibernateUtil , com.soumya.product.Product , java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Products</title>
 <style type="text/css">
    table, th, td {
  border: 6px solid blue;
  border-collapse: collapse;
    padding: 15px;
  
}
 </style>
</head>
<body>

<h2 style="color:green">***Product List***</h2>
<table>
   <tr>
   
      <td>Product Id</td>
      <td>Product Name</td>
      <td>Product Price</td>
      <td>Date Added</td>
      
   </tr>
   
   <% 
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); // Getting SessionFactory class instance
	
	Session mySession = sessionFactory.openSession(); // Begin a new Session
	
	List<Product> listOfProducts = mySession.createQuery("from Product").list(); // Fetching the list of Products available in the datbase
	
	// Fetching Products from the listOfProducts one by one
	for(Product pro:listOfProducts){
		%>
		   <tr>
		      <td><%= pro.getProductId() %></td>
		      <td><%= pro.getProductName() %></td>
		      <td><%= pro.getProductPrice() %></td>
		      <td><%= pro.getDateAdded() %></td>
		   </tr>
	<% } 
	   mySession.close(); // Closing current Session
	%>
   
</table>
   <br>
   <a href="Home.jsp"><button>Go To Home Page</button></a>
</body>
</html>