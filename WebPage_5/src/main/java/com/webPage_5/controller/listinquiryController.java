package com.webPage_5.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.ResultSet;

import com.studentLogin.model.DAOServiceImpl;

@WebServlet("/listInquiry")
public class listinquiryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public listinquiryController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			HttpSession session = request.getSession(false);
		session.setMaxInactiveInterval(20);
		if(session.getAttribute("email") != null) {
		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		ResultSet result = service.listInquiry();
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("/views/list_inquiry.jsp");
		rd.forward(request, response);
	
	}else {
		
	}
		}catch(NullPointerException e) {
			e.printStackTrace();
		request.setAttribute("errorMessage", "Session time out! try again...");	
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);

		}		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
	}

}
