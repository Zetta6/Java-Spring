<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Secret Code</title>

</head>

<body>

<center>

<br>
<a style="color:red"><c:out value="${error}"></c:out></a>
<br>
<a>What is the code?</a>
<br>

<form method="POST" action="/code">
<input type="text" name="code">
<br><br>
<button>Try code</button>
</form>

</center>

</body>

</html>