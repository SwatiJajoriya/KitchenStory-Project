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
h2 {
  text-align: center;
  font-family:verdana;
  font-size:250%;
  color:SlateBlue;
}
body {
  background-color: rgb(255, 255, 128);
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3><b>Redirecting to your Bank...</b></h3>

<form action="proceedpay">

<h2><i><b>Enter bank ID(1 or 2):</b></i><input type="number" name="bid"></h2>

<input type="hidden" name="fprice" value=<%=request.getParameter("fprice")%>>
<input type="hidden" name="fname" value=<%=request.getParameter("fname")%>>
<input type="hidden" name="cname" value=<%=request.getParameter("cname")%>>
<div style="text-align:center">
<button type="submit" class="btn btn-primary">Confirm Purchase</button> 
</div>

</form>
</body>
</html>