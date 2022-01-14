package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.Conexion;
import entities.Ejecutivo;
import entities.CuentaCorriente;

public class CuentaCorrienteDAO {


	public CuentaCorrienteDAO() {
		
	}
	
	public boolean insertar(CuentaCorriente ctaCte) throws SQLException {
		String sql = "INSERT INTO cta_corriente (rut_cliente, monto_ejecutivo) VALUES (?,?)";
		Connection conn = Conexion.getConexion();
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);

		preparedStatement.setString(1, ctaCte.getRutCliente());
		preparedStatement.setString(2, ctaCte.getMontoEjecutivo());
		try {
			int rs = preparedStatement.executeUpdate();
			
			preparedStatement.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
}
