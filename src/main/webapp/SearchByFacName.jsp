<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>


	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="C:\Users\anuguru374\Pictures\IMG_20210418_094702.jpg"
				alt="" height="60" width="100"> </a>
				<ul>
				<li style="display: inline-block;padding: 20px;">
					<a href="cool" class="col-lg-2 col-sm-2">Select</a>
					<a href="index.jsp" class="col-lg-2 col-sm-2">Home</a>
				</ul>
			</div>
	</nav>

<h1> Welcome to Factory name Search</h1>
<h3>
<span style="color:red"> ${message}</span> 
</h3>
 
 <form action = "SearchByFacName" method = "get">
 Search By name <input type = "search" name = "factoryName"/>
 <input type = "submit" value = "Search"/>
 </form>
 
 <div>
    <table  class = "table" >
        <tr>
           <th scope="col"> id </th>
           <th scope="col"> factoryName </th>
           <th scope="col"> factoryPlace </th>
           <th scope="col"> empName </th>
           <th scope="col"> empAddress </th>
           <th scope="col"> salary </th>
           <th > Edit </th>
           <th > Delete </th>
            
        </tr>
        
        <c:forEach items ="${list}" var = "t">
        <tr>
          <td> ${t.id} </td>
           <td> ${t.factoryName} </td>
           <td> ${t.factoryPlace} </td>
           <td> ${t.empName} </td>
           <td> ${t.empAddress} </td>
           <td> ${t.salary} </td>
           <td> <a href = "update?id=${t.id}">Edit </a> </td>
           <td> <a href = "delete?id=${t.id}"> Delete </a> </td>
           </tr>
           </c:forEach>
   </table>
 </div>

</body>
</html>