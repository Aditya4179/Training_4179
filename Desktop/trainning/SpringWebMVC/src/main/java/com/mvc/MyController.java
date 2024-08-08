package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Controller
public class MyController {
	
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	public String hello() {
		return("Hello, I am Karishma and this is my controller");
	}

}
