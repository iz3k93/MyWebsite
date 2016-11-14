package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyWebsiteAboutServlet
 */
@WebServlet("/MyWebsiteAboutServlet")
public class MyWebsiteAboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<!DOCTYPE html>\n\t<head>\n\t\t<title>Isaac Moua!</title>\n\t</head>");
		response.getWriter().append("\n\t<body>\n\t\t<nav>\n\t\t\t<ul>\n\t\t\t\t\t<a href='/MyWebsite/MyWebsiteHomeServlet'>Home</a>\n\t\t\t\t\t<a href='/MyWebsite/MyWebsiteAboutServlet'>About</a>\n\t\t\t\t<a href='/MyWebsite/MyWebsiteContactServlet'>Contact</a>\n\t\t\t\t</ul>\n\t\t\t</li>\n\t\t</nav>");
		response.getWriter().append("\n\t\t<h1>About Me</h1>\n\t\t<p>My Name is Isaac Moua and my hobbies are:</p>");
		response.getWriter().append("\n\t\t\t<ul>\n\t\t\t\t<li>Eating</li>");
		response.getWriter().append("\n\t\t\t\t\t<li>sleeping</li>");
		response.getWriter().append("\n\t\t\t\t\t<li>drawing</li>");
		response.getWriter().append("\n\t\t\t\t\t<li>gaming</li>");
		response.getWriter().append("\n\t\t\t\t\t<li>programming</li>");
		response.getWriter().append("\n\t\t\t\t\t<li>dancing</li>\n\t\t\t</ul>");
		response.getWriter().append("\n\t\t<p>I am very out going, but at the same time, i dont like to go out that much. I enjoy a lot of things and have a lot of dislikes. Overall, i am a very easy going person you just got to get to know.</p>");
		response.getWriter().append("\n\t\t<p>&copy; 2016 Isaac Moua</p>\n\t</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
