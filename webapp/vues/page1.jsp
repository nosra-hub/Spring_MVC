<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>matiere</title>
</head>


<body>
<h1> Liste matiere </h1>
 <a href="${cxt }/tp1Spring1/addMatiere${l.id}">ajouter matiere </a>
<style>
table, th, td {
  border:1px solid black;
}
</style>

<table style="width:100%">

 <c:forEach items="${liste}" var="l">
<tr>
<th>id</th>
    <th>titre</th>
    <th>niveau</th>
    <th>nre heures</th>
  </tr>
<td>${l.id }</td>
<td>${l.titre}</td>
<td>${l.niv}</td>
<td>${l.nbreH}</td>
</tr>
 </c:forEach>
</table>
  
 
  



</body>
</html>
