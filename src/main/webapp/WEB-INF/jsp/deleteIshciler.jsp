<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="ishciler" method="post">
	<!-- 	Ad:<form:input path="ad"/><br>
		Soyad:<form:input path="soyad"/><br>
		Dogum Tarixi:<form:input path="dogumTarixi"/><br>
		Bolme1:<form:input path="bolme1"/><br>
		Unvan:<form:input path="unvan"/><br>
		Maas:<form:input path="maas"/><br> -->
		<h1>Delete?</h1>
		<form:button name="submit">Delete</form:button><form:button name="submit"><a href="http://localhost:8080/ishciler">No</a></form:button>
		
	
	
	</form:form>


</body>
</html>