<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome project</title>
</head>
<body>
<%
String name = request.getParameter("uname");
out.println("User "+ name);

pageContext.setAttribute("user", name, PageContext.SESSION_SCOPE);

%>
<a href="second.jsp">second jsp</a>
</body>
</html>