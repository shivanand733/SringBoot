package com.mr_Shivanand.myApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/api")
public class Greet {

	@RequestMapping("/user/future/{BirthYear}")
	@ResponseBody
	public int addYears(@PathVariable int BirthYear) {
		return BirthYear + 10;
	}
}
