<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<%
	String email = (String) request.getAttribute("result");
	%>

	<h1>This is your HOME page!</h1>
	<h3>
		This is your Student email:
		<%=email%></h3>
</body>
</html>