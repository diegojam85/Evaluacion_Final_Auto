package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import entities.Usuario;

@WebServlet("/adminUsuario")
public class AdminUsuario extends HttpServlet{

	public AdminUsuario() {
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
		UsuarioDAO dao = new UsuarioDAO();
		
		try {
			Usuario user = new Usuario(request.getParameter("nombre"), request.getParameter("nombreUsuario"), request.getParameter("password"));
			dao.insertar(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		doGet(request, response);
	}
	
	private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/nuevoUsuario.jsp");
		dispatcher.forward(request, response);
	}
}
