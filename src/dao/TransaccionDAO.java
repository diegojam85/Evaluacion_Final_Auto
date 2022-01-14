package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.Conexion;
import entities.Ejecutivo;
import entities.Transaccion;


public class TransaccionDAO {

	public TransaccionDAO() {
		
	}
	
	public boolean insertar(Transaccion transaccion) throws SQLException {
		String sql = "INSERT INTO transferencia (rut_cliente, rut_duenio, id_cuenta, monto_transferencia, cuenta_transferencia, tipo_cuenta) VALUES (?,?,?,?,?,?)";
		Connection conn = Conexion.getConexion();
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);

		preparedStatement.setString(1, transaccion.getRutCliente());
		preparedStatement.setString(2, transaccion.getRutDuenio());
		preparedStatement.setString(3, transaccion.getIdCuenta());
                preparedStatement.setString(4, transaccion.getMontoTransferencia());
                preparedStatement.setString(5, transaccion.getCuentaTransferencia());
                preparedStatement.setString(6, transaccion.getTipoCuenta());
		
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
