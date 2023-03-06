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
					<a href="cool">Select</a>
					<a href="Search.jsp">search</a>
					<a href="SearchByFacName.jsp">findByNameSerach</a>
					
				</ul>
			</div>
	</nav>
	
	<h3>
<span style="color:green">${message}</span>
</h3>
<h3>
<span style="color:red">${error}</span>
</h3>
<form action="delete" method="get">


Search By factory Name : <input type="text" name="FactoryName"/>
		<input type="submit" value="Search"/>
	</form>
	<div>
	<table class="table table-bordered">
	<tr>
	<th scope="col">ID</th>
	<th scope="col">FactoryName</th>
	<th scope="col">FactoryPlace</th>
	<th scope="col">EmpName</th>
	<th scope="col">EmpAddress</th>
	</tr>
	<c:forEach items="${dto}" var="d">
	<tr>
	<td>${t.id}</td>
	<td>${t.factoryName}</td>
	<td>${t.factoryPlace}</td>
	<td>${t.empName}</td>
	<td>${t.empAddress}</td>
	<td>${t.salary}</td>
	<td><a href="update?id=${t.id}">edit</a></td>
	</tr>
	</c:forEach>
	</table>
	
</div>

</body>
</html>
