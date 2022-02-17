<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Counter</title>

</head>

<body>

<br>
<h1>You have visited 
<a style="color: blue">http://localhost:8080/you_server</a> 
<c:out value="${count}"/>
times.
</h1>

<a href="/you_server">Test another visit?</a>

</body>

</html>