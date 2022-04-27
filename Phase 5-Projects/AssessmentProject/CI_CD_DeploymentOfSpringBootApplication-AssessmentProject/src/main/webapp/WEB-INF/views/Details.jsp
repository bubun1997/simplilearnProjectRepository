<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>

  <h4>*****Please find your details below****</h4>

  FirstName : ${user.firstName}
  <br><br>
  LastName : ${user.lastName}
  <br><br>
  Age : ${user.age}
  <br><br>
  Gender : ${user.gender}
  <br><br>
  Country : ${user.country}
  
  <br><br>
  
  Hobbies are : 
  <br><br>
     <c:forEach items="${user.hobbies}" var="hobby">
       <c:out value="${hobby}"></c:out>
       <br>
       
     </c:forEach>
     
  
  
  <h4>****Thank You*****</h4>
  
  <a href="../">Go Back</a>

</body>
</html>