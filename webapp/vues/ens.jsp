<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> ajouter Enseignant </h1>
 <a href="${cxt }/tp1Spring1/${l.id}">ajouter ens </a>


<table br=1>
 <c:forEach items="${list}" var="l">
<tr>
<td>${l.prenom }</td>
<td>${l.nom}</td>
<td>${l.ChargeH}</td>

</tr>
 </c:forEach>
</table>
  
 
  
</body>
</html>