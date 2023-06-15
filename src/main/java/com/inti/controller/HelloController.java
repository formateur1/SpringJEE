package com.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView helloTest(ModelAndView model)
	{
		model = new ModelAndView("hello");
		String nom = "DUPONT";
		model.addObject("n", nom);
		return model;
	}
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public ModelAndView test(ModelAndView model)
	{
		model = new ModelAndView("test");
		
		return model;
	}

}
