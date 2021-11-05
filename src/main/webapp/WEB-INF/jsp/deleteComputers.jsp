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
	<form:form modelAttribute="computers" method="post">
		<h1>Delete?</h1>
		<form:button name="submit">Delete</form:button><form:button name="submit"><a href="http://localhost:8080/computers">No</a></form:button>
		
	
	
	</form:form>


</body>
</html>