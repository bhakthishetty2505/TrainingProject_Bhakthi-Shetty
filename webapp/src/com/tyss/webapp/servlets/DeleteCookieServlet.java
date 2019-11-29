package com.tyss.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie[] cookies = req.getCookies();
		PrintWriter out = resp.getWriter();

		if (cookies == null) {
			out.println("<h1>No Cookie Found</h1>");
		} else {
			for (Cookie cookie : cookies) {
				String name = cookie.getName();
				if (name.equals("emp-name")) {
					cookie.setMaxAge(0);

					out.println("<h1> For emp-name cookie is deleted");
				}
			}
		}

	}
}
