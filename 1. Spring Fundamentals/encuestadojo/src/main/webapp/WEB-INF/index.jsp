<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Dojo Survey Index</title>

</head>

<body style="text-align: center">

			<form method="POST" action="result">
				<div>
			    	<label>Your Name: <input type="text" name="name"></label>
			    </div>
			    <br>
			    <div>
			    	<label>Dojo Location: <input type="text" name="location"></label>
			    </div>
			    <br>
			    <div>
			    	<label>Favorite Languaje: <input type="text" name="languaje"></label>
			    </div>
			    <br>
			    <div>
			    	<label>Comment (optional):</label> <br> <textarea name="comment"></textarea>
 			 	</div>
 			 	<br>
 			 	<button>Submit</button>
			</form>

</body>

</html>