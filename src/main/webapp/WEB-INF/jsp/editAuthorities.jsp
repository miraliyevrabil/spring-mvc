<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Yenilə</title>
</head>
<body>
	
		<form:form modelAttribute="authorities" method="post">
		<form:input path="username"/>
		<form:errors path="username"/><br><br>
		
			<select  name="authority" >
	  	<option value="ROLE_EDITOR">EDITOR</option>
		  <option value="ROLE_ADMIN">ADMIN</option>
 		 	
		</select>
		<form:button name="submit"> Yenilə</form:button>
	
	
	</form:form>


</body>
</html>