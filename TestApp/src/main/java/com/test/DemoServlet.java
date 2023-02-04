package com.test;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.PageContext;

@WebServlet("/demoServlet")
public class DemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    
		String name = "Tharindu";
		Student s = new Student("Chamikara", 10);
		int age = 10;
		req.setAttribute("label", name);
		RequestDispatcher rd = req.getRequestDispatcher("display1.jsp");
		rd.forward(req, res);

	   
	}
}