package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
    {//only accept get reqvest
		
    	Cookie cookies[] = req.getCookies();//get the multiple cookies
    	
    	int k=0;
    	for(Cookie c : cookies) {//loop through the all cookies 
    		if(c.getName().equals("k"))//find the exact name of the cookie 
    			k = Integer.parseInt(c.getValue());//and get the value of cookie
    	}
    	
	    PrintWriter out = res.getWriter();
	    out.println("<h1>result is : </h1>"+k*k);//send to response client
	}
}
 