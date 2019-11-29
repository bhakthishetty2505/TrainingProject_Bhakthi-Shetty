package com.tyss.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	public MyFirstServlet() {
		System.out.println("Object created");
	}

	@Override
	public void init() throws ServletException {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter(); // resp - response, req - request
		resp.setContentType("text/html");

		out.println("<html>");
		out.println("<body>");

		Date date = new Date();
		out.println("<h1 style = 'color : Red'>Date and Time is : ");
		out.println(date.toString());
		out.println("</h1>");

		String url = req.getRequestURI();
		String method = req.getMethod();
		out.println("<br>");
		out.println(url);
		out.println("<br>");
		out.println(method);

		out.println("</body>");
		out.println("</html>");

	} // end of doGet()

} // end of MyFirstServlet
