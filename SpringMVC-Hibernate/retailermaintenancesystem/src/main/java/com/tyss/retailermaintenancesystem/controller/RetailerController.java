package com.tyss.retailermaintenancesystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.tyss.retailermaintenancesystem.DTO.ProductBean;
import com.tyss.retailermaintenancesystem.DTO.RetailerBean;
import com.tyss.retailermaintenancesystem.services.RetailerService;

@Controller
public class RetailerController {

	@Autowired
	private RetailerService service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of loginPage()
	
	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request) {
		
		RetailerBean bean = service.login(id, password);
		if(bean == null) {
			request.setAttribute("msg", "Invalid Credentails");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}//end of login()
	}
	
	@GetMapping("/createprofile")
	public String registerProfile() {
		
		return "createprofile";
	}//end of registerPage()
	
	@PostMapping("/createprofile")
	public String registerProfile(RetailerBean bean, ModelMap map) {
		
		int check = service.createProfile(bean);
		if(check > 0) {
			map.addAttribute("msg", "Profile is successfully created and your ID is " +check);
		}else {
			map.addAttribute("msg", "Check the credentials again");
		}
		return "login";
	}// end of register()
	
	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name = "bean", required = false)  RetailerBean bean) {
		
		if(bean == null) {
			
			map.addAttribute("msg", "Please Login");
			return "login";
			
		}else {
			
			return "home";
		}
	}// end of home()
	
	@PostMapping("/home")
	public String home() {
		
		return "home";
		
	}//end of home()
	@PostMapping("/search")
	public String searchProduct(@RequestParam("id")int id, ModelMap map) {
		
		ProductBean bean = service.searchProduct(id);
		if(bean == null) {
			map.addAttribute("msg", "no data found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}//end of search
	
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//end of logout()
	
	
	@GetMapping("/updatepassword")
	public String changePassword(HttpServletRequest request) {
		
		HttpSession session = request.getSession(false);
		if(session != null) {
			return "updatepassword";
			
		} else {
			return "login";
		}
	}//end of changePassword()
	
	@PostMapping("/updatepassword")
	public String updatePassword(String password, String confirmpassword,
			@SessionAttribute(name = "bean")RetailerBean bean, ModelMap map) {
		
		if(password.equals(confirmpassword)) {
			service.updatePassword(bean.getId(), password);
			map.addAttribute("msg", "Password Successfully Changed");
		}else {
			map.addAttribute("msg", "Password doesnt match");
		}
		return "home";
	}
}
