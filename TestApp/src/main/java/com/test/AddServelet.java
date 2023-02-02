package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServelet extends HttpServlet {
  
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {//only accept post reqvest
	
         int i = Integer.parseInt(req.getParameter("num1"));//get the values in url
         int j = Integer.parseInt(req.getParameter("num2"));
	     int k = i+j;//total value 
	     PrintWriter out = res.getWriter();
	     out.println("<h1>result is : </h1>"+k);//send to response client
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {//only accept get reqvest
		
        int i = Integer.parseInt(req.getParameter("num1"));//get the values in url
        int j = Integer.parseInt(req.getParameter("num2"));
	    int k = i+j;//total value 
	    
	    PrintWriter out = res.getWriter();
	    out.println("<h1>result is : </h1>"+k);
	}
}
