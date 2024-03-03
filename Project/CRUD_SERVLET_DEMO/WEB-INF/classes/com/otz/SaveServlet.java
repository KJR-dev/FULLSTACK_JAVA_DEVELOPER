package com.otz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//collect data from html
		String name=request.getParameter("txtName");
		String email=request.getParameter("txtEmail");
		String password=request.getParameter("txtPassword");
		String country=request.getParameter("cmdCountry");
		
		//create UserBin
		UserBin data=new UserBin();
		data.setName(name);
		data.setEmail(email);
		data.setPassword(password);
		data.setCountry(country);
		
		//Output
		out.print("<h1>Name : " + name+"</h1>");
		out.print("<h1>Email : " + email+"</h1>");
		out.print("<h1>Password : " + password+"</h1>");
		out.print("<h1>Country : " + country+"</h1>");
		
		//create UserDao
		UserDao obj=new UserDao();
		
		if(obj.saveUser(data)>=1) {
			out.print("Done");
		}
		
	}

}
