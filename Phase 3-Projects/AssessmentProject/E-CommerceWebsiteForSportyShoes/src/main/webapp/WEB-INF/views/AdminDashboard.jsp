<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<style type="text/css">
  table, th, td {
  border: 5px solid green;
  border-collapse: collapse;
   text-align: center;

}
th, td {
  background-color: #96D4D4;
   padding-top: 10px;
  padding-bottom: 20px;
  padding-left: 30px;
  padding-right: 40px;
}
.logout{
   background-color: aqua;
} 

 
</style>
</head>
<body bgcolor="maroon">

  <center>
    <jsp:include page="MainPage.jsp"></jsp:include>
      <h3 style="color:blue">****THE PURCHASE DETAILS ARE LISTED BELOW****</h3>
      <table>
	       <tr>
	          <th>UserId</th>
	       	  <th>userName</th>
	         <th>productId</th>
	         <th>productName</th>
	         <th>productPrice</th>
	         <th>dateOfPurchase</th>
	       </tr>
	        
	        <c:forEach items="${purchaselist}" var="plist1">
	       		 <tr>
	       		   <c:forEach items="${plist1}" var="plist2">
	       		     <td><c:out value="${plist2}"></c:out></td>
	       		   </c:forEach>
	       		 </tr>
	        </c:forEach>
	         
     </table>
     <br><br>
     <a href="add/product"><button>Add Product</button></a><br><br>
      <a href="registered/users">Click here to see All Registered Users</a>
      <br><br>
         <a class="logout" href="admin/logout"><button>Logout</button></a>
         
         
      
  </center>
  
  <br>
 
  
</body>
</html>