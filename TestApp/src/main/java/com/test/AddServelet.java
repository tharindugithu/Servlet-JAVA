package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServelet extends HttpServlet {
  
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {//you have to go with this method name
	
         int i = Integer.parseInt(req.getParameter("num1"));
         int j = Integer.parseInt(req.getParameter("num2"));
	     int k = i+j;//total value 
	     PrintWriter out = res.getWriter();
	     out.println("<h1>result is : </h1>"+k);
	}
}
