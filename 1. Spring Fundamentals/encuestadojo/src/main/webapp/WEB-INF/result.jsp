<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<meta charset="ISO-8859-1">

<title>Dojo Survey Index</title>

</head>

<body>
<center>
<table class="table table-bordered">
  <thead>
    <tr>
      <th colspan="2">Submitted Info</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Name:</td>
      <td><c:out value="${name}"/></td>
    </tr>
    <tr>
      <td>Dojo Location:</td>
      <td><c:out value="${location }"/></td>
    </tr>
    <tr>
      <td>Favorite Languaje:</td>
      <td><c:out value="${languaje}"/></td>
    </tr>
    <tr>
      <td>Comment:</td>
      <td><c:out value="${comment}"/></td>
    </tr>
  </tbody>
</table>
</center>
</body>

</html>