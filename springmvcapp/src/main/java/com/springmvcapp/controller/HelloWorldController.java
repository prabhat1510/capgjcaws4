package com.springmvcapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	// http://localhost:8080/helloWorld
	@RequestMapping("/helloWorld")	// http request is mapped to below method
	public ModelAndView showMessage() {
		//In this method the model is prepared and /helloWorld request the view for response is also set
		Map model = new HashMap();
		model.put("greetings", "Hello Welcome to Spring MVC Example");
		//"hello" - is a view name , and model(or data) is model map
		ModelAndView modelAndView = new ModelAndView("hello",model);
		return modelAndView;
	}
}
