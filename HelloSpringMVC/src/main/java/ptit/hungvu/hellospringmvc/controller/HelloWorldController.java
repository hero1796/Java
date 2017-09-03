package ptit.hungvu.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("greeting", "Hello Spring MVC");
		return "methodInJsp";
	}
	
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String authorInfo(Model model) {
		return "redirect:/hello";
	}
}
