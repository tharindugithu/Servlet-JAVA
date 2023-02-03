package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
    {//only accept get reqvest
		
    	int k = Integer.parseInt(req.getParameter("k"));//get the value in url
        int sq = k*k;
	    PrintWriter out = res.getWriter();
	    out.println("<h1>result is : </h1>"+sq);//send to response client
	}
}
 