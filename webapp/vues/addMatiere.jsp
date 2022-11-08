<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Add Matiere</h1>  
       <form:form method="post" action="/tp1Spring1/addMatiere" modelAttribute="matiere">    
      <table >    
            
         <tr>    
          <td>tire :</td> 
         <td> <form:input path="titre" /></td>
          </tr>
           <tr>    
          <td>niv :</td> 
        <td>   <form:input path="niv" /></td>
         </tr>
          <tr>    
          <td>nbre :</td> 
         <td>  <form:input path="nbreH" /></td>
          </tr>
         
      <td>    <input type="submit" value="Save" /></td>
     
      </tr>
            
         </table>        
       </form:form>    

</body>
</html>