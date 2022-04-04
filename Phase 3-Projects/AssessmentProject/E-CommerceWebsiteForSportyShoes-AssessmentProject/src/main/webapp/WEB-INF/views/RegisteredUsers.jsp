<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registered Users</title>
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
<body bgcolor="maroon">
	<center>
	       <jsp:include page="MainPage.jsp"></jsp:include>
	     
	     <h3 style="color:green">***All Registered Users are Listed Below***</h3>
			   <table>
			      <tr>
			        <th>user Id</th>
			        <th>user Name</th>
			      </tr>
			      <c:forEach items="${users}" var="allusers">
			         <tr>
			           <td><c:out value="${allusers.userId}"></c:out></td>
			           <td><c:out value="${allusers.userName}"></c:out></td>
			         </tr>
			      </c:forEach>
			   </table>
			   
			   <br><br>
			   <a href="Admin/dashboard">Go To Dashboard</a>
  </center>
</body>
</html>