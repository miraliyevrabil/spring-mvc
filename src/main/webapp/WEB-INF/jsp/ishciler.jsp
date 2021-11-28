<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>İşçilər</title>
</head>
<body>
	<table class="table" style="width: 900;">
		<thead>
			<tr>
				<td>Id</td>
				<td>Ad</td>
				<td>Soyad</td>
				<td>Doğum Tarixi</td>
				<td>Bölmə</td>
				<td>Ünvan</td>
				<td>Maaş</td>
				<td>Şəhər</td>
			</tr>
		</thead>
		<c:forEach items="${ishciler}" var="ishciler" varStatus="status">
			<tr > 
				<td>${ishciler.id}</td>
				<td>${ishciler.ad}</td>
				<td>${ishciler.soyad}</td>
				<td>${ishciler.dogumTarixi}</td>
				<td>${ishciler.bolme1}</td>
				<td>${ishciler.unvan}</td>
				<td>${ishciler.maas}</td>
				<!-- isciler clasinda city clasindan yaratdigim city obyektinin name -  -->
				<td>${ishciler.city.name}</td>
				<td> <button type="button" class="btn btn-success"><i class="fa fa-refresh"></i><a href="http://localhost:8080/ishciler/update/${ishciler.id}" style="text-decoration: none; color: black"> Yenilə</a> </button></td>
				<sec:authorize access="hasRole('ROLE_ADMIN')">
<td> <button type="button" class="btn btn-danger"><i class="fa fa-trash"></i><a href="http://localhost:8080/ishciler/delete/${ishciler.id}" style="text-decoration: none; color: black"> Sil</a> </button></td>	
				</sec:authorize>	
			</tr>
		
		</c:forEach>
	
	</table>
	<sec:authorize access="hasRole('ROLE_ADMIN')">
	<button type="button" class="btn btn-secondary"><i class="fa fa-plus"></i><a href="http://localhost:8080/ishciler/new" style="text-decoration: none; color: black"> Əlavə et</a></button> 
	</sec:authorize>
	
	<button type="button" class="btn btn-secondary"><a href="http://localhost:8080/city" style="text-decoration: none; color: black">Şəhərlər</a></button>
	<button type="button" class="btn btn-secondary"><a href="http://localhost:8080/computers" style="text-decoration: none; color: black">Komputerlər</button></button>
	<button type="button" class="btn btn-secondary"><a href="http://localhost:8080/sql" style="text-decoration: none; color: black">Adlar</button>
	<button type="button" class="btn btn-secondary"><a href="http://localhost:8080/" style="text-decoration: none; color: black">Əsas Səhifə</button>
	<c:if test="${not empty message}">
		<div style="color:blue;">
		${message}
		</div>
	</c:if>
</body>
</html>