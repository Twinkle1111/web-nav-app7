package com.monami.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sservlet
 */
public class Sservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sservlet() {
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
		String d=config.getInitParameter("d");
		String e=config.getInitParameter("e");
		String f=config.getInitParameter("f");
		response.setContentType("text/html");
		out.println("Second Servlet is working");
		out.println("Servlet Config"+config);
		out.println("<br>"+"d :"+d);
		out.println("<br>"+"e :"+e);
		out.println("<br>"+"f :"+f);
		
	}

}
