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

@WebServlet("/searchController")
public class SearchStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SearchStudentController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(30);
			
			if(session.getAttribute("email") != null) {
				
				String mobile = request.getParameter("mobile");
				//String email = request.getParameter("email");
				
				DAOService dao = new DAOServiceImpl();
				dao.connectDB();
				
				ResultSet student = dao.getStudentByMobile(mobile);
				
				if(student != null) {
					
					request.setAttribute("student", student);
					
					RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/getStudent.jsp");
					rd.forward(request, response);
				}
				else {
					
					request.setAttribute("msg", "No record found!");
					
					RequestDispatcher rd = request.getRequestDispatcher("findStudent.jsp");
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
