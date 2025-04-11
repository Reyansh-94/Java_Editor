<%@ page import="java.sql.Connection, java.sql.DriverManager" %>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Core tag for java</title>
</head>
<body>
<%
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql//localhost:3306/college", "root", "banti@936827");
	out.println(conn);	
}catch(Exception e) {
	e.printStackTrace();
}
%>
</body>
</html>