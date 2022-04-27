<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

  <center>
     <form method="post" action="send/details">
     
        <input type="text" placeholder="Enter firstname..." name="firstName"/><br><br>
        
        <input type="text" placeholder="Enter lastname..." name="lastName"/><br><br>
        
        <input type="text" placeholder="Enter Age..." name="age"/><br><br>
        
        Select Your Gender : <input type="radio" name="gender" value="male"/> Male
                             <input type="radio" name="gender" value="female"/> Female
                             <input type="radio" name="gender" value="others"/> Others
                             
           <br><br>
           
           Select Your Origin :
         
        <select name="country">
        
           	<option value="India">INDIA</option>
            <option value="Pakistan">PAKISTAN</option>
            <option value="USA">USA</option>
            <option value="Canada">CANADA</option>
            <option value="Australia">AUSTRALIA</option>
            
            
         </select>
         
         <br><br>
         
         Select Your Hobbies :
         
         <input type="checkbox" name="hobbies" value="Cricket"/> Cricket
         <input type="checkbox" name="hobbies" value="Soccer"/>  Soccer
         <input type="checkbox" name="hobbies" value="Singing"/> Singing
         <input type="checkbox" name="hobbies" value="Gardening"/> Gardening
         <input type="checkbox" name="hobbies" value="Reading"/>  Reading
        
        
        <br><br>
        
        
        <hr>
        
      
        
         <button type="submit">Submit Details</button>
        
        
     </form>
  </center>

</body>
</html>