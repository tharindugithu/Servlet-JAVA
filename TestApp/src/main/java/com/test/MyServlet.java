package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class MyServlet extends HttpServlet {
   
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {//only accept get reqvest
		PrintWriter out = res.getWriter();
		out.print("<h1>Hi</h1>");
		
		//servlet context
		ServletContext ctx  = getServletContext();
		String str = ctx.getInitParameter("name");//go to web.xml and get the match value
		
		String str2 = ctx.getInitParameter("phone");//go to web.xml and get the match value
		
		//out.println(str);
		//out.print("phone is "+str2);
		
		//servlet config
		ServletConfig cg = getServletConfig();//get the values from specifically this servlet
		String str3 = cg.getInitParameter("name");
		
		out.print(str3);
	}
	
}
