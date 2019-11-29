package com.tyss.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.empwebapp.dao.EmployeeDAO;
import com.tyss.empwebapp.dto.EmployeeInfo;
import com.tyss.empwebapp.util.EmployeeDAOManager;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		String rememberMe = req.getParameter("rememberme");
		if(rememberMe == null) {
			
			Cookie[] cookies = req.getCookies();
			if(cookies != null) {
				for (Cookie cookie : cookies) {
					if(cookie.getName().equals("alwaysRemember")) {
						cookie.setMaxAge(0);
						resp.addCookie(cookie);
					}
				}
			}
			
		} else {
			
			Cookie cookie = new Cookie("alwaysRemember", id +"");
			resp.addCookie(cookie);
		}
		
		EmployeeDAO dao = EmployeeDAOManager.getEmployeeDAO();
		EmployeeInfo info = dao.auth(id, password);
		
		
		if(info == null) {
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<h4 style = 'color : Red'> Invalid id or password</h4>");
			out.println("</html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.include(req, resp);
		} else {
			HttpSession session = req.getSession(true);
			session.setAttribute("info", info);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
			dispatcher.forward(req, resp);
			
		}	
	}
}
