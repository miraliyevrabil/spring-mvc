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
				<td>Soyad</td>
				<td>Dogum Tarixi</td>
				<td>Bolme</td>
				<td>Unvan</td>
				<td>Maas</td>
			
			</tr>
		
		
		
		
		</thead>
		<c:forEach items="${ishciler}" var="ishciler" varStatus="status">
			<tr bgcolor="${status.index % 2 == 0 ?'white' : 'lightgray'}"> 
				<td>${ishciler.id}</td>
				<td>${ishciler.ad}</td>
				<td>${ishciler.soyad}</td>
				<td>${ishciler.dogumTarixi}</td>
				<td>${ishciler.bolme1}</td>
				<td>${ishciler.unvan}</td>
				<td>${ishciler.maas}</td>
				<td> <button><a href="http://localhost:8080/ishciler/update/${ishciler.id}">Update</a> </button></td>
				<td> <button><a href="http://localhost:8080/ishciler/delete/${ishciler.id}">Delete</a> </button></td>	
			</tr>
		
		</c:forEach>
	
	</table>
	<button><a href="http://localhost:8080/ishciler/new">Create</a></button>
	<c:if test="${not empty message}">
		<div style="color:blue;">
		${message}
		</div>
	</c:if>
</body>
</html>