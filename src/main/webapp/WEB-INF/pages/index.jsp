<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>


<body>

<h2>Enter user information:</h2>
 
 <form:form method="post" >
  <table>
    <tr>    
      <td>Name<input name="name" type ="text"  maxlength="25" required /> (less than 25) </td>
    </tr>
    <tr>      
      <td>Age<input name="age" type = "number" min = "1" maxlength="2" /> (please input less than 2 digits)</td>
    </tr>
    <tr>
    	<td>isAdmin<input name="admin" type="checkbox" /></td>      
    </tr>
    <tr>
      <td colspan="2">        	
         <button type="submit"  formaction="addUser"> create </button>
		 <button type="submit"  formaction="update"> update </button>
		 <button type="submit"  formaction="deleteUser"> delete </button>
		 <button type="submit"  formaction="searchUser"> search </button>
		      
      </td>
    </tr>
  </table>
</form:form>

<form> 
	<button type="submit" formmethod="post" formaction="showAllUsers" > showAll </button>
</form>

</body>
</html>