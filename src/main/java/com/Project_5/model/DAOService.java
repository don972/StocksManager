package com.Project_5.model;

import java.sql.ResultSet;

public interface DAOService {
	
	public void connectDB();
	
	public boolean verifyLogin(String email, String password);
	
	public void saveRegistration(String name, String city, String email,String mobile);
	
	public ResultSet getAllreg();
	
	public ResultSet getStudentByEmailId(String email);
	
	public ResultSet getStudentByMob(String mobile);
	
	public ResultSet getStudentByMobile(String mobile);

	public void deleteRegistration(String email);

	public void updateRegistration(String name, String city, String email, String mobile);

}
