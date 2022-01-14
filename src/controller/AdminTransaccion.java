package controller;

import dao.TransaccionDAO;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Transaccion;

@WebServlet("/adminTransaccion")
public class AdminTransaccion extends HttpServlet{

	public AdminTransaccion() {
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
		TransaccionDAO dao = new TransaccionDAO();
		
		try {
			Transaccion user = new Transaccion(request.getParameter("rutCliente"), request.getParameter("rutDuenio"), 
                                request.getParameter("idCuenta"), request.getParameter("montoTransferencia"), 
                                request.getParameter("cuentaTransferencia"), request.getParameter("tipoCuenta"));
			dao.insertar(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		doGet(request, response);
	}
	
	private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/nuevaTransaccion.jsp");
		dispatcher.forward(request, response);
	}
}
