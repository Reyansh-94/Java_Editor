package coreJava;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/readServer")
public class readServerFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public readServerFile() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		            response.setContentType("text/html");
		            PrintWriter out = response.getWriter();

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "banti@936827");
					Statement stmnt = con.createStatement();
				   ResultSet result = stmnt.executeQuery("select * from stu1");
				   
				   out.println("<table border = '1'>");
				   out.println("<tr>");	
				   out.println("<th>");
				   out.println("Name");
				   out.println("</th>");
				   out.println("<th");
				   out.println("EmailId");
				   out.println("</th");
				   out.println("<th");
				   out.println("PhoneNo.");
				   out.println("</th");
				   out.println("</tr>");		   
				   while(result.next()) {
					   out.println("<tr>");	
					   out.println("<td>");
					   out.println(result.getString(1));
					   out.println("</td>");
					   out.println("<td>");
					   out.println(result.getString(2));
					   out.println("</td>");
					   out.println("<td>");
					   out.println(result.getString(3));
					   out.println("</td>");
					   out.println("</tr>");		   
					   out.println("</table");
				   }
					con.close();
				}catch(Exception e) {
					e.printStackTrace();	
					}
		}

	}


