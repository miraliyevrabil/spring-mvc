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
	<form:form modelAttribute="ishciler" method="post">
		Ad:<form:input path="ad"/>
		<form:errors path="ad"/><br>
		Soyad:<form:input path="soyad"/>
		<form:errors path="soyad"/><br>
		Dogum Tarixi:<form:input type="date" path="dogumTarixi"/>
		<form:errors path="dogumTarixi"/><br>
		Bolme1:<form:input path="bolme1"/>
		<form:errors path="bolme1"/><br>
		Unvan:<form:input path="unvan"/>
		<form:errors path="unvan"/><br>
		Maas:<form:input path="maas"/>
		<form:errors path="maas"/><br>City:<select name="city" >
    <c:forEach items="${city}" var="city">
    <!-- city id ni arxaya gonderirem city name fronta -->
        <option value="${city.id}" >${city.name}</option>
    </c:forEach>
</select>
		<form:button name="submit">Update</form:button>
		
	
	
	</form:form>


</body>
</html>