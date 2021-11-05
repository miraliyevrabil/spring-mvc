<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="computers" method="post">
		Name:<form:input path="name"/>
		<form:errors path="name"/><br><br>
	
		  Ishci Ad:<select name="ishciler.id" >
    <c:forEach items="${ishciler}" var="ishci">
    <!-- ishci id db ye ishci ad fronta -->
        <option value="${ishci.id}" >${ishci.ad}</option>
    </c:forEach>
</select>
		<br><br>
		<form:button name="submit">Create</form:button>
		
	
	
	</form:form>


</body>
</html>