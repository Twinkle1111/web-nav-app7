package com.monami.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fservlet
 */
public class Fservlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fservlett() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		String a=config.getInitParameter("a");
		String b=config.getInitParameter("b");
		String c=config.getInitParameter("c");
		response.setContentType("text/html");
		out.println("First Servlet is working");
		out.println("Servlet Config"+config);
		out.println("<br>"+"a :"+a);
		out.println("<br>"+"b :"+b);
		out.println("<br>"+"c :"+c);
		
	}

}
