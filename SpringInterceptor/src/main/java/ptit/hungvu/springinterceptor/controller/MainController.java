package ptit.hungvu.springinterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value = {"/", "/test"})
	public String test(Model model) {
		System.out.println("MainController.test--");
		return "test";
	}
	
	@Deprecated
	@RequestMapping(value = {"/admin/oldLogin"})
	public String oldLogin(Model model) {
		return "oldLogin";
	}
	
	@RequestMapping(value = {"/admin/login"})
	public String login(Model model) {
		System.out.println("MainController.login");
		return "login";
	}
	
	@RequestMapping(value = "/login1")
	public String login1(Model model) {
		return "login1";
	}
}
