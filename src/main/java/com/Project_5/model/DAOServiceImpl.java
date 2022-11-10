package com.Project_5.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	private Connection con;
	private Statement stmnt;
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationapp1","root","Nabarag@1998");
			stmnt = con.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public boolean verifyLogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from login where email = '"+email+"' and password = '"+password+"'");
			return result.next();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public void saveRegistration(String name, String city, String email, String mobile) {
		try {
			stmnt.executeUpdate("insert into registration values ('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ResultSet getAllreg() {
		try {
			ResultSet result = stmnt.executeQuery("select * from registration");
			return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ResultSet getStudentByMobile(String mobile) {
		try {
			ResultSet result = stmnt.executeQuery("select * from registration where mobile = '"+mobile+"'");
			return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteRegistration(String email) {
		try {
			stmnt.executeUpdate("delete from registration where email='"+email+"'");
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}


	@Override
	public void updateRegistration(String name, String city, String email, String mobile) {
		// TODO Auto-generated method stub
		try {
			stmnt.executeUpdate("UPDATE registration SET name= '"+name+"',city= '"+city+"',email= '"+email+"' WHERE mobile = '"+mobile+"'");
		}catch(Exception e) {
			e.printStackTrace();
		
	}
}

	@Override
	public ResultSet getStudentByEmailId(String email) {
		try {
			ResultSet result = stmnt.executeQuery("select * from registration where email = '"+email+"'");
			return result;
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ResultSet getStudentByMob(String mobile) {
		try {
			ResultSet result = stmnt.executeQuery("select * from registration where mobile = '"+mobile+"'");
			return result;
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
}
