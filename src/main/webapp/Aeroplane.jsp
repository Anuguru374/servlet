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
	<h1>Welcome to Aeroplane Register</h1>
	<c:forEach items="${errors}" var="e">
	<br>
	<span style="color: red;">${e.message}</span>
	</c:forEach>
	
	<form action="aeroplane" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Company</label> <input
				type="text" class="form-control" name="company" id="formFile" required="required"
				placeholder="Enter company" value="${company}"/>
		</div>
		
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" id="formFile" required="required"
				placeholder="Enter name" value="${name}"/>
		</div>
		
		
		<div class="mb-3">
			<label for="formFile" class="form-label">Cost</label> <input
				type="number" class="form-control" name="cost" id="formFile"
				required="required" placeholder="Enter cost" value="${cost}" />
		</div>
		
		Select Type <select class="form-select"
			aria-label="Default select example" name="type" required="required">
			<option selected value="">Select type</option>
			<c:forEach items="${type}" var="t">
			<option value="${t}">${t}</option>
			</c:forEach>
			</select>
			
			
		Select Country <select class="form-select"
			aria-label="Default select example" name="country" required="required">
			<option selected value="">Select country</option>
			<c:forEach items="${country}" var="c">
			<option value="${c}">${c}</option>
			</c:forEach>
			</select>
					<input type="submit" value="Save" class="btn btn-primary"/>
		</form>
</body>
</html>