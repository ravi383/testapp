package com.learning.testapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	@RequestMapping("/greet")
	public String customerInformation() {
		return "Hey, I am from external tomcat";
	}
}
