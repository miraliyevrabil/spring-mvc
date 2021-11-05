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
		Name:<form:input path="name"/>
		<form:errors path="name"/><br>
		Ishci id:<form:input path="ishciler_id"/>
		<form:errors path="ishciler_id"/><br>
		<form:button name="submit">Update</form:button>
		
	
	
	</form:form>


</body>
</html>