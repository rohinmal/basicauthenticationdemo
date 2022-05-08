package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out = resp.getWriter();
		out.println("<h1>Get:After Authentication only we can access this servlet</h1>");
	}
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
	PrintWriter out = resp.getWriter();
	out.println("<h1>POST:After Authentication only we can access this servlet</h1>");
	}
}
