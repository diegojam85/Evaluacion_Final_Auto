package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.Conexion;
import entities.Ejecutivo;


public class EjecutivoDAO {

	public EjecutivoDAO() {
		
	}
	
	public boolean insertar(Ejecutivo ejecutivo) throws SQLException {
		String sql = "INSERT INTO ejecutivo (rut_ejecutivo, nombre, departamento) VALUES (?,?,?)";
		Connection conn = Conexion.getConexion();
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);

		preparedStatement.setInt(1, ejecutivo.getRutEjecutivo());
		preparedStatement.setString(2, ejecutivo.getNombre());
		preparedStatement.setString(3, ejecutivo.getDepartamento());
		
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
