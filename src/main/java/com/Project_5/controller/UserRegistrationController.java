package com.Project_5.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Project_5.model.DAOService;
import com.Project_5.model.DAOServiceImpl;

@WebServlet("/userRegistrationController")
public class UserRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UserRegistrationController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cnf_password = request.getParameter("cnf_password");
		
		if(password.equals(cnf_password)) {
			
			DAOService dao = new DAOServiceImpl();
			dao.connectDB();
			
			dao.verifyLogin(email, password);
			
			request.setAttribute("alert", "User Registration Successful!");
			
			RequestDispatcher rd = request.getRequestDispatcher("userRegister.jsp");
			rd.include(request, response);
		}
		else {
			
			request.setAttribute("alert", "Error! Password and Confirm Password should be same");
			
			RequestDispatcher rd = request.getRequestDispatcher("userRegister.jsp");
			rd.include(request, response);
		}
	}
}
