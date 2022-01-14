<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaccion</title>
</head>
<body>
	<h1>Registrar</h1>
	<form action="adminTransaccion?action=nuevo" method="post">
		<table border="1" align="center">
		<tr>
			<td>Rut Cliente:</a></td>		
			<td><input type="text" name="rutCliente"/></td>	
		</tr>
		<tr>
			<td>RUT Duenio:</a></td>		
			<td><input type="text" name="rutDuenio"/></td>	
		</tr>
		<tr>
			<td>ID Cuenta:</a></td>		
			<td><input type="text" name="idCuenta"/></td>	
		</tr>
		<tr>
			<td>Monto Transferencia:</a></td>		
			<td><input type="text" name="montoTransferencia"/></td>	
		</tr>
		<tr>
			<td>Cuenta Transferencia:</a></td>		
			<td><input type="text" name="cuentaTransferencia"/></td>	
		</tr>
		<tr>
			<td>Tipo Cuenta</a></td>		
			<td><input type="text" name="tipoCuenta"/></td>	
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