package com.tyss.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		String id = "";
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}

		out.println("<html>");
		out.println("<body>");

		out.println("<fieldset align='center'>");
		out.println("<legend>Login</legend>");
		out.println("<form action='./login' method='post'>");
		out.println("<table align='center'>");
		out.println("<tr><td>ID :</td><td><input name='id' type='number' value = '" + id + "'></td></tr>");
		out.println("<tr><td>Password :</td><td><input name='password' type='password'></td></tr>");
		out.println(
				"<tr><td><input name='rememberme' type='checkbox' value = 'checked'></td><td>Remember Me</td></tr>");
		out.println(
				"<tr><td><input name='Login' type='submit' value='Login'></td><td><input name='reset' type='reset' value='Reset'></td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("<a href='./register.html'>Register</a>");
		out.println("</fieldset>");

		out.println("</body>");
		out.println("</html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	}
}
