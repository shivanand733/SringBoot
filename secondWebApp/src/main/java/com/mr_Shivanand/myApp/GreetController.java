package com.mr_Shivanand.myApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {
	@GetMapping("/home")
	public String home() {
		return "Kodnest";
	}
}
