package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/check")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// reading parameter
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// B.L.

		// GEN OUTPUT(HTML)
		response.setContentType("text.html");// setting mime type for browser
		PrintWriter writer = response.getWriter();
		LoginDAO ldao = new LoginDAO();
//		if(ldao.checkLogin(username, password))
//		{
//			writer.println("WELCOME "+username);
//			
//		}
//		
//		else
//		{
//			writer.println("Sorry can't login");
//		}
		if (username.equals("CITI") && password.equals("CITI")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
		} else {
			
			request.setAttribute("message", "CREDENTIALS NOT MATCHING");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
//			writer.println("<html>");
//			writer.println("<body>");
//			writer.println("Sorry can't login");
//			writer.println("</body>");
//			writer.println("</html>");
	}
}
