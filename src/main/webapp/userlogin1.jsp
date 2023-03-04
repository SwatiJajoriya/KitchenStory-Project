<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
h3 {
  text-align: center;
  font-family:verdana;
  font-size:200%;
  color:DarkRed;
}
body {
  background-color: rgb(255, 255, 128);
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3><%=request.getAttribute("msg") %></h3>
<%@include file="userlogin.jsp" %>
</body>
</html>