package p1;

import java.io.IOException;

import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class RegistrationA extends HttpServlet {
private static final long serialVersionUID = 1L;

    public RegistrationA() {
        super();
    }
@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("Banti Singh");
//		doGet(request, response);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
	    String phone = request.getParameter("phone");

//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(phone);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "banti@936827");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into stu1 value('"+name+"', '"+email+"', '"+phone+"')");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();	
			}

}
}