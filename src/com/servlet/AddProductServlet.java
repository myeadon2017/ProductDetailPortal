package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddProductServlet
 */

//This Servlet will be used to communicate with front-end and back-end 
//product details from user input
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//This is retrieving the users input for product name and details
		String prodName= request.getParameter("prodName");
		String details= request.getParameter("details");
	
			HttpSession session= request.getSession();
			session.setAttribute("prodName", request.getParameter("prodName"));
			session.setAttribute("details", request.getParameter("details"));
			
			//The user will then be sent to a page to a success page
			//showing product details
			response.sendRedirect("addproductsuccess.jsp");
	}
	

	}
