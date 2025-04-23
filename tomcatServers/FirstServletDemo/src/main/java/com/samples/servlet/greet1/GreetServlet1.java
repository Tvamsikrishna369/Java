//22-04-2025

package com.samples.servlet.greet1;

import java.io.IOException;

import javax.swing.text.html.HTMLDocument.HTMLReader;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetServlet1 extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	

}
