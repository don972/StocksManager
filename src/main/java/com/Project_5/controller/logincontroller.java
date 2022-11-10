package com.Project_5.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Project_5.model.DAOService;
import com.Project_5.model.DAOServiceImpl;
@WebServlet("/log")
public class logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public logincontroller() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		try {
			
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			DAOService dao = new DAOServiceImpl();
			dao.connectDB();
			
			boolean status = dao.verifyLogin(email, password);
			
			if(status == true)
			{
				HttpSession session = request.getSession(true);
				session.setMaxInactiveInterval(50);
				
				session.setAttribute("email", email);
				
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/new_registration.jsp");
				
				rd.forward(request, response);
				
			}else {
				
				request.setAttribute("error", "invalid Username/Password");
				
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				
				rd.forward(request, response);
			}
				
			//System.out.println(status);
		} catch (Exception e) {
			
			request.setAttribute("alert", "Error! Password and Confirm Password should be same");
			
			RequestDispatcher rd = request.getRequestDispatcher("userRegister.jsp");
			rd.include(request, response);
		}
	}
}
