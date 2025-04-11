<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="index.css"/>
</head>
<body>
<h2>Login here...</h2>
<form action="LoginController" method="post">
<div>Email: <input type="text" name="email" id="email"/></div>
<div>Password: <input type="password" name="password" id="password"/></div>
<div><input type="submit" value="login" class="button"/></div>
</form>

<%
if(request.getAttribute("errorMessage")!=null) {
out.println("<div style='color:red;'>" + request.getAttribute("errorMessage") + "</div>");
}
%>
</body>
</html>