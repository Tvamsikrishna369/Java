//21-04-2025
package com.samples.servlet.greet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetServlet  extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -460044817367220868L;

	/**
	 * 
	 */
	
	
	

	@Override
	public void init() throws ServletException {
	System.out.println("Init Called...");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service Called...");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroyed Called..");
	}
	
}
