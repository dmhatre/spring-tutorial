package com.tutorial.spring4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<div style='text-align:center;'>"
				+ "<h3>Hello World, Spring MVC Tutorial</h3>"
				+ "This message is coming from MyController.java</div>";
		return new ModelAndView("welcome", "message", message);
	}
}
