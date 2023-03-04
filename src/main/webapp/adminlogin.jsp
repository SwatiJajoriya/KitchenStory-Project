<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style>
h1 {
  text-align: center;
  font-family:verdana;
  font-size:300%;
  color:#006400;
}
body {
  background-color: rgb(255, 255, 128);
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><b>Welcome Admin</b></h1>
<form action="checkadmin">
<table>
<tr><td>Username:</td><td><input type="text" name="adusnm"></td></tr>
<tr><td>Password:</td><td><input type="password" name="adpass"></td></tr>
<tr><td><button type="submit" class="btn btn-primary">Login</button></td></tr>
</table>
</form><br><br>
<h2>Update Password:</h2>
<form action="updateadmin.jsp">
<button type="submit" class="btn btn-primary">Update Now</button>
</form>


</body>
</html>