<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
	<div class="logo">
	<h1>Update Student Record</h1>
	</div>
	<div class="label">
		id : <input type="text" name="id" ><br /><br />
		name : <input type="text" name="name"><br /><br />
		email : <input type="text" name="email"><br /><br />
		pass: <input type="text" name="pass"><br /><br />
		<input type="submit" value="Login" />
		</div>
		<div class="update">
		<h4>User login ${status}</h4>
		</div>
	</form>
</body>
</html>