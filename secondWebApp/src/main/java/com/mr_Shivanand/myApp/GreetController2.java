package com.mr_Shivanand.myApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController2 {

	@GetMapping("/home1")
	public String home1(Model m) {
		m.addAttribute("msg", " Hello Wel Come to OnePluse Nord Series...");
		return "OnePluse";
	}
}
