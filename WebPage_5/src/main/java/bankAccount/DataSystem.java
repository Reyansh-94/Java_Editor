package bankAccount;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@WebServlet("/DataSystem")
public class DataSystem extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DataSystem() {
    	super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		System.out.println("Get Method");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
//		System.out.println("Post Method");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
System.out.println(name +  email + phone);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql//localhost:3306/college", "root", "banti@936827");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO customer VALUE('"+name+"', '"+email+"', '"+phone+"')");
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
