package p1;

import java.io.IOException;

import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/DeleteRegData")
public class deleteReg extends HttpServlet {
private static final long serialVersionUID = 1L;

    public deleteReg() {
        super();
    }
@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "banti@936827");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("delete from stu1 where email = ('"+email+"')");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();	
			}

}
}