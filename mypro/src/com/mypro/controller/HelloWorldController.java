package com.mypro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		String message = "HELLO SPRING MVC HOW R U";
		return new ModelAndView("hellopage", "message", message);
	}
}
