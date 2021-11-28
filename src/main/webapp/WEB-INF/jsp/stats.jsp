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
      <title>Adlar</title>
   </head>
   <body>
      <table class="table" style="width: 500">
          <tr>
          	<th>Şəhər Adı</th>
            <th>Şəhər ID</th>
            <th>İşçi sayı</th>
           
         </tr>
         <c:forEach var = "stats" items = "${stats}">
            <tr>
           		 <td> <c:out value = "${stats.name1}"/></td>
               <td> <c:out value = "${stats.stats_city}"/></td>
               <td> <c:out value = "${stats.stats_totalusers}"/></td>
            </tr>
         </c:forEach>
      </table>
   </body>
</html>