<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Əlavə et</title>
</head>
<body>

	<form:form modelAttribute="users" method="post">
		<form:input  placeholder="Username" path="username"/>
		<form:errors path="username"/><br><br>
		<form:input  placeholder="Password" path="password"/>
		<form:errors path="password"/><br><br> 
		<select  name="enabled" >
	  	<option value="true" style="color: green;">True</option>
		  <option value="false" style="color: red;">False</option>
		</select><br><br>
		<form:button name="submit">Əlavə et</form:button>
	</form:form>

</body>
</html>