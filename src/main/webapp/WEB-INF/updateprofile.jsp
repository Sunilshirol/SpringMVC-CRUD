<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name = (String) request.getAttribute("result");
	%>

	<h1> Data Updated Successfulley for <%=name%></h1>
</body>
</html>