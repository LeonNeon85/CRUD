<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
  <title>Update</title>
</head>
<body>

 <h2>Old information:</h2>
 
 <form:form method="post" >
  <table>
    <tr>    
      <td>Old name - ${name} </td>
    </tr>
    <tr>      
      <td>Old age - ${age} </td>
    </tr>
    <tr>
    	<td>Old isAdmin - ${admin}</td>      
    </tr>
     <tr>
    	<td>Old createdDate - ${createdDate}</td>      
    </tr>   
  </table>
</form:form> 


<h2>Enter New information:</h2>
 
 <form:form method="post" action ="updateUser?id=${id}">
  <table>
    <tr>    
      <td>New name<input name="name" type ="text"  maxlength="25" required /> (less than 25) </td>
    </tr>
    <tr>      
      <td>New age<input name="age" type = "number" min = "1" maxlength="2" required /> (please input less than 2 digits)</td>
    </tr>
    <tr>
    	<td>isAdmin<input type="checkbox" name="admin"/></td>      
    </tr>
    <tr>
      <td colspan="2">        	
         <button type="submit"> Submit </button>  
      </td>
    </tr>
  </table>
</form:form> 


</body>
</html>