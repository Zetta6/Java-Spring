<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<meta charset="ISO-8859-1">

<title>Ninja Gold Game</title>

</head>

<body>
	
	<br>

	<div style="margin: 20px; margin-left: 40px">Your Gold: <p style="border: 2px solid #ccc; height: 30px; width: 130px"> <c:out value="${gold}" ></c:out></p></div>
	
	<br>
	
		<div class="row" style="margin: 20px">
	  <div class="col-sm-3">
	    <div class="card">
	      <div class="card-body">
	        <h2 class="card-title" style="text-align: center">Farm</h2>
	        <p class="card-text" style="text-align: center">(earns 10 - 20 gold)</p>
			<form style="text-align: center" method="POST" action="Gold">
	        	<input type="number" value="10" name="min" style="display: none">
	        	<input type="text" value="Farm" name="name" style="display: none">
	        	<input type="number" value="20" name="max" style="display: none">
	        	<button class="btn btn-success">Find Gold!</button>
	        </form>
	      </div>
	    </div>
	  </div>
	  <div class="col-sm-3">
	    <div class="card">
	      <div class="card-body">
	        <h2 class="card-title" style="text-align: center">Cave</h2>
	        <p class="card-text" style="text-align: center">(earns 5 - 20 gold)</p>
			<form style="text-align: center" method="POST" action="Gold">
	        	<input type="number" value="5" name="min" style="display: none">
	        	<input type="text" value="Cave" name="name" style="display: none">
	        	<input type="number" value="20" name="max" style="display: none">
	        	<button class="btn btn-success">Find Gold!</button>
	        </form>
	      </div>
	    </div>
	  </div>
	  <div class="col-sm-3">
	    <div class="card">
	      <div class="card-body">
	        <h2 class="card-title" style="text-align: center">House</h2>
	        <p class="card-text" style="text-align: center">(earns 2 - 5 gold)</p>
	        <form style="text-align: center" method="POST" action="Gold">
	        	<input type="number" value="2" name="min" style="display: none">
	        	<input type="text" value="House" name="name" style="display: none">
	        	<input type="number" value="5" name="max" style="display: none">
	        	<button class="btn btn-success">Find Gold!</button>
	        </form>
	      </div>
	    </div>
	  </div>
	  <div class="col-sm-3">
	    <div class="card">
	      <div class="card-body">
	        <h2 class="card-title" style="text-align: center">Casino</h2>
	        <p class="card-text" style="text-align: center">(earns/takes 0 - 50 gold)</p>
	        <form style="text-align: center" method="POST" action="Golds">
	        	<input type="number" value="0" name="casino-min" style="display: none">
	        	<input type="text" value="Casino" name="casino-name" style="display: none">
	        	<input type="number" value="50" name="casino-max" style="display: none">
	        	<button class="btn btn-success">Find Gold!</button>
	        </form>
	      </div>
	    </div>
	  </div>
	</div>

	<br><br>

	<div style="margin: 1rem; padding: 1rem; overflow-y: scroll; margin: 100px; margin-top: 20px; margin-bottom: 20px; border: 2px solid #ccc; height: 300px">
		<c:forEach items="${historial}" var="n" >
			<p>${n}</p>
		</c:forEach>
	</div>

</body>

</html>