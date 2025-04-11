package com.webPage_5.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.studentLogin.model.DAOServiceImpl;

@WebServlet("/inquiryController")
public class inquiryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public inquiryController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("/views/inquiry.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		try {
			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(20);
			if(session.getAttribute("email") != null) {

			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			
			DAOServiceImpl service = new DAOServiceImpl();
			service.connectDB();
			service.createInquiry(name, email, mobile);
			
			request.setAttribute("message", "saved!");
			RequestDispatcher rd = request.getRequestDispatcher("/views/inquiry.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		}catch(NullPointerException e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", "Session time out. login Again");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

		}
			
}
}