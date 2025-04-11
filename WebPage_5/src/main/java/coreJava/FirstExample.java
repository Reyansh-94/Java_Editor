package coreJava;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstExample {
	
public static void main(String[] args) {
	Connection conn = null;
	Statement stmnt = null;
	ResultSet result;
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");    
	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "banti@936827");
    stmnt = conn.createStatement();
     result = stmnt.executeQuery("SELECT * FROM stu1");
    while(result.next()) {
    	String name = result.getString("name");
    	String email = result.getString("email");
    	String mobile = result.getString("phone");
    	
    	System.out.println("Name: "+ name);
    	System.out.println("Email: "+ email);
    	System.out.println("Phone: "+ mobile);
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
