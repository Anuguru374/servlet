<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>1
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
				</ul>
			</div>
	</nav>
	
	<h1>Welcome to factory Update.....</h1>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message}<br></span>
	</c:forEach>
	<div><span style="color:green;">${e.message}</span></div>
	
	<form action="update" method="post">
	
	<div class="mb-3">
	<label for="formFile" class="form-label">Id</label>
	<input type="text" class="form-control" name="id" readonly="readonly" value="${dto.id}"/>
	
	</div>
	
	<div class="mb-3">
	 <label for="formFile" class="form-label">FactoryName</label>
	<input type="text" class="form-control" name="factoryName" readonly="readonly" value="${dto.factoryName}"/>
	
	</div>	
	
	
	<select class="from-seect" aria-label="Default select example" name="factoryPlace" required="required" >
				<option selected value="${dto.factoryPlace}">${dto.factoryPlace}</option>
				<c:forEach items="${factoryPlace}" var="n">
					<option value="${n}">${n}</option>
				</c:forEach>
			</select>
	
	<div class="mb-3">
	 <label for="formFile" class="form-label">emp name</label>
	<input type="text" class="form-control" name="empName" readonly="readonly" value="${dto.empName}"/>
	
	</div>	
	
	
	<div class="mb-3">
	 <label for="formFile" class="form-label">emp address</label>
	<input type="text" class="form-control" name="empAddress" readonly="readonly" value="${dto.empAddress}"/>
	
	</div>	
	
	<div class="mb-3">
	 <label for="formFile" class="form-label">salary</label>
	<input type="text" class="form-control" name="salary" readonly="readonly" value="${dto.salary}"/>
	
</div>
	
	<input type="submit" value="update"/>
	</form>

</body>
</html>