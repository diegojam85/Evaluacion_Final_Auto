package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.Conexion;
import entities.Persona;

public class PersonaDAO {

	public PersonaDAO() {
		
	}
	
	public boolean insertar(Persona persona) throws SQLException {
		String sql = "INSERT INTO persona (rut, nombre, apellido, direccion, correo, telefono) VALUES (?,?,?,?,?,?)";
		Connection conn = Conexion.getConexion();
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);

		preparedStatement.setString(1, persona.getRut());
		preparedStatement.setString(2, persona.getNombre());
		preparedStatement.setString(3, persona.getApellido());
		preparedStatement.setString(4, persona.getDireccion());
                preparedStatement.setString(5, persona.getCorreo());
                preparedStatement.setString(6, persona.getTelefono());
		
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
