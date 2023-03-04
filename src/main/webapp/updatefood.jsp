<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style>
h3 {
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
<h3><b><i>Update Dish Details</i></b></h3>
<form action="updatefood"  method="post" enctype="multipart/form-data">
<table class="table table-hover">
<tr><td><input type="hidden" name="fid" value=<%=request.getParameter("fid") %>></td></tr>
<tr><td>Dish_Name</td><td><input type="text" name="fname"></td></tr>
<tr><td>Dish_Category</td><td><input type="text" name="fcategory"></td></tr>
<tr><td>Dish_Price</td><td><input type="number" name="fprice"></td></tr>
<tr><td>Image:</td><td><input type="file" name="file"></td></tr>
<tr><td><div style="text-align:center"><button type="submit" class="btn btn-primary">Update Now</button></div></td></tr>
</table><br>
</form>
</body>
</html>