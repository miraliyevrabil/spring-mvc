<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Əlavə et</title>
</head>
<body>
	<form:form modelAttribute="computers" method="post">
		<form:input placeholder="Ad" path="name"/>
		<form:errors path="name"/><br><br>
	
		  <select class="form-select" style="height: 40;width: 150" name="ishciler">
    <c:forEach items="${ishcileridandname}" var="ishcileridandname">
    	<option value="${ishcileridandname.ishci_id}" > Id:${ishcileridandname.ishci_id}Ad:${ishcileridandname.ishci_adi}  </option>
        
    </c:forEach>
</select>
		<br><br>
		<form:button name="submit">Əlavə et</form:button>
	</form:form>


</body>
</html>