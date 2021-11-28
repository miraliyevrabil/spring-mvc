<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<html>
   <head>
   <meta charset="UTF-8">
      <title>Stats</title>
   </head>
   <body>
      <table class="table" style="width: 500">
          <tr>
          	<th>Şəhər Adı</th>
            <th>Şəhər İD</th>
            <th>Say</th>
           
           
         </tr>
         <c:forEach var = "maxUsersCity" items = "${maxUsersCity}">
            <tr>
           	 <td> <c:out value = "${maxUsersCity.name1}"/></td>
              <td> <c:out value = "${maxUsersCity.stats_city}"/></td>
               <td> <c:out value = "${maxUsersCity.max_value}"/></td>
            </tr>
         </c:forEach>
      </table>
   </body>
</html>