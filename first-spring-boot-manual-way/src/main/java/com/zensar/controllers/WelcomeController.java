package com.zensar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController

//@Controller
@RestController
public class WelcomeController {
	// http://localhost:8080/welcome
	//@RequestMapping(value = "/welcome", method=RequestMethod.GET)
	//@ResponseBody
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

}
