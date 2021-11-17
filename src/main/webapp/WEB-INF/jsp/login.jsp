<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Daxil Olun!</h1>
	<form action="login" method="post" >
	<input placeholder="İstifadəci adı" type="text" name="username"/><br><br>
	<input placeholder="Parol" type="password" name="password"/><br><br>
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
	<input type="submit" value="login"/>
	<font color="red">
		<c:if test="${not empty param.loginFailed}">
			<c:out value="Uğursuz giriş , yanlış istifadəçi adı və ya parol"></c:out>
		</c:if>
	
	</font>
	</form>
	
</body>
</html>