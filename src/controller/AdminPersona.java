package controller;

import dao.PersonaDAO;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Persona;

@WebServlet("/adminPersona")
public class AdminPersona extends HttpServlet{

	public AdminPersona() {
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
		PersonaDAO dao = new PersonaDAO();
		
		try {
			Persona user = new Persona(request.getParameter("rut"), request.getParameter("nombre"), 
                                request.getParameter("apellido"), request.getParameter("direccion"), request.getParameter("correo"), request.getParameter("telefono"));
			dao.insertar(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		doGet(request, response);
	}
	
	private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/nuevaPersona.jsp");
		dispatcher.forward(request, response);
	}
}
