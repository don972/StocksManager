package com.Project_5.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Project_5.model.DAOService;
import com.Project_5.model.DAOServiceImpl;
@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(30);
			
			if(session.getAttribute("email")!=null) {
				
				String email = request.getParameter("email");
				
				DAOService dao = new DAOServiceImpl();
				dao.connectDB();
				
				dao.deleteRegistration(email);
				
				ResultSet result = dao.getAllreg();
				
				request.setAttribute("result", result);
				
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/list_registration.jsp");
				rd.forward(request, response);
			}
			else {
				
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		}
		catch(Exception e) {
			
			request.setAttribute("error", "Session timed out! Please login again");
			
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			
			rd.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
	}

}
