<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="database.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<jsp:useBean id="login" class="bean.LoginBean" />
	<jsp:setProperty property="*" name="login" />

	<%
		LoginDAO loginDao = new LoginDAO();
			String output = loginDao.validate(login);
			if (output != null && !output.isEmpty()) {
		         out.println("<h1>Bienvenido</h1>");
		         out.println(output);
			}
	%>
	
	<h1>Evaluacion Final</h1>
	<table border="1" width="50%" align="center">
		<tr>
			<td align="center"><a href="adminUsuario?action=nuevo">Nuevo Usuario</a></td>			
		</tr>
		<tr>
			<td align="center"><a href="adminCuentaCorriente?action=nuevo">Nueva Cuenta Corriente</a></td>
		</tr>
		<tr>
			<td align="center"><a href="adminPersona?action=nuevo">Nueva Persona</a></td>
		</tr>
		<tr>
			<td align="center"><a href="adminTransaccion?action=nuevo">Nueva Transaccion</a></td>
		</tr>
		<tr>
			<td align="center"><a href="adminEjecutivo?action=nuevo">Nuevo Ejecutivo</a></td>
		</tr>
	</table>
</body>
</html>