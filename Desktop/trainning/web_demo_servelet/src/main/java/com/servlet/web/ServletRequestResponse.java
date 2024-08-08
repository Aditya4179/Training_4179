package com.servlet.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRequestResponse
 */
@WebServlet("/ServletRequestResponse")
public class ServletRequestResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try{
			String user=request.getParameter("user");
			out.println("<h2> Welcome "+user+"</h2>");
		}finally {
			out.close();
		}
	}
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		PrintWriter pwriter=response.getWriter();
		String user=request.getParameter("val1");
		String pass=request.getParameter("val2");
		pwriter.println("User details are : ");
		pwriter.println("User name : "+user);
		pwriter.println("Password : ****"+pass+"****");
		pwriter.close();
	}

}
