package p1;

import java.io.IOException;

import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("verifyLogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection Code = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "banti@936827");
		    
		    Statement stmt = Code.createStatement();
		    
		    ResultSet result = stmt.executeQuery("select * from login where email = '"+email+"' and password = '"+password+"'");
		    if(result.next()) {
		    	System.out.println("Welcome");
		    }else {
		    	System.out.println("Invalid email and password! try again");
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
