<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-work</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
</head>
<body>


<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">

			<img
				src="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				height="48" width="80"></a>
			<form class="d-flex">
				<a href="index.jsp" class="form-control me-2">Home</a>
			</form>
		</div>
	</nav>


    <h1>Page to Casino </h1>
      <form action="casino"  method="post" class="form-control-lg">
     <div class="form-group">
       <label for="exampleInputEmail1">Name</label>
       <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name" placeholder="enter the name">
     </div>
     
  <div>
   <div class="form-group">
    <label for="exampleInputEmail1">Cruise</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="cruise" placeholder="enter the Cruise">
  </div>
  
  
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Entry Fees</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="entryfees" placeholder="enter the price">
  </div>
  
   <div class="form-group">
    <label for="exampleInputEmail1">Free Food </label>
    yes<input type="radio" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="free" value="true">
    No<input type="radio" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="free" value="false">
  </div>
  
  
    <div class="form-group">
       <label for="exampleInputEmail1">Free Alcohol </label>
       yes<input type="radio" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="alcohol" value="true">
       No<input type="radio" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="alcohol" value="false">
    </div>
      <input type="submit" value="send" class="btn btn-dark">
    </form>
</body>
</html>