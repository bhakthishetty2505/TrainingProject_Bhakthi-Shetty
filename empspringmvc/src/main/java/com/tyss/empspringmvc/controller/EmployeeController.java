package com.tyss.empspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tyss.empspringmvc.DTO.EmployeeBean;
import com.tyss.empspringmvc.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of loginPage
	
	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request) {
		
		EmployeeBean bean = service.login(id, password);
		if(bean == null) {
			request.setAttribute("msg", "Invalid Credentails");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}//end of login
	}
	
	@GetMapping("/register")
	public String registerPage() {
		
		return "register";
	}//end of registerPage
	
	@PostMapping("/register")
	public String register(EmployeeBean bean, ModelMap map) {
		
		int check = service.register(bean);
		if(check > 0) {
			map.addAttribute("msg", "Registration Successful and your ID is " +check);
		}else {
			map.addAttribute("msg", "Email already exists");
		}
		return "login";
	}

}
