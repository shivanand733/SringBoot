package com.mr_Shivanand.myApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
@GetMapping("/Shivu")
@ResponseBody
	public String printMessage() {
		return "Hello World";
	}

@GetMapping("/welcome")
@ResponseBody
	public String Welocme() {
		return "Welcome to Spring boot";
	}
}
