package com.iteen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		String message = "HELLO SPRING MVC HOW R U";
		return new ModelAndView("hellopage", "message", message);
	}
	
	@RequestMapping(value = "/pingServlet", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> pingServlet(){
		return new ResponseEntity(HttpStatus.OK);
	}
}
