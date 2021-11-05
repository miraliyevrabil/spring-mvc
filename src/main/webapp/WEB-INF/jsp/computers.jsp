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
				<td>Ishci id</td>
			
			</tr>
		
		
		
		
		</thead>
		<c:forEach items="${computers}" var="computers" varStatus="status">
			<tr bgcolor="${status.index % 2 == 0 ?'white' : 'lightgray'}"> 
				<td>${computers.id}</td>
				<td>${computers.name}</td>
				<!-- computer clasindaki isciler sinifinden olan isciler obyektinin id -si -->
				<td>${computers.ishciler.id}</td>
			
				<td> <button><a href="http://localhost:8080/computers/update/${computers.id}">Update</a></button></td>
				<td> <button><a href="http://localhost:8080/computers/delete/${computers.id}">Delete</a></button></td>	
			</tr>
		
		</c:forEach>
	
	</table>
	<button><a href="http://localhost:8080/computers/new">Create</a></button><button><a href="http://localhost:8080/ishciler">Ishciler</button><button><a href="http://localhost:8080/city">City</a></button><c:if test="${not empty message}">
		<div style="color:blue;">
		${message}
		</div>
	</c:if>
</body>
</html>