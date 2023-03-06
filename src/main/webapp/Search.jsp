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
					<a href="index.jsp" class="col-lg-2 col-sm-2">Home</a>
					<a href="cool" class="col-lg-2 col-sm-2">Select</a>
				</ul>
			</div>
	</nav>
	
	<h1>Searching.........</h1>
	<form action="Search" method="get">
	
	Search By Id<input type="text" name="id" required="required" />
	<input type="submit" value="Search"/>

	<h3>
	<span style=""> The search results...</span>
	
	<span style="">the searching result are</span><br>
	<span style="color:blue">id:</span>${dto.id}<br>
	<span style="color:blue">factoryName:</span>${dto.factoryName}<br>
	<span style="color:blue">factoryPlace:</span>${dto.factoryPlace}<br>
	<span style="color:blue">empName:</span>${dto.empName}<br>
	<span style="color:blue">empAddress:</span>${dto.empAddress}<br>
	<span style="color:blue">salary:</span>${dto.salary}<br>
	</h3>
	</form>
</body>
</html>