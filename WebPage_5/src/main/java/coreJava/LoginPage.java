package coreJava;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginPage {
	
public static void main(String[] args) {
	Connection conn = null;
	Statement stmnt = null;
	ResultSet result;
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");    
	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "banti@936827");
    stmnt = conn.createStatement();
     result = stmnt.executeQuery("SELECT * FROM login");
    while(result.next()) {
    	String email = result.getString("email");
    	String password = result.getString("password");
    	
    	System.out.println("Email: "+ email);
    	System.out.println("Phone: "+ password);
	  }	
    conn.close();
    stmnt.close();
    result.close();
	}catch(Exception e) {
	e.printStackTrace();	
	}
  finally {
	  try {
		  if(stmnt != null) {
			  stmnt.close();
		  }
	  }catch(Exception e2) {
		  e2.printStackTrace();	
	  }
	  try {
		  if(conn != null) {
			  conn.close();
		  }
	  }catch(Exception e3) {
		  e3.printStackTrace();
	  }  
  }
	System.out.println("GoodBye India...");
}
}
