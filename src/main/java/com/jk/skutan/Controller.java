package com.jk.skutan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String welcome() {
		String welcomeMessage = "Welcome to Skutan Availability. This is an app in early development.";
		return welcomeMessage;
	}
}
