package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Studente;
import persistence.DatabaseManager;
import persistence.dao.StudenteDao;

public class MostraElencoStudenti extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudenteDao studenteDao = DatabaseManager.getInstance().getDaoFactory().getStudentDAO();
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<table border = 1>");
		out.println("<tr>");
		out.println("<th>Matricola</th>");
		out.println("<th>Nome</th>");
		out.println("<th>Cognome</th>");
		out.println("<th>Data di Nascita</th>");
		out.println("<th>Indirizzo</th>");
		out.println("</tr>");
		for(Studente studente : studenteDao.findAll()) {
			out.println("<tr>");
			out.println("<td>");
			out.println(studente.getMatricola());
			out.println("</td>");
			out.println("<td>");
			out.println(studente.getNome());
			out.println("</td>");
			out.println("<td>");
			out.println(studente.getCognome());
			out.println("<td>");
			out.println(dateFormat.format(studente.getDataNascita()));
			out.println("</td>");
			out.println("<td>");
			out.println(studente.getIndirizzo().getNome());
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</html>");
		
	}
	
}
