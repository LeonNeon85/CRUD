<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Messaga</title>
</head>
<body>


<h2>Search result:</h2>

<table border="1" bordercolor="black" cellpadding="4" cellspacing="5">
    <tr>
      <td > ID </td>  
      <td> Name </td> 
      <td> Age </td> 
      <td> isAdmin </td> 
      <td> CreatedDate </td>       
    </tr>
            
   <c:forEach var="user" items="${userList}">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.age}</td>
				<td>${user.admin}</td>
				<td>${user.createdDate}</td>
			</tr>
	</c:forEach>    
   </table>   
   
  <br>
 <form action="user">
    	<button type="submit">Back</button>
</form> 
</body>
</html>