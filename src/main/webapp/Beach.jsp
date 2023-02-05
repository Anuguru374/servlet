<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
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
    
    
   <h1> Give Beach Deatils</h1>
   <form action="beach" method="post" class="form-control-lg">
     <div class="form-group">
      <label for="exampleInputEmail1">Name</label>
      <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name" placeholder="enter name">
     </div>
     
     
  <div>
    <select class="custom-select" name="select">
     <option selected>select location</option>
     <option value="1">Agonda</option>
     <option value="2">Palolem</option>
     <option value="3">Anjuna Beach</option>
    </select> 
  </div>
  
  
   <div class="form-group">
      <label for="exampleInputEmail1">clean </label>
       yes<input type="radio" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="clean" value="true" >
       No<input type="radio" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="clean" value="false">
   </div>
   
   
  <div>
     <div>
   <label for="customRange2" class="form-label">Games</label> <input
				type="text"  class="form-control"  name="games" id="customRange2">
  </div>
  </div>
 <input type="submit" value="send" class="btn btn-dark">
</form>
</head>
<body>

</body>
</html>