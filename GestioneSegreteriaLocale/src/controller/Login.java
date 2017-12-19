package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Provare a implementare un login sfruttando la session
		
		HttpSession session = req.getSession();
		session.setAttribute("username", "ciccio"); // dal login prendo l'username da settare alla sessione
		
		
		// questo può essere fatto da un'altra servlet per verificare se un utente è loggato
		//String username = (String) session.getAttribute("username");
	}

}
