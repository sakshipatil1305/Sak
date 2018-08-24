package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class mysession
 */
@WebServlet("/mysession")
public class mysession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public mysession() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession se = request.getSession();
		PrintWriter writer = response.getWriter();
		se.setAttribute("value", request.getParameter("myname"));
		

		writer.println(se.getId() + "<br>");
		writer.println(se.getCreationTime() + "<br>");
		
		
		/*
		 * se.invalidate(); se=request.getSession(); writer.println(se.getId()+"<br>");
		 * writer.println(se.getCreationTime()+"<br>");
		 */
	}

}
