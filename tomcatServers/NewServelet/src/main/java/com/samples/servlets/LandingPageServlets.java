package com.samples.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LandingPageServlets
 */
@WebServlet("/login")
public class LandingPageServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LandingPageServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("username");
		String password = request.getParameter("Password");
		PrintWriter out = response.getWriter();
		if(userName.equals("Krishna") && password.equals("1234")) {
			System.out.println("Valid User");
			out.print("Login Susscessfull");
			out.print("<html><body><h1>" + "Welcome" + userName + "</h1></body></html>");
		} else {
			response.setContentType("text/html");
			out.print("Error: Invalid User ");
			RequestDispatcher rd = request.getRequestDispatcher("/views/login/loginPage.html");
			rd.include(request, response);
		}
		
	}

}
