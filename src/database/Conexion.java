package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	public static Connection getConexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuentas_clientes?useSSL=false","root", "");
			
			return connection;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
