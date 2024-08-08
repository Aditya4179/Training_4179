package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieDemo
 */
@WebServlet("/CookieDemo")
public class CookieDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		try{
			response.setContentType("text/html");
		
			String user=request.getParameter("user");
			String pass=request.getParameter("pass");
		
			if(pass.equals("1234")) {
				out.println("Your User name is : "+user);
				out.println("<br>Your Password : "+pass);
				Cookie c1=new Cookie("user1",user);
				Cookie c2=new Cookie("pass1",pass);
				response.addCookie(c1);
				response.addCookie(c2);
				out.println("<br> <a href='cookie2'>For more information</a>");
			}else {
				out.println("Wrong Password ....");
			}
		}catch(Exception e) {
			
		}
	}

}
