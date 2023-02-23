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
				src="https://www.freepnglogos.com/uploads/plane-png/plane-png-flights-airlines-msp-airport-1.png"
				alt="" height="60" width="100"> </a>
				<ul>
				<li style="display: inline-block;padding: 20px;">
					<a href="index.jsp" class="col-lg-2 col-sm-2">Home Page</a>
				</ul>
			</div>
	</nav>
	
	<h1>Welcome to Aeroplane Search page</h1>
	<h3><span style="color:red">${message}</span></h3>
	<form action="search" method="get">
	Search By Id<input type="text" name="id" />
	<input type="submit" value="search"/>
	</form>
	<div>
	<h4>Search Results</h4>
	Company:${dto.company}<br>
	Name:${dto.name}<br>
	Cost:${dto.cost}<br>
	Type:${dto.type}<br>
	Country:${dto.country}
	</div>
</body>
</html>