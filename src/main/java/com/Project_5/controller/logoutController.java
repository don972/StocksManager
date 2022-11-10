package com.Project_5.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logoutController")
public class logoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public logoutController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		//Write Code to destroy Session//
		
		HttpSession session = request.getSession(false);
		if(session.getAttribute("email") != null) {
			
			session.invalidate();
			
			RequestDispatcher rd = request.getRequestDispatcher("logout.jsp");
			rd.forward(request, response);
		}
		else {
			
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}
}
