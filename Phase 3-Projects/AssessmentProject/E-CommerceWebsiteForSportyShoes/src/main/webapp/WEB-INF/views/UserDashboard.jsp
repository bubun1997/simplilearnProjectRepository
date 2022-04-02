<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Dashboard</title>
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
</style>
</head>
<body bgcolor="gray">

<center>
   <jsp:include page="MainPage.jsp"></jsp:include>
   <c:if test="${flag}">  
   		<h4 style="color:green">Your Product is on the way....</h4>
  </c:if>  
  <h3 style="color:blue">*********Welcome TO DASHBOARD********</h3>
    <table>
      <tr>
         <th>Product Name</th>
         <th>Product Price</th>
         <th>Click below To buy</th>

         
      </tr>
        <c:forEach items="${products}" var="pro">
	        <tr>
	           <td> <c:out value="${pro.productName}"/> </td>
	           <td> <c:out value="${pro.productPrice}"/> </td>
	           <td> <a href="add/product/${id}/${pro.productId}"><button>Buy</button></a> </td>
	        </tr>
        </c:forEach>
         
  </table>
    <br>
        <a href="user/logout"><button>Logout</button></a>
</center>
</body>
</html>