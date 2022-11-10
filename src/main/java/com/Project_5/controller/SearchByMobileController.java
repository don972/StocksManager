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
@WebServlet("/SearchByMobile")
public class SearchByMobileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SearchByMobileController() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		String mobile = request.getParameter("mobile");
		
		DAOService dao = new DAOServiceImpl();
		dao.connectDB();
		
		ResultSet studentByMob = dao.getStudentByMob(mobile);
		
		request.setAttribute("res", studentByMob);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/getStudentByMobile.jsp");
		rd.forward(request, response);	
	}

}
