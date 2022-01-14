package controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EjecutivoDAO;
import entities.Ejecutivo;

@WebServlet("/adminEjecutivo")
public class AdminEjecutivo extends HttpServlet{

	public AdminEjecutivo() {
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
		
		
		EjecutivoDAO dao = new EjecutivoDAO();
		
		try {
			
			Ejecutivo ejecutivo = new Ejecutivo(Integer.valueOf(request.getParameter("rut_ejecutivo")), request.getParameter("nombre"),
					request.getParameter("departamento"));
			dao.insertar(ejecutivo);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		doGet(request, response);
	}
	
	private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/nuevoEjecutivo.jsp");
		dispatcher.forward(request, response);
	}
}
