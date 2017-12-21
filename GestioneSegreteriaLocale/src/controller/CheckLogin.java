package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import persistence.DatabaseManager;
import persistence.StudenteCredenziali;
import persistence.dao.StudenteDao;

public class CheckLogin extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		if ( (req.getParameter("logout") != null) && (req.getParameter("logout").equals("true"))){
			session.setAttribute("username", null);	
			out.println("<html>");
			out.println("<head><title>Login</title></head>");
			out.println("<body>");
			out.println("<h1>Logout effettuato con successo</h1>");
			out.println("</body>");
			out.println("</html>");	
		}else{
			String username = (String) session.getAttribute("username");		
			if (username != null){			
				out.println("<html>");
				out.println("<head><title>Login</title></head>");
				out.println("<body>");
				out.println("<h1>Sei già loggato come " + username + "</h1>");
				out.println("<a href=\"checkLogin?logout=true\">Logout</a>");
				out.println("</body>");
				out.println("</html>");	
			}else{
				out.println("<html>");
				out.println("<head><title>Effettual il Login</title></head>");
				out.println("<body>");
				out.println("<h1>Effettua il login</h1>");
				out.println("<form method=\"post\" action=\"checkLogin\">");
				out.println("Username : <input name=\"username\" type=\"text\" />");
				out.println("Password : <input name=\"password\" type=\"password\" />");
				out.println("<input type=\"submit\" />");
				out.println("</form>");
				out.println("</body>");
				out.println("</html>");
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.setAttribute("username", null);
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		StudenteDao dao = DatabaseManager.getInstance().getDaoFactory().getStudenteDAO();
		StudenteCredenziali studente = dao.findByPrimaryKeyCredential(username);
		if (studente == null){
			out.println("<html>");
			out.println("<head><title>Login</title></head>");
			out.println("<body>");
			out.println("<h1>Nessuno studente è registrato come " + username + "</h1>");			
			out.println("</body>");
			out.println("</html>");				
		}else{
			if (password.equals(studente.getPassword())){
				session.setAttribute("username", username);
				out.println("<html>");
				out.println("<head><title>Login</title></head>");
				out.println("<body>");
				out.println("<h1>Login effettuato con successo</h1>");			
				out.println("</body>");
				out.println("</html>");	
			}else{
				out.println("<html>");
				out.println("<head><title>Login</title></head>");
				out.println("<body>");
				out.println("<h1>Spiacente, password non corrispondente per lo studente " + username + "</h1>");			
				out.println("</body>");
				out.println("</html>");	
			}				
		}
	}
}
