package com.webPage_5.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.webPage_5.service.ServiceProvider;

@WebServlet("/addController")
public class addController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public addController() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		ServiceProvider s = new ServiceProvider();
		int result = s.add(num1, num2);
		
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request, response);
	}



}
