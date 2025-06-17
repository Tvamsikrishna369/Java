package busApp1.v1;

import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
//		Configuration config = new Configuration();
//		SessionFactory sessionFactory = config.buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Credentials cred = new Credentials(username, password);
//		session.save(cred);
		
		String userName = request.getParameter("username");
		String userPassword = request.getParameter("password");
		System.out.println("userName" + userName + "password" + userPassword);
		PrintWriter out = response.getWriter();
		if(userName.equals("Krishna") && userPassword.equals("krish")) {
			System.out.println("userName" + userName + "password" + userPassword);
			System.out.println("Valid");
			out.print("<html><body><h1>Welcome " + userName + "</h1></body></html>");
		} else {
			response.setContentType("text/html");
			out.print("<h3 style=\"color: red;\">Error: Invalid Credentials</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("./index.html");
			rd.include(request, response);
		}
	}
	
	
	
	@Override
	public void init() throws ServletException {

		System.out.println("home.java called");
	}

}
