<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cuenta Corriente</title>
</head>
<body>
	<h1>Registrar</h1>
	<form action="adminCuentaCorriente?action=nuevo" method="post">
		<table border="1" align="center">
		<tr>
			<td>Id Cuenta:</a></td>		
			<td><input type="text" name="idCuenta"/></td>	
		</tr>
		<tr>
			<td>RUT Cliente:</a></td>		
			<td><input type="text" name="rutCliente"/></td>	
		</tr>
		<tr>
			<td>Monto Ejecutivo:</a></td>		
			<td><input type="text" name="montoEjecutivo"/></td>	
		</tr>
	</table>
	<br>
	<table border="0" align="center">
		<tr>
		<td><input type="submit" value="Agregar" name="agregar"></td>	
		</tr>
	
	</form>
</body>
</html>