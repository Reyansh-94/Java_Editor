package com.studentLogin.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DAOServiceImpl implements DAOService{
    private Connection conn;
    private Statement stmnt;    
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "banti@936827");
			stmnt = conn.createStatement();
			if (conn == null) {
			    System.out.println("Database connection is null");
			} else {
			    System.out.println("Database connection is established");
			}
			if (stmnt == null) {
			    System.out.println("Statement is null");
			} else {
			    System.out.println("Statement is initialized");
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void createInquiry(String name, String email, String mobile) {
		try {
			stmnt.executeUpdate("INSERT INTO inquiry VALUES('"+name+"', '"+email+"', '"+mobile+"')");			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteInquiry(String email) {
		
		try {
			stmnt.executeUpdate("delete from inquiry where email = '"+email+"'");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateInquiry(String email, String mobile) {
		try {
			stmnt.executeUpdate("update inquiry set mobile = '"+mobile+"' where email = '"+email+"'");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ResultSet listInquiry() {
		try {
			ResultSet result = stmnt.executeQuery("select * from inquiry");
		   return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean verifyLogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password = '"+password+"'");
			System.out.println(result);
		   return result.next();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
