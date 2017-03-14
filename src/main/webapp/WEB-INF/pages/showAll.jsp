<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
		
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
		"http://www.w3.org/TR/html4/loose.dtd">


<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Users</title>

</head>

<body>
 <h2>All users from DB:</h2>  
 	
 	<table border="1" bordercolor="black"  cellpadding="4" cellspacing="0" width = "50%" > 
    <thead>    
	    <tr>
	      <th> ID </th>  
	      <th> Name </th> 
	      <th> Age </th> 
	      <th> isAdmin </th> 
	      <th> CreatedDate </th>       
	    </tr>
    </thead>
    
    <tbody>     
	    <c:forEach var="user" items="${userList}">
					<tr>
						<td width="10%">${user.id}</td>
						<td width="10%">${user.name}</td>
						<td width="10%">${user.age}</td>
						<td width="10%">${user.admin}</td>
						<td width="10%">${user.createdDate}</td>
					</tr>
		</c:forEach> 
    </tbody> 
    </table>
    
    <table border="1" bordercolor="black"  cellpadding="4" cellspacing="2"  >    
     	<tfoot >
    			<tr>
    			<c:forEach begin="1" end="${noOfPages}" var="i">
					<c:choose>
						<c:when test="${currentPage eq i}">
							<td>${i}</td>
						</c:when>
						<c:otherwise>	
							<td> 
								<a href="showAllUsers?page=${i}">${i}</a>							
							</td>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				</tr>
    	</tfoot>
     </table> 
     
   <h3> Total users - ${noOfRecords} </h3>  
   
   	<form action="user">
    	<button type="submit">Back</button>
	</form>
   
   
</body>
</html>