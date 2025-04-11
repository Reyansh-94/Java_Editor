package com.webPage_5.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/logOut")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LogoutController() { //23:04 timing 24/11/04
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		System.out.println(session.getAttribute("email"));
		session.invalidate();
  RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
  rd.forward(request, response);
  }

}
