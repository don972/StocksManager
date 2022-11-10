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
@WebServlet("/saveReg")
public class saveRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public saveRegistration() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/new_registration.jsp");
		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		try {
			
			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(30);
			
			if(session.getAttribute("email") != null) {
				
				String name = request.getParameter("name");
				String city = request.getParameter("city");
				String email = request.getParameter("email");
				String mobile = request.getParameter("mobile");
				
				if(name != null || city != null || email != null || mobile != null) {
					
					DAOService dao = new DAOServiceImpl();
					
					dao.connectDB();
					
					dao.saveRegistration(name, city, email, mobile);
					
					request.setAttribute("msg", "record is successfully save");
					
					RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/new_registration.jsp");
					
					rd.forward(request, response);
				}
				else {
					
					request.setAttribute("msg", "Fields can not be empty!");
					
					RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/new_registration.jsp");
					
					rd.forward(request, response);
					
					}
				
			}else {
				
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);	
			}
			
		} catch (Exception e) {
			
			request.setAttribute("error", "Session timed out! Please login again");
			
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			
			rd.forward(request, response);
		}
	}
}
