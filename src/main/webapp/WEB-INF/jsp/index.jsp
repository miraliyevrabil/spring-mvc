<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<button type="button" class="btn btn-secondary"><a href="http://localhost:8080/ishciler" style="text-decoration: none; color: black">Işçilər</button>
	<button type="button" class="btn btn-secondary"><a href="http://localhost:8080/city" style="text-decoration: none; color: black">City</a></button>
	<button type="button" class="btn btn-secondary"><a href="http://localhost:8080/computers" style="text-decoration: none; color: black">Computers</button></button>
	<sec:authorize access="hasRole('ROLE_ADMIN')">
	<button type="button" class="btn btn-secondary"><a href="http://localhost:8080/users" style="text-decoration: none; color: black">Users</button></button>
	</sec:authorize>	
	<sec:authorize access="hasRole('ROLE_ADMIN')">
	<button type="button" class="btn btn-secondary"><a href="http://localhost:8080/authorities" style="text-decoration: none; color: black">Authorities</button></button>
	</sec:authorize>
	<br><br>
	<form action="logout" method="post">
		<input type="submit" value="Çıxış"/>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
	
	</form>
</body>
</html>