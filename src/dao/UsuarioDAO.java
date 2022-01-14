package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.Conexion;
import entities.Usuario;

public class UsuarioDAO {
	
	
	public UsuarioDAO() {
		super();
	}
	
	public boolean insertar(Usuario usuario) throws SQLException {
		String sql = "INSERT INTO usuario (nombre, usuario, password) VALUES (?,?,?)";
		Connection conn = Conexion.getConexion();
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);

		preparedStatement.setString(1, usuario.getName());
                preparedStatement.setString(2, usuario.getUsername());
		preparedStatement.setString(3, usuario.getPassword());
		
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
