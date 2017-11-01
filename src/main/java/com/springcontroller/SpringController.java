package com.springcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
	@RequestMapping("/hello")
	public String helloworld(Model model) {
		String helloWorldMessage = "Hello world from java2blog!";
		model.addAttribute("helloWorldMessage", helloWorldMessage);
		return "hello";
	}

}
