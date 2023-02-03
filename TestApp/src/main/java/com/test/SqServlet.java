package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
    {//only accept get reqvest
		
    	HttpSession session = req.getSession();
        int k = (int) session.getAttribute("k");
	    PrintWriter out = res.getWriter();
	    out.println("<h1>result is : </h1>"+k*k);//send to response client
	}
}
 