package com.Project_5.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Project_5.model.DAOService;
import com.Project_5.model.DAOServiceImpl;

@WebServlet("/searchByEmail")
public class SearchByEmailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SearchByEmailController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");
		
		DAOService dao = new DAOServiceImpl();
		dao.connectDB();
		
		ResultSet student = dao.getStudentByEmailId(email);
		
		request.setAttribute("student", student);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/getStudentByEmail.jsp");
		rd.forward(request, response);	
	}

}
