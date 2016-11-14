package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyWebsiteContactServlet
 */
@WebServlet("/MyWebsiteContactServlet")
public class MyWebsiteContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("<!DOCTYPE html>\n\t<head>\n\t\t<title>Isaac Moua!</title>\n\t</head>");
		response.getWriter().println("\n\t<body>\n\t\t<nav>\n\t\t\t<ul>\n\t\t\t\t\t<a href='/MyWebsite/MyWebsiteHomeServlet'>Home</a>\n\t\t\t\t\t<a href='/MyWebsite/MyWebsiteAboutServlet'>About</a>\n\t\t\t\t<a href='/MyWebsite/MyWebsiteContactServlet'>Contact</a>\n\t\t\t\t</ul>\n\t\t\t</li>\n\t\t</nav>");
		response.getWriter().println("\n\t\t<h1>Contact Info!</h1>\n\t\t<p>Please leave you information below\nI will get back to you whenever.</p>");
		response.getWriter().println("\n\t\t<form method='post' action =' '>First Name: <input type='text' name='firstName'><br><br>");
		response.getWriter().println("Last Name: <input type='text' name='lastName'><br><br>");
		response.getWriter().println("Email Address: <input type='text' name='email'><br><br>");
		response.getWriter().println("\n\t\t<input type='submit' name='submit'></form>");
		response.getWriter().println("\n\t\t<p>&copy; 2016 Isaac Moua</p>\n\t</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
