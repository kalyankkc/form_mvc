<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8"/>
<title>Product Manager</title>
</head>
<body>
    <table border="1" >
      <tr>
      <th>First Name</th>
      <th>Last Name</th>
      <th>age</th>
      </tr>  
    
   <c:forEach var="user" items="${users}">   
     <tr>  
   <td>${user.firstname}</td>  
   <td>${user.lastname}</td>  
   <td>${user.age}</td>  
   </tr>
   </c:forEach> 
    </table>  
</body>
</html>