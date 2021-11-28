<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Yenilə</title>
</head>
<body>
	<form:form modelAttribute="ishciler" method="post">
		  <form:input placeholder="Ad" path="ad"/>
		<form:errors path="ad"/><br><br>
		<form:input placeholder="Soyad" path="soyad"/>
		<form:errors path="soyad"/><br><br>
		<form:input type="date" path="dogumTarixi"/>
		<form:errors path="dogumTarixi"/><br><br>
		<form:input placeholder="Bölmə" path="bolme1"/>
		<form:errors path="bolme1"/><br><br>
		<form:input placeholder="Ünvan" path="unvan"/>
		<form:errors path="unvan"/><br><br>
		<form:input placeholder="Maaş" path="maas"/>
		<form:errors path="maas"/><br><br>
	 	<select class="form-select"  name="city" style="height: 40;width: 150">
    <c:forEach items="${city}" var="city">
    <!-- city id ni arxaya gonderirem city name fronta -->
        <option value="${city.id}" >${city.name}</option>
    </c:forEach>
</select>
		<br><br>
		<form:button name="submit"> Yenilə</form:button>
		
	
	
	</form:form>


</body>
</html>