package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyWebsiteHomeServlet
 */
@WebServlet("/MyWebsiteHomeServlet")
public class MyWebsiteHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<!DOCTYPE html>\n\t<head>\n\t\t<title>Isaac Moua!</title>\n\t</head>");
		response.getWriter().append("\n\t<body>\n\t\t<nav>\n\t\t\t<ul>\n\t\t\t\t\t<a href='/MyWebsite/MyWebsiteHomeServlet'>Home</a>\n\t\t\t\t\t<a href='/MyWebsite/MyWebsiteAboutServlet'>About</a>\n\t\t\t\t<a href='/MyWebsite/MyWebsiteContactServlet'>Contact</a>\n\t\t\t\t</ul>\n\t\t\t</li>\n\t\t</nav>");
		response.getWriter().append("\n\t\t<h1 >Welcome to My Home Page</h1>\n\t\t<p>This is the home page to my website. There is nothing descripive about this page except for the fact that i need it to aquire a grade, but thank you for taking your time reading this intro. Please have a nice day</p>\n\t\t<p>&copy; 2016 Isaac Moua</p>\n\t</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
