package controller;

import dao.CuentaCorrienteDAO;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.CuentaCorriente;

@WebServlet("/adminCuentaCorriente")
public class AdminCuentaCorriente extends HttpServlet{

	public AdminCuentaCorriente() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			switch (action) {
			case "nuevo":
				nuevo(request, response);
				break;
			default:
				break;
			}
		} catch (SQLException e) {
			e.getStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CuentaCorrienteDAO dao = new CuentaCorrienteDAO();
		
		try {
			CuentaCorriente user = new CuentaCorriente(request.getParameter("rutCliente"), request.getParameter("montoEjecutivo"));
			dao.insertar(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}
	
	private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/nuevaCuentaCorriente.jsp");
		dispatcher.forward(request, response);
	}
}
