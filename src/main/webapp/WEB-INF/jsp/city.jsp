<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr style="font-weight: bold;" bgcolor="lightblue">
				<td>Id</td>
				<td>Ad</td>
			
			</tr>
		
		
		
		
		</thead>
		<c:forEach items="${city}" var="city" varStatus="status">
			<tr bgcolor="${status.index % 2 == 0 ?'white' : 'lightgray'}"> 
				<td>${city.id}</td>
				<td>${city.name}</td>
			
				<td> <button><a href="http://localhost:8080/city/update/${city.id}">Update</a></button></td>
				<td> <button><a href="http://localhost:8080/city/delete/${city.id}">Delete</a></button></td>	
			</tr>
		
		</c:forEach>
	
	</table>
	<button><a href="http://localhost:8080/city/new">Create</a></button><button><a href="http://localhost:8080/ishciler">Ishciler</button><button><a href="http://localhost:8080/computers">Computers</button><c:if test="${not empty message}">
		<div style="color:blue;">
		${message}
		</div>
	</c:if>
</body>
</html>