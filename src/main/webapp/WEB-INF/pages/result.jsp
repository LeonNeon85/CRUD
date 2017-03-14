<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
  <title>User Info</title>
</head>
<body>

<h2>Added User:</h2>
<table>
  <tr>
    <td>Id - </td>
    <td>${id}</td>
  </tr>
  <tr>
  <tr>
    <td>Name - </td>
    <td>${name}</td>
  </tr>
  <tr>
    <td>Age - </td>
    <td>${age}</td>
  </tr>
  <tr>
    <td>isAdmin - </td>
    <td>${admin}</td>
  </tr>
  
</table>

<form action="user">
    	<button type="submit">Back</button>
</form>

</body>
</html>