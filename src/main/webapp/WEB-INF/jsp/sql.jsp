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
      <title>Query</title>
   </head>
   <body>
      <sql:setDataSource var = "snapshot" driver = "org.h2.Driver"
         url = "jdbc:h2:mem:testdb"
         user = "sa" password = ""/>
         <sql:query dataSource = "${snapshot}" var = "result">
		select ist.ad ischi_adi,ct.name1 city_name,co.name comp_name from ISHCILER ist
        join city ct on ct.id=ist.city_id
        join computers co on co.ishciler_id=ist.id;
      </sql:query>
      <table class="table" style="width: 500">
         <tr>
            <th>Ishci Name</th>
            <th>City Name</th>
            <th>Comp Name</th>
         </tr>
         <c:forEach var = "result" items = "${result.rows}">
            <tr>
               <td> <c:out value = "${result.ad}"/></td>
               <td> <c:out value = "${result.name1}"/></td>
               <td> <c:out value = "${result.name}"/></td>
            </tr>
         </c:forEach>
      </table>
   </body>
</html>