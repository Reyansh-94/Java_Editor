<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="menu.jsp"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inquiry</title>
</head>
<body>
<h2>Add Students Details</h2>
<form action="inquiryController" method="post">	
<pre>
Name: <input type="text" name="name"/>
Email: <input type="text" name="email"/>
Mobile: <input type="text" name="mobile"/>
<input type="submit" value="add"/>
</pre>
</form>

<%
if(request.getAttribute("message")!=null) {
	out.println(request.getAttribute("message"));
}
%>
</body>
</html>