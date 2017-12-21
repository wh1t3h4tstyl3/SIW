package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Indirizzo;
import model.Studente;
import persistence.DatabaseManager;
import persistence.dao.IndirizzoDao;
import persistence.dao.StudenteDao;

public class IscriviStudente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matricola = req.getParameter("matricola");
		String nome = req.getParameter("nome");
		String cognome = req.getParameter("cognome");
		String dataNascita = req.getParameter("dataNascita");
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd", Locale.ITALIAN);
		Date date = null;
		try {
			date = format.parse(dataNascita);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String password = req.getParameter("password");
		String indirizzo = req.getParameter("indirizzo");
		
		Studente studente = new Studente(matricola, nome, cognome, date);
		
		IndirizzoDao indirizzoDao = DatabaseManager.getInstance().getDaoFactory().getIndirizzoDAO();
		
		Indirizzo indirizzoDB = indirizzoDao.findByPrimaryKey(Long.parseLong(indirizzo));
		
		studente.setIndirizzo(indirizzoDB);
		
		StudenteDao studenteDao = DatabaseManager.getInstance().getDaoFactory().getStudenteDAO();
		studenteDao.save(studente);
		
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