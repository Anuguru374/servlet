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
					<a href="index.jsp" class="col-lg-2 col-sm-2">Home Page</a>
				</ul>
			</div>
	</nav>
	
	<form action = "cool" method = "Post">

	
	
	<h1>Welcome too factory</h1>
	<c:forEach items="${errors}" var="e">
	<br>
	<span style="color: red;">${e.message}</span>
	</c:forEach>
		
		
		<div class="mb-3">
			<label for="formFile" class="form-label">factoryName</label> <input
				type="text" class="form-control" name="factoryName" id="formFile" required="required"
				placeholder="Enter factory name" value="${factoryName}"/>
		</div>
		
		
		 place <select class="form-select"
			aria-label="Default select example" name="factoryPlace" required="required">
			<option selected value="">Select place</option>
			<c:forEach items="${place}" var="c">
			<option value="${c}">${c}</option>
			</c:forEach>
			</select>
			
		
		
		
		<div class="mb-3">
			<label for="formFile" class="form-label"> empName</label> <input
				type="text" class="form-control" name="empName" id="formFile" required="required"
				placeholder="Enter emp name" value="${empName}"/>
		</div>
		
		
		<div class="mb-3">
			<label for="formFile" class="form-label"> emp address</label> <input
				type="text" class="form-control" name="empAddress" id="formFile" required="required"
				placeholder="Enter emp address" value="${empAddress}"/>
		</div>
		
		<div class="mb-3">
			<label for="formFile" class="form-label"> salary</label> <input
				type="text" class="form-control" name="salary" id="formFile" required="required"
				placeholder="Enter salary" value="${salary}"/>
		</div>
		

					<input type="submit" value="Save" class="btn btn-primary"/>
					
		</form>
</body>
</html>