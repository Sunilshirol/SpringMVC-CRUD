<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
.NavBar {
	line-break: normal;
	/* border: 2px solid red; */
	width: 100%;
	height: 530px;
	display: flex;
	justify-content: space-around;
	align-items: center;
	/* background-color: rgb(87, 75, 75); */
	/* background: #353D40; */
	background: #3B4346 url(./bg01.jpg);
	margin-block-start: 0.5px;
}

.NavContainer {
	/* border: 2px solid red; */
	width: 100%;
	height: 400px;
	display: flex;
	justify-content: center;
	align-items: center;
	gap: 5px;
	font-family: 'Yanone Kaffeesatz';
}

.logo {
	/*  border: 2px solid red;  */
	color: grey;
	width: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
}
.logo h1{
    color: azure;
    font-size: 40px;
    text-decoration: none;
}
.logo1 h1{
    color: azure;
    font-size: 40px;
    text-decoration: none;
}

.logo1 h4{
    color: red;
    text-decoration: none;
}
.label{
color: azure;
    font-size: 20px;
    text-decoration: none;
}
</style>
<body>
<nav class="NavBar">

 <div class="NavContainer">
	<form action="login" method="post">
	<div class="logo">
	<h1>Login Student </h1>
	</div>
	<div class="label">
		Email : <input type="text" name="email"><br /><br />
		Password : <input type="password" name="pass"><br /><br />
		<input type="submit" value="Login" />
		</div>
		<div class="logo1">
		<h4>User login ${status}</h4>
		</div>
	</form>
</div>
	</nav>
</body>
</html>