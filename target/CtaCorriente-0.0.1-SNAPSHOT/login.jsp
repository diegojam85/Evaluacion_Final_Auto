<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<form action="welcome.jsp" method="post">
		<table style="with: 100%">
			<tr>
				<td>Usuario</td>
				<td><input type="text" name="username" id="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id="password" /></td>
			</tr>

		</table>
		<input type="submit" value="Submit" name="login" id="login"/>
	</form>
</body>
</html>