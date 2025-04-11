<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Numbers</title>
<link rel="stylesheet" href="Welcome.css"/>
</head>
<body>
<h2 class="text">Add Numbers Calculator</h2>
<form action="addController" method="post">
Number1 <input type="text" name = "num1"/>

Number2 <input type="text" name = "num2"/>
<br/>
<br/>
<input type="submit" value="addNumber"/>
</form>
<p>
<%
if(request.getAttribute("result") != null) {
	out.println("Result of two numbers are equal to sum is: "+ request.getAttribute("result"));
}
%>
</p>

</body>
</html>