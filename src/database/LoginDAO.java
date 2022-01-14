package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.LoginBean;

public class LoginDAO {

	public String validate(LoginBean loginBean) throws ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuentas_clientes?useSSL=false",
					"root", "");

			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from usuario where usuario = ? and password = ? ");

			preparedStatement.setString(1, loginBean.getUsername());
			preparedStatement.setString(2, loginBean.getPassword());

			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				return "";
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
}