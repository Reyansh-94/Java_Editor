package com.webPage_5.controller;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


import com.studentLogin.model.DAOServiceImpl;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
       
    }
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init...");
		super.init(config);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		boolean status = service.verifyLogin(email, password);

		if(status) {
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			session.setMaxInactiveInterval(20);
			RequestDispatcher rd = request.getRequestDispatcher("views/inquiry.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("errorMessage", "invalid credentials");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

	@Override
	public void destroy() {
		System.out.println("Destroy Method");
		super.destroy();
	}
	
}
