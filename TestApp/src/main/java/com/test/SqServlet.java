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
		
    	int k = (int)req.getAttribute("k");//
        int sq = k*k;
	    PrintWriter out = res.getWriter();
	    out.println("<h1>result is : </h1>"+sq);//send to response client
	}
}
