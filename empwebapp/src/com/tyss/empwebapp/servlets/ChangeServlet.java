package com.tyss.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.empwebapp.dao.EmployeeDAO;
import com.tyss.empwebapp.dto.EmployeeInfo;
import com.tyss.empwebapp.util.EmployeeDAOManager;

@WebServlet("/changepassword")
public class ChangeServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if(session != null) {

			String pass = req.getParameter("newpassword");
			String confirmPass = req.getParameter("confirmpassword");

			if(pass.equals(confirmPass)) {
				EmployeeInfo info = (EmployeeInfo) session.getAttribute("info");
				EmployeeDAO dao = EmployeeDAOManager.getEmployeeDAO();
				dao.changePassword(info.getId(), pass );
				RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
				dispatcher.forward(req, resp);
			} else {
				
				String msg = "Password doesn't match";
				req.setAttribute("msg", msg);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/changepassword.jsp");
				dispatcher.forward(req, resp);
			}
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
