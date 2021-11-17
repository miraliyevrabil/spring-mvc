<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table" style="width: 400">
		<thead>
			<tr>
				<td>Id</td>
				<td>Ad</td>
			</tr>
		</thead>
		<c:forEach items="${city}" var="city" varStatus="status">
			<tr> 
				<td>${city.id}</td>
				<td>${city.name}</td>
			
				<td> <button type="button" class="btn btn-success"><i class="fa fa-refresh"></i><a href="http://localhost:8080/city/update/${city.id}"style="text-decoration: none; color: black"> Update</a></button></td>
				<sec:authorize access="hasRole('ROLE_ADMIN')">
				<td> <button type="button" class="btn btn-danger"><i class="fa fa-trash"></i><a href="http://localhost:8080/city/delete/${city.id}"style="text-decoration: none; color: black"> Delete</a></button></td>	
				</sec:authorize>
			</tr>
		</c:forEach>
	</table>
	<sec:authorize access="hasRole('ROLE_ADMIN')">
	<button type="button" class="btn btn-secondary"><i class="fa fa-plus"></i><a href="http://localhost:8080/city/new" style="text-decoration: none; color: black"> Create</a></button>
	</sec:authorize>
	<button type="button" class="btn btn-secondary"><a href="http://localhost:8080/ishciler" style="text-decoration: none; color: black">Ishciler</button>
	<button type="button" class="btn btn-secondary"><a href="http://localhost:8080/computers" style="text-decoration: none; color: black">Computers</button>
	<c:if test="${not empty message}">
		<div style="color:blue;">
		${message}
		</div>
	</c:if>
</body>
</html>