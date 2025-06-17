package busApp1.v1.signup;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/v1/signup/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append("Served at: ").append(req.getContextPath());

		
			String firstName = req.getParameter("firstName");
			String lastName = req.getParameter("lastName");
			System.out.println(firstName + lastName);

		}
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("v1.signup called...");
	}
}
