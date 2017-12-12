package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IscriviStudente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matricola = req.getParameter("matricola");
		String nome = req.getParameter("nome");
		String cognome = req.getParameter("cognome");
		String dataNascita = req.getParameter("dataNascita");
		String password = req.getParameter("password");
		String indirizzo = req.getParameter("indirizzo");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>Iscrizione Studente</title></head>");
		out.println("<body><h1>Il seguente studente è stato memorizzato e iscritto</h1>");
		out.println(matricola + " " + nome + " " + cognome + " " + dataNascita + " " + password + " " + indirizzo);
		out.println("</body>");
		out.println("</html>");
	}	
}