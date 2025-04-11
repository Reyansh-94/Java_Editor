package Full_Practice_Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import full_practice.model.DAOServiceImpl;

@WebServlet("/Login")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Controller() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String pass = request.getParameter("password");
	
	DAOServiceImpl server = new DAOServiceImpl();
	server.connectDB();
	 
	boolean condition = server.verifyLogin(email, pass);
	if(condition) {
		System.out.println("Login Suceessfully...");
		}else {
			System.out.println("Error");
		}
	}

}
