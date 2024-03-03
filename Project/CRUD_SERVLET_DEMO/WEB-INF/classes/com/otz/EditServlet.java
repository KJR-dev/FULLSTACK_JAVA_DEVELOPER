package com.otz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>"+id+ "</h1>");
		UserDao obj=new UserDao();
		UserBin user=obj.getUser(id);
			out.print(user.getId());
			out.print(user.getName());
			out.print(user.getEmail());
			out.print(user.getPassword());
			out.print(user.getCountry());
			
			
			out.print("<html><body>");
			out.print("<form action=edit method=post>");
			out.print("<table>");
			out.print("<tr>");
			out.print("<td>Name : </td> <td><input type=text name=txtName value="+user.getName()+"></td>");
			out.print("</tr>");
			
			out.print("<tr>");
			out.print("<td>Email : </td> <td><input type=text name=txtEmail value="+user.getEmail()+"></td>");
			out.print("</tr>");
			
			out.print("<tr>");
			out.print("<td>Password : </td> <td><input type=text name=txtPassword value="+user.getPassword()+"></td>");
			out.print("</tr>");
			
			out.print("<tr>");
			out.print("<td>Country : </td>");
			out.print("<td><select name=ddlcountry>");
			if(user.getCountry().equalsIgnoreCase("India")) {
				out.print("<option value=\"India\" selected >India</option>");
				out.print("<option value=\"Pakistan\">Pakistan</option>");
				out.print("<option value=\"Nepal\">Nepal</option>");
				out.print("<option value=\"Bhutan\">Bhutan</option>");
				out.print("<option value=\"Japan\">Japan</option>");
				
			}else if(user.getCountry().equalsIgnoreCase("Pakistan")) {
				out.print("<option value=\"India\">India</option>");
				out.print("<option value=\"Pakistan\" selected>Pakistan</option>");
				out.print("<option value=\"Nepal\">Nepal</option>");
				out.print("<option value=\"Bhutan\">Bhutan</option>");
				out.print("<option value=\"Japan\">Japan</option>");
				
			}else if(user.getCountry().equalsIgnoreCase("Nepal")) {
				out.print("<option value=\"India\">India</option>");
				out.print("<option value=\"Pakistan\">Pakistan</option>");
				out.print("<option value=\"Nepal\" selected>Nepal</option>");
				out.print("<option value=\"Bhutan\">Bhutan</option>");
				out.print("<option value=\"Japan\">Japan</option>");
			}
			else if(user.getCountry().equalsIgnoreCase("Bhutan")) {
				out.print("<option value=\"India\">India</option>");
				out.print("<option value=\"Pakistan\">Pakistan</option>");
				out.print("<option value=\"Nepal\">Nepal</option>");
				out.print("<option value=\"Bhutan\"selected>Bhutan</option>");
				out.print("<option value=\"Japan\">Japan</option>");
			}
			else if(user.getCountry().equalsIgnoreCase("Japan")) {
				out.print("<option value=\"India\">India</option>");
				out.print("<option value=\"Pakistan\">Pakistan</option>");
				out.print("<option value=\"Nepal\">Nepal</option>");
				out.print("<option value=\"Bhutan\">Bhutan</option>");
				out.print("<option value=\"Japan\"selected>Japan</option>");
			}else
			{
				out.print("<option value=\"India\">India</option>");
				out.print("<option value=\"Pakistan\">Pakistan</option>");
				out.print("<option value=\"Nepal\">Nepal</option>");
				out.print("<option value=\"Bhutan\">Bhutan</option>");
				out.print("<option value=\"Japan\"selected>Japan</option>");
			}
			out.print("</select></td>");
			out.print("</tr>");
			
			out.print("<tr>");
			out.print("<td><input type=\"submit\" value=\"Update\"/><input type= hidden name=hdnId value="+user.getId()+"></td>");
			out.print("</td>");
			
			out.print("</table>");
			out.print("</form>");
			out.print("</body></html>");
		
			
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		UserBin user= new UserBin();
		user.setId(Integer.parseInt(request.getParameter("hdnId")));
		user.setName(request.getParameter("txtName"));
		user.setEmail(request.getParameter("txtEmail"));
		user.setPassword(request.getParameter("txtPassword"));
		user.setCountry(request.getParameter("ddlcountry"));

		int res = new UserDao().updateUser(user);
		if(res >= 1) {
			out.print("DONE");
		}
		
	}

}
