package com.otz;

import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewUsers
 */
@WebServlet("/ViewUsers")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		UserDao obj=new UserDao();
		List<UserBin> users=obj.getUsers();
		out.print("<html><body><table border=1>");
		out.print("<tr><td>ID</td><td>NAME</td><td>EMAIL</td><td>PASSWORD</td><td>COUNTRY</td> <td colspan=2>ACTION</td></tr>");
		for(UserBin u: users)
		{
			out.print("<tr>");
			out.print("<td>"+u.getId()+"</td>");
			out.print("<td>"+u.getName()+"</td>");
			out.print("<td>"+u.getEmail()+"</td>");
			out.print("<td>"+u.getPassword()+"</td>");
			out.print("<td>"+u.getCountry()+"</td>");
			out.print("<td> <a href=edit?id="+u.getId()+">Edit</a> </td>");
			out.print("<td> <a href=delete?id="+u.getId()+">Delete</a> </td>");
			out.print("</tr>");
		}
		out.print("</table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
